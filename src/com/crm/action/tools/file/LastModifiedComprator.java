package com.crm.action.tools.file;

import java.io.File;
import java.util.Comparator;

public class LastModifiedComprator implements Comparator {

	public int compare(Object f1, Object f2) {
		File fa = (File) f1;
		File fb = (File) f2;

		long diff = fa.lastModified() - fb.lastModified();
		if (diff > 0)
			return 1;
		else if (diff == 0)
			return 0;
		else
			return -1;
	}

}
