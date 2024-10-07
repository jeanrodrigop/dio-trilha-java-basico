package edu.jean.repeticoes;

public class forArrays {
    public static void main(String[] args) {
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no indice x= " + x + " e " + alunos[x]);
        }
    }
}

public class forEach {
    public static void main(String[] args) {
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};
    
        for (String aluno : alunos) {
            System.out.println("O nome aluno e: " + aluno);
        }
    }

}
