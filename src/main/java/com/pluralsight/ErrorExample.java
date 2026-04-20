package com.pluralsight;

import java.util.Scanner;

public class ErrorExample {

    public static void main(String[] args) {

            String[] names = {
                    "Ezra", "Elisha", "Ian",
                    "Siddalee", "Pursalane", "Zephaniah"
            };

            try {
                String name = names[6];
                System.out.println(name);
            } catch (RuntimeException e) {
                e.printStackTrace();
            }




























    }
}
