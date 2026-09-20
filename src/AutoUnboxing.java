public class AutoUnboxing {
    public static void main(String[] args) {
        int x = 14;
        int y = 15;
        Pratice a = new Pratice();
        Pratice1 b = new Pratice1();
        a.integerclass(x);
        b.integerclass(y);
        int arthimetics = 16;

        // Arthemetrics
        Integer sum = x+y+arthimetics;  // autoboxing
        System.out.println(sum);        // unboxing
    }
}

// Methods calls
class Pratice{
    public void integerclass(int x){
        Integer y = x;                   // autoboxing
        System.out.println(y);          // unboxing

    }
}
class Pratice1{
    public void integerclass(Integer x){
        Integer y = x;                   // autoboxing
        System.out.println(y);          // unboxing

    }
}
