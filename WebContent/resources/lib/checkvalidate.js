
/*判断是否为空*/
function isempty(vstr) {
	if (vstr.replace(/\s/g, "") == "") {
		return true;
	}
	return false;
}

/*判断文件是否是图片*/
function isImg(filename) {
	var suffix = filename.substring(filename.lastIndexOf("."));
	if (suffix == ".gif" || suffix == ".png" || suffix == ".jpg") {
		return true;
	}
}
/*判断数组是否重复*/
function mm(arr) {
	var hash = {};
	for (var i in arr) {
		if (hash[arr[i]]) {
			return true;
		}
		hash[arr[i]] = true;
	}
	return false;
}

