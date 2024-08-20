public class metodos {
    public static void main (String [] args){
        String primeiroNome = "Gustavo";
        String segunddoNome = "Silva";

        String nomeCompleto = nomeCompleto(primeiroNome, segunddoNome);
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}