import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Lista de colores");
        System.out.println("Cuántos colores quieres introducir?");
        Scanner numColores = input.nextInt();

        ArrayList<String> colores = new ArrayList<String>();

        for (int i = 1; i <= numColores; i++) {
            System.out.println("Indroduce el color nº" + i + ":");
            String color = input.next();
            colores.add(color);
        }

        System.out.println("Hs introducido los siguientes colores: ");

        for (int i = 0; i<colores.siza(3); i++);
            System.out.println("\n" + colores.get(i));



        // Press Mayús+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Mayús+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);

        }


        input.close();

    }
}