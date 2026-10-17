package com.itjava;

public class StringUtil {
    public static void printNumber(String name) {
        if (name == null) {
            System.out.println("你的传输名字不能为null");
            return;
        }
        System.out.println("名字长度是: " + name.length());
    }

    /**
     * 求字符串的最大索引
     *
     */
    public static int getMaxIndex(String data) {
        if (data == null) {
            return -1;
        }
        return data.length() - 1;
    }
}
