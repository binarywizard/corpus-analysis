package com.zjz.fileutils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * What's this about?
 *
 * @author Xiao Song(xiaosong at qiyi.com)
 * @since 2017/4/30 下午6:29
 */
public class ReadAllFileFromParentCatalog {

    public void readAllFile(String filePath, String newFilePath) {
        File f = new File(filePath);
        File[] files = f.listFiles();
        List<File> list = new ArrayList<>();
        for (File file : files) {
            if(file.isDirectory()) {
                File newDir = new File(newFilePath + file.getName());
                newDir.mkdir();
                readAllFile(file.getAbsolutePath(), newFilePath + file.getName() + "/");
            } else {
                String ethnicChinese = "none";
                File newDir = null;

                try {
                    Scanner scanner = new Scanner(file, "GBK");
                    while (scanner.hasNext()) {
                        String line = scanner.nextLine();
                        if (line.equals("是否华裔：是")) {
                            ethnicChinese = "华裔";
                            break;
                        } else if (line.equals("是否华裔：否")) {
                            ethnicChinese = "非华裔";
                            break;
                        } else {
                            continue;
                        }
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                if (ethnicChinese.equals("华裔")) {
                    newDir = new File(newFilePath + "/华裔");
                } else if (ethnicChinese.equals("非华裔")) {
                    newDir = new File(newFilePath + "/非华裔");
                } else {
                    newDir = new File(newFilePath + "/none");
                }

                newDir.mkdir();
                File newFile = new File(newDir.getAbsolutePath() + "/" + file.getName());
                try {
                    Files.copy(file.toPath(), newFile.toPath());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                list.add(newFile);
            }
        }
    }

    public void readFile(String filePath) {
        File f = new File(filePath);
        File[] files = f.listFiles();
        List<File> list = new ArrayList<>();
        for (File file : files) {
            list.add(file);
        }
        for(File file : files) {
            System.out.println(file.getAbsolutePath());
        }
    }
}
