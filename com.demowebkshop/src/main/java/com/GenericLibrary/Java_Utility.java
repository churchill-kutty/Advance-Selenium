package com.GenericLibrary;

import java.time.LocalDateTime;

public class Java_Utility {
	public static String date() {
		LocalDateTime currrentTime=LocalDateTime.now();
		String localTime=currrentTime.toString().replace(":","-");
		return localTime;
		}

}
