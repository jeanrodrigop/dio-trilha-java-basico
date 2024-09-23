package edu.jean.operadores;
public class OperadoresRelacionais {
    public static void main(String[] args) {
        // <Expressão Condicional> ? <Caso seja true> : <Caso seja false>
        String nomeUm = "Jean";
        String nomeDois = new String("Jean");

        System.out.println(nomeUm.equals(nomeDois));
        
        //===========================================//
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm e igual a numeroDois?" + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm e diferente a numeroDois?" + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm e maior que numeroDois?" + simNao);
    }
}
