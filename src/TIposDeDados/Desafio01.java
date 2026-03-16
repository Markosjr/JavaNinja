package TIposDeDados;

public class Desafio01 {
    public static void main(String[] args) {
        String nomeNinja1 = "Naruto";
        int idadeNinja1 = 10;
        String nomeMissao = "Massacre";
        char rankMissao = 'C';
        String statusMissao = "Em andamento";

        System.out.println("--------------Ninja 1 ------------");
        System.out.println("Nome: " +nomeNinja1);
        System.out.println("Idade: " +idadeNinja1);
        System.out.println("Missao: "+ nomeMissao);
        System.out.println("Rank da missao: " +rankMissao);

        System.out.println("--------------Ninja 2 ------------");
        String nomeNinja2 = "Sasuke";
        int idadeNinja2 = 19;
        String nomeMissao2 = "Espionagem";
        char rankMissao2 = 'B';

        System.out.println("Nome: " +nomeNinja2);
        System.out.println("Idade: " +idadeNinja2);
        System.out.println("Missao: "+ nomeMissao2);
        System.out.println("Rank da missao: " +rankMissao2);


        System.out.println("--------------Ninja 3 ------------");
        String nomeNinja3 = "Sakura";
        int idadeNinja3 = 14;
        String nomeMissao3 = "Captura";
        char rankMissao3 = 'S';

        System.out.println("Nome: " +nomeNinja3);
        System.out.println("Idade: " +idadeNinja3);
        System.out.println("Missao: "+ nomeMissao3);
        System.out.println("Rank da missao: " +rankMissao3);

        // Usar condicional para verificar se o ninja pode concluir a missao baseado na sua idade
        // missao concluida ou nao concluida
        // ninja menor que 15 anos so pode concluir missao nivel C ou D
        // ninja igual ou maior que 15 anos pode concluir missoes de qualquer nivel.

        if (idadeNinja1 < 15) {
            if(rankMissao == 'C' || rankMissao == 'D') {
                statusMissao = "Missao Concluida";
            } else {
            statusMissao = "Nao concluida";
        }

    } else {
            statusMissao = "Concluida";
        }
        System.out.println("------------");
        System.out.println("Status Missao Ninja 1 :" +statusMissao);
    }
}

