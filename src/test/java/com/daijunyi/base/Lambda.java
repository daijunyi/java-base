package com.daijunyi.base;

import org.junit.Test;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author djy
 * @createTime 2022/7/28 21:06
 * @description
 */
public class Lambda {

    @Test
    public void test1(){
        Runnable run1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("运行了1");
            }
        };
        run1.run();

        Runnable run2 = () -> System.out.println("运行了2");
        run2.run();
    }

    public void sortTest(){
        TreeSet<String> tree = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
    }
}
