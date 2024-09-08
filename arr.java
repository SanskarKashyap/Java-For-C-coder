public class arr {
    public static void fun(int arr[]) {
        arr[2] = 300;
        arr[3] = 400;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 10;
        arr[1] = 20;

        arr[4] = 50;

        fun(arr);

        // non initialized elements are 0
        for (int val : arr) {
            System.out.print(val + "  ");
        }
    }

}
