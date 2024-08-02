import java.util.LinkedList;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        LinkedList<Pessoa> listaEncadeadaPessoas = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            listaEncadeadaPessoas.add(new Pessoa(i, "nome"+i, "telefone" + i, "endereco" + i, "cpf" + i));
        }

        Random random = new Random();
        int posicaoInicial = random.nextInt(20) + 1;
        int indice = posicaoInicial;

        while (listaEncadeadaPessoas.size()>1){
            indice = (indice + posicaoInicial - 1) % listaEncadeadaPessoas.size();
            listaEncadeadaPessoas.remove(indice);
        }

        System.out.println(listaEncadeadaPessoas.get(0));

    }
}
