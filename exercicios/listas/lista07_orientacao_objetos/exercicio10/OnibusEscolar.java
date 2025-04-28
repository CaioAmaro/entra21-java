package lista07_orientacao_objetos.exercicio10;

public class OnibusEscolar {
    int quantidadeAlunos;
    int quantidadeProfessores;

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        try{
            if(quantidadeAlunos > 40) {
                throw new IllegalArgumentException("Quantidade Max é 40 alunos, alterando variavel para 40 alunos.");
            }
            else if(quantidadeAlunos < 0) this.quantidadeAlunos = 0;
            else this.quantidadeAlunos = quantidadeAlunos;

            if(this.quantidadeProfessores == 0 ){
                this.quantidadeAlunos = 0;
            }

        }catch (Exception e){
            System.out.println(e.toString());
            this.quantidadeAlunos = 40;
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
