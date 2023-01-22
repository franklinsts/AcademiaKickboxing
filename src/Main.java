public class Main {

    public static void main(String[] args) {

        Instrutor i1 = new Instrutor("3255268", "Anderson Silva", "Sensei", "15/04/1984", "99888-9999");
        Turma t1 = new Turma(30, 2, "18/01/2023", "19/12/2023", "19:00", "Kickboxing", i1);
        Aluno a1 = new Aluno(202301, 71, "Franklin Santana", "Rua Copacabana, 11", "99999-8888", "15/08/1994", 1.73);
        Aluno a2 = new Aluno(202302, 80, "Paulo Henrique", "Rua Copacabana, 23", "99888-7777", "22/05/1992", 1.79);

        t1.matricular(a1);
        t1.matricular(a2);

        System.out.println("Dados dos Alunos da turma:" + t1.getLista());
        System.out.println("Número de alunos da turma:" + t1.getnAlunos());
        System.out.println("Instrutor da turma:" + t1.getInstrutor());
    }

}