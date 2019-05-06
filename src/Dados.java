public class Dados {

    public String nome;
    public String tipo;


    public Dados(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public void imprimir (){
        System.out.println("Nome da impressora " + nome);
        System.out.println("Impressora tipo: " + tipo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
