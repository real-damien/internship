package com.example; // Убедитесь, что пакет соответствует вашему проекту

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("3 + 4 = " + calculator.add(3, 4));
        System.out.println("10 - 5 = " + calculator.subtract(10, 5));
    }
}
