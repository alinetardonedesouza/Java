import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        float number1 = 0;
        float number2 = 0;
        float result = 0;


        System.out.print("Olá mundo! (｡･∀･)ﾉﾞ")
        System.out.print("Vamos somar dois números? ")

        System.out.print("Digite o primeiro número: ");
        number1 = input.nextFloat();

        System.out.print("Digite o segundo número: ");
        number2 = input.nextFloat();

        result = number1 + number2;

        System.out.printf("O resultado da soma é: %d\n", result)
        System.out.printf("(～￣▽￣)～")

    }
}
