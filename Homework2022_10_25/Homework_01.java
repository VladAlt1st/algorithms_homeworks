package Homework2022_10_25;

/*
Linear Search. Given an array arr[] of N elements,
the challenge is to write a function to find a given element x in arr[] .
*/

public class Homework_01 {
    public static void main(String[] args) {
        int[] arr = new int[]{10,4,3,2,5,8,7,6,9,1};
        System.out.println(getIndex(8,arr));
    }

    public static int getIndex(int x, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}