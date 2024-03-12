public class Principal {

public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Marya", "12112964", 7.0, 8.0, 9.0, 6.0, 7.0);
        Aluno aluno2 = new Aluno("Luiza", "12142964", 5.0, 3.0, 4.0, 4.0, 5.0);

        System.out.println("Aluno: " + aluno1.nome + "\nMatricula: " + aluno1.matricula + "\nSituação: " + aluno1.Situacao());
        System.out.println("Aluno: " + aluno2.nome + "\nMatricula: " + aluno2.matricula + "\nSituação: " + aluno2.Situacao());
    }


}
