

public class Practice {

    public static void main(String[] args){

        int[] numbers = {};
        System.out.print("1 : " +numbers.length);

        int w = 0;
        for (int i = 0; i <=3 ; i++) {
            for (int y = 1; y < i; y++) {
                w = w + y;
            }
        }
            System.out.println("w " + w);


        calculaqte(2,5,7);
        System.out.println(calculaqte(2,5,7));

        int sum = 0;
        for (int i = 2; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum" +sum);

        int height = 70;
        int weight = 160;
        decrement(weight,height);
        System.out.println(height+ ": " + weight);



    }

    private static int calculaqte(int w, int x, int y) {
        int a  =x;
        int b = w+1;
        return a+b+3;

    }

    public static void decrement(int height, int weight){
         height = 70;
         weight = 160;
        height--;
        weight--;
    }
}
