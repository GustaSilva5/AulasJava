package Condicionais;

public class EstruturaCondicionalAlinhada {
    public static void main (String [] args){
        /* int notaA = 7;
        int notaB = 5;
        int notaC = 6;

        int soma = (notaA + notaB + notaC) / 3;
        */
         int nota = 5;

        if (nota >= 6 ){
            System.out.println("Parabens voce passou nesta materia");
        } else if (nota >= 3 && nota < 5 ) {
            System.out.println("Voce esta de recuperação");
        } else {
            System.out.println("Voce esta de reprovado da materia");
        }
    }

}
