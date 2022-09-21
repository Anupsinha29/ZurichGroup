package com.MiWay.Genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public final class FileUtility {
private	Properties properties;

	/**
	 * this method is use for get the data from property file
	 * @author Anup Sinha
	 * @param key
	 * @return
	 */
//changes done in file utility
	public String getDataFromProperyfile(String key) {
		String value = properties.getProperty(key).trim();
		return value;
	}
	/**
	 * this method is use for intialise the property file
	 * @author Anup Sinha 
	 * @param propertyFilePath
	 * @throws IOException
	 */
	public void intializePropertyFile(String propertyFilePath)  {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(propertyFilePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		properties = new Properties();
		try {
			properties.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
