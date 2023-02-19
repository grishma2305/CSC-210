import java.util.Arrays;

public class FinalQue8 {

    public static boolean[] flipEvenIndex(boolean[] values) {


        for (int i = 0; i < values.length; i++){
            if (i % 2 == 0){
                if (values[i] == true){
                    values[i] = false;
                }
                else if (values[i] == false){
                    values[i] = true;
                }
            }
        }

        return values;

    }

    //Main to check the implication
    public static void main(String [] args){
        boolean[] values = {true, false, false, true};
        System.out.println(Arrays.toString(flipEvenIndex(values)));
    }
}
