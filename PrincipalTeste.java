public class PrincipalTeste {

    public static void main(String[] args) {

        AlunoTeste aluno1 = new AlunoTeste();
        aluno1.nome = "Marya";
        aluno1.matricula = 12112964;

        Disciplina disciplina1 = new Disciplina();
        disciplina1.nome = "Matemática";
        disciplina1.CargaHoraria = 60.0;

        aluno1.disciplinaMatriculada = disciplina1;

        System.out.println("Aluno: " + aluno1.nome + "\nMatricula: " + aluno1.matricula + "\nDisciplina: " + aluno1.disciplinaMatriculada.nome + "\nCarga Horária: " + aluno1.disciplinaMatriculada.CargaHoraria);
    }
}
