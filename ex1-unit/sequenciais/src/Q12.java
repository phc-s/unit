public class Q12 {
    public static void main(String[] args) {
        try {
            
            System.out.println("\nFeito por phc-s! 🙌 (JAVA SE 21)");
            System.out.println("Questão 12 - Médias Aritméticas");

            double media1 = (7 + 8 + 9) / 3.0;
            double media2 = (4 + 5 + 6) / 3.0;

            double somaMedias = media1 + media2;
            double mediaDasMedias = (media1 + media2) / 2.0;

            

            System.out.println("\nResultados:\n");
            
            System.out.println("Média dos números 7, 8 e 9: " + media1);
            System.out.println("Média dos números 4, 5 e 6: " + media2);
            
            System.out.println("---");
            
            System.out.println("Soma das duas médias: " + somaMedias);
            System.out.println("Média das médias: " + mediaDasMedias);

        } catch (Exception e) {

            System.err.println("\nERRO: Alguma coisa aconteceu de errado no script!");

        } finally {

            System.out.println("\nPrograma Encerrado!");

        }
    }
}