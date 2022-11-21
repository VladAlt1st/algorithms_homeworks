package Homework2022_11_08;

import java.util.Stack;

public class Homework_01 {
    public static void main(String[] args) {
        Stack<Integer> from = new Stack<>();
        Stack<Integer> middle = new Stack<>();
        Stack<Integer> to = new Stack<>();

        from.add(3);
        from.add(2);
        from.add(1);

        solve1( from, to, middle, 3);

        solve(3, 1, 3, 2);
    }

    private static void solve(int n, int from, int to, int middle) {
        if(n == 1) {
            System.out.println("Move 1 from rod " + from + " to rod " + to);
            return;
        }

        solve(n - 1, from, middle, to);
        System.out.println("Move " + n + " from rod " + from + " to rod " + to + " with rod " + middle);
        solve(n - 1, middle, to, from);
    }





    private static void solve1(Stack<Integer> from, Stack<Integer> to, Stack<Integer> middle, int n) {
        if (n > 0){
            solve1(from,middle,to,n-1);
            to.push(from.pop());
            solve1(middle,to,from,n-1);
        }
    }
}
