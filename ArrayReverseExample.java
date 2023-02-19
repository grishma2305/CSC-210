public class ArrayReverseExample {

    public static void main(String[] args){

        int[] arr1 = {6,5,1,2,7};

        int[] arr2 = new int[arr1.length];

        for (int i=0; i<arr1.length; i++){
            arr2[i] = arr1[i];
            System.out.print("Copy: " + arr2[i] + " ");
        }

        //Using for each loop
//       int i=0;
//       for (int e: arr1){
//           arr2[i] = e;
//           i++;
//       }

        for (int i=0; i<arr1.length; i++){
            arr2[i] = arr1[(arr1.length-1)-i];
            System.out.print(arr2[i] + " ");
        }
    }
}
