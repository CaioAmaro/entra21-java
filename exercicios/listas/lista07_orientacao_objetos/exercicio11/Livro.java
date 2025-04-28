package lista07_orientacao_objetos.exercicio11;

public class Livro {
    String tituloLivro;
    boolean emprestado;

    public Livro(String tituloLivro, boolean emprestado) {
        this.tituloLivro = tituloLivro;
        this.emprestado = emprestado;
    }

    public void emprestar(){
        if(emprestado){
            throw new IllegalArgumentException("Livro já foi emprestado!");
        }else{
            emprestado = true;
        }
    }

    public void devolver(){
        if(!emprestado){
            throw new IllegalArgumentException("Livro já foi devolvido!");
        }else{
            emprestado = false;
        }
    }

    @Override
    public String toString() {
        if(emprestado){
            return "O livro " + tituloLivro + " não está disponivel.";
        }else{
            return "O livro " + tituloLivro + " está disponivel.";
        }

    }
}
