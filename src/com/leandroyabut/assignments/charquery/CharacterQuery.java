package com.leandroyabut.assignments.charquery;

import java.util.Scanner;

/**
 *
 * Searches for a character in a file
 * and counts how many times that character occurs.
 *
 * @author Leandro Yabut
 */
public class CharacterQuery {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("File to search: ");
        String path = scanner.nextLine();
        System.out.print("Character to count: ");
        String character = scanner.nextLine();

        FileCrawler crawler = new FileCrawler(path);
        int count = crawler.getCharCount(character.charAt(0));

        System.out.println("The character " + character.charAt(0) + " occurs " + count + " times.");

        scanner.close();

    }

}
