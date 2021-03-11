package com.leandroyabut.assignments.charquery;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Crawls a file and looks for a specific character
 * and how many time is occurs.
 *
 * @author Leandro Yabut
 */

public class FileCrawler {

    private String path;

    public FileCrawler(String path){
        this.path = path;
    }

    /**
     *
     * @param c character to search for
     * @return amount of times that character occurs
     */
    public int getCharCount(char c) {
        int count = 0;

        try(FileInputStream inputStream = new FileInputStream(path)) {

            int charByte;
            while((charByte = inputStream.read())!=-1) {
                if(charByte == (byte) c) count++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return count;
    }

}
