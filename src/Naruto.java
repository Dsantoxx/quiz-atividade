import java.util.Scanner;

public class Naruto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        System.out.println("****************");
        System.out.println("*   FACULDADE ALFREDO NASSER   *");
        System.out.println("****************");
        System.out.println("*   Aluno: Danilo Costa Santos  *");
        System.out.println("*  Professor: Brenno Pimenta da Costa  *");
        System.out.println("****************");
        System.out.println("*   Quiz de 15 perguntas de Naruto   *");
        System.out.println("****************");
        System.out.println("Olá, bem-vindo ao Quiz sobre o anime Naruto!");

        System.out.println("Pergunta 1: Quem ensinou o rasengan para o Naruto?");
        System.out.println("a) Minato");
        System.out.println("b) Jiraiya");
        System.out.println("c) Kakashi");
        System.out.println("d) Isobu");
        System.out.println("e) Sasuke");
        System.out.print("Sua resposta: ");
        String resposta1 = scanner.nextLine();
        if (resposta1.equalsIgnoreCase("b")) {
            score++;
        }
        System.out.println("Pergunta 2: Quem matou os pais do Naruto?");
        System.out.println("a) Kurama (Kyuubi)");
        System.out.println("b) Madara Uchiha");
        System.out.println("c) Danzo Shimura");
        System.out.println("d) Akatsuki");
        System.out.println("e) Hiruzen");
        System.out.print("Sua resposta: ");
        String resposta2 = scanner.nextLine();
        if (resposta2.equalsIgnoreCase("a")) {
            score++;
        }
        System.out.println("Pergunta 3: Quem foi o primeiro(a) a se tornar chunin?");
        System.out.println("a) Sakura");
        System.out.println("b) Lee");
        System.out.println("c) Neji");
        System.out.println("d) Gaara");
        System.out.println("e) Shikamaru");
        System.out.print("Sua resposta: ");
        String resposta3 = scanner.nextLine();
        if (resposta3.equalsIgnoreCase("e")) {
            score++;
        }
        System.out.println("Pergunta 4: Quem é a progenitora do Chakra?");
        System.out.println("a) Sakura");
        System.out.println("b) Konan");
        System.out.println("c) Hinata");
        System.out.println("d) Kaguya");
        System.out.println("e) Tenten");
        System.out.print("Sua resposta: ");
        String resposta4 = scanner.nextLine();
        if (resposta4.equalsIgnoreCase("d")) {
            score++;
        }
        System.out.println("Pergunta 5: Quem criou a Akatsuki?");
        System.out.println("a) Yahiko");
        System.out.println("b) Obito");
        System.out.println("c) Nagato/Pain");
        System.out.println("d) Kaguya");
        System.out.println("e) Itachi");
        System.out.print("Sua resposta: ");
        String resposta5 = scanner.nextLine();
        if (resposta5.equalsIgnoreCase("c")) {
            score++;
        }
        System.out.println("Pergunta 6: Quem matou Jiraiya?");
        System.out.println("a) Yahiko");
        System.out.println("b) Obito");
        System.out.println("c) Nagato/Pain");
        System.out.println("d) Konan");
        System.out.println("e) Itachi");
        System.out.print("Sua resposta: ");
        String resposta6 = scanner.nextLine();
        if (resposta6.equalsIgnoreCase("c")) {
            score++;
        }
        System.out.println("Pergunta 7: Quem matou Asuma Sarutobi?");
        System.out.println("a) Yahiko");
        System.out.println("b) Kakuzu");
        System.out.println("c) Kisame");
        System.out.println("d) Konan");
        System.out.println("e) Hidan");
        System.out.print("Sua resposta: ");
        String resposta7 = scanner.nextLine();
        if (resposta7.equalsIgnoreCase("e")) {
            score++;
        }
        System.out.println("Pergunta 8: Qual é o nome do lugar onde Naruto e Sasuke lutam no final do Shippuden?");
        System.out.println("a) Vale do Fim");
        System.out.println("b) Floresta da Morte");
        System.out.println("c) Poço Esquecido");
        System.out.println("d) Floresta do Fim");
        System.out.println("e) Vale da Morte");
        System.out.print("Sua resposta: ");
        String resposta8 = scanner.nextLine();
        if (resposta8.equalsIgnoreCase("a")) {
            score++;
        }
        System.out.println("Pergunta 9: Quem lutou e derrotou Sasori?");
        System.out.println("a) Sakura e Tenten");
        System.out.println("b) Sakura e Chiyo-baa");
        System.out.println("c) Sakura e Tsunade");
        System.out.println("d) Gaara e Naruto");
        System.out.println("e) Sasuke e Naruto");
        System.out.print("Sua resposta: ");
        String resposta9 = scanner.nextLine();
        if (resposta9.equalsIgnoreCase("b")) {
            score++;
        }
        System.out.println("Pergunta 10: Quem é o líder do Clã Uchiha?");
        System.out.println("a) Fugaku Uchiha");
        System.out.println("b) Madara Uchiha");
        System.out.println("c) Itachi Uchiha");
        System.out.println("d) Sasuke Uchiha");
        System.out.println("e) Obito Uchiha");
        System.out.print("Sua resposta: ");
        String resposta10 = scanner.nextLine();
        if (resposta10.equalsIgnoreCase("b")) {
            score++;
        }
        System.out.println("Pergunta 11: Quem foi o mentor de Naruto durante o treinamento do Modo Sábio?");
        System.out.println("a) Jiraiya");
        System.out.println("b) Kakashi");
        System.out.println("c) Fukasaku");
        System.out.println("d) Gamabunta");
        System.out.println("e) Orochimaru");
        System.out.print("Sua resposta: ");
        String resposta11 = scanner.nextLine();
        if (resposta11.equalsIgnoreCase("c")) {
            score++;
        }
        System.out.println("Pergunta 12: Qual é o nome do pai de Naruto?");
        System.out.println("a) Minato Namikaze");
        System.out.println("b) Hiruzen Sarutobi");
        System.out.println("c) Jiraiya");
        System.out.println("d) Hashirama Senju");
        System.out.println("e) Tobirama Senju");
        System.out.print("Sua resposta: ");
        String resposta12 = scanner.nextLine();
        if (resposta12.equalsIgnoreCase("a")) {
            score++;
        }
        System.out.println("Pergunta 13: Quem é o portador do Sharingan original?");
        System.out.println("a) Itachi Uchiha");
        System.out.println("b) Shisui Uchiha");
        System.out.println("c) Madara Uchiha");
        System.out.println("d) Sasuke Uchiha");
        System.out.println("e) Obito Uchiha");
        System.out.print("Sua resposta: ");
        String resposta13 = scanner.nextLine();
        if (resposta13.equalsIgnoreCase("c")) {
            score++;
        }
        System.out.println("Pergunta 14: Quem é conhecido como o 'Demônio do Lago Oculto'?");
        System.out.println("a) Kisame Hoshigaki");
        System.out.println("b) Zabuza Momochi");
        System.out.println("c) Suigetsu Hozuki");
        System.out.println("d) Karin Uzumaki");
        System.out.println("e) Haku");
        System.out.print("Sua resposta: ");
        String resposta14 = scanner.nextLine();
        if (resposta14.equalsIgnoreCase("a")) {
            score++;
        }
        System.out.println("Pergunta 15: Quem é o criador do Jutsu de Clone das Sombras?");
        System.out.println("a) Jiraiya");
        System.out.println("b) Minato Namikaze");
        System.out.println("c) Kakashi Hatake");
        System.out.println("d) Hiruzen Sarutobi");
        System.out.println("e) Naruto Uzumaki");
        System.out.print("Sua resposta: ");
        String resposta15 = scanner.nextLine();
        if (resposta15.equalsIgnoreCase("b")) {
            score++;
        }
        // Display final score
        System.out.println("****************");
        System.out.println("*   RESULTADO FINAL   *");
        System.out.println("****************");
        System.out.println("Você acertou " + score + "");
    }
}
