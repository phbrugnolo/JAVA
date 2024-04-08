import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("\n\n\n\n");

        Agenda agenda = new Agenda(new LinkedList<>());

        agenda.adicionar(new Contato("Explosivo d5", 0123123));
        agenda.adicionar(new Contato("FELIPE FETO", 213213));
        agenda.adicionar(new Contato("FELIPE FETO", 213213));

        System.out.println(agenda);

        agenda.remover("Explosivo d5");

        System.out.println(agenda);


    }

    
    
}
