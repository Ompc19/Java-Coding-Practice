package BasicJAVA;

public class Variable {
    public static void main(String[] args){
        Variable2 var = new Variable2();
        var.localvariable();
        System.out.println(var.instancevariable);
        System.out.println(var.staticvariable);
    }
}
class Variable2 {
    int instancevariable = 20;
    static int staticvariable = 30;
    public void localvariable(){
        int localvariable = 10;
        System.out.println(localvariable);
    }
}
