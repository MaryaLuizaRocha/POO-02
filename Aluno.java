public class Aluno {

    String nome;
    String matricula;
    Double nota_fisica;
    Double nota_quimica;
    Double nota_geografia;

    public Aluno(String nome, String matricula, Double nota_matematica, Double nota_portugues, Double nota_fisica, Double nota_quimica, Double nota_geografia) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota_fisica = nota_fisica;
        this.nota_quimica = nota_quimica;
        this.nota_geografia = nota_geografia;
    }

    public Double calcularMedia() {
        return (nota_fisica + nota_quimica + nota_geografia) / 3;
    }
    public String Situacao() {
        if (calcularMedia() >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}