public class ZeroMatrix {
    public static int[][] run (int[][] matrix) {
        boolean[] lines = new boolean[matrix.length];
        boolean[] columns = new boolean[matrix[0].length];
        //Save zero values
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    lines[i] = true;
                    columns[j] = true;
                }
            }
        }
        //Zero lines on matrix
        for (int i = 0; i < lines.length; i++) {
            if (lines[i]) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        //Zero columns on matrix
        for (int i = 0; i < columns.length; i++) {
            if (columns[i]) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
        return matrix;
    }
}