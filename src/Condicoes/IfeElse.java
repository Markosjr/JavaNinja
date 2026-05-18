package Condicoes;

public class IfeElse {

    /*
    IF e ELSE - Condicoes
    ELSEIF
    Objetivo: Passar o nivel de acordo com o numero de missoes
     */

    /*
        if (condicao) { resultado }
        else if (condicao) { resultado }
        else {resultado}
     */

    public static void main(String[] args) {
        String nome = "Naruto";
        String rank;

        int idade = 12;
        boolean hokage = false;
        Short numeroMissoes = 20;


        // se (condicao) {faca isso}
        if (numeroMissoes > 15 && idade > 15) {
            System.out.println("Rank: Chunnin");
        } else if (numeroMissoes >= 20) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennim");
        }
    }


}
