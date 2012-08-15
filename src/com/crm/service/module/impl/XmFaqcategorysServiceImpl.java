package com.crm.service.module.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.stereotype.Service;

import com.crm.mapper.module.XmFaqcategoryMapper;
import com.crm.model.XmFaqcategory;
import com.crm.service.module.XmFaqcategorysService;

@Service("xmFaqcategorysService")
public class XmFaqcategorysServiceImpl implements XmFaqcategorysService {
	XmFaqcategoryMapper xmFaqcategoryMapper;
	@Resource(name="xmFaqcategoryMapper")
	public void setXmFaqcategoryMapper(XmFaqcategoryMapper xmFaqcategoryMapper) {
		this.xmFaqcategoryMapper = xmFaqcategoryMapper;
	}
	
	@Override
	public List<XmFaqcategory> getFaqCategoryByParentid(String parentfaqcategoryid) {
		return this.xmFaqcategoryMapper.getFaqCategoryByParentid(parentfaqcategoryid);
	}
	
	@Override
	public String getFaqCategory() {
		List<XmFaqcategory> list=this.xmFaqcategoryMapper.getFaqCategory();
		List<XmFaqcategory> root=this.xmFaqcategoryMapper.getFaqCategoryByParentid("");
		JSONArray ja=recursionTree(list,root.get(0)); 
		JSONObject jo = new JSONObject();
		jo.put("id", 0);
		jo.put("text", "根目录");
		jo.put("children", ja);
		return "["+jo.toString()+"]";
	}
	
	public JSONArray recursionTree(List<XmFaqcategory> list , XmFaqcategory node){
		JSONArray js=new JSONArray();
		List<XmFaqcategory> childList = getChildList(list,node);  
		for(XmFaqcategory st : childList){
			JSONObject jo = new JSONObject();
			jo.put("id", st.getFaqcategoryid());
			jo.put("text", st.getFaqcategoryname());
			if(hasChild(list,st))
				jo.put("children", recursionTree(list,st));
		    js.add(jo);
		}
		return js; 
	}
	
	
    public boolean hasChild(List<XmFaqcategory> list, XmFaqcategory node){  //判断是否有子节点   
        return getChildList(list,node).size()>0?true:false;   
    }   
    
    public List<XmFaqcategory> getChildList(List<XmFaqcategory> list , XmFaqcategory node){  //得到子节点列表   
        List<XmFaqcategory> li = new ArrayList<XmFaqcategory>();     
        Iterator<XmFaqcategory> it = list.iterator();     
        while(it.hasNext()){     
        	XmFaqcategory n = (XmFaqcategory)it.next();     
            if(n.getParentfaqcategoryid().equals(node.getFaqcategoryid())){     
                li.add(n);     
            }     
        }     
        return li;     
    }

	@Override
	public List<XmFaqcategory> getCatalogAll() {
		return this.xmFaqcategoryMapper.getCatalogAll();
	}   
	
	

}
