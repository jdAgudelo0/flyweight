package com.example;


import java.util.HashMap;
import java.util.Map;

// Fábrica de objetos Flyweight
public class ShapeFactory {
// Mapa para almacenar instancias de círculos compartidas
    private static final Map<String, Shape> circleMap = new HashMap<>();

// Método para obtener un círculo del color especificado
    public static Shape getCircle(String color) {
        // Verifica si ya existe un círculo del color especificado en el mapa
        Circle circle = (Circle) circleMap.get(color);

    // Si no existe, crea un nuevo círculo y lo agrega al mapa
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creando un nuevo círculo de color " + color);
        }

// Devuelve el círculo existente o recién creado
        return circle;
    }
}