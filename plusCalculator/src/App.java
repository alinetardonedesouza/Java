import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        float number1 = 0;
        float number2 = 0;
        float result = 0;


        System.out.println("Olá mundo! (｡･∀･)ﾉﾞ");
        System.out.println("Vamos somar dois números? ");

        System.out.println("Digite o primeiro número: ");
        number1 = input.nextFloat();

        System.out.println("Digite o segundo número: ");
        number2 = input.nextFloat();

        result = number1 + number2;

        System.out.printf("O resultado da soma é: %d\n", result);
        System.out.println("(～￣▽￣)～");

    }
}
