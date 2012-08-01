<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../head_portlets.jsp"%>
<cache:cache>
<script type="text/javascript" src="resources/desktop/portlets/notepad.js"></script>
</head>
<body>
	<textarea name="content" style="width:100%;height:250px;" id="content" onblur="setNotepad()" ></textarea>
</body>
</html>
</cache:cache>