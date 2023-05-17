package com.gmail.valeriipiliaiev;

import java.util.Arrays;
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        int[] first = new int[7];
        int[] second = new int[7];
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            first[i] = random.nextInt(10);
            second[i] = random.nextInt(10);
        }
        for (int i = 0; i < first.length - 1; i++) {
            for (int j = 0; j < first.length - i - 1; j++) {
                if (first[j] > first[j + 1]) {
                    int temp = first[j];
                    first[j] = first[j + 1];
                    first[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < second.length - 1; i++) {
            for (int j = 0; j < second.length - i - 1; j++) {
                if (second[j] > second[j + 1]) {
                    int temp = second[j];
                    second[j] = second[j + 1];
                    second[j + 1] = temp;
                }
            }
        }
        System.out.println("Числа лотереї " + Arrays.toString(first));
        System.out.println("Ваші числа " + Arrays.toString(second));
        int matches = 0;
        for (int i = 0; i < first.length; i++) {
            if (first[i] == second[i]) {
                matches++;
            }
        }
        System.out.println("Кількість збігів: " + matches);

    }
}
