import java.util.ArrayList;

public class ListaContatos implements IContato {
    private ArrayList<Contato> contatos;
    
    public ListaContatos() {
        this.contatos = new ArrayList<>();
    }
    
    @Override
    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }
    
    @Override
    public Contato buscarContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                return contato;
            }
        }
        return null;
    }
    
    @Override
    public void listarContatos() {
        for (Contato contato : contatos) {
            System.out.println("Nome: " + contato.getNome() + ", Telefone: " + contato.getTelefone());
        }
    }
}
