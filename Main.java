package com.company;

import java.lang.String;
import java.util.Scanner;

public class Main {

    public static void sort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp_num = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp_num;
                }
            }
        }
        for (int i : list) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        String prepreList = getInput.nextLine();
        String[] preList = prepreList.split(" ");
        int[] regList = new int[preList.length];
        for (int i = 0; i < preList.length; i++) {
            regList[i] = Integer.parseInt(preList[i]);
        }
        sort(regList);
    }
}
