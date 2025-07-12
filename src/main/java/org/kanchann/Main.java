package org.kanchann;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal1 a1 = new Animal1();
        a1.sleep();

        Cat c = new Cat();
        c.barks();
        c.sleep();

        Elephant e = new Elephant();
        e.eat();
        e.sleep();

        Cow c1 = new Cow();
        c1.milk();
        c1.sleep();

        Rabbit r = new Rabbit();
        r.height();
        r.sleep();

        Buffalo b = new Buffalo();
        b.color();
        b.sleep();

    }
}