package cn.zju.basic;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class Chapter13 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("hello");
        });
        thread.start();

    }
}
