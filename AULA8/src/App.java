import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aula 8 - Collections");

        // Melhor para buscas e acesso aleatório
        List<String> arrayList = new ArrayList<>();
        arrayList.add("JAVA");
        arrayList.add("Python");
        arrayList.add("C#");
        arrayList.add("PHP");

        // Melhor para inserção e remoção
        List<String> linkedList = new LinkedList<>();
        linkedList.add("JAVA");
        linkedList.add("Python");
        linkedList.add("C#");
        linkedList.add("PHP");

        System.out.println(arrayList);
        System.out.println(linkedList);

        linkedList.replaceAll(e -> e.equals("C#") ? "C++" : e);
        linkedList.removeIf(e -> e.equals("Python"));

        System.out.println(linkedList);

        linkedList.addAll(Arrays.asList("Python", "Ruby", "HTML & CSS"));

        System.out.println(linkedList);

        linkedList.forEach(System.out::println);

        int[] i = { 1 };

        arrayList.forEach(e -> System.out.println("value: " + (i[0]++) + " " + e));

        for (int j : i) {
            System.out.println("valor atual: " + j);
        }

        Aluno aluno = new Aluno("Pedro", new ArrayList<>());

        String[] nomeMateria = { "PHP", "JAVA", "C++", "Python", "C#", "HTML" };

        for (String mat : nomeMateria) {
            aluno.getMateria().add(new Materia(mat));
        }

        System.out.println(aluno);

        Materia html = new Materia("HTML");
        Materia novaMat = new Materia(null);
        for (Materia mat : aluno.getMateria()) {
            if (mat.getNome().equals("HTML")) {
                novaMat = mat;
            }
        }

        // aluno.getMateria().remove(novaMat);
        novaMat.setNome("HTML5");

        System.out.println(aluno);

        System.out.println("Tamanho do vetor: " + aluno.getMateria().size());

        System.out.println("Verificificando se o objeto esta no vetor " + aluno.getMateria().contains(html));

        aluno.getMateria().set(3, html);
        System.out.println(aluno);

       System.out.println("\n ///////////// STREAM EM JAVA /////////////\n");

        Materia php = aluno.getMateria()
            .stream()
            .filter(e -> e.getNome().equals("PHP"))
            .findFirst()
            .orElse(null);


        System.out.println("Materia de PHP: " + php);

        List<Materia> novaLista = aluno.getMateria()
            .stream()
            .map(m -> new Materia(m.getNome() + "!"))
            .collect(Collectors.toList());
        System.out.println(novaLista);

        aluno.getMateria().add(new Materia("PHP"));

        // Bom para a prova
        novaLista = aluno.getMateria()
            .stream()
            .filter(m -> m.getNome().equals("PHP"))
            .collect(Collectors.toList());
        System.out.println(novaLista);    

        // Bom para o trabalho
        System.out.println(
            aluno.getMateria()
                .stream()
                .map(Materia :: getNome)
                .reduce("Materias: ", (newString, interatorString) -> newString + interatorString + ", ")
        );

        System.out.println("\n/////////////////// SET EM JAVA ///////////////////\n");
        // Set não permite itens duplicados
        // HashSet não mantem a orden
        // linkedHashSet mantem a ordem de inserção
        // TreeSet mantem a ordem alfabetica
        Set<String> set = new TreeSet<>();
        set.add("JAVA");
        set.add("PHP");
        set.add("Python");
        set.add("C++");
        set.add("C++");
        set.add("C++");
        set.add("C++");
        set.add("C#");
        set.add("CSS");

        System.out.println(set);
        
        Collections.sort(aluno.getMateria());
        System.out.println(aluno.getMateria());
        
        Set<Materia> setMateria = new TreeSet<>();
        setMateria.addAll(aluno.getMateria());
        System.out.println(setMateria);

    }
}

