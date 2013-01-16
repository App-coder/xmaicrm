package com.crm.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.codehaus.xfire.client.Client;

public class TestXfire {

	public static void main(String[] args) {
		TestXfire tx = new TestXfire();
		tx.test();
	}
	
	public void test(){
		Client client = null;
		try {
			client = new Client(new URL(
					"http://127.0.0.1:85/index.php/webservice/news?wsdl"));
			Object[] result1 = client.invoke("loadNews", new Object[]{100});

			System.out.println(result1[0]);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
