import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        try (Scanner scantool = new Scanner(System.in)) {

            System.out.println("\nFeito por phc-s! 🙌 (JAVA SE 21)");
            System.out.println("Questão 19 - O Maior de Três Números");

            System.out.print("\nValor 1: ");
            long v1 = scantool.nextLong();
            System.out.print("Valor 2: ");
            long v2 = scantool.nextLong();
            System.out.print("Valor 3: ");
            long v3 = scantool.nextLong();

            long maior = v1;
            
            if (v2 > maior) 
            {
                maior = v2;
            }
            if (v3 > maior)
            { 
                maior = v3;
            }

            System.out.println("\nResultados:\n");
            System.out.println("O maior valor digitado foi: " + maior);

        } catch (Exception e) {

            System.err.println("\nERRO: Alguma coisa aconteceu de errado no script!");

        } finally {

            System.out.println("\nPrograma Encerrado!\n");
        }

    }
}