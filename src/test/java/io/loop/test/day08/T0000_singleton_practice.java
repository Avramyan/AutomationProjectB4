package io.loop.test.day08;

import org.testng.annotations.Test;

public class T0000_singleton_practice {

    @Test
    public void example1() {
        String str1 = T000_singleton_pattern_example.getWord();
        System.out.println(str1);

        System.out.println("========================");
        String str2 = T000_singleton_pattern_example.getWord();
        System.out.println(str2);
    }
}
