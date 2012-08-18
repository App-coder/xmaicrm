package com.crm.action.tools;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

import javax.servlet.ServletContext;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.alibaba.fastjson.JSON;
import com.crm.action.tools.file.NameComparator;
import com.crm.action.tools.file.SizeComparator;
import com.crm.action.tools.file.TypeComparator;
import com.crm.util.DateUtil;
import com.crm.util.FileUtil;
import com.crm.util.StringUtil;

@Controller
@RequestMapping(value = "file/")
public class FileController implements
		ServletContextAware {

	private ServletContext servletContext;

	public void setServletContext(ServletContext servletContext) { // 实现接口中的setServletContext方法
		this.servletContext = servletContext;
	}

	@RequestMapping(value = "/filemanager", method = RequestMethod.GET)
	@ResponseBody
	public String filemanager(String path, String name, String dir,
			String order, String fileloc) {
		String rootPath = this.servletContext.getRealPath(fileloc);
		String rootUrl = fileloc;

		// 图片扩展名
		String[] fileTypes = new String[] { "gif", "jpg", "jpeg", "png", "bmp" };

		if (dir != null) {
			if (!Arrays.<String> asList(
					new String[] { "image", "flash", "media", "file" })
					.contains(dir)) {
				return "没有对应的路径！";
			}
			rootPath += "/" + dir;
			rootUrl += dir + "/";
			File saveDirFile = new File(rootPath);
			if (!saveDirFile.exists()) {
				saveDirFile.mkdirs();
			}
		}

		// 根据path参数，设置各路径和URL
		path = path != null ? path : "";
		String currentPath = rootPath + "/" + path;
		String currentUrl = rootUrl + path;
		String currentDirPath = path;
		String moveupDirPath = "";
		if (!"".equals(path)) {
			String str = currentDirPath.substring(0,
					currentDirPath.length() - 1);
			moveupDirPath = str.lastIndexOf("/") >= 0 ? str.substring(0,
					str.lastIndexOf("/") + 1) : "";
		}

		// 排序形式，name or size or type
		order = order != null ? order.toLowerCase() : "name";

		// 不允许使用..移动到上一级目录
		if (path.indexOf("..") >= 0) {
			return "权限不足！";
		}
		// 最后一个字符不是/
		if (!"".equals(path) && !path.endsWith("/")) {
			return "参数不正确！";
		}
		// 目录不存在或不是目录
		File currentPathFile = new File(currentPath);
		if (!currentPathFile.isDirectory()) {
			return "目录不存在！";
		}

		// 遍历目录取的文件信息
		List<Hashtable> fileList = new ArrayList<Hashtable>();
		if (currentPathFile.listFiles() != null) {
			for (File file : currentPathFile.listFiles()) {
				Hashtable<String, Object> hash = new Hashtable<String, Object>();
				String fileName = file.getName();
				if (file.isDirectory()) {
					hash.put("is_dir", true);
					hash.put("has_file", (file.listFiles() != null));
					hash.put("filesize", 0L);
					hash.put("is_photo", false);
					hash.put("filetype", "");
				} else if (file.isFile()) {
					String fileExt = fileName.substring(
							fileName.lastIndexOf(".") + 1).toLowerCase();
					hash.put("is_dir", false);
					hash.put("has_file", false);
					hash.put("filesize", file.length());
					hash.put("is_photo", Arrays.<String> asList(fileTypes)
							.contains(fileExt));
					hash.put("filetype", fileExt);
				}
				hash.put("filename", fileName);
				hash.put("datetime",
						new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(file
								.lastModified()));
				fileList.add(hash);
			}
		}

		if ("size".equals(order)) {
			Collections.sort(fileList, new SizeComparator());
		} else if ("type".equals(order)) {
			Collections.sort(fileList, new TypeComparator());
		} else {
			Collections.sort(fileList, new NameComparator());
		}

		HashMap<String, Object> result = new HashMap<String, Object>();
		result.put("moveup_dir_path", moveupDirPath);
		result.put("current_dir_path", currentDirPath);
		result.put("current_url", currentUrl);
		result.put("total_count", fileList.size());
		result.put("file_list", fileList);

		JSONObject jsonobj = JSONObject.fromObject(result);
		return jsonobj.toString();
	}

	/**
	 * 
	 * KindEditor文件处理，也可用于普通文本的异步处理，返回带contxtpath+文件路径
	 * 
	 * @param imgFile
	 *            图片文件信息
	 * @param fileloc
	 *            文件保存路径
	 * @param dir "image", "flash", "media", "file"             
	 *            
	 */
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	@ResponseBody
	public String upload(@RequestParam("imgFile") CommonsMultipartFile imgFile,
			String fileloc, String dir) {
		String rootPath = this.servletContext.getRealPath(fileloc);
		String rootUrl = fileloc;
		HashMap<String, Object> message = new HashMap<String, Object>();
		if (!imgFile.isEmpty()) {
			if (dir != null) {
				if (!Arrays.<String> asList(
						new String[] { "image", "flash", "media", "file" })
						.contains(dir)) {
					message.put("message", "没有对应的路径！");
					message.put("result", false);
				}
				rootPath += "/" + dir;
				rootUrl += dir + "/";
				File saveDirFile = new File(rootPath);
				if (!saveDirFile.exists()) {
					saveDirFile.mkdirs();
				}

				String month = DateUtil
						.getCurrentDateStr(DateUtil.C_DATA_PATTON_YYYYMM);
				rootPath += "/" + month;
				rootUrl += month + "/";
				saveDirFile = new File(rootPath);
				if (!saveDirFile.exists()) {
					saveDirFile.mkdirs();
				}

				String day = DateUtil
						.getCurrentDateStr(DateUtil.C_DATA_PATTON_DD);
				rootPath += "/" + day;
				rootUrl += day + "/";
				saveDirFile = new File(rootPath);
				if (!saveDirFile.exists()) {
					saveDirFile.mkdirs();
				}

				String filepath = rootPath + "/" + day;
				File file = new File(filepath); // 新建一个文件
				try {
					imgFile.getFileItem().write(file); // 将上传的文件写入新建的文件中
				} catch (Exception e) {
					e.printStackTrace();
				}

			}

			String fname = StringUtil.getTimeMD5();
			String suffix = FileUtil.getSuffix(imgFile.getFileItem().getName());
			rootPath += "/" + fname  + suffix;
			rootUrl += fname + suffix;
			File file = new File(rootPath); // 新建一个文件

			try {
				imgFile.getFileItem().write(file); // 将上传的文件写入新建的文件中
				message.put("url",this.servletContext.getContextPath()+"/"+rootUrl);
				message.put("error", 0);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			message.put("message","文件不能为空！");
			message.put("error", 1);
		}
		return JSON.toJSONString(message);
	}

}
