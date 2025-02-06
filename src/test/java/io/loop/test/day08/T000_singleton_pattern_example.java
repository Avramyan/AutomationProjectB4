package io.loop.test.day08;

public class T000_singleton_pattern_example {
    // private construction to prevent external instantiation
    private  T000_singleton_pattern_example(){}
    private static String word;

    //public getter
    public static String getWord() {

        if (word == null) {
            System.out.println("First time calling, object is null and assigning now");
            word = "driver";

        }else {
            System.out.println("word is already assigned and has value");
        }
        return word;
    }
}
