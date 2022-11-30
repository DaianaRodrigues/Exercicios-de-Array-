import java.lang.reflect.Array;
import java.util.*;

public class Exercicio3 {
    public static void main(String[] args) {
        Random random = new Random();
        int quantidadeGrupos = args.length / 3;
        String[][] grupos = new String[quantidadeGrupos][3];

        for(int i = 0; i < quantidadeGrupos; i++) {
            int alunosGrupo = 0;
            while(alunosGrupo < 3) {
                int sorteio = random.nextInt(0, args.length);
                if(!args[sorteio].equals("")) {
                    grupos[i][alunosGrupo] = args[sorteio];
                    alunosGrupo++;
                    args[sorteio] = "";
                }
            }
        }
        for(String[] grupo : grupos) {
            System.out.println("Grupo");
            for(String aluno : grupo) {
                System.out.println(aluno);
            }
        }

    }
}
