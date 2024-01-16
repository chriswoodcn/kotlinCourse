package cn.chriswood.type.smartcast;


import cn.chriswood.type.smartcast.java.Kotliner;
import cn.chriswood.type.smartcast.java.Person;

public class JavaCasts {
    public static void main(String... args) {


        Kotliner kotliner = new Person("benny", 20);
        if (kotliner instanceof Person) {
            System.out.println(((Person) kotliner).name);
        }
    }
}


