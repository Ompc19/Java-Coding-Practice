package BasicJAVA;

public class TypeCasting {
    public static void main(String[] args) {
        /* Implicit conversion
        byte --> int --> float... from lower to higher bytes conversion
        */
                byte a = 14;
                int b = a;
                System.out.println(b);

                char g = 'O';
                int h = g;
                System.out.println(h);

        /* Explicit conversion
        float --> int --> byte... from higher to lower bytes conversion
        one point float and int is 4 bytes then also explicit conversion is requried
        */
                float c = 14.18f;
                int d = (int) c;
                System.out.println(d);

                int i = 79;
                char j = (char) i;
                System.out.println(j);

        /* Type Promotion
        also one point during multiple of byte it consider as a int not byte
        */
                byte e = 7;
                byte f = (byte) (e * 2);
                System.out.println(f);

        /*
         if one operand is float then all became long
         this is for all ex int,long,double
        */
                int k = 7;
                double l = k*2.0;
                System.out.println(l);


    }
}
