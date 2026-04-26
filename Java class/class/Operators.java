public class Operators {
    public static void main(String[] args) {
        int var1 = 5;

        // += ; -=, *=, /= and %=

        // var1 = var1 + 2;
        // var1 += 2;  
        // var1 -= 1;  

        var1 %= 3;

        System.out.println(var1);

        int p = 10, q = 10;
        // System.out.println("p = " + p + ", q = " + q);
        // System.out.println("p == q  : " + (p == q)); // equal to
        // System.out.println("p != q  : " + (p != q)); // not equal to
        // System.out.println("p >  q  : " + (p >  q)); // greater than
        // System.out.println("p <  q  : " + (p <  q)); // less than
        // System.out.println("p >= q  : " + (p >= q)); // greater than or equal
        // System.out.println("p <= q  : " + (p <= q)); // less than or equal

        boolean isSunny = false;
        boolean isWarm  = false;

        if (isSunny) {
            System.out.println("The weather is sunny!");
        } else {
            System.out.println("The weather is not sunny!");
        }

        String result = (isSunny) ? "The weather is sunny!" : "The weather is not sunny!";

        System.out.println(result);

        

    }
}