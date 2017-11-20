package org.edu.personal;

/**
 * Created by esdmnv on 20/11/2017.
 */
public interface DefaultImplementationInterface {

    void method1(String param);

    void method2(String param);

    default void method3(String param){
        System.out.println("This is the param:" + param);
    }

    public class Implementation implements  DefaultImplementationInterface{

        @Override
        public void method1(String param) {

        }

        @Override
        public void method2(String param) {

        }
    }

    public class Implementation2 implements  DefaultImplementationInterface{

        @Override
        public void method1(String param) {

        }

        @Override
        public void method2(String param) {

        }

        @Override
        public void method3(String param){
            // Overriding default method
            System.out.println("This is the param from the overrriden method:" + param);
        }
    }


}


