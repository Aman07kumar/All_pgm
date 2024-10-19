import java.util.ArrayList;
import java.util.List;

class saddle {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(10);
        row1.add(8);
        row1.add(9);
        matrix.add(row1);

        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(3);
        row2.add(2);
        row2.add(5);
        matrix.add(row2);

        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(4);
        row3.add(6);
        row3.add(7);
        matrix.add(row3);

        List<List<Integer>> saddlePoints = findSaddlePoints(matrix);

        for (List<Integer> point : saddlePoints) {
            System.out.println("Saddle Point found at row " + point.get(0) +
                    ", column " + point.get(1) + " with value " + point.get(2));
        }
    }

    public static List<List<Integer>> findSaddlePoints(ArrayList<ArrayList<Integer>> matrix) {
        List<List<Integer>> saddlePoints = new ArrayList<>();

        for (int i = 0; i < matrix.size(); i++) {
            int rowMin = Integer.MAX_VALUE;
            int colIndex = -1;

            for (int j = 0; j < matrix.get(i).size(); j++) {
                if (matrix.get(i).get(j) < rowMin) {
                    rowMin = matrix.get(i).get(j);
                    colIndex = j;
                }
            }

            boolean isSaddle = true;
            for (int j = 0; j < matrix.size(); j++) {
                if (matrix.get(j).get(colIndex) > rowMin) {
                    isSaddle = false;
                    break;
                }
            }

            if (isSaddle) {
                List<Integer> saddlePoint = new ArrayList<>();
                saddlePoint.add(i);
                saddlePoint.add(colIndex);
                saddlePoint.add(rowMin);
                saddlePoints.add(saddlePoint);
            }
        }

        return saddlePoints;
    }
}
