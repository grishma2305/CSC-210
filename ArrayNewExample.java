public class ArrayNewExample {
    public static void main(String[] args) {
        int[] arr1 = {6, 5, 1, 2, 7};

        System.out.println(arr1);

        int[] arr2 = new int[arr1.length];

        // this for loop will reverse the elements of the original array (arr1) and insert them into arr2
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[(arr1.length - 1) - i];
        }

        // we are simply printing out the elements of arr2 one by one
        for (int e : arr2) {
            System.out.print(e + " ");
        }
    }
}
