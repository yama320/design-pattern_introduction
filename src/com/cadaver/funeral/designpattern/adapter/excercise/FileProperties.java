package com.cadaver.funeral.designpattern.adapter.excercise;

import java.io.*;
import java.util.Properties;

/**
 * Created by mitsuo on 2015/10/25.
 */
public class FileProperties extends Properties implements FileIO {
    public void readFromFile(String filename) {
        try {
            load(new FileInputStream(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFile(String filename) {
        try {
            store(new FileOutputStream(filename), "test");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getValue(String key) {
        return getProperty(key);
    }

    public void setValue(String key, String value) {
        setProperty(key, value);
    }

}
