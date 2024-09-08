public class twoDarray {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        int val = 10;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = val;
                val += 10;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // creeating a 2D array with different number of columns
        int[][] arr2 = new int[3][];
        arr2[0] = new int[4];
        arr2[1] = new int[3];
        arr2[2] = new int[2];

        int val2 = 10;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = val2;
                val2 += 10;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
