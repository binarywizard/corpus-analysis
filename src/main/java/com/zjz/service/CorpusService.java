package com.zjz.service;

import com.zjz.fileutils.ReadAllFileFromParentCatalog;
import org.springframework.stereotype.Service;

import java.io.File;

/**
 * What's this about?
 *
 * @author Xiao Song(xiaosong at qiyi.com)
 * @since 2017/4/24 23:41
 */
@Service("corpusService")
public class CorpusService {
    public void loadCorpus(String path, String newPath) {
        File file = new File(newPath);
        deleteDir(file);
        file.mkdirs();
        new ReadAllFileFromParentCatalog().readAllFile(path, newPath);
    }

    public static void main(String[] args) {
        String filePath = "/Users/xiaosong/Downloads/3二校完成部分-最全-2016.4.18-是否华裔核对补充/2015级本C6-未二校-未标注-已填华裔与否/";
        String newFilePath = "/Users/xiaosong/Desktop/a/";
        new CorpusService().loadCorpus(filePath, newFilePath);
    }

    private static boolean deleteDir(File dir) {
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i=0; i<children.length; i++) {
                boolean success = deleteDir(new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
        }
        return dir.delete();
    }

}
