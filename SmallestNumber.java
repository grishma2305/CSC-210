public class SmallestNumber {
    public static void main(String[] args) {
        int a, b, c;

        int smallest, mathSmall;

        for (int i = 0; i<10; i++){

            a = (int) (Math.random() * 100);
            b = (int) (Math.random() * 100);
            c = (int) (Math.random() * 100);

            smallest = origSmallest(a, b, c);
            mathSmall = mathSmallest(a, b ,c);

            System.out.println(a + "-" + b + "-" + c+ ":" + smallest + ":" + mathSmall + "::" + (smallest==mathSmall));

        }
    }

    public static int origSmallest(int p, int q, int r) {

        if (p<=q && p<=r){
            return p;
        } else if (q<=p && q<=r) {
            return q;
        } else {
            return r;
        }

    }

    private static int mathSmallest(int p, int q, int r) {
        return Math.min(Math.min(p, q), r);
    }
}
