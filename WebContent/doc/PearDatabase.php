<?php
/*********************/
/*                   */
/*  Version : 5.1.0  */
/*  Author  : RM     */
/*  Comment : 071223 */
/*                   */
/*********************/

class PreparedQMark2SqlValue
{

				public function PreparedQMark2SqlValue( $vals )
				{
								$this->ctr = 0;
								$this->vals = $vals;
				}

				public function call( $matches )
				{
								if ( $matches[3] == "?" )
								{
												$this->ctr++;
												return $this->vals[$this->ctr - 1];
								}
								return $matches[0];
				}

}

class PearDatabase
{

				public $database = NULL;
				public $dieOnError = FALSE;
				public $dbType = NULL;
				public $dbHostName = NULL;
				public $dbName = NULL;
				public $dbOptions = NULL;
				public $userName = NULL;
				public $userPassword = NULL;
				public $query_time = 0;
				public $log = NULL;
				public $lastmysqlrow = -1;
				public $enableSQLlog = FALSE;
				public $continueInstallOnError = TRUE;
				public $avoidPreparedSql = FALSE;
				public $req_flist = NULL;

				public function isMySQL( )
				{
								return $this->dbType == "mysql";
				}

				public function isOracle( )
				{
								return $this->dbType == "oci8";
				}

				public function isPostgres( )
				{
								return $this->dbType == "pgsql";
				}

				public function isMssql( )
				{
								if ( -1 < javastrpos( $this->dbType, "mssql" ) )
								{
												return TRUE;
								}
								return FALSE;
				}

				public function println( $msg )
				{
								require_once( "include/logging.php" );
								$log1 =& LoggerManager::getlogger( "VT" );
								if ( is_array( $msg ) )
								{
												$log1->info( "PearDatabse ->".print_r( $msg, TRUE ) );
												return $msg;
								}
								$log1->info( "PearDatabase ->".$msg );
								return $msg;
				}

				public function setDieOnError( $value )
				{
								$this->dieOnError = $value;
				}

				public function setDatabaseType( $type )
				{
								$this->dbType = $type;
				}

				public function setUserName( $name )
				{
								$this->userName = $name;
				}

				public function setOption( $name, $value )
				{
								if ( isset( $this->dbOptions ) )
								{
												$this->dbOptions[$name] = $value;
								}
								if ( isset( $this->database ) )
								{
												$this->database->setOption( $name, $value );
								}
				}

				public function setUserPassword( $pass )
				{
								$this->userPassword = $pass;
				}

				public function setDatabaseName( $db )
				{
								$this->dbName = $db;
				}

				public function setDatabaseHost( $host )
				{
								$this->dbHostName = $host;
				}

				public function getDataSourceName( )
				{
								return $this->dbType."://".$this->userName.":".$this->userPassword."@".$this->dbHostName."/".$this->dbName;
				}

				public function startTransaction( )
				{
								if ( $this->isPostgres( ) || $this->isMssql( ) )
								{
												return;
								}
								$this->checkConnection( );
								$this->println( "TRANS Started" );
								$this->database->StartTrans( );
				}

				public function completeTransaction( )
				{
								if ( $this->isPostgres( ) || $this->isMssql( ) )
								{
												return;
								}
								if ( $this->database->HasFailedTrans( ) )
								{
												$this->println( "TRANS  Rolled Back" );
								}
								else
								{
												$this->println( "TRANS  Commited" );
								}
								$this->database->CompleteTrans( );
								$this->println( "TRANS  Completed" );
				}

				public function hasFailedTransaction( )
				{
								return $this->database->HasFailedTrans( );
				}

				public function checkError( $msg = "", $dieOnError = FALSE )
				{
								if ( $this->dieOnError || $dieOnError )
								{
												$this->println( "ADODB error ".$msg."->[".$this->database->ErrorNo( )."]".$this->database->ErrorMsg( ) );
												exit( $msg."ADODB error ".$msg."->".$this->database->ErrorMsg( ) );
								}
								$this->println( "ADODB error ".$msg."->[".$this->database->ErrorNo( )."]".$this->database->ErrorMsg( ) );
								return FALSE;
				}

				public function change_key_case( $arr )
				{
								if ( is_array( $arr ) )
								{
												return array_change_key_case( $arr );
								}
								return $arr;
				}

				public function checkConnection( )
				{
								global $log;
								if ( !isset( $this->database ) )
								{
												$this->println( "TRANS creating new connection" );
												$this->connect( FALSE );
								}
				}

				public function logSqlTiming( $startat, $endat, $sql, $params = FALSE )
				{
								global $logsqltm;
								$logsqltm->debug( "SQL: ".$sql );
								if ( $params != NULL && 0 < count( $params ) )
								{
												$logsqltm->debug( "PARAMS: [".implode( ",", $params )."]" );
								}
								$logsqltm->debug( "EXEC: ".( $endat - $startat ).( " micros [START=".$startat.", END={$endat}]" ) );
								$logsqltm->debug( "" );
				}

				public function executeSetNamesUTF8SQL( )
				{
								global $default_charset;
								if ( strtoupper( $default_charset ) == "UTF-8" )
								{
												$sql_start_time = microtime( TRUE );
												$setnameSql = "SET NAMES utf8";
												$this->database->Execute( $setnameSql );
												$this->logSqlTiming( $sql_start_time, microtime( TRUE ), $setnameSql );
								}
				}

				public function query( $sql, $dieOnError = FALSE, $msg = "" )
				{
								global $log;
								global $default_charset;
								$log->debug( "query being executed : ".$sql );
								$this->checkConnection( );
								$sql_start_time = microtime( TRUE );
								$result =& $this->database->Execute( $sql );
								$this->logSqlTiming( $sql_start_time, microtime( TRUE ), $sql );
								$this->lastmysqlrow = -1;
								if ( !$result )
								{
												$this->checkError( $msg." Query Failed:".$sql."::", $dieOnError );
								}
								$this->print_sql($sql);
								return $result;
				}

				public function print_sql($sql){
						//echo $sql;
						//echo ';<br><br>';
				}

				public function convert2Sql( $ps, $vals )
				{
								if ( empty( $vals ) )
								{
												return $ps;
								}
								$index = 0;
								for ( ;	$index < count( $vals );	++$index	)
								{
												if ( is_string( $vals[$index] ) )
												{
																if ( $vals[$index] == "" )
																{
																				$vals[$index] = $this->database->Quote( $vals[$index] );
																}
																else
																{
																				$vals[$index] = "'".$this->sql_escape_string( $vals[$index] )."'";
																}
												}
												if ( $vals[$index] === NULL )
												{
																$vals[$index] = "NULL";
												}
								}
								preg_replace_callback( $vals );
								/*
								$sql = ( "/('[^']*')|(\"[^\"]*\")|([?])/", array(
												new PreparedQMark2SqlValue( ),
												"call"
								), $ps );
								*/
								$sql = preg_replace_callback("/('[^']*')|(\"[^\"]*\")|([?])/", array(new PreparedQMark2SqlValue($vals),"call"), $ps);
								$this->$this->print_sql($sql);
								return $sql;
				}

				public function pquery( $sql, $params, $dieOnError = FALSE, $msg = "" )
				{
								global $log;
								global $default_charset;
								$log->debug( "Prepared sql query being executed : ".$sql );
								$this->checkConnection( );
								$sql_start_time = microtime( TRUE );
								$params = $this->flatten_array( $params );
								if ( 0 < count( $params ) )
								{
												$log->debug( "Prepared sql query parameters : [".implode( ",", $params )."]" );
								}
								if ( $this->avoidPreparedSql || empty( $params ) )
								{
												$sql = $this->convert2Sql( $sql, $params );
												$result =& $this->database->Execute( $sql );
								}
								else
								{
												$result =& $this->database->Execute( $sql, $params );
								}
								$sql_end_time = microtime( TRUE );
								$this->logSqlTiming( $sql_start_time, $sql_end_time, $sql, $params );
								$this->lastmysqlrow = -1;
								if ( !$result )
								{
												$this->checkError( $msg." Query Failed:".$sql."::", $dieOnError );
								}
								$this->$this->print_sql($sql);
								return $result;
				}

				public function flatten_array( $input, $output = NULL )
				{
								if ( $input == NULL )
								{
												return;
								}
								if ( $output == NULL )
								{
												$output = array( );
								}
								foreach ( $input as $value )
								{
												if ( is_array( $value ) )
												{
																$output = $this->flatten_array( $value, $output );
												}
												else
												{
																array_push( &$output, $value );
												}
								}
								return $output;
				}

				public function getEmptyBlob( $is_string = TRUE )
				{
								if ( is_string )
								{
												return "null";
								}
				}

				public function updateBlob( $tablename, $colname, $id, $data )
				{
								$this->println( "updateBlob t=".$tablename." c=".$colname." id=".$id );
								$this->checkConnection( );
								$sql_start_time = microtime( TRUE );
								$result = $this->database->UpdateBlob( $tablename, $colname, $data, $id );
								$this->logSqlTiming( $sql_start_time, microtime( TRUE ), "Update Blob ".$tablename.", {$colname}, {$id}" );
								$this->println( "updateBlob t=".$tablename." c=".$colname." id=".$id." status=".$result );
								return $result;
				}

				public function updateBlobFile( $tablename, $colname, $id, $filename )
				{
								$this->println( "updateBlobFile t=".$tablename." c=".$colname." id=".$id." f=".$filename );
								$this->checkConnection( );
								$sql_start_time = microtime( TRUE );
								$result = $this->database->UpdateBlobFile( $tablename, $colname, $filename, $id );
								$this->logSqlTiming( $sql_start_time, microtime( TRUE ), "Update Blob ".$tablename.", {$colname}, {$id}" );
								$this->println( "updateBlobFile t=".$tablename." c=".$colname." id=".$id." f=".$filename." status=".$result );
								return $result;
				}

				public function limitQuery2( $sql, $start, $count, $orderby = "", $sorder = "", $dieOnError = FALSE, $msg = "" )
				{
								global $log;
								$log->debug( "limitQuery2 sql = ".$sql." start = ".$start." count = ".$count );
								$this->checkConnection( );
								$result =& $this->database->limitQuery2( $sql, $start, $count, $orderby, $sorder );
								if ( !$result )
								{
												$this->checkError( $msg." Limit Query Failed:".$sql."::", $dieOnError );
								}
								$this->print_sql($sql);
								return $result;
				}

				public function limitQuery( $sql, $start, $count, $dieOnError = FALSE, $msg = "" )
				{
								global $log;
								$log->debug( " limitQuery sql = ".$sql." st = ".$start." co = ".$count );
								$this->checkConnection( );
								$sql_start_time = microtime( TRUE );
								$result =& $this->database->SelectLimit( $sql, $count, $start );
								$this->logSqlTiming( $sql_start_time, microtime( TRUE ), "{$sql} LIMIT {$count}, {$start}" );
								if ( !$result )
								{
												$this->checkError( $msg." Limit Query Failed:".$sql."::", $dieOnError );
								}
								$this->$this->print_sql($sql);
								return $result;
				}

				public function getOne( $sql, $dieOnError = FALSE, $msg = "" )
				{
								$this->println( "ADODB getOne sql=".$sql );
								$this->checkConnection( );
								$sql_start_time = microtime( TRUE );
								$result =& $this->database->GetOne( $sql );
								$this->logSqlTiming( $sql_start_time, microtime( TRUE ), "{$sql}" );
								if ( $result === FALSE )
								{
												$this->checkError( $msg." Get one Query Failed:".$sql."::", $dieOnError );
								}
								$this->$this->print_sql($sql);
								return $result;
				}

				public function getFieldsDefinition( &$result )
				{
								$field_array = array( );
								if ( isset( $result, $result ) )
								{
												return 0;
								}
								$i = 0;
								$n = $result->FieldCount( );
								while ( $i < $n )
								{
												$meta = $result->FetchField( $i );
												if ( !$meta )
												{
																return 0;
												}
												array_push( &$field_array, $meta );
												++$i;
								}
								return $field_array;
				}

				public function getFieldsArray( &$result )
				{
								$field_array = array( );
								if ( isset( $result, $result ) )
								{
												return 0;
								}
								$i = 0;
								$n = $result->FieldCount( );
								while ( $i < $n )
								{
												$meta = $result->FetchField( $i );
												if ( !$meta )
												{
																return 0;
												}
												$metaname = $meta->name;
												array_push( &$field_array, $metaname );
												++$i;
								}
								return $field_array;
				}

				public function getRowCount( &$result )
				{
								global $log;
								if ( isset( $result, $result ) )
								{
												$rows = $result->RecordCount( );
								}
								return $rows;
				}

				public function num_rows( &$result )
				{
								return $this->getRowCount( $result );
				}

				public function num_fields( &$result )
				{
								return $result->FieldCount( );
				}

				public function fetch_array( &$result )
				{
								if ( $result->EOF )
								{
												return;
								}
								$arr = $result->FetchRow( );
								return $this->change_key_case( $arr );
				}

				public function run_query_record_html( $query )
				{
								if ( !is_array( $rec = $this->run_query_record( $query ) ) )
								{
												return $rec;
								}
								foreach ( $rec as $walk => $cur )
								{
												$r[$walk] = to_html( $cur );
								}
								return $r;
				}

				public function sql_quote( $data )
				{
								if ( is_array( $data ) )
								{
												switch ( $data['type'] )
												{
												case "text" :
												case "numeric" :
												case "integer" :
												case "oid" :
																return $this->quote( $data['value'] );
												case "timestamp" :
																return $this->formatDate( $data['value'] );
												}
												( "unhandled type: ".serialize( $cur ) );
												throw new Exception( );
								}
								return $this->quote( $data );
				}

				public function sql_insert_data( $table, $data )
				{
								if ( !$table )
								{
												( "missing table name" );
												throw new Exception( );
								}
								if ( !is_array( $data ) )
								{
												( "data must be an array" );
												throw new Exception( );
								}
								if ( !count( $table ) )
								{
												( "no data given" );
												throw new Exception( );
								}
								$sql_fields = "";
								$sql_data = "";
								foreach ( $data as $walk => $cur )
								{
												$sql_fields .= ( $sql_fields ? "," : "" ).$walk;
												$sql_data .= ( $sql_data ? "," : "" ).$this->sql_quote( $cur );
								}
	
								return "INSERT INTO ".$table." (".$sql_fields.") VALUES (".$sql_data.")";
				}

				public function run_insert_data( $table, $data )
				{
								$query = $this->sql_insert_data( $table, $data );
								$res = $this->query( $query );
								$this->query( "commit;" );
				}

				public function run_query_record( $query )
				{
								$result = $this->query( $query );
								if ( !$result )
								{
												return;
								}
								if ( !is_object( $result ) )
								{
												( "query \"".$query."\" failed: ".serialize( $result ) );
												throw new Exception( );
								}
								$res = $result->FetchRow( );
								$rowdata = $this->change_key_case( $res );
								return $rowdata;
				}

				public function run_query_allrecords( $query )
				{
								$result = $this->query( $query );
								$records = array( );
								$sz = $this->num_rows( $result );
								$i = 0;
								for ( ;	$i < $sz;	++$i	)
								{
												$records[$i] = $this->change_key_case( $result->FetchRow( ) );
								}
								return $records;
				}

				public function run_query_field( $query, $field = "" )
				{
								$rowdata = $this->run_query_record( $query );
								if ( isset( $field ) && $field != "" )
								{
												return $rowdata[$field];
								}
								return array_shift( &$rowdata );
				}

				public function run_query_list( $query, $field )
				{
								$records = $this->run_query_allrecords( $query );
								foreach ( $records as $walk => $cur )
								{
												$list[] = $cur[$field];
								}
				}

				public function run_query_field_html( $query, $field )
				{
								return to_html( $this->run_query_field( $query, $field ) );
				}

				public function result_get_next_record( $result )
				{
								return $this->change_key_case( $result->FetchRow( ) );
				}

				public function sql_expr_datalist( $a )
				{
								if ( !is_array( $a ) )
								{
												( "not an array" );
												throw new Exception( );
								}
								if ( !count( $a ) )
								{
												( "empty arrays not allowed" );
												throw new Exception( );
								}
								foreach ( $a as $walk => $cur )
								{
												$l .= ( $l ? "," : "" ).$this->quote( $cur );
								}
								return " ( ".$l." ) ";
				}

				public function sql_expr_datalist_from_records( $a, $field )
				{
								if ( !is_array( $a ) )
								{
												( "not an array" );
												throw new Exception( );
								}
								if ( !$field )
								{
												( "missing field" );
												throw new Exception( );
								}
								if ( !count( $a ) )
								{
												( "empty arrays not allowed" );
												throw new Exception( );
								}
								foreach ( $a as $walk => $cur )
								{
												$l .= ( $l ? "," : "" ).$this->quote( $cur[$field] );
								}
								return " ( ".$l." ) ";
				}

				public function sql_concat( $list )
				{
								switch ( $this->dbType )
								{
								case "mysql" :
												return "concat(".implode( ",", $list ).")";
								case "pgsql" :
												return "(".implode( "||", $list ).")";
								}
								( "unsupported dbtype \"".$this->dbType."\"" );
								throw new Exception( );
				}

				public function query_result( &$result, $row, $col = 0 )
				{
								if ( !is_object( $result ) )
								{
												( "result is not an object" );
												throw new Exception( );
								}
								$result->Move( $row );
								$rowdata = $this->change_key_case( $result->FetchRow( ) );
								$coldata = $rowdata[$col];
								return $coldata;
				}

				public function query_result_rowdata( &$result, $row = 0 )
				{
								if ( !is_object( $result ) )
								{
												( "result is not an object" );
												throw new Exception( );
								}
								$result->Move( $row );
								$rowdata = $this->change_key_case( $result->FetchRow( ) );
								foreach ( $rowdata as $col => $coldata )
								{
												if ( $col != "fieldlabel" )
												{
																$rowdata[$col] = to_html( $coldata );
												}
								}
								return $rowdata;
				}

				public function raw_query_result_rowdata( &$result, $row = 0 )
				{
								if ( !is_object( $result ) )
								{
												( "result is not an object" );
												throw new Exception( );
								}
								$result->Move( $row );
								$rowdata = $this->change_key_case( $result->FetchRow( ) );
								return $rowdata;
				}

				public function getAffectedRowCount( &$result )
				{
								global $log;
								$log->debug( "getAffectedRowCount" );
								$rows = $this->database->Affected_Rows( );
								$log->debug( "getAffectedRowCount rows = ".$rows );
								return $rows;
				}

				public function requireSingleResult( $sql, $dieOnError = FALSE, $msg = "", $encode = TRUE )
				{
								$result = $this->query( $sql, $dieOnError, $msg );
								if ( $this->getRowCount( $result ) == 1 )
								{
												return $result;
								}
								$this->log->error( "Rows Returned:".$this->getRowCount( $result )." More than 1 row returned for ".$sql );
								return "";
				}

				public function requirePsSingleResult( $sql, $params, $dieOnError = FALSE, $msg = "", $encode = TRUE )
				{
								$result = $this->pquery( $sql, $params, $dieOnError, $msg );
								if ( $this->getRowCount( $result ) == 1 )
								{
												return $result;
								}
								$this->log->error( "Rows Returned:".$this->getRowCount( $result )." More than 1 row returned for ".$sql );
								return "";
				}

				public function fetchByAssoc( &$result, $rowNum = -1, $encode = TRUE )
				{
								if ( $result->EOF )
								{
												$this->println( "ADODB fetchByAssoc return null" );
								}
								else if ( $this->isMssql( ) )
								{
												return $this->fetch_array( $result );
								}
								else
								{
												if ( isset( $result ) && $rowNum < 0 )
												{
																$row = $this->change_key_case( $result->GetRowAssoc( FALSE ) );
																$result->MoveNext( );
																return $row;
												}
												if ( $rowNum < $this->getRowCount( $result ) )
												{
																$result->Move( $rowNum );
												}
												$this->lastmysqlrow = $rowNum;
												$row = $this->change_key_case( $result->GetRowAssoc( FALSE ) );
												$result->MoveNext( );
								}
								return $row;
				}

				public function getNextRow( &$result, $encode = TRUE )
				{
								global $log;
								$log->info( "getNextRow" );
								if ( isset( $result ) )
								{
												$row = $this->change_key_case( $result->FetchRow( ) );
												return $row;
								}
				}

				public function fetch_row( &$result, $encode = TRUE )
				{
								return $this->getNextRow( $result );
				}

				public function field_name( &$result, $col )
				{
								return $result->FetchField( $col );
				}

				public function getQueryTime( )
				{
								return $this->query_time;
				}

				public function connect( $dieOnError = FALSE )
				{
								global $dbconfigoption;
								global $dbconfig;
								if ( !isset( $this->dbType ) )
								{
												$this->println( "ADODB Connect : DBType not specified" );
								}
								else
								{
												$this->database = adonewconnection( $this->dbType );
												if ( $dbconfigoption['debug'] )
												{
																$this->database->debug = TRUE;
												}
												if ( $dbconfigoption['persistent'] )
												{
																$this->database->PConnect( $this->dbHostName, $this->userName, $this->userPassword, $this->dbName );
												}
												else
												{
																$this->database->Connect( $this->dbHostName, $this->userName, $this->userPassword, $this->dbName );
												}
												$this->database->LogSQL( $this->enableSQLlog );
								}
				}

				public function PearDatabase( $dbtype = "", $host = "", $dbname = "", $username = "", $passwd = "" )
				{
								global $currentModule;
								$this->log =& LoggerManager::getlogger( "PearDatabase_".$currentModule );
								$this->resetSettings( $dbtype, $host, $dbname, $username, $passwd );
				}

				public function resetSettings( $dbtype, $host, $dbname, $username, $passwd )
				{
								global $dbconfig;
								global $dbconfigoption;
								if ( $host == "" )
								{
												$this->disconnect( );
												$this->setDatabaseType( $dbconfig['db_type'] );
												$this->setUserName( $dbconfig['db_username'] );
												$this->setUserPassword( $dbconfig['db_password'] );
												$this->setDatabaseHost( $dbconfig['db_hostname'] );
												$this->setDatabaseName( $dbconfig['db_name'] );
												$this->dbOptions = $dbconfigoption;
												if ( $dbconfig['log_sql'] )
												{
																$this->enableSQLlog = $dbconfig['log_sql'];
												}
								}
								else
								{
												$this->disconnect( );
												$this->setDatabaseType( $dbtype );
												$this->setDatabaseName( $dbname );
												$this->setUserName( $username );
												$this->setUserPassword( $passwd );
												$this->setDatabaseHost( $host );
								}
				}

				public function quote( $string )
				{
								return $this->database->qstr( $string );
				}

				public function disconnect( )
				{
								$this->println( "ADODB disconnect" );
								if ( isset( $this->database ) )
								{
												if ( $this->dbType == "mysql" )
												{
																mysql_close( $this->database );
												}
												else
												{
																$this->database->disconnect( );
												}
												//unset( ['database'] );
								}
				}

				public function setDebug( $value )
				{
								$this->database->debug = $value;
				}

				public function createTables( $schemaFile, $dbHostName = FALSE, $userName = FALSE, $userPassword = FALSE, $dbName = FALSE, $dbType = FALSE )
				{
								$this->println( "ADODB createTables ".$schemaFile );
								if ( $dbHostName )
								{
												$this->dbHostName = $dbHostName;
								}
								if ( $userName )
								{
												$this->userName = $userPassword;
								}
								if ( $userPassword )
								{
												$this->userPassword = $userPassword;
								}
								if ( $dbName )
								{
												$this->dbName = $dbName;
								}
								if ( $dbType )
								{
												$this->dbType = $dbType;
								}
								$this->checkConnection( );
								$db = $this->database;
								( $db );
								$schema = new adoSchema( );
								$sehema->XMLS_DEBUG = TRUE;
								$sehema->debug = TRUE;
								$sql = $schema->ParseSchema( $schemaFile );
								$this->println( "--------------Starting the table creation------------------" );
								$result = $schema->ExecuteSchema( $sql, $this->continueInstallOnError );
								$this->println( "ADODB createTables error: ".$db->errorMsg( ) );
								$this->println( "ADODB createTables ".$schemaFile." status=".$result );
								return $result;
				}

				public function createTable( $tablename, $flds )
				{
								$this->println( "ADODB createTable table=".$tablename." flds=".$flds );
								$this->checkConnection( );
								$dict = newdatadictionary( $this->database );
								$sqlarray = $dict->CreateTableSQL( $tablename, $flds );
								$result = $dict->ExecuteSQLArray( $sqlarray );
								$this->println( "ADODB createTable table=".$tablename." flds=".$flds." status=".$result );
								return $result;
				}

				public function alterTable( $tablename, $flds, $oper )
				{
								$this->println( "ADODB alterTableTable table=".$tablename." flds=".$flds." oper=".$oper );
								$this->checkConnection( );
								$dict = newdatadictionary( $this->database );
								if ( $oper == "Add_Column" )
								{
												$sqlarray = $dict->AddColumnSQL( $tablename, $flds );
								}
								else if ( $oper == "Delete_Column" )
								{
												$sqlarray = $dict->DropColumnSQL( $tablename, $flds );
								}
								$result = $dict->ExecuteSQLArray( $sqlarray );
								$this->println( "ADODB alterTableTable table=".$tablename." flds=".$flds." oper=".$oper." status=".$result );
								return $result;
				}

				public function getColumnNames( $tablename )
				{
								$this->checkConnection( );
								$adoflds = $this->database->MetaColumns( $tablename );
								$i = 0;
								foreach ( $adoflds as $fld )
								{
												$colNames[$i] = $fld->name;
												++$i;
								}
								return $colNames;
				}

				public function formatString( $tablename, $fldname, $str )
				{
								$this->println( "ADODB formatString table=".$tablename." fldname=".$fldname." str=".$str );
								$this->checkConnection( );
								$key = "tablemetacolumns_".$tablename;
								$metaColumns = getsqlcachedata( $key );
								if ( !$metaColumns )
								{
												$metaColumns = array( );
												$adoflds = $this->database->MetaColumns( $tablename );
												if ( is_array( $adoflds ) )
												{
																foreach ( $adoflds as $fld )
																{
																				$metaColumns[$fld->name] = $fld->type;
																}
												}
												setsqlcachedata( $key, $metaColumns );
								}
								if ( is_array( $metaColumns ) && isset( $metaColumns[$fldname] ) )
								{
												$fldtype = strtoupper( $metaColumns[$fldname] );
												if ( strcmp( $fldtype, "CHAR" ) == 0 || strcmp( $fldtype, "VARCHAR" ) == 0 || strcmp( $fldtype, "VARCHAR2" ) == 0 || strcmp( $fldtype, "LONGTEXT" ) == 0 || strcmp( $fldtype, "TEXT" ) == 0 )
												{
																if ( empty( $str ) || $str == "null" || $str == "NULL" )
																{
																				return $this->quote( "" );
																}
																return $this->database->Quote( $str );
												}
												if ( strcmp( $fldtype, "DATE" ) == 0 || strcmp( $fldtype, "TIMESTAMP" ) == 0 || strcmp( $fldtype, "DATETIME" ) == 0 )
												{
																return $this->formatDate( $str );
												}
												if ( ( strcmp( $fldtype, "NUMERIC" ) == 0 || strcmp( $fldtype, "INT" ) == 0 ) && empty( $str ) )
												{
																return "0";
												}
												return "'".$str."'";
								}
								return "'".$str."'";
				}

				public function formatDate( $datetime, $strip_quotes = FALSE )
				{
								$this->checkConnection( );
								$db =& $this->database;
								$date = $db->DBTimeStamp( $datetime );
								if ( $strip_quotes )
								{
												return trim( $date, "'" );
								}
								if ( $date == "null" || $date == "NULL" )
								{
												return $this->quote( "" );
								}
								return $date;
				}

				public function getDBDateString( $datecolname )
				{
								$this->checkConnection( );
								$db =& $this->database;
								$datestr = $db->SQLDate( "Y-m-d, H:i:s", $datecolname );
								return $datestr;
				}

				public function getUniqueID( $seqname )
				{
								$this->checkConnection( );
								return $this->database->GenID( $seqname."_seq", 1 );
				}

				public function get_tables( )
				{
								$this->checkConnection( );
								$result =& $this->database->MetaTables( "TABLES" );
								return $result;
				}

				public function sql_escape_string( $str )
				{
								if ( $this->isMySql( ) )
								{
												$result_data = mysql_real_escape_string( $str );
												return $result_data;
								}
								if ( $this->isPostgres( ) )
								{
												$result_data = pg_escape_string( $str );
								}
								return $result_data;
				}

				public function getLastInsertID( $seqname )
				{
								if ( $this->isPostgres( ) )
								{
												$result = pg_query( "SELECT currval('".$seqname."_seq')" );
												if ( $result )
												{
																$row = pg_fetch_row( $result );
																$last_insert_id = $row[0];
																return $last_insert_id;
												}
								}
								else
								{
												$last_insert_id = $this->Insert_ID( );
								}
								return $last_insert_id;
				}

				public function Concat( )
				{
								return $this->database->Concat( );
				}

				public function qstr( $s, $magic_quotes = FALSE )
				{
								return $this->database->qstr( $s, $magic_quotes );
				}

}

function &getSingleDBInstance( )
{
				static $db = FALSE;
				if ( $db === FALSE )
				{
								global $log;
								$log->info( "start create peardatabase" );
								$db = new PearDatabase( );
								$db->connect( );
								if ( $db->isMssql( ) )
								{
												$db->database->SetFetchMode( ADODB_FETCH_ASSOC );
								}
								$log->info( "end create peardatabase" );
				}
				return $db;
}

global $root_directory;
require_once( $root_directory."include/logging.php" );
require_once( $root_directory."include/utils/utils.php" );
require_once( $root_directory."include/utils/CommonUtils.php" );
require_once( $root_directory."adodb/adodb.inc.php" );
require_once( $root_directory."adodb/adodb-xmlschema.inc.php" );
$log =& LoggerManager::getlogger( "VT" );
$logsqltm =& LoggerManager::getlogger( "SQLTIME" );
if ( !function_exists( "javaStrPos" ) )
{
				function javaStrPos( $base, $findme )
				{
								$result = stripos( $base, $findme );
								if ( $result === FALSE )
								{
												$result = -1;
								}
								return $result;
				}
}
if ( empty( $adb ) )
{
				$adb =& getsingledbinstance( );
}
?>
