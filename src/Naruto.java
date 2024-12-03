import java.util.Scanner;

public class Naruto {
    public static void main(String[] args) {

        String resp;
        int cont = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("****************");
        System.out.println("*   FACULDADE ALFREDO NASSER   *");
        System.out.println("****************");
        System.out.println("*   Aluno: Danilo Costa Santos  *");
        System.out.println("*  Professor: Brenno Pimenta da Costa  *");
        System.out.println("****************");
        System.out.println("*   Quiz de 15 perguntas de Naruto   *");
        System.out.println("****************");
        System.out.println("Olá, bem-vindo ao Quiz sobre o anime Naruto!");

        // Perguntas e respostas
        Questao q1= new Questao();
        q1.pergunta = "Pergunta 1: Quem ensinou o rasengan para o Naruto?";
        q1.opcaoA= "a) Minato";
        q1.opcaoB= "b) Jiraiya";
        q1.opcaoC= "c) Kakashi";
        q1.opcaoD= "d) Isobu";
        q1.opcaoE= "e) Sasuke";
        q1.correta= "b";

        q1.escrevaQuestao();
        resp = q1.leiaResposta();
        if(q1.isCorreta(resp)){
            cont++;
        }

        Questao q2 = new Questao();
        q2.pergunta = "Pergunta 2: Qual é o nome do clã do qual o Sasuke faz parte?";
        q2.opcaoA = "a) Uzumaki";
        q2.opcaoB = "b) Hyuuga";
        q2.opcaoC = "c) Uchiha";
        q2.opcaoD = "d) Senju";
        q2.opcaoE = "e) Akimichi";
        q2.correta = "c";

        q2.escrevaQuestao();
        resp = q2.leiaResposta();
        if(q2.isCorreta(resp)){
            cont++;
        }

        Questao q3 = new Questao();
        q3.pergunta = "Pergunta 3: Qual é o nome do bijuu que está selado dentro do Naruto?";
        q3.opcaoA = "a) Shukaku";
        q3.opcaoB = "b) Matatabi";
        q3.opcaoC = "c) Gyuki";
        q3.opcaoD = "d) Kurama";
        q3.opcaoE = "e) Chomei";

        q3.correta = "d";

        q3.escrevaQuestao();
        resp = q3.leiaResposta();
        if(q3.isCorreta(resp)){
            cont++;
        }

        Questao q4= new Questao();
        q4.pergunta = "Pergunta 4: Quem é a progenitora do Chakra?";
        q4.opcaoA= "a) Sakura";
        q4.opcaoB= "b) Konan";
        q4.opcaoC= "c) Hinata";
        q4.opcaoD= "d) Kaguya";
        q4.opcaoE= "e) Tenten";
        q4.correta= "d";

        q4.escrevaQuestao();
        resp = q4.leiaResposta();
        if(q4.isCorreta(resp)){
            cont++;
        }

        Questao q5= new Questao();
        q5.pergunta = "Pergunta 5: Quem criou a Akatsuki?";
        q5.opcaoA= "a) Yahiko";
        q5.opcaoB= "b) Obito";
        q5.opcaoC= "c) Nagato/Pain";
        q5.opcaoD= "d) Kaguya";
        q5.opcaoE= "e) Itachi";
        q5.correta= "c";

        q5.escrevaQuestao();
        resp = q5.leiaResposta();
        if(q5.isCorreta(resp)){
            cont++;
        }

        Questao q6= new Questao();
        q6.pergunta = "Pergunta 6: Quem matou Jiraiya?";
        q6.opcaoA= "a) Yahiko";
        q6.opcaoB= "b) Obito";
        q6.opcaoC= "c) Nagato/Pain";
        q6.opcaoD= "d) Kaguya";
        q6.opcaoE= "e) Itachi";
        q6.correta= "c";

        q6.escrevaQuestao();
        resp = q6.leiaResposta();
        if(q6.isCorreta(resp)){
            cont++;
        }

        Questao q7= new Questao();
        q7.pergunta = "Pergunta 7: Quem matou Asuma Sarutobi?";
        q7.opcaoA= "a) Yahiko";
        q7.opcaoB= "b) Kakuzu";
        q7.opcaoC= "c) Kisame";
        q7.opcaoD= "d) Konan";
        q7.opcaoE= "e) Hidan";
        q7.correta= "e";

        q7.escrevaQuestao();
        resp = q7.leiaResposta();
        if(q7.isCorreta(resp)){
            cont++;
        }

        Questao q8= new Questao();
        q8.pergunta = "Pergunta 8: Qual é o nome do lugar onde Naruto e Sasuke lutam no final do Shippuden?";
        q8.opcaoA= "a) Vale do Fim";
        q8.opcaoB= "b) Floresta da Morte";
        q8.opcaoC= "c) Poço Esquecido";
        q8.opcaoD= "d) Floresta do Fim";
        q8.opcaoE= "e) Vale da Morte";
        q8.correta= "a";

        q8.escrevaQuestao();
        resp = q8.leiaResposta();
        if(q8.isCorreta(resp)){
            cont++;
        }

        Questao q9= new Questao();
        q9.pergunta = "Pergunta 9: Quem lutou e derrotou Sasori?";
        q9.opcaoA= "a) Sakura e Tenten";
        q9.opcaoB= "b) Floresta da Morte";
        q9.opcaoC= "c) Sakura e Tsunade";
        q9.opcaoD= "d) Gaara e Naruto";
        q9.opcaoE= "e) Sasuke e Naruto";
        q9.correta= "b";

        q9.escrevaQuestao();
        resp = q9.leiaResposta();
        if(q9.isCorreta(resp)){
            cont++;
        }

        Questao q10= new Questao();
        q10.pergunta = "Pergunta 10: Quem é o líder do Clã Uchiha?";
        q10.opcaoA= "a) Fugaku Uchiha";
        q10.opcaoB= "b) Madara Uchiha";
        q10.opcaoC= "c) Itachi Uchiha";
        q10.opcaoD= "d) Sasuke Uchiha";
        q10.opcaoE= "e) Obito Uchiha";
        q10.correta= "b";

        q10.escrevaQuestao();
        resp = q10.leiaResposta();
        if(q10.isCorreta(resp)){
            cont++;
        }

        Questao q11= new Questao();
        q11.pergunta = "Pergunta 11: Quem foi o mentor de Naruto durante o treinamento do Modo Sábio?";
        q11.opcaoA= "a) Jiraiya";
        q11.opcaoB= "b) Kakashi";
        q11.opcaoC= "c) Fukasaku";
        q11.opcaoD= "d) Gamabunta";
        q11.opcaoE= "e) Orochimaru";
        q11.correta= "c";

        q11.escrevaQuestao();
        resp = q11.leiaResposta();
        if(q11.isCorreta(resp)){
            cont++;
        }

        Questao q12= new Questao();
        q12.pergunta = "Pergunta 12: Qual é o nome do pai de Naruto?";
        q12.opcaoA= "a) Minato Namikaze";
        q12.opcaoB= "b) Hiruzen Sarutobi";
        q12.opcaoC= "c) Jiraiya";
        q12.opcaoD= "d) Hashirama Senju";
        q12.opcaoE= "e) Tobirama Senju";
        q12.correta= "a";

        q12.escrevaQuestao();
        resp = q12.leiaResposta();
        if(q12.isCorreta(resp)){
            cont++;
        }

        Questao q13= new Questao();
        q13.pergunta = "Pergunta 13: Quem é o portador do Sharingan original?";
        q13.opcaoA= "a) Itachi Uchiha";
        q13.opcaoB= "b) Shisui Uchiha";
        q13.opcaoC= "c) Madara Uchiha";
        q13.opcaoD= "d) Sasuke Uchiha";
        q13.opcaoE= "e) Obito Uchiha";
        q13.correta= "c";

        q13.escrevaQuestao();
        resp = q13.leiaResposta();
        if(q13.isCorreta(resp)){
            cont++;
        }

        Questao q14= new Questao();
        q14.pergunta = "Pergunta 14: Quem é conhecido como o 'Demônio do Lago Oculto'?";
        q14.opcaoA= "a) Kisame Hoshigaki";
        q14.opcaoB= "b) Zabuza Momochi";
        q14.opcaoC= "c) Suigetsu Hozuki";
        q14.opcaoD= "d) Karin Uzumaki";
        q14.opcaoE= "e) Haku";
        q14.correta= "a";

        q14.escrevaQuestao();
        resp = q14.leiaResposta();
        if(q14.isCorreta(resp)){
            cont++;
        }

        Questao q15= new Questao();
        q15.pergunta = "Pergunta 15: Quem é o criador do Jutsu de Clone das Sombras?";
        q15.opcaoA= "a) Jiraiya";
        q15.opcaoB= "b) Minato Namikaze";
        q15.opcaoC= "c) Kakashi Hatake";
        q15.opcaoD= "d) Hiruzen Sarutobi";
        q15.opcaoE= "e) Naruto Uzumaki";
        q15.correta= "b";

        q15.escrevaQuestao();
        resp = q15.leiaResposta();
        if(q15.isCorreta(resp)){
            cont++;
        }

        // Calcular a porcentagem de acertos
        double percentage = ((double) cont / 15.0) * 100;

        // Exibir o resultado final
        System.out.println("****************");
        System.out.println("*   RESULTADO FINAL   *");
        System.out.println("****************");
        System.out.println("Você acertou " + cont + " respostas.");
        System.out.println("Você errou " + (15-cont) + " respostas.");
        System.out.println("Porcentagem de acertos: " + String.format("%.2f", percentage) + "%");
        System.out.println("****************");

        // Fechar o scanner
        scanner.close();
    }
}
