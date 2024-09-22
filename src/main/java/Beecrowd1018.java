import java.util.Scanner;
public class Beecrowd1018 {
    public static void main(String[] args)throws java.lang.Exception {
        Scanner leitor = new Scanner(System.in);
        //declarar variáveis
        int N,total,nota100,nota50,nota20,nota10,nota5,nota2,nota1;
        
        //ler a variável
        N = leitor.nextInt();
        
        //atribuir valores às variáveis
        total = N;
        nota100 = N/100;
        N %= 100;
        nota50 = N/50;
        N %= 50;
        nota20 = N/20;
        N %= 20;
        nota10 = N/10;
        N %= 10;
        nota5 = N/5;
        N %= 5;
        nota2 = N/2;
        N %= 2;
        nota1 = N;
        
        //mostrar resultado no console
        System.out.printf("%d%n%d nota(s) de R$ 100,00%n%d nota(s) de R$ 50,00%n%d nota(s) de R$ 20,00%n%d nota(s) de R$ 10,00%n%d nota(s) de R$ 5,00%n%d nota(s) de R$ 2,00%n%d nota(s) de R$ 1,00%n", total,nota100,nota50,nota20,nota10,nota5,nota2,nota1);
    }
}