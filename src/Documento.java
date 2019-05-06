public class Documento implements Imprimivel {

    @Override
    public void imprimir() {
       System.out.println("Sou um documento Word");
    }

    public Documento() {
    }
}
