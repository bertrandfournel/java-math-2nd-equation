package com.bertrandfournel;

import static java.lang.Math.pow;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Bienvenue sur ce programme de résolution des équations du second degré.");
        work();
    }

    static void work(){
        double a = 0, b = 0, c = 0, delta, x0, x1, x2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez une équation sous le forme suivante : AX² + B + C = 0");
        System.out.print("Saisissez A :");
        a = sc.nextDouble();
        System.out.print("Saisissez B :");
        b = sc.nextDouble();
        System.out.print("Saisissez C :");
        c = sc.nextDouble();

        delta = pow(b, 2) - (4 * a * c);

        if (delta < 0){
            System.out.println("L'équation n'a pas de solution.");
        }else if(delta == 0){
            x0 = -b / (2 * a);
            System.out.println("L'équation a une solution double : " + x0);
        }else{
            x1 = (-b - Math.sqrt(delta)) / (2 * a);
            x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("L'équation a deux solutions : ");
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        }
        nouveau();
    }
    static void nouveau(){
        Scanner nv = new Scanner(System.in);
        String res = "";
        System.out.println("Souhaitez-vous faire un nouveau calcul ? o/n");
        res = nv.nextLine();
        if(res.equals("o")){
            work();
        }else if (res.equals("n")){
            System.out.println("A bientôt");
        }else{
            System.out.println("Je n'ai pas compris votre réponse...");
            nouveau();
        }
    }

}
