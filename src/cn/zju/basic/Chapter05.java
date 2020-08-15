package cn.zju.basic;

public class Chapter05 {
    public static void main(String[] args) {
//        int i = 1;
//        while (i <= 100) {
//            System.out.println(i + ":HelloWorld");
//            i++;
//        }

        /*for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        System.out.println("打印直角三角形");
        for (int i = 0; i < 4; i++) {
            for(int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("打印等腰三角形");
        for (int i = 0; i < 5; i++) {
            for (int j = 5 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2*i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
