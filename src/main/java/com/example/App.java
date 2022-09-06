package com.example;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
       Kata kata = new Kata();
       String number = kata.Type(3);
       System.out.println(number);

    }

    
}
