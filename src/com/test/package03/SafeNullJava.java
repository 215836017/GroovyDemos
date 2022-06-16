package com.test.package03;

public class SafeNullJava {

    public static void main(String[] args) {
        SafeNullJava s = new SafeNullJava();
        s.foo("abc");
        s.foo(null);
    }

    private void foo(String str) {
        if (null != str) {
            System.out.println(str.toUpperCase());
        }
    }
}
