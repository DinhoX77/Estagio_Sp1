import java.util.Scanner;

public class Verificador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int num = scanner.nextInt();

        Fibonacci fibonacci = new Fibonacci();

        if (fibonacci.isFibonacci(num)) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}


