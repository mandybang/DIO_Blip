import java.util.Scanner;

public class ClassificadorHeroi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome;
        int xp;
        String nivel = "";

        while (true) {

            System.out.print("Digite o nome do herói: ");
            nome = scanner.nextLine();

            System.out.print("Digite a quantidade de XP: ");
            xp = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            if (xp < 1000) {
                nivel = "Ferro";
            } else if (xp >= 1001 && xp <= 2000) {
                nivel = "Bronze";
            } else if (xp >= 2001 && xp <= 5000) {
                nivel = "Prata";
            } else if (xp >= 5001 && xp <= 7000) {
                nivel = "Ouro";
            } else if (xp >= 7001 && xp <= 8000) {
                nivel = "Platina";
            } else if (xp >= 8001 && xp <= 9000) {
                nivel = "Ascendente";
            } else if (xp >= 9001 && xp <= 10000) {
                nivel = "Imortal";
            } else {
                nivel = "Radiante";
            }


            System.out.println("O Herói de nome " + nome + " está no nível de " + nivel);

            System.out.print("\nDeseja classificar outro herói? (s/n): ");
            String continuar = scanner.nextLine();

            if (!continuar.equalsIgnoreCase("s")) {
                break;
            }
        }

        scanner.close();
    }
}
