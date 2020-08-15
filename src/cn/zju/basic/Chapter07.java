package cn.zju.basic;

import java.util.Arrays;

public class Chapter07 {
    public static void main(String[] args) {
        int[] a = {324, 3, 32, 0, -1};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 1; j < a.length; j++) {
                if (a[j] < a[j-1]) {
                    swap(a, j, j-1);
                }
            }
        }
        System.out.println(Arrays.toString(a));
        int[] b = new int[a.length];
        System.arraycopy(a, 0, b, 0, a.length);
        System.out.println(Arrays.toString(b));
        int[] c = Arrays.copyOfRange(b, 0, b.length-1);
        System.out.println(Arrays.toString(c));
    }

    public static void swap (int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
