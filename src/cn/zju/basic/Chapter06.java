package cn.zju.basic;

import java.util.Scanner;

public class Chapter06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int n = in.nextInt();
            System.out.println(f(n));
        }
    }

    // 使用递归计算菲波那切数列
    public  static int f(int n) {
        if (n <= 1) return 0;
        else if (n == 2) return 1;
        else return f(n-1) + f(n-2);
    }
}
