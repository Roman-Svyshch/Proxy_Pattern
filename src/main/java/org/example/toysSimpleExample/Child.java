package org.example.toysSimpleExample;

public class Child {
    public static void main(String[] args) {
        RealToy realToy = new RealToy();
        ParentProxy parentProxy = new ParentProxy(realToy);

        System.out.println("Дитина хоче гратися з іграшкою:");
        parentProxy.play();  // Батько перевіряє, чи можна гратися... Ти граєшся з іграшкою!
    }
}
