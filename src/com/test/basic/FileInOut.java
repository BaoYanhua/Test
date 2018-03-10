package com.test.basic;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileInOut {

    public static void main(String[] args){
        try {
            String dir = System.getProperty("user.dir");
            System.out.println(dir);

            Scanner in = new Scanner(Paths.get("/Users/baoyanhua/IdeaProjects/Test/resources/myfile.txt"), "UTF-8");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
