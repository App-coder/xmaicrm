package com.crm.action.portlets;

import java.net.MalformedURLException;
import java.net.URL;

import org.codehaus.xfire.client.Client;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * 新麦CRM新闻
 * 
 * User: zhujun Date: 2012-8-7 Time: 下午2:18:20
 */
@Controller
@RequestMapping(value = "crm/portlets/c3crm_news")
public class C3crmnewsController {

	@RequestMapping(value = "/getJson")
	@ResponseBody
	public String getJson() {
//		Client client = null;
//		try {
//			client = new Client(new URL(
//					"http://127.0.0.1:85/index.php/webservice/news?wsdl"));
//			Object[] result1 = client.invoke("loadNews", new Object[]{100});
//
//			return result1[0]+"";
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		return "";
	}

}
