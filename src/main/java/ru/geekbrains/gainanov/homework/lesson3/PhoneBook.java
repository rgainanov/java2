package ru.geekbrains.gainanov.homework.lesson3;

import java.util.*;

public class PhoneBook {
    private TreeMap<String, HashSet<String>> phoneDirectory = new TreeMap<String, HashSet<String>>();

    public void add(String surname, String phoneNumber) {
        HashSet<String> temp = new HashSet<>();
        surname = surname.toLowerCase();
        if(phoneDirectory.containsKey(surname)) {
            temp = phoneDirectory.get(surname);
        }
        temp.add(phoneNumber);
        phoneDirectory.put(surname, temp);

    }

    public void printRecords() {
        for(Map.Entry<String, HashSet<String>> o: phoneDirectory.entrySet()) {
            System.out.println(o.getKey() + " : " + o.getValue());
        }
    }

    public void get(String surname) {
        HashSet<String> temp;
        surname = surname.toLowerCase();

        if(phoneDirectory.containsKey(surname)) {
            temp = phoneDirectory.get(surname);
            System.out.println("Фамилия        |Номер Телефона");
            for (String o : temp) {
                int s = 15 - surname.length();
                surname = surname.substring(0,1).toUpperCase() + surname.substring(1);
                System.out.println(surname + getSpaces(s) + o);
            }
        } else {
            System.out.println("Такого абонента не существует.");
        }
    }

    private String getSpaces(int s) {
        String spaces = " ";
        char space = ' ';
        for (int i = 0; i < s; i++) {
            spaces += space;
        }

        return spaces;
    }
}
