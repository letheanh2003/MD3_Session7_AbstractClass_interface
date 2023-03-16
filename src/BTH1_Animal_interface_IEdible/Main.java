package BTH1_Animal_interface_IEdible;


import BTH1_Animal_interface_IEdible.animals.Animal;
import BTH1_Animal_interface_IEdible.animals.Chicken;
import BTH1_Animal_interface_IEdible.animals.Tiger;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
        }

    }
}