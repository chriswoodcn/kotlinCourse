package cn.chriswood.type.classes;


import cn.chriswood.type.classes.java.SimpleClass;

public class JavaClasses {
    public static void main(String[] args) {
        SimpleClass simpleClass = new SimpleClass(9);
        System.out.println(simpleClass.x);
        simpleClass.y();
    }
}
