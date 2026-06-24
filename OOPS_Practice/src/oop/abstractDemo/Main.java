package oop.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(24);
        son.career();
        son.normal();

        Daughter daughter = new Daughter(23);
        daughter.career();

        Parent.hello();
    }
}

/*
abstract → “You must extend me.”

final → “You cannot extend me.”

So writing final abstract together is like saying:
👉 "You must eat this food, but also you cannot eat it." 😂


 */
