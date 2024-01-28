class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
   
    public void makeSound() {
        System.out.println("Meow!");
    }
}

class RuntimePolymorphismExample {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.makeSound(); // Outputs "Woof!"
        animal2.makeSound(); // Outputs "Meow!"
    }
}