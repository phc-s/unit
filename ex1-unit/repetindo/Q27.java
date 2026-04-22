public class Q27 {
    public static void main(String[] args) {

        try {

            System.out.println("\nFeito por phc-s! 🙌 (JAVA SE 21)");
            System.out.println("Questão 27 - Quadrado dos Inteiros (15-30)");

            System.out.println("\nResultados:\n");

            for (int i = 15; i <= 30; i++) { 

                long squareValue = (long) i * i;
                System.out.println(i + "² = " + squareValue);

            }

        } catch (Exception e) {

            System.err.println("\nERRO: Alguma coisa aconteceu de errado no script!");

        } finally {

            System.out.println("\nPrograma Encerrado!\n");

        }
    }
}