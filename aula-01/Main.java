import java.util.*;

public class Main {

    public static Object x(Integer var1) {
        if (var1 > 10) {
            System.out.println("maior que 10");
        } else {
            System.out.println("menor que 10");
        }
        return "teste";
    }

    public static void main(String[] args) {

        Integer x = (Integer) x(10);
        System.out.println(x);

        Scanner scanner = new Scanner(System.in);
        String var1 = scanner.next();

        System.out.println("Nome: " + var1);

        Integer var2 = var1.length();
        System.out.println(var2);

        if (var2 > 10) {
            System.out.println("maior que 10");
        } else if (var2 > 5) {

        } else {
            System.out.println("menor que 10");
        }

        List<String> lista = new LinkedList<>();
        lista.add("xyz");
        lista.add("abc");

        // for o in lista:
        for (String o : lista) {
            System.out.println(o);
        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i);
        }

        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("a");
        set.add("b");

        for (String o : set) {
            System.out.println(o);
        }

        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);

        System.out.println(map);


    }
}