package Exercicios;

import java.util.Scanner;

public class triangulos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira três números reais, onde cada um equivalerá a um lado de um triângulo:");
        System.out.println("nA: ");
        int a = teclado.nextInt();
        System.out.println("nB: ");
        int b = teclado.nextInt();
        System.out.println("nC: ");
        int c = teclado.nextInt();

        int a1 = 0;
        int b1 = 0;
        int c1 = 0;

        if ((a < b) && (b < c)) {
            a1 = c;
            b1 = b;
            c1 = a;
        }
        else if ((b < a) && (a < c)){
            a1 = c;
            b1 = a;
            c1 = b;
        }
        else if ((a < c) && ( c < b)) {
            a1 = b;
            b1 = c;
            c1 = a;
        }
        else if ((a < b) && (c < a)){
            a1 = b;
            b1 = a;
            c1 = c;
        }
        else if ((c < a) && (b < c)){
            a1 = a;
            b1 = c;
            c1 = b;
        }
        else {
            a1 = a;
            b1 = b;
            c1 = c;
        }

        /*      Testes
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
*/

        int a2 = a1 * a1;
        int b2 = b1 * b1;
        int c2 = c1 * c1;


        if (a1 >= (b1 + c1)){
            System.out.println("Não forma um triângulo.");
        }
        else if ((a1 == b1) && (b1 == c1)){
            System.out.println("Triangulo equilatero.");
        }
        else if ((a1 == b1) && (a1 > c1)){
            System.out.println("Triangulo isoceles.");
        }
        else if ((a2) == (b2) + (c2)){
            System.out.println("Triangulo retangulo.");
        }
        else if (a2 > (b2 + c2)){
            System.out.println("Thriangulo obtusangulo.");
        }
        else if (a2 < (b2 + c2)){
            System.out.println("Triangulo acutangulo.");
        }
        else {
            System.out.println("Parabéns, você bugou a matrix");
        }
    }
}
