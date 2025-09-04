import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Somasubtracao calc = new Somasubtracao();

        System.out.println("=== Calculadora ===");
        System.out.print("Digite o primeiro número: ");
        double num1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Digite o segundo número: ");
        double num2 = Double.parseDouble(scanner.nextLine());

        System.out.println("Escolha a operação:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        int opcao = Integer.parseInt(scanner.nextLine()); 

        double resultado;

        switch (opcao) {
            case 1:
                resultado = calc.somar(num1, num2);
                System.out.println("Resultado da soma: " + resultado);
                break;
            case 2:
                resultado = calc.subtrair(num1, num2);
                System.out.println("Resultado da subtração: " + resultado);
                break;
            case 3:
                resultado = calc.multiplicar(num1, num2);
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = calc.dividir(num1, num2);
                    System.out.println("Resultado da divisão: " + resultado);
                    break;
                }
                else {
                    System.out.println("Não existe divisão por zero!");
                    break;
                }
            default:
                System.out.println("Opção inválida.\n");
        }

        scanner.close();
    }
}

