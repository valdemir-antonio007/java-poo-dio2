import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso java", "Curso com foco em Ides", 10);
        Curso curso2 = new Curso("Curso PHP", "Curso baseado Laravel", 14);

        Mentoria mentoria = new Mentoria("Mentoria de Java", "Pilares da POO", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp de Java", "Bootcamp Santander");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev("Valdemir");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println(dev1);
        dev1.progredir();
        dev1.progredir();
        System.out.println(dev1);
        System.out.println(dev1.calcularTotalXp());



    }
}