package functionalInterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main (String[] args) {
        System.out.println(getDBConnectionUrl());

        System.out.println(getDBConnectionUrlsSupplier.get());
    }
    //takes no argument but return a value
    static Supplier<List<String>> getDBConnectionUrlsSupplier = () -> List.of("jdbc://localhost:5432/users",
            "jdbc://localhost:5432/student");

    static String getDBConnectionUrl () {
        return "jdbc://localhost:5432/users";
    }
}
