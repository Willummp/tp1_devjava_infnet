package org.example;
import pack1.Class1;
import pack2.Class2;
import pack3.Class3;

public class App {
    public static void main(String[] args) {

        Class1 class1 = new Class1();
        Class2 class2 = new Class2();
        Class3 class3 = new Class3();


        class1.metodo1();
        class1.callMetodo2();
        class1.callMetodo3();

        class2.metodo2();

        class3.metodo3();
    }
}
