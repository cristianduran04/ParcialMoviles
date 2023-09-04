import java.util.Scanner;

public class PotenciaRecursiva {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        int base = scanner.nextInt();

        System.out.print("Ingrese el exponente: ");
        int exponente = scanner.nextInt();

        int resultado = calcularPotencia(base, exponente);
        System.out.println(base + " elevado a la " + exponente + " es igual a " + resultado);

        scanner.close();
    }

    public static int calcularPotencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return base * calcularPotencia(base, exponente - 1);
    }
}