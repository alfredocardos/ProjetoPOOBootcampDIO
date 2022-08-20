package dio.com.projct;

import dio.com.projct.dominio.Bootcamp;
import dio.com.projct.dominio.Curso;
import dio.com.projct.dominio.Dev;
import dio.com.projct.dominio.Mentoria;

import java.time.LocalDate;

public class Inicio {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAlfredo = new Dev();
        devAlfredo.setNome("Camila");
        devAlfredo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Alfredo :" + devAlfredo.getConteudosInscritos());
        devAlfredo.progredir();
        devAlfredo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Alfredo:" + devAlfredo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Alfredo:" + devAlfredo.getConteudosConcluidos());
        System.out.println("XP:" + devAlfredo.calcularTotalXp());

        System.out.println("-------");

        Dev devJULIO = new Dev();
        devJULIO.setNome("JULIO");
        devJULIO.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos JULIO:" + devJULIO.getConteudosInscritos());
        devJULIO.progredir();
        devJULIO.progredir();
        devJULIO.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos JULIO:" + devJULIO.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos JULIO:" + devJULIO.getConteudosConcluidos());
        System.out.println("XP:" + devJULIO.calcularTotalXp());
    }
}
