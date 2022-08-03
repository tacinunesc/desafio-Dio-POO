import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição curso java");
        curso.setCargaHoraria(8);
        //System.out.println(curso);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição mentoria de java");
        mentoria.setData(LocalDate.now());
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev devTacila = new Dev();
        devTacila.setNome("Tacila");
        devTacila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Tacila:" + devTacila.getConteudosInscritos());

        devTacila.progredir();
        devTacila.progredir();
        System.out.println("-");

        System.out.println("Conteúdos inscritos Tacila:" + devTacila.getConteudosInscritos());
        System.out.println("Conteudos concluidos Tacila:" + devTacila.getConteudosConcluidos());
        System.out.println("XP:" + devTacila.calcularTotalXp());

        System.out.println("--------------------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Maria:" + devMaria.getConteudosInscritos());

        devMaria.progredir();
        System.out.println("-");

        System.out.println("Conteúdos inscritos Maria:" + devMaria.getConteudosInscritos());
        System.out.println("Conteudos concluidos Maria:" + devMaria.getConteudosConcluidos());
        System.out.println("XP:" + devMaria.calcularTotalXp());
    }
}
