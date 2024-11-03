import java.util.Scanner;public class Main {    public static void main(String[] args) {        System.out.println("Bienvenido a la calculadora de la clase Main");        menu();    }    public static void menu() {        Scanner scanner = new Scanner(System.in);        Operations operations = new Operations();        System.out.println("Menu de la calculadora");        System.out.println("1. Sumar");        System.out.println("2. Restar");        System.out.println("3. Multiplicar");        System.out.println("4. Dividir");        System.out.println("5. Salir");        System.out.println("Seleccione una opcion: ");        int option = 0;        try {            option = Integer.parseInt(scanner.nextLine());            switch(option) {                case 1:                    System.out.println("Selecciono sumar");                    System.out.println("Ingrese el primer numero: ");                    int a = Integer.parseInt(scanner.nextLine());                    System.out.println("Ingrese el segundo numero: ");                    int b = Integer.parseInt(scanner.nextLine());                    System.out.println("El resultado de la suma es: " + operations.sum(a, b));                    menu();                    break;                case 2:                    System.out.println("Selecciono restar");                    System.out.println("Ingrese el primer numero: ");                    a = Integer.parseInt(scanner.nextLine());                    System.out.println("Ingrese el segundo numero: ");                    b = Integer.parseInt(scanner.nextLine());                    System.out.println("El resultado de la resta es: " + operations.substract(a, b));                    menu();                    break;                case 3:                    System.out.println("Selecciono multiplicar");                    System.out.println("Ingrese el primer numero: ");                    a = Integer.parseInt(scanner.nextLine());                    System.out.println("Ingrese el segundo numero: ");                    b = Integer.parseInt(scanner.nextLine());                    System.out.println("El resultado de la multiplicacion es: " + operations.multiply(a, b));                    menu();                    break;                default:                    System.out.println("Opcion no valida");                    menu();                    break;            }        } catch (NumberFormatException e) {            System.out.println("Por favor, ingrese un numero valido");            menu();        }    }}