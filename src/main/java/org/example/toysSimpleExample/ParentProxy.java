package org.example.toysSimpleExample;

public class ParentProxy implements Toy {
    private RealToy realToy;

    public ParentProxy(RealToy realToy) {
        this.realToy = realToy;
    }

    @Override
    public void play() {
        System.out.println("Батько перевіряє, чи можна гратися...");
        // Додамо просту перевірку: можна гратися тільки вдень
        boolean isDaytime = true; // уявимо, що зараз день
        if (isDaytime) {
            realToy.play();
        } else {
            System.out.println("Зараз не можна гратися. Грайся пізніше.");
        }
    }
}
