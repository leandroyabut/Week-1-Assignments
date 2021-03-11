package com.leandroyabut.assignments.appendtofile;

import java.util.Scanner;

public class AppendToFile {

    public static void main(String[] args) {

        String path;
        String textToAppend;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the path to the file you want to append to: ");

        path = scanner.nextLine();

        System.out.print("Enter text to append: ");

        textToAppend = scanner.nextLine();

        FileAppender appender = new FileAppender(path);
        appender.append(textToAppend);

        scanner.close();

    }

}
