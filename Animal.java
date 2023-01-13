public class Animal {
    void bark() {
        System.out.println("Eating");
    }

}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}

class Animall {
    public static void main(String args[]) {
        Dog ob = new Dog();
        ob.bark();
        ob.bark();
    }
}