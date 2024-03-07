package annotations;

import java.util.List;

public class Basics {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        List<String> list = List.of("a", "b", "c");
    }
}
