package pack1;

import pack2.Class2;
import pack3.Class3;

public class Class1 {
    public void metodo1() {
        System.out.println("Classe 1 no Package1");
        System.out.println("Arquivo na Branch Develop");
    }

    public void callMetodo2() {

        Class2 class2 = new Class2();
        class2.metodo2();
    }

    public void callMetodo3() {

        Class3 class3 = new Class3();
        class3.metodo3();
    }
}
