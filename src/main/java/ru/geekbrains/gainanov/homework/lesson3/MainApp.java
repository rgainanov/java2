package ru.geekbrains.gainanov.homework.lesson3;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {
//        taskOne();

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Gainanov", "+3716231449");
        phoneBook.add("gainanov", "+3726231441");
        phoneBook.add("GAINANOV", "+19806231443");
        phoneBook.add("Ivanov", "+442345567634");
        phoneBook.add("Sazonov", "+37126178749");
        phoneBook.add("Sazonov", "+37223456872");
        phoneBook.add("Tszu", "+190992345678");

        phoneBook.get("GAINANOV");
    }

    public static void taskOne() {
        String[] words = {
                "home", "car", "bicycle", "work", "home",
                "rain", "book", "car", "internet", "java",
                "browser", "idea", "car", "monitor", "home",
                "monitor", "book", "rain", "computer", "water"
        };

        HashSet<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word);
        }

        List<String> list = new ArrayList<>(uniqueWords);

        Arrays.sort(words);
        Collections.sort(list);
        System.out.println(Arrays.toString(words));
        System.out.println(list);
    }
}
