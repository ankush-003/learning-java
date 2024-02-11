package methods;

public class scopes {
    public static void main(String[] args) {
        int a = 10; // instance variable
        {
//            int a = 30; // instance block variable ->
            a = 30; // instance block variable -> this will change the value of a
            int c = 30; // instance block
            System.out.println(c);
        }
        System.out.println(a);
        //    System.out.println(c); // this will give an error as c is not in scope
    }

}
