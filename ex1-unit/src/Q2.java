import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        try (Scanner scantool = new Scanner(System.in)) {

            System.out.println("\nFeito por phc-s! 🙌 (JAVA SDK 26)");
            System.out.println("Questão 2, Sucessor e Antecessor de um Inteiro.");

            System.out.println("\nInsira um inteiro: ");
            long n = scantool.nextLong();

            System.out.println("\nValor Colocado: " + n  );
            System.out.println("Seu Antecessor: " + (n - 1) );
            System.out.println("Seu Sucessor: " + (n + 1) );

        } catch (Exception e){

            System.err.println("\nERRO: Somente coloque um valor inteiro, nunca coloque outro tipo!");

        } finally{

            System.out.println("\nPrograma Encerrado!\n");
            
        }
    }
}