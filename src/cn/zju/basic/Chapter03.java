package cn.zju.basic;

public class Chapter03 {
    public static void main(String[] args) {
//        char c = '毙';
//        System.out.println(c);
        /*以下哪些赋值语句能通过编译*/
//        byte a = 128; // 超出取值范围
        short b = 65;
        short c = -32000;
//        float d = 12.34;  // 浮点数默认为double，此时应加F或f
//        char e = '65';    // 字符智能有一个
        char f = 65;
//        short g = 65; char h = g; // short g可能为负数,无法直接赋值给char h
//        boolean i = "true";   // true / false为Java保留字,直接使用
        String j = "   123";
// 八种数据类型: byte, short, int, long, float, double, boolean, char
    }

}
