public class Q25 {
    public static void main(String[] args) {
    
        try {

            System.out.println("\nFeito por phc-s! 🙌 (JAVA SE 21)");
            System.out.println("Questão 25 - Pares entre 14 e 30");

            System.out.println("\nResultados:\n");
            for (int i = 14; i <= 30; i++) {

                if (i % 2 == 0) {

                    System.out.print(i + " ");

                }

            }

            System.out.println();

        } catch (Exception e) {

            System.err.println("\nERRO: Alguma coisa aconteceu de errado no script!");

        } finally {

            System.out.println("\nPrograma Encerrado!\n");
            
        }
    }
}