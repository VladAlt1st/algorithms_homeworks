package Homework2022_10_25;

/*
Find the element that appears once in a sorted array.
Given a sorted array in which all elements occur twice
(one after the other) and one element appears only once.
*/

public class Homework_02 {
    public static void main(String[] args) {
        int[] arr = new int[] {1,1,2,2,3,3,4,5,5,6,6};
        System.out.println(findSingleElement(arr));
    }

    public static int findSingleElement(int[] arr) {
        int element = -1;
        for (int i = 1; i < arr.length; i += 2) {
            if (arr[i] != arr[i - 1]) {
                element = arr[i - 1];
                break;
            }
        }
        if (element == -1 && arr.length % 2 != 0) {
            element = arr[arr.length - 1];
        }
        return element;
    }
}

