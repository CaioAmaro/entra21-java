package lista07_orientacao_objetos.exercicio10;

public class OnibusEscolar {
    int quantidadeAlunos;
    int quantidadeProfessores;

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        if(quantidadeAlunos > 40) this.quantidadeAlunos = 40;
        else if(quantidadeAlunos < 0) this.quantidadeAlunos = 0;
        else this.quantidadeAlunos = quantidadeAlunos;

        if(this.quantidadeProfessores == 0 ){
            this.quantidadeAlunos = 0;
        }
    }

    public void setQuantidadeProfessores(int quantidadeProfessores){
        if(quantidadeProfessores  == 0 ){
            this.quantidadeAlunos = 0;
            this.quantidadeProfessores = 0;
        }else{
            this.quantidadeProfessores  = quantidadeProfessores;
        }
    }

    public void removerAlunos(int quantidadeAlunos){
        if(quantidadeAlunos > 0 && quantidadeAlunos <= this.quantidadeAlunos ){
            this.quantidadeAlunos -= quantidadeAlunos;
        }
    }

}
