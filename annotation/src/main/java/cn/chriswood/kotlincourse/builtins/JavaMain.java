package cn.chriswood.kotlincourse.builtins;

import java.io.IOException;

public class JavaMain {
    public static void main(String... args) {
        KotlinAnnotations.hello("JavaMain");
        try {
            KotlinAnnotations.throwException();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void throwException() throws IOException {

    }
}
