public class Nestedclass {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        inner.fun();
    }
}
//statics nested class
class Outer {
    int a = 30;
    static class Inner {
        int x = 20;
        public  void fun(){
            System.out.println(x);
        }
    }
}

