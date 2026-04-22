import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        try (Scanner scantool = new Scanner(System.in)) {

            System.out.println("\nFeito por phc-s! 🙌 (JAVA SE 21)");
            System.out.println("Questão 9, Troca de Valores.");

            System.out.print("\nInsira um valor qualquer: ");
            String a = scantool.nextLine();
            System.out.print("Insira um outro valor qualquer: ");
            String b = scantool.nextLine();


            System.out.println("\nResultados:\n");

            System.out.println("Valores originais!" );
            System.out.println("A = " + a );
            System.out.println("B = " + b );


            String temp = a;
            a = b;
            b = temp;
            
            System.out.println("\nvalores trocados!");
            System.out.println("A = " + a );
            System.out.println("B = " + b );

        } catch (Exception e) {

            System.err.println("\nERRO: Alguma coisa aconteceu de errado no script!");

        } finally {

            System.out.println("\nPrograma Encerrado!\n");
            
        }
    }
}