package com.wc.io.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class FileTest1 {

    @Test
    public void test() {
        File file = new File("src/main/java/com/wc/io/file/testfile");

        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.exists());
    }

    /**
     * 测试createNewFile
     */
    @Test
    public void test1() {
        File file = new File("src/main/java/com/wc/io/file/testfile1");

        if (!file.exists()) {
            try {
                boolean isCreated = file.createNewFile();
                System.out.println(isCreated);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("file exists");

    }

    /**
     * 测试mkdir
     */
    @Test
    public void test2() {
        File file = new File("src/main/java/com/wc/io/file/testdir/testdir1");
        if (!file.exists()) {
            boolean isDirMaked = file.mkdir();
            System.out.println(isDirMaked);
        }

    }

    /**
     * 测试mkdirs
     */
    @Test
    public void test3() {
        File file = new File("src/main/java/com/wc/io/file/testdir/testdir1");
        if (!file.exists()) {
            boolean isDirMaked = file.mkdirs();
            System.out.println(isDirMaked);
        }
    }

    /**
     * 测试delete
     */
    @Test
    public void test4() {
        File file = new File("src/main/java/com/wc/io/file/testdir/testdir1");
        if (file.exists()) {
            //注意，文件删除要求文件夹中没有其他文件
            boolean isDeleted = file.delete();
            //删除成功返回true，否则返回false
            System.out.println(isDeleted);
        }
    }

}
