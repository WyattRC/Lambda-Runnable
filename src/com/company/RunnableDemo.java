package com.company;

public class RunnableDemo {
    public static void main(String[] args) {

        // !! - Write an anonymous Runnable class here
        //It can just print out "Anonymous run" or similar



        Runnable anonRun = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable run run run run and ");
            }
        };

                anonRun.run();

        // !! - Write a lambda function here
        //It can also print out something like "Lambda run"
        Runnable lambdaRun = () -> System.out.println("Lambda run");

                lambdaRun.run();

    }
}

