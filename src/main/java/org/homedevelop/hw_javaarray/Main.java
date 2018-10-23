package org.homedevelop.hw_javaarray;

public class Main {
    public static void main(String[] args) {

        int [] array = {10, -20, 0, 30, 40, 60, 9};
            System.out.println(checkArrData(array));

    }

    public static boolean checkArrData(int [] array) {
        int i = 0;
        int q = 6;
        if (array[i]==10 || array[q]==10) {
            return true;}
            else {
            return false; }
        }
    }