package Stream;

//Classe Contato: id, Nome, Numero, data de nascimento, idade
//Some todas as idades
//Filtre por data de nascimento
//Pesquise por nome ou id
//Ordene por nome
//Mostre a pessoa mais velha e mais nova


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class RevisaoStream {

    public static void main(String[] args) {

        List<Contato> contatosList = new ArrayList<>();

        Contato Maria = new Contato("1", "Maria", 1, LocalDate.of(2002, 06, 06), 20l);
        Contato Joao = new Contato("2", "Joao", 2, LocalDate.of(2005, 06, 06), 17l);
        Contato Jose = new Contato("3", "Jose", 3, LocalDate.of(2004, 06, 06), 18l);

        contatosList.add(Maria);
        contatosList.add(Joao);
        contatosList.add(Jose);

        Stream<Contato> contatoStream = contatosList.stream();

        //Somar todas as idades

        //Long totalIdades = contatoStream.map(contato -> contato.getIdade()).reduce(10l, (total, valor)-> total + valor);

        //System.out.println("Total de Idades : " + totalIdades);

        //Filter por data de nascimento -- menor de idade  --  Filter retorna outra Stream;

       contatoStream.filter(contato ->
            contato.getData_de_nascimento().isAfter(LocalDate.now().minusYears (18l))
        ).forEach(System.out::println);


        //Pesquise por nome ou id

        Stream<Contato> contatoPesquisa = contatosList.stream();

        contatoPesquisa.filter(contato -> contato.getNome().equals("Jose")).forEach(System.out::println);


        //Ordene por nome

        Stream<Contato> contatosOrdenados = contatosList.stream();

        contatosOrdenados.sorted(Comparator.comparing(Contato::getNome)).forEach(System.out::println);

        //Mostre a pessoa mais velha e mais nova

        Stream<Contato> contatosPorIdade = contatosList.stream();

       // Optional<Contato> maisVelho = contatosPorIdade.max(Comparator.comparing(Contato::getIdade));
       Optional<Contato> maisNovo = contatosPorIdade.min(Comparator.comparing(Contato::getIdade));

       // if (maisVelho.isPresent()) {
       //     System.out.println(maisVelho.get());
       // }

       if (maisNovo.isPresent()){
            System.out.println(maisNovo.get());
       }

    }
}