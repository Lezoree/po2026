package agh.po.zadania;
import agh.po.animals.*;

import java.util.Random;

public class Zoo {
    public static void main(String[] args) {
        Animal[]animals = new Animal[100];
        Random random = new Random();

        for (int i = 0; i < animals.length; i++){
            int los = random.nextInt(3);
            if (los == 0) {
                animals[i] = new Dog();
            }
            else if (los == 1) {
                animals[i] = new Parrot();
            }
            else {
                animals[i] = new Snake();
            }
            animals[i].getDescription();
            int legs = animals[i].getLegs();
            animals[i].makeSound();
        }
        int suma = wszystkieNogi(animals);
        System.out.println("Suma nóg: " + suma);


    }
    public static int wszystkieNogi(Animal[] tablica) {
        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            suma += tablica[i].legs;
        }
        return suma;
    }
}
