public class Cliente {

    protected Banco banco;
    protected String nome;

    public Cliente(String nome, Banco banco) {
        this.nome = nome;
        this.banco = banco;
        this.banco.clientes.add(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
        this.banco.clientes.add(this);
    }

    @Override
    public String toString() {
        return "Cliente: {" +
                "Banco: " + banco.getNome() + ", Nome: " + this.getNome() +
                '}';
    }
}
