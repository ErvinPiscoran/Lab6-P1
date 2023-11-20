/*1. Creati o clasa Animal cu metodele eat() si sound(). Creati 3 subclase: Lion, Tiger, Panther.
Suprascrieti metoda eat() in fiecare subclasa care sa descrie ce mananca fiecare animal.
Suprascrieti metoda sound() care sa descrie sunetul fiecarui animal. In clasa Main creati o instanta
din fiecare subclasa si apelati metodele.*/

class Animal {
    void eat() {
        System.out.println("Animal eats -----");
    }

    void sound() {
        System.out.println("Animal sounds like -----");
    }
}

class Lion extends Animal {
    @Override
    void eat() {
        System.out.println("Lion eats sushi.");
    }

    @Override
    void sound() {
        System.out.println("Lion says: go make me a sandwich.");
    }
}

class Tiger extends Animal {
    @Override
    void eat() {
        System.out.println("Tiger eats burgers.");
    }

    @Override
    void sound() {
        System.out.println("Tiger says: why is my coffee cold?!");
    }
}

class Panther extends Animal {
    @Override
    void eat() {
        System.out.println("Panther eats pizza.");
    }

    @Override
    void sound() {
        System.out.println("Panther says: where is THE MUFFIN MAN?");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal tigru = new Tiger();
        Animal leu = new Lion();
        Animal pantera = new Panther();
        leu.eat();
        tigru.eat();
        pantera.eat();
        leu.sound();
        tigru.sound();
        pantera.sound();
    }
}