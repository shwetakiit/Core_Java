package kumari.shweta.java8.functionalInterface;

@FunctionalInterface
public interface Interf1 extends  Interf {  //Functional interface can extend other functional interface
    // void display()                  //Multiple non-overriding abstract methods found in interface kumari.shweta.java8.functionalInterface.Interf
default void defaultMethod(){

    show();  // We can extend Functional interface with same abstract method

}

public static void staticMethod(){

}

}
