public class Exemplo{
    public void saudacao(){
    }

    public void saudacao(String nome) {
        System.out.println("Bem vinda, " + nome + "! Boa noite.");
    }

    public void saudacao(String nome, String sobrenome) {
        System.out.println("Boa noite, " + nome + " " + sobrenome + "! Bem vinda");
    }

    public static void main(String[] args) {
        Exemplo exemplo = new Exemplo();

        exemplo.saudacao();
        exemplo.saudacao("Carol");
        exemplo.saudacao("Marcela", "Silva");
    }
}
