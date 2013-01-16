package com.crm.action.portlets;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.crm.bean.crm.UserPermission;
import com.crm.service.portlets.XmSalesobjectService;
import com.crm.service.portlets.XmSalesorderService;
import com.crm.util.CacheUtil;
import com.crm.util.Constant;
import com.crm.util.DateUtil;
import com.crm.util.time.TimeGet;

/**
 * 
 * 本人最近3个月销售任务完成情况
 * 
 * User: zhujun
 * Date: 2012-8-9
 * Time: 下午4:13:11
 */
@Controller
@RequestMapping(value = "crm/portlets/user_salesfinishedbymonth")
@SessionAttributes(Constant.USERPERMISSION)
public class UserSalesfinishedbymonthController {

	XmSalesobjectService xmSalesobjectService;
	@Resource(name="com.crm.service.portlets.impl.xmSalesobjectService")
	public void setXmSalesobjectService(XmSalesobjectService xmSalesobjectService) {
		this.xmSalesobjectService = xmSalesobjectService;
	}
	
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
		
		TimeGet tg = new TimeGet();
		
		StringBuffer sb = new StringBuffer();
		StringBuffer categories = new StringBuffer();
		categories.append("<categories>");
		StringBuffer aim = new StringBuffer();
		aim.append("<dataset seriesName='目标' color='AFD8F8' showValues='0'>");
		StringBuffer finished = new StringBuffer();
		finished.append("<dataset seriesName='完成' color='F6BD0F' showValues='0'>");
		
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, -3);
		
		String aimval = "";
		String fval = "";
		for(int i=0;i<3;i++){
		
			categories.append("<category label='"+DateUtil.format(calendar.getTime(),DateUtil.C_DATE_PATTON_YYYYMM)+"' />");
			aimval = this.xmSalesobjectService.getAim("salesorder",DateUtil.format(calendar.getTime(),"yyyy"),DateUtil.format(calendar.getTime(),"MM"),userPermission.getUser().getId());
			if("".equals(aimval) || aimval==null){
				aimval = "0";
			}
			aim.append("<set value='"+aimval+"' />");
			fval = this.xmSalesorderService.getFinish(tg.getFirstDayOfMonth(calendar),tg.getLastDayOfMonth(calendar),userPermission.getUser().getId());
			if("".equals(fval) ||  fval==null){
				fval = "0";
			}
			finished.append("<set value='"+fval+"' />");
			
			calendar.add(Calendar.MONTH,1);
		}
		
		categories.append("</categories>");
		aim.append("</dataset>");
		finished.append("</dataset>");
		
		
		sb.append("<graph caption='销售任务完成情况统计图' labelDisplay='WRAP' shownames='1' showvalues='0' decimals='0' numDivLines='4' formatNumberScale='0' decimalPrecision='0' anchorSides='10' anchorRadius='3' anchorBorderColor='009900' outCnvBaseFontSize='12' baseFontSize='12'>");
		sb.append(categories.toString());
		sb.append(aim.toString());
		sb.append(finished.toString());
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
