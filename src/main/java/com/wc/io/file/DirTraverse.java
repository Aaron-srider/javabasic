package com.wc.io.file;

import java.io.File;

public class DirTraverse {

    public static double size = 0;

    public static void traverse(File file) {
        if(!file.isDirectory()) {
            size += file.length();
            System.out.println(file);
        }

        File[] fileList = file.listFiles();
        if(fileList != null && fileList.length != 0) {
            for (File f : fileList) {
                traverse(f);
            }
        }
    }

    public static void main(String[] args) {
        File file = new File("src");
        String absolutePath = file.getAbsolutePath();
        int index = absolutePath.lastIndexOf(File.separator);
        String path = absolutePath.substring(0, index);
        File file1 = new File(path);
        //System.out.println(file1);

        traverse(file1);
        System.out.println(size / 1024 + "kb");
    }
}
