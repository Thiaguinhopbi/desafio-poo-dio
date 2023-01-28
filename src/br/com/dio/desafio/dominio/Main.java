package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso JAVA ");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do curso  JS ");
        curso2.setCargaHoraria(4);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição Mentoria Java");
        mentoria1.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devThiago = new Dev();
        devThiago.setNome("Thiago");
        devThiago.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Thiago:  " + devThiago.getConteudosInscritos());

        devThiago.progredir();
        devThiago.progredir();
        devThiago.progredir();
        System.out.println("-");

        System.out.println("Conteudos Inscritos Thiago:  " + devThiago.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Thiago:  " + devThiago.getConteudosConcluidos());
        System.out.println("XP: " + devThiago.calcularTotalXp());
        System.out.println("\n\n");

        Dev devPamella = new Dev();
        devPamella.setNome("Pamella");
        devPamella.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Pamella: " + devPamella.getConteudosInscritos());
        devPamella.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Pamella: " + devPamella.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Pamella: " + devPamella.getConteudosConcluidos());
        System.out.println("XP:  " + devPamella.calcularTotalXp());

    }
}
