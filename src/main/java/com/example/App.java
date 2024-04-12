package com.example;



public class App {
    public static void main(String[] args) {
        // Dibuja 10 círculos en posiciones aleatorias
        for (int i = 0; i < 10; ++i) {
            // Obtiene un color aleatorio para el círculo
            String color = getRandomColor();
            // Obtiene un círculo del color aleatorio
            Shape circle = ShapeFactory.getCircle(color);
            // Dibuja el círculo en una posición aleatoria
            circle.draw(getRandomX(), getRandomY());
        }
    }

    // Método para obtener un color aleatorio de la lista de colores
    private static String getRandomColor() {
        return ColorProvider.colors[(int) (Math.random() * ColorProvider.colors.length)];
    }

    // Método para generar una posición x aleatoria
    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    // Método para generar una posición y aleatoria
    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}