package org.kanchann;

public class Animal1 {
    void sleep(){
        System.out.println("Every animal is sleeping");
    }
}
class Cat extends Animal1{
    void barks(){
        System.out.println("miow miow");
    }
}
class Elephant extends Animal1{
    void eat(){
        System.out.println("Elephant is eating more and more chara");
    }
}
class Cow extends Animal1{
    void milk(){
        System.out.println("Cow's milk is very postic");
    }
}
class Rabbit extends Animal1{
    void height(){
        System.out.println("Rabbit height is short");
    }
}
class Buffalo extends Animal1{
    void color(){
        System.out.println("buffalo color is black");
    }
}