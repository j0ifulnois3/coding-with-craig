package com.pluralsight;

public class ExceptionExample {

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
