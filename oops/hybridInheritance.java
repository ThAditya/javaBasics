package oops;

public class hybridInheritance {
    public static void main(String[] args) {
        // Animal animal = new Animal();
        // animal.eat();

        lion lions = new lion();
        lions.breathe();
    }
}

class Animal {
    void eat() {
        System.out.println("Eating...");
    }

    void breathe() {
        System.out.println("Breathe");
    }
}

class fish extends Animal {
    void fins() {
        System.out.println("Fins");
    }
}

class tunna extends fish {
    void carnivorus() {
        System.out.println("Carnivorous");
    }
}

class shark extends fish {
    void Hervivore() {
        System.out.println("Hervivore");
    }
}

class birds extends Animal {
    void fly() {
        System.out.println("Fly");
    }
}

class eagle extends birds {
    void sharpEye() {
        System.out.println("Sharp Eye");
    }
}

class parrot extends birds {
    void colorful() {
        System.out.println("Colorful");
    }
}

class mammals extends Animal {
    void warmBlood() {
        System.out.println("Warm Blood");
    }
}

class DOg extends mammals {
    void loyal() {
        System.out.println("Loyal");
    }
}

class lion extends mammals {
    void kingOfJungle() {
        System.out.println("King Of Jungle");
    }
}
