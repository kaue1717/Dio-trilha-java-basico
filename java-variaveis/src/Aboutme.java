public class AboutMe {

    public static void main(String[] args) {

        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá, me chamo " + nome + " " + sobrenome + ", tenho " + idade + " anos e minha altura é " + altura + " cm.");
        System.out.println("Minha altura é " + altura + " cm.");
    }   
}
