package oops;

public class Abstractions {
    public static void main(String[] args) {
        Bear B = new Bear();
        B.eat();
    }
}

interface Hervivore{
    void eat();
}

interface carnivore{
    void eatNonVeg();
}

class Bear implements Hervivore,carnivore{
    public void eat(){
        System.out.println("Eats plants");
    }

    public void eatNonVeg(){
        System.out.println("Eats non veg");
    }
}