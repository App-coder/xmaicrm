package com.crm.action.portlets;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.crm.bean.crm.UserPermission;
import com.crm.bean.crm.portlets.UserSalesbymonth;
import com.crm.service.portlets.XmSalesorderService;
import com.crm.util.CacheUtil;
import com.crm.util.Constant;

/**
 * 
 * 本人最近6个月销售情况
 * 
 * User: zhujun
 * Date: 2012-8-9
 * Time: 下午2:20:45
 */
@Controller
@RequestMapping(value = "crm/portlets/user_salesbymonth")
@SessionAttributes(Constant.USERPERMISSION)
public class UserSalesbymonthController {
	
	XmSalesorderService xmSalesorderService;
	@Resource(name="com.crm.service.portlets.impl.xmSalesorderService")
	public void setXmSalesorderService(XmSalesorderService xmSalesorderService) {
		this.xmSalesorderService = xmSalesorderService;
	}


	@RequestMapping(value = "/getXml")
	@ResponseBody
	public String getXml(@ModelAttribute(Constant.USERPERMISSION) UserPermission userPermission){
		
		Object cache = CacheUtil.getKeyCache(CacheUtil.getMethKey(),CacheUtil.defRefreshTime);
		if(cache!=null){
			return cache.toString();
		}
		
		List<UserSalesbymonth> usm = this.xmSalesorderService.getUserSalesbymonth(userPermission.getUser().getId());
		
		StringBuffer sb = new StringBuffer();
		
		StringBuffer categories = new StringBuffer();
		categories.append("<categories>");
		StringBuffer amount = new StringBuffer();
		amount.append("<dataset seriesName='合同订单金额' color='AFD8F8' showValues='0'>");
		StringBuffer num = new StringBuffer();
		num.append("<dataset seriesName='合同订单数量' color='8BBA00' showValues='0' parentYAxis='S'>");
		
		for(int i=0;i<usm.size();i++){
			categories.append("<category name='"+usm.get(i).getM()+"' />");
			amount.append("<set value='"+usm.get(i).getTotal()+"' />");
			num.append("<set value='"+usm.get(i).getSocount()+"' />");
		}
		
		categories.append("</categories>");
		amount.append("</dataset>");
		num.append("</dataset>");
		
		sb.append("<graph labelDisplay='WRAP' showvalues='0' numDivLines='4' formatNumberScale='0' decimalPrecision='0' anchorSides='10' anchorRadius='3' anchorBorderColor='009900' outCnvBaseFontSize='12' baseFontSize='12'>");
		sb.append(categories.toString());
		sb.append(amount.toString());
		sb.append(num.toString());
		sb.append("</graph>");
		
        byte[] utf8Bom = new byte[]{(byte) 0xef, (byte) 0xbb, (byte) 0xbf};
        String utf8BomStr = "";
        try {
            utf8BomStr = new String(utf8Bom, "UTF-8");//定义BOM标记
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        
        String cachestr = utf8BomStr+sb.toString();
        CacheUtil.putKeyCache(CacheUtil.getMethKey(), cachestr);;
        
		return cachestr;
	}
	
	
}
