package Stream;

import java.util.Comparator;
import java.util.stream.Stream;
import java.util.List;

public class AulaStream {

    public static void main(String[] args){

    //    Stream<Integer> listStream = Stream.iterate(a, i-> i+4);
    //    listStream.forEach(System.out::println);
    //    listStream.forEach(System.out::println);



        Stream<Integer> listaInteiros = Stream.of(3,6,7,9,2,4);
        System.out.println(listaInteiros.count());
        System.out.println(listaInteiros.min(Comparator.naturalOrder()));
     //   System.out.println(listaInteiros.max());

        


    }



}
