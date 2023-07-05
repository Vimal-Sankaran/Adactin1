package com.Adactin.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileReaderManager {

    Properties property = new Properties();

    public String getPropertyValue(String key) throws IOException {
        String propertyFilePath = "F:\\Project\\Adact\\Adactin1\\Adactin\\src\\test\\resources\\extent.properties";
        FileInputStream fis = new FileInputStream(propertyFilePath);
        property.load(fis);

        String value = property.get(key).toString();
        return value;
    }
}
