package Homework2022_11_01;

public class Homework_01 {
    // доп 1
    // best: a == b -> O(1);
    // worse: if a == 1 and b > 0 then need to do b operations -> O(n).
    void method1(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
    }


    // доп 2
    // first cycle -> O(n), second -> O(n), third - O(log n);
    // worse: O(n) * O(n) * O(log n) -> O(n2 log n).
    void method2(int n) {
        for (int i = 0; i < n / 2; i++) {
            for (int j = 1; j + n / 2 <= n; j++) {
                for (int k = 1; k <= n; k = k * 2) {
                    System.out.println("I am expert!");
                }
            }
        }
    }


    // доп 3
    // worse: between O(n2) or O(n log n), I think O(n log n).
    void method3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j = j + i) {
                System.out.println("I am expert!");
            }
        }
    }
}
