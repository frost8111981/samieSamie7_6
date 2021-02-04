package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> newList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            String input = reader.readLine();
            list.add(input);
            newList.add(input); // Создаю 2 массива.
        }                             //1-й для нахожден мин макс. 2-й дублирую для последенго действия, что раньше встретится
        System.out.println();
        System.out.println();
        String temp = "";
        for (int i = 0; i < list.size(); i++) { // Сортирую по возрастанию
            for (int j = 0; j < list.size() - 1; j++) {
                if ((j + 1) < list.size() && list.get(j + 1).length() < list.get(j).length()) {
                    temp = list.get(j + 1);
                    list.set(j + 1, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        String minim = list.get(0); // Нахожу мин
        String max = list.get(list.size() - 1); // Нахожу макс

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
        System.out.println("Мин - " + minim);
        System.out.println("Макс - " + max);
        System.out.println();
        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));
        }
        System.out.println();
        System.out.println();


        for (int i = 0; i < newList.size(); i++) { // Послед действие. Что будет первым мин или макс.
            if (newList.get(i) == minim) {
                System.out.println("Раньше встретится " + newList.get(i));
                break;
            } else if (newList.get(i) == max) {
                System.out.println("Раньше встретится " + newList.get(i));
                break;
            }

        }

    }
}

