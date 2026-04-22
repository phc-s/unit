import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {

        try (Scanner scantool = new Scanner(System.in)) {

            System.out.println("\nFeito por phc-s! 🙌 (JAVA SE 21)");
            System.out.println("Questão 21 - Verificador de Triângulos");

            System.out.print("\nSide A: ");
            long sideA = scantool.nextLong();
            System.out.print("Side B: ");
            long sideB = scantool.nextLong();
            System.out.print("Side C: ");
            long sideC = scantool.nextLong();

            System.out.println("\nResultados:\n");

            if (sideA < (sideB + sideC) && sideB < (sideA + sideC) && sideC < (sideA + sideB)) {
                
                if (sideA == sideB && sideB == sideC) {

                    System.out.println("Tipo: Equilatero");

                } else if (sideA == sideB || sideA == sideC || sideB == sideC) {

                    System.out.println("Tipo: Isosceles");

                } else {

                    System.out.println("Tipo: Escaleno");
                }

            } else {

                System.out.println("Os valores dados falham em formar um triângulo.");

            }

        } catch (Exception e) {
            System.err.println("\nERRO: Alguma coisa aconteceu de errado no script!");
        } finally {
            System.out.println("\nPrograma Encerrado!\n");
        }
    }
}