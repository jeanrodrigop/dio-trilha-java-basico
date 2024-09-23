package edu.jean.operadores;
public class OperadorTernario {
    public static void main(String[] args) {
        // <Expressão Condicional> ? <Caso seja true> : <Caso seja false>
        int a, b;

        a = 5;
        b = 6;

        //String resultado = "";
        //if(a==b)
        //    resultado = "verdadeiro";
        //else
        //    resultado = "falso";

        String resultado = a==b ? "verdadeiro" : "falso";

        System.out.println(resultado);
    }
}
