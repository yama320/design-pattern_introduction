package com.cadaver.funeral.designpattern.adapter.excercise;

import java.io.IOException;

/**
 * Created by mitsuo on 2015/10/25.
 */
public interface FileIO {
    public void readFromFile(String filename) throws IOException;
    public void writeToFile(String filename) throws IOException;
    public void setValue(String key, String value);
    public String getValue(String key);
}
