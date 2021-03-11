package com.leandroyabut.practice.files;

import java.io.*;
import java.util.Scanner;

public class FilePractice {

    public static void main(String[] args) {

        try (FileInputStream input = new FileInputStream("resources/in/sample.txt"); Scanner scanner = new Scanner(input)) {

            int num;
            int sum = 0;

            while (scanner.hasNext()) {
                num = scanner.nextInt();
                sum += num;
            }

            System.out.println(sum);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
