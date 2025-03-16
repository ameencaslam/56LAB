class q7 {
    public static void main(String[] args) {
        // matrix size
        int n = 3;
        int[][] matrix = new int[n][n];
        int temp = 1;
        int trace = 0; 

        System.out.println("Original Matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++, temp++) {
                matrix[i][j] = temp;
                System.out.print(temp+"  ");
            }
                System.out.println(" ");
        }

        System.out.println("Transpose Matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[j][i]+"  ");
                trace += i==j ? matrix[i][j] : 0;
            }
                System.out.println(" ");
        }

        System.out.print("Trace: " + trace);
    }
}