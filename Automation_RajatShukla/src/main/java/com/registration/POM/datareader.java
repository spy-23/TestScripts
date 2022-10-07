package com.registration.POM;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class datareader {

	public String readfile(String Path, String key) throws IOException {

		Properties pro = new Properties();
		FileInputStream as = new FileInputStream(Path);
		pro.load(as);
		String KeyValue = pro.getProperty(key);
		return KeyValue;
	}

}
