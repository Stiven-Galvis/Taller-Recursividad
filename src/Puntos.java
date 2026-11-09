import java.util.Scanner;
public class Puntos {
    int calcularFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * calcularFactorial(n - 1);
    }
    void punto1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese N para sumar de 1 a N: ");
        int n = scanner.nextInt();

        int resultado = calcularSuma(n);
        System.out.println("La suma es: " + resultado);
        scanner.close();
    }
    int calcularSuma(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + calcularSuma(n - 1);
    }
    void punto2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la base: ");
        int base = scanner.nextInt();
        System.out.println("Ingrese el exponente: ");
        int exponente = scanner.nextInt();

        int resultado = calcularPotencia(base, exponente);
        System.out.println("El resultado de la potencia es: " + resultado);
        scanner.close();
    }

    int calcularPotencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return base * calcularPotencia(base, exponente - 1);
    }

    void punto3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int n = scanner.nextInt();

        int resultado = contarDigitosRecursivo(n);
        System.out.println("La cantidad de dígitos es: " + resultado);
        scanner.close();
    }

    int contarDigitosRecursivo(int n) {
        if (n < 0) {
            n = -n;
        }
        if (n < 10) {
            return 1;
        }
        return 1 + contarDigitosRecursivo(n / 10);
    }

    void punto4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero a invertir: ");
        int n = scanner.nextInt();

        int resultado = invertirNumero(n, 0);
        System.out.println("Número invertido: " + resultado);
        scanner.close();
    }

    int invertirNumero(int n, int rev) {
        if (n == 0) {
            return rev;
        }
        return invertirNumero(n / 10, rev * 10 + n % 10);
    }
}