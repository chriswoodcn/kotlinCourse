package cn.chriswood.kotlincourse.basics;

import java.io.*;

public class JavaGenerics {
    public static void main(String... args) throws IOException {
        int max = Math.max(1, 2);

        File file = new File("hello.txt");
        try(InputStream is = new FileInputStream(file)){

        }
    }
}
