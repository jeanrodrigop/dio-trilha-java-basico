package edu.jean.introducao;
public class MinhaClasse {
    public static void main (String [] args) {
        String primeiroNome = "Jean";
        String segundoNome = "Rodrigo";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
