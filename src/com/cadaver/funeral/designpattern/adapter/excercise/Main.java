package com.cadaver.funeral.designpattern.adapter.excercise;

import java.io.IOException;

/**
 * Created by mitsuo on 2015/10/25.
 */
public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("D:\\git\\design-pattern_introduction\\src\\com\\cadaver\\funeral\\designpattern\\adapter\\excercise\\file.txt");
            f.setValue("year", "2016");
            f.setValue("month", "09");
            f.setValue("day", "21");
            f.writeToFile("D:\\git\\design-pattern_introduction\\src\\com\\cadaver\\funeral\\designpattern\\adapter\\excercise\\newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
