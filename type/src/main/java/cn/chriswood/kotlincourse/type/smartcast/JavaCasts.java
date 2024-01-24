package cn.chriswood.kotlincourse.type.smartcast;


import cn.chriswood.kotlincourse.type.smartcast.java.Kotliner;
import cn.chriswood.kotlincourse.type.smartcast.java.Kotliner;
import cn.chriswood.kotlincourse.type.smartcast.java.Person;

public class JavaCasts {
    public static void main(String... args) {


        Kotliner kotliner = new Person("benny", 20);
        if (kotliner instanceof Person) {
            System.out.println(((Person) kotliner).name);
        }
    }
}


