public class Test2 {
    public static void main(String[] args) {

        //int[] arr = {};

        System.out.println("The count is: " + countElements(new int[]{25, 42, 18, 25, 38, 96, 25, 25},25));
    }


//        int x=4, y=1;
//        if (!(x<3||y>2)){
//            System.out.println("FFf");
//        }
//        else {
//            System.out.println("Ssss");
//        }
//        x=1024;
//        if (x<0)
//            System.out.println("negative");
//        else if (x==0)
//            System.out.println("zero");
//        else
//            System.out.println("posiyive");
//
//        if ((x>15&& x<18)||(x>10||y<20)){
//            System.out.println("correct");
//        }
//        if (((x > 10) || (x > 15 && x < 18)) || (y < 20)){
//            System.out.println("corr2");
//        }
//        if ((x < 10 && y > 20) && (x < 15 || x > 18))
//            System.out.println("corCCCC");
//        if ((x > 15 && x < 18) && (x > 10))
//            System.out.println("corccAAA");
//        if ((y < 20) || (x > 15 && x < 18))
//            System.out.println("CorrrDDDD");
//
//        int c=0, d=1;
//        if(!(c==3 || d==0))
//            System.out.println("rrr");
//        if ((c==3 && d==0) ){
//            System.out.println("ccdd");
//        }
//
//        int z=3, a=2;
//        if(z>2)
//            z++;
//        if (a>2)
//            a++;
//        if (z>2)
//            System.out.println("First");
//        if (a<3)
//            System.out.println("second"+ a);
//        System.out.println("third");


        //Que 8
//    public static void talk(String name){
//        System.out.println("Hello, " + name);
//    }

    public static int countElements(int[] arr, int target){


        int countOfElements = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                countOfElements++;
            }
        }
        return countOfElements;
    }

}
