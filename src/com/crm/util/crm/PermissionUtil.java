package com.crm.util.crm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.crm.bean.crm.permission.ModulePermission;
import com.crm.model.XmProfile2standardpermissions;
import com.crm.model.XmTab;
import com.crm.service.XmFieldService;

public class PermissionUtil {

	public static List<ModulePermission> GenerateModulePerssion(
			List<XmTab> tabPermissions,
			List<XmProfile2standardpermissions> standardpermissions,XmFieldService xmFieldService,int profileid) {
		
		List<ModulePermission> permissions = new ArrayList<ModulePermission>();
		for(int i=0;i<tabPermissions.size();i++){
			ModulePermission permission = new ModulePermission();
			permission.setTabid(tabPermissions.get(i).getTabid());
			permission.setTablabel(tabPermissions.get(i).getTablabel());
			
			//设置CRUD的permission
			for(int j=0;j<standardpermissions.size();j++){
				if(standardpermissions.get(j).getTabid() == tabPermissions.get(i).getTabid() && standardpermissions.get(j).getOperation()==10 ){
					permission.setCreate(standardpermissions.get(j).getPermissions());
				}
				if(standardpermissions.get(j).getTabid() == tabPermissions.get(i).getTabid() && standardpermissions.get(j).getOperation()==1 ){
					permission.setEdit(standardpermissions.get(j).getPermissions());
				}
				if(standardpermissions.get(j).getTabid() == tabPermissions.get(i).getTabid() && standardpermissions.get(j).getOperation()==2 ){
					permission.setDel(standardpermissions.get(j).getPermissions());
				}
				if(standardpermissions.get(j).getTabid() == tabPermissions.get(i).getTabid() && standardpermissions.get(j).getOperation()==4){
					permission.setView(standardpermissions.get(j).getPermissions());
				}
				if(standardpermissions.get(j).getTabid() == tabPermissions.get(i).getTabid() && standardpermissions.get(j).getOperation()==0){
					permission.setTabpermission(standardpermissions.get(j).getPermissions());
				}
			}
			
			//设置字段的权限
			permission.setProfile2fields(xmFieldService.getProfileFieldsByTabid(profileid,tabPermissions.get(i).getTabid()));
			
			permissions.add(permission);
		}
		return permissions;
	}

	public static HashMap<String,ModulePermission> GenerateUserModulePerssion(
			List<XmTab> tabPermissions,
			List<XmProfile2standardpermissions> standardpermissions,
			XmFieldService xmFieldService) {
		HashMap<String,ModulePermission> permissions = new HashMap<String, ModulePermission>();
		for(int i=0;i<tabPermissions.size();i++){
			ModulePermission permission = new ModulePermission();
			permission.setProfileid(tabPermissions.get(i).getProfileid());
			permission.setTabid(tabPermissions.get(i).getTabid());
			permission.setTablabel(tabPermissions.get(i).getTablabel());
			permission.setTabpermission(tabPermissions.get(i).getPermissions());
			
			for(int j=0;j<standardpermissions.size();j++){
				if(standardpermissions.get(j).getTabid() == tabPermissions.get(i).getTabid() && standardpermissions.get(j).getOperation()==10 ){
					permission.setCreate(standardpermissions.get(j).getPermissions());
				}
				if(standardpermissions.get(j).getTabid() == tabPermissions.get(i).getTabid() && standardpermissions.get(j).getOperation()==1 ){
					permission.setEdit(standardpermissions.get(j).getPermissions());
				}
				if(standardpermissions.get(j).getTabid() == tabPermissions.get(i).getTabid() && standardpermissions.get(j).getOperation()==2 ){
					permission.setDel(standardpermissions.get(j).getPermissions());
				}
				if(standardpermissions.get(j).getTabid() == tabPermissions.get(i).getTabid() && standardpermissions.get(j).getOperation()==4){
					permission.setView(standardpermissions.get(j).getPermissions());
				}
			}
			
			//设置字段的权限
			permission.setProfile2fields(xmFieldService.getProfileFieldsByTabid(tabPermissions.get(i).getProfileid(),tabPermissions.get(i).getTabid()));
			permissions.put(tabPermissions.get(i).getTabid()+"", permission);
		}
		
		return permissions;
	}

}
