package org.example;

import org.example.Lecture.Calculator;

public class App{

    public static void main( String[] args ){
        Calculator calculator = new Calculator();
        int z = calculator.add(5,5);
        if(z == 10){
            System.out.println("ok");
        }else {
            System.out.println("no");
        }


}
}
