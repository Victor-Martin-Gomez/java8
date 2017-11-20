package org.edu.personal;

/**
 * Created by esdmnv on 20/11/2017.
 */
public class LambdaExpressions {

    public static void main(int[] args){
        // Before Java 8
        Runnable r = new Runnable(){
            @Override
            public void run() {
                System.out.println("My Runnable");
            }};
        r.run();

        // Java 8
        Runnable r2 = () -> {
            System.out.println("My Java 8 Runnable");
        };
        r2.run();

        // If it is single lines, we could use
        Runnable r3 = () -> System.out.println("My Java 8 Runnable");

        r3.run();
    }
}
