package com.example;


// Implementación concreta de Shape (Flyweight)
public class Circle implements Shape {
    private String color;
 // Constructor que recibe el color del círculo
    public Circle(String color) {
        this.color = color;
    }

    // Implementación del método draw de la interfaz Shape
    @Override
    
    //Dibuja el circulo con posicion x y)
    public void draw(int x, int y) {
        System.out.println("Dibujando un círculo de color " + color + " en (" + x + ", " + y + ")");
    }
}
