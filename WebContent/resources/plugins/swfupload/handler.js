function fileQueueError(file, errorCode, message) {
    try {
	switch (errorCode) {
	case SWFUpload.QUEUE_ERROR.QUEUE_LIMIT_EXCEEDED:
	    message("你试图上传多个文件，"
		    + (message === 0 ? "已达到上传限制！"
			    : "可以选择 "
				    + (message > 1 ? "超过 " + message
					    + "个文件！" : "一个文件！")));
	    return;
	case SWFUpload.QUEUE_ERROR.FILE_EXCEEDS_SIZE_LIMIT:
	    message("您选择的文件过大！");
	    return;
	case SWFUpload.QUEUE_ERROR.ZERO_BYTE_FILE:
	    message("您选择的文件是空的。请选择其他文件！");
	    return;
	case SWFUpload.QUEUE_ERROR.INVALID_FILETYPE:
	    message("您选择的文件是不被允许的文件类型！");
	    return;
	default:
	    message("在上传时发生错误。请稍后再试！");
	    return;
	}
    } catch (e) {
    }
}