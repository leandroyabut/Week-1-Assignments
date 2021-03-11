package com.leandroyabut.assignments.appendtofile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileAppender {

    private String path;

    public FileAppender(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    /**
     * Appends data to specified file
     * @param data data to append
     */
    public void append(String data) {
        try (FileOutputStream outputStream = new FileOutputStream(path, true)) {
            outputStream.write(data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
