package com.crm.util;

import java.util.Random;

public class MathUtil {
	public static int getRd(){
		 Random random = new Random(100000);
		 return random.nextInt();
	}
}
