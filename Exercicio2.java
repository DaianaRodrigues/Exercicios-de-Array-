public class Exercicio2{
    public static void main(String[] args) {
        System.out.println("Jogo da velha!");
        if (args.length != 9) {
            System.out.println("Deve-se informar 9 caracteres de entrada! Ex: x, o, _");
        } else {
            for (int i = 0; i < 3; i++) {
                int indice = i * 3;
                System.out.printf(" %s | %s | %s \n", args[indice], args[indice + 1], args[indice + 2]);
            }
        }
    }
}
