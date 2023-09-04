package com.campusdual;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("INTRODUZCA UN NUMERO");
        int num1=sc.nextInt();
        System.out.println("INTRODUZCA otro NUMERO");
        int num2=sc.nextInt();




        if(num1<0){
            System.out.println(" El numero es negativo");
        }else{
            System.out.println(" El numero es positivo");

        }

        if(num1%num2==0){
            System.out.println(" El numero 1 es multiple del numero 2");
        }else{
            System.out.println(" El numero 1 no es multiple del num 2");
        }

        if(num1<num2){
            System.out.println(" El numero 2 es menor que el num 1");
        }else{
            System.out.println(" El numero 1 esm ayor que el numero 2");
        }

    }
}
