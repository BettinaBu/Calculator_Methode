import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double zahl1 = userInput();
        double zahl2 = userInput();
        printInput(zahl1, zahl2);

        printResult("Addition", add(zahl1, zahl2));
        printResult("Substraktion", substract(zahl1, zahl2));
        printResult("Multiplikation", multiply(zahl1, zahl2));
        printResult("Division", divide(zahl1, zahl2));
        printResult("Rest der Division", restBerechnen(zahl1, zahl2));
    }


    public static void printResult(String resultName, double result){
        System.out.println("Das Ergebnis der " + resultName + " = " + result);
    }

    public static void printInput (double a, double b){
        System.out.println("a = " + a);
        System.out.println("b = " + b + "\n");
    }

    public static double userInput (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte gib hier eine Zahl ein: ");
        return scanner.nextDouble();
    }

    public static double add (double a, double b){
        return a + b;
    }

    public static double substract (double a, double b){
        return a - b;
    }

    public static double multiply(double a, double b){
        return a * b;
    }

    public static double divide (double a, double b){
        if (b == 0){
            System.out.println("Error: Division durch 0 nicht gültig.");
            return 0;
        } else {
            return a / b; // oder return a / (b * 1.0) dann wirds ein double und ich muss es nicht überall ändern
        }
    }

    public static double restBerechnen (double a, double b){
        if (b == 0){
            System.out.println("Error: Division durch 0 nicht gültig.");
            return 0;
        } else {
            return a % b;
        }
    }
}