package cn.chriswood.kotlincourse.type.classes;


import cn.chriswood.kotlincourse.type.classes.java.SimpleClass;

public class JavaClasses {
    public static void main(String[] args) {
        SimpleClass simpleClass = new SimpleClass(9);
        System.out.println(simpleClass.x);
        simpleClass.y();
    }
}
