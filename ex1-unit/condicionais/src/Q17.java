import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {

        try (Scanner scantool = new Scanner(System.in)) {

            System.out.println("\nFeito por phc-s! 🙌 (JAVA SE 21)");
            System.out.println("Questão 17 - Comparação de Igualdade e Magnitude");

            System.out.print("\nInsira o primeiro número: ");
            long n1 = scantool.nextLong();
            System.out.print("Insira o segundo número: ");
            long n2 = scantool.nextLong();
            long major;

            System.out.println("\nResultados:\n");
            if (n1 == n2) {

                System.out.println("Os números são IGUAIS.");

            } else {

                System.out.println("Os números são DIFERENTES.");

                if(n1 > n2){

                major = n1;

                } 
                else{

                major = n2;

                }
                
                System.out.println("O maior valor é: " + major);
                
            }

        } catch (Exception e) {

            System.err.println("\nERRO: Alguma coisa aconteceu de errado no script!");

        } finally {

            System.out.println("\nPrograma Encerrado!\n");

        }
    }
}