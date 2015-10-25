package com.cadaver.funeral.designpattern.adapter.excercise;

import java.io.*;
import java.util.Properties;

/**
 * Created by mitsuo on 2015/10/25.
 */
public class FileProperties extends Properties implements FileIO {
    public void readFromFile(String filename) throws IOException {
        load(new FileInputStream(filename));
    }

    public void writeToFile(String filename) throws IOException{
        store(new FileOutputStream(filename), "written by FileProperties");
    }

    public String getValue(String key) {
        return getProperty(key, "");
    }

    public void setValue(String key, String value) {
        setProperty(key, value);
    }

}
