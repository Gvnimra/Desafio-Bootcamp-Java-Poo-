import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descrição Curso Javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp JAVA Developer");
        bootcamp.setDescricao("Descrição Bootcamp JAVA Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGiovani = new Dev();
        devGiovani.setNome("Giovani de Moura André");
        devGiovani.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Giovani" + devGiovani.getConteudosInscritos());
        devGiovani.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos Giovani" + devGiovani.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Giovani" + devGiovani.getConteudosConcluidos());
        System.out.println("XP:" + devGiovani.calcularTotalXp());

        System.out.println("---------------------");

        Dev devRick = new Dev();
        devRick.setNome("Rick Sanchez");
        devRick.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rick" + devRick.getConteudosInscritos());
        devRick.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos Rick" + devRick.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Rick" + devRick.getConteudosConcluidos());
        System.out.println("XP:" + devRick.calcularTotalXp());

    }
}