package cn.chriswood;

import kotlin.coroutines.CoroutineContext;

public class HelloGradleKtJava {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello GradleKtJava!");
        CoroutineContext coroutineContext = coroutineDemo();
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.printf("sleep seconds: %d\n", i);
        }
    }

    public static void printName() {
        System.out.println(HelloGradleKtJava.class.getName());
    }

    public static CoroutineContext coroutineDemo() {
        System.out.println("coroutineDemo start");
        Coroutine4J coroutine4J = new Coroutine4J();
        CoroutineContext context = coroutine4J.getContext();
        coroutine4J.launchWithContext(context, () -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("coroutine4J finished");
            return null;
        });
        return context;
    }
}