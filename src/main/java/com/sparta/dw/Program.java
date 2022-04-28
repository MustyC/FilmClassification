package com.sparta.dw;

public class Program {

    public static void main(String[] args) {
        GreetingGenerator greetingGenerator = new GreetingGenerator();
        String greeting = greetingGenerator.getGreeting(13);
        System.out.println(greeting);
    }

}