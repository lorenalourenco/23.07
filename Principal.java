public class Principal {
    public static void main(String[] args) {
        Disciplina d1 = new Disciplina();
        d1.setNome("Programando em Java");
        d1.setQuantidadeCreditos(4);
        Disciplina d2 = new Disciplina();
        d2.setNome("Programando em C++");
        d2.setQuantidadeCreditos(4);
        Professor p1 = new Professor();
        p1.setNome("Maria");
        p1.setTitulacao("D.Sc.");
        Professor p2 = new Professor();
        p2.setNome("Claudio");
        p2.setTitulacao("D.Sc.");
        Turma t1 = new Turma();
        t1.setDisciplina(d1);
        t1.setHorario("19:00");
        t1.setProfessor(p1);
        t1.setSala("10A");
        Turma t2 = new Turma();
        t2.setDisciplina(d2);
        t2.setHorario("15:00");
        t2.setProfessor(p1);
        t2.setSala("11A");
        Turma t3 = new Turma();
        t3.setDisciplina(d1);
        t3.setHorario("21:00");
        t3.setProfessor(p2);
        t3.setSala("20B");
        Turma t4 = new Turma();
        t4.setDisciplina(d2);
        t4.setHorario("17:00");
        t4.setProfessor(p2);
        t4.setSala("21B");
        Turma t5 = new Turma();
        t5.setDisciplina(d2);
        t5.setHorario("08:00");
        t5.setProfessor(p2);
        t5.setSala("22B");
        d1.adicionarTurma(t1);
        d1.adicionarTurma(t3);
        d2.adicionarTurma(t2);
        d2.adicionarTurma(t4);
        p1.adicionarTurma(t1);
        p1.adicionarTurma(t2);
        p2.adicionarTurma(t3);
        p2.adicionarTurma(t4);
        p2.adicionarTurma(t5);

        for (Turma t : p2.getListaTurmas() ) {
            System.out.println("turmas do professor " + p2.getNome() + ": " + t.getDisciplina().getNome() + " as " + t.getHorario() + " na sala " + t.getSala());
        }
    }
}
