public class Q28 {
    public static void main(String[] args) {
        try {
            System.out.println("\nFeito por phc-s! 🙌 (JAVA SE 21)");
            System.out.println("Questão 28 - Soma dos 100 Primeiros Inteiros");

            long sum = 0;
            for (int i = 1; i <= 100; i++) {
                sum += i;
            }

            System.out.println("\nResult: " + sum);

        } catch (Exception e) {

            System.err.println("\nERRO: Alguma coisa aconteceu de errado no script!");

        } finally {

            System.out.println("\nPrograma Encerrado!\n");
            
        }
    }
}