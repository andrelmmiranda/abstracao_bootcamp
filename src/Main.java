import br.com.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso("Curso de Java", "Descrição do curso de Java", 8);

        Curso curso2 = new Curso("Curso JavaScript", "Descrição do curso de JavaScript", 4);

        Mentoria mentoria = new Mentoria("Mentoria de Java", "Descrição da mentoria de Java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev("Dev 1");
        dev1.inscreverBootcamp(bootcamp);
        dev1.imprimirConteudosInscritos();
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        dev1.imprimirConteudosInscritos();
        dev1.imprimirConteudosConcluidos();
        System.out.println("XP:" + dev1.calcularXp());

        System.out.println("-------");

        Dev dev2 = new Dev("Dev 2");
        dev2.inscreverBootcamp(bootcamp);
        dev2.imprimirConteudosInscritos();
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        dev2.imprimirConteudosInscritos();
        dev2.imprimirConteudosConcluidos();
        System.out.println("XP:" + dev2.calcularXp());
    }
}
