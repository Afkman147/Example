package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Программа показывает результаты бега 5 участников. Так же показывает быстрейшего.");
        System.out.println("\n"+"Результаты участников:");
        String[][] beg = new String[5][2];
        beg[0][0] = "Анатолий";
        beg[1][0] = "Бекуш";
        beg[2][0] = "Бибис";
        beg[3][0] = "Кабачок";
        beg[4][0] = "Пармезан";

        for (int i = 0; i < beg.length; i++) {
            int rnd1 = (int) (Math.random() * 120 + 1);
            beg[i][1] = Integer.toString(rnd1);
            System.out.println(beg[i][0] + " " + beg[i][1] + " секунд");
        }

        System.out.println();

        for (int i = 0; i < beg.length; i++) {
            for (int j = 0; j < beg.length - 1; j++) {
                int a = Integer.parseInt(beg[j][1]);
                int b = Integer.parseInt(beg[j + 1][1]);
                if (a > b) {

                    String memory = beg[j][1];
                    beg[j][1] = beg[j + 1][1];
                    beg[j + 1][1] = memory;

                    memory = beg[j][0];
                    beg[j][0] = beg[j + 1][0];
                    beg[j + 1][0] = memory;
                }

            }

        }
        System.out.println("Самый быстрый: "+beg[0][0] + "  " + beg[0][1] + " секунд");
    }
}