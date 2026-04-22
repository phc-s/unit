public class Q26 {
    public static void main(String[] args) {

        try {

            System.out.println("\nFeito por phc-s! 🙌 (JAVA SE 21)");
            System.out.println("Questão 26 - Tabuada do 7");

            System.out.println("\nResultados:\n");
            for (int i = 1; i <= 10; i++) {
                System.out.println("7 x " + i + " = " + (7 * i));
            }

        } catch (Exception e) {

            System.err.println("\nERRO: Alguma coisa aconteceu de errado no script!");

        } finally {

            System.out.println("\nPrograma Encerrado!\n");

        }
    }
}