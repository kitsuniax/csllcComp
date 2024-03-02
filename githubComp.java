public class githubComp {
    public static void main(String[] args) {
        // ROUND 1
        String str = "abcdefghijklmnopqrstuvwxyz"; // editor: Iris
                                                   // note: made string for round 1
        for (int i = 0; i < str.length(); i++) { // editor: Pallavi
            if (i % 3 == 0 && i % 2 == 1) { // editor: Audrey
                System.out.println(str.charAt(i)); // editor: Iris
            }
        }
        // ROUND 2
        int[][] matrix = { { 1, 3, 1, 4 }, // created matrix
                { 0, 2, 1, 1 },
                { 0, 0, 2, 3 },
                { 0, 0, 0, 1 } };
        int product = 1;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == col) { // if the row == col, it is a diagonal entry.
                    product = product * matrix[row][col]; // updates product to be product* the diagonal entry
                }
            }
        }
        System.out.println(product);

    }

    public static int factorial(int num){ // method header
        if (num == 1 || num == 0){ //base case - editor: Iris
            return 1 * num;
        }
    }

}