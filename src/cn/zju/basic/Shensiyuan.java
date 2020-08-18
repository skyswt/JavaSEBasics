package cn.zju.basic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Shensiyuan {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Class<Shensiyuan> clazz = Shensiyuan.class;
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            if (method.getName().equals("a")) {
                method.invoke(Shensiyuan.class);
            }
        }
    }

    public static void a() {
        System.out.println("aa");
    }

    public void b() {
        System.out.println("bb");
    }
}
