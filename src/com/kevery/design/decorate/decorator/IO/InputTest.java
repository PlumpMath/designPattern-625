package com.kevery.design.decorate.decorator.IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by kever
 * 16/8/9.
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            LowerCaseInputStream lowerCaseInputStream = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("/Users/kever/shell/main.java")));
            while ((c = lowerCaseInputStream.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
