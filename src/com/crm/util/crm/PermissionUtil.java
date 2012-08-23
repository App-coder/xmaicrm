package com.crm.util.crm;

import java.util.ArrayList;
import java.util.List;

import com.crm.bean.crm.permission.ModulePermission;
import com.crm.model.XmProfile2standardpermissions;
import com.crm.model.XmTab;

public class PermissionUtil {

	public static List<ModulePermission> GenerateModulePerssion(
			List<XmTab> tabPermissions,
			List<XmProfile2standardpermissions> standardpermissions) {
		List<ModulePermission> permissions = new ArrayList<ModulePermission>();
		for(int i=0;i<tabPermissions.size();i++){
			ModulePermission permission = new ModulePermission();
			permission.setProfileid(tabPermissions.get(i).getProfileid());
			permission.setTabid(tabPermissions.get(i).getTabid());
			permission.setTablabel(tabPermissions.get(i).getTablabel());
			permission.setTabpermission(tabPermissions.get(i).getPermissions());
			
			//设置CRUD的permission
			permission.setPermission(tabPermissions.get(i).getPermissions());
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
			permissions.add(permission);
		}
		return permissions;
	}

}
