import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Integer[] second = {2,3,null,4};
        Integer[] third = {null};
        List<Object> list = Arrays.asList(1,Arrays.asList(second),Arrays.asList(third),5);
        List<Object> result = flattenList(list);
        System.out.println(result.size());
        for(Object o: result){
            if(o == null){
                o = -1;
            }
            System.out.println(Integer.parseInt(o.toString()));
        }
    }

    public  static <E> List<E> flattenList(List<E> list){
//        List<List<Object>> lists = new ArrayList<>();
//        for(Object o: list){
//            if()
//            lists.add(Arrays.asList(o));
//        }
        List<E> result = new ArrayList<>();
        for(E e: list){
            result.addAll(Arrays.asList(e));
        }
        return result;
        //return lists.stream().flatMap(List::stream).collect(Collectors.toList());
    }
}
