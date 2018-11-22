/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import static java.lang.Math.pow;

public class JavaApplication1 {

    public static void main(String[] args) {
        
        int numeroOriginal = 1234;
        int num1 = numeroOriginal % 10;
        numeroOriginal /= 10;
        int num2 = numeroOriginal % 10;
        numeroOriginal /= 10;
        
        System.out.println(num1);
        System.out.println(num2);
        
    }
    
}
