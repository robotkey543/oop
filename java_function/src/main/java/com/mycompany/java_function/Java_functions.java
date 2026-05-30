/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java_function;

/**
 *
 * @author robot
 */
public class Java_functions {
    //Functions
    public static void hello(){
        System.out.println("Hello everyone. Welcome !!!");
    }
    
    public static String hello2(String msg){
        return msg;
    }
    
    public static void add1(){
        int num1, num2;
    
        num1 = 10;
        num2 = 20;
        System.out.println("Addition with F1 is: " + (num1 +  num2));
    }
    
    public static void add2(int p, int q){
        System.out.println("Addition with F2 is: " + (p +  q));
    }
    
    public static int add3(int z, int w){
        int t;
        t = z + w;
        return t;
    }
    
    public static int add4(int z, int w){
        return z + w;
    }
    
    public static void loop1(){
        for(int i=1; i<=10; i++)
            System.out.println(i);
    }
    
    
   
    public static void main(String[] args) {
        int n1, n2, mi_variable;
        String message = "Hello Joan !!!";
    
        n1 = 50;
        n2 = 20;
        
        int number1 = 1;
        int number2 = 2;
        //Call hello function
        hello();
        //Call add1 function
        add1();
        //Call add2 function
        add2(n1, n2);
        //Call add3 function
        //Form1
        mi_variable = add3(number1, number2);
        System.out.println("Addition with F3 with variable is: " + mi_variable);
        //Form2
        System.out.println("Addition with F3 without variable is: " + add3(number1, number2));
        System.out.println(hello2(message));
        loop1();
    }
}
