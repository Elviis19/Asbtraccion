package main;

import Animales.Animal;
import Animales.Gato;
import Animales.León;
import Animales.Lobo;
import Animales.Perro;

public class Ejecutar {

    public static void main(String[] args) {

        Animal[] animales = new Animal[4];

        animales[0] = new Gato();
        animales[1] = new Perro();
        animales[2] = new Lobo();
        animales[3] = new León();

        for (int i = 0; i < animales.length; i++) {
            System.out.println(animales[i].getNombreCientifico());
            System.out.println("Sonido = " + animales[i].getSonido());
            System.out.println("Alimentos = " + animales[i].getAlimentos());
            System.out.println("Habitat = " + animales[i].getHabitat());
            System.out.println("\n_____________________________________\n");
        }
    }
}