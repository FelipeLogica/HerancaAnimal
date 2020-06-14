import java.util.Scanner;
/**
 * @author Felipe Voigt
 * @version 1.0
 * @since 11/06/2020 - 19:48
 * @category View
 */
public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\f");

        System.out.println("Digite o nome do seu cachorro");
        String nome = scanner.next();
        System.out.println("Digite a raça do seu cachorro");
        String raca = scanner.next();
        System.out.println("Digite a idade do cachorro");
        int idade = scanner.nextInt();
        System.out.println("Informe se seu cachorro é castrado");
        String castracao = scanner.next();
        System.out.println("Digite o porte fidico do seu cachorro");
        String porte = scanner.next();
        System.out.println("Digite o temperamento do seu cachorro");
        String temperamento = scanner.next();
        System.out.println("Digite o nnivel de higiene do seu cachorro");
        String nivelHigiene = scanner.next();

        Cachorro cachorro = new Cachorro(nome, raca, idade, castracao, porte, temperamento, nivelHigiene);
        System.out.println(cachorro);

        System.out.println("\nDigite o nome do seu gato");
        String nome1 = scanner.next();
        System.out.println("Digite a raça do seu gato");
        String raca1 = scanner.next();
        System.out.println("Digite a idade do gato");
        int idade1 = scanner.nextInt();
        System.out.println("Informe se seu gato é castrado");
        String castracao1 = scanner.next();
        System.out.println("Digite o nivel de parkuor do deu gato");
        String nivelParkuor = scanner.next();
        System.out.println("Digite quantas vidas restantes tem o seu gato");
        int vidasRestantes = scanner.nextInt();
        System.out.println("Digite o nivel de independencia do seu gato");
        String nivelDeIndependencia = scanner.next();

        Gato gato = new Gato(nome1, raca1, idade1, castracao1, nivelParkuor,vidasRestantes,nivelDeIndependencia);
        System.out.println(gato);



    }
}
