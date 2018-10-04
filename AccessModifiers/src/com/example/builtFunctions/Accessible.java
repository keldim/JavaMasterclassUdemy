package com.example.builtFunctions;

interface Accessible { // package private
    int SOME_CONSTANT = 100; // public
    public void methodA(); // public
    void methodB(); // public
    boolean methodC(); // public

    // all interface variables are public static final
    // review the lectures on interface
}
