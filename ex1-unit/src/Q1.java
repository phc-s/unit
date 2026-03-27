import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        try (Scanner scantool = new Scanner(System.in)) {

            System.out.println("\nFeito por phc-s! 🙌 (JAVA SDK 26)");
            System.out.println("Questão 1, Multiplicando Inteiros.");

            System.out.println("\nInsira o primeiro inteiro: ");
            long a = scantool.nextLong();

            System.out.println("\nInsira o segundo inteiro: ");
            long b = scantool.nextLong();

            System.out.println("\nMultiplicação: " + a + " * " + b );
            System.out.println("Resultado: " + (a * b));

        } catch (Exception e){

            System.err.println("\nERRO: Somente coloque um valor inteiro, nunca coloque outro tipo!");

        } finally{

            System.out.println("\nPrograma Encerrado!\n");
            
        }
    }
}
