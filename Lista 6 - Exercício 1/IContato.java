public interface IContato {
    void adicionarContato(Contato contato);
    Contato buscarContato(String nome);
    void listarContatos();
}