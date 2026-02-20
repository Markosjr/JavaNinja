package TIposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {

        /*
        Dados nao primitivos: String, Array, Class, enum
        Objetivo: criar um ninja e atribuir metodos a ele
         */

        String nome2 = "marcos junior";
        System.out.println("Texto com letra minuscula: "  + nome2);
        String nome2UpperCase = nome2.toUpperCase();
        System.out.println("Texto com Letra maiuscula: "+nome2UpperCase);

        String cidade = "Campo Mourao";
        System.out.println("Nome da cidade: "+cidade);
        String cidadeCaixaBaixa = cidade.toLowerCase();
        System.out.println("Nome da cidade com caixa baixa: "  + cidadeCaixaBaixa);
    }
}
