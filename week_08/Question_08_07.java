package week_08;
public class Question_08_07 {
    public static void main(String[] args) {
        double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1}, {2, 0.5, 9}, {3.5, 2, -1},
                {3, 1.5, 3}, {-1.5, 4, 2}, {5.5, 4, -0.5}};
        int[] closestTwoPointsIndexes = findClosestTwoPoints(points);
        printResult(closestTwoPointsIndexes, points);
    }
    private static void printResult(int[] closestTwoPointsIndexes, double[][] points) {
        System.out.print("The closest two points are ");
        for (int i = 0; i < 2; i++) {
            System.out.print("(");
            for (int j = 0; j < 3; j++) {
                System.out.print(points[closestTwoPointsIndexes[i]][j] + ",");
            }
            System.out.print("\b) and ");
        }
        System.out.print("\b\b\b\b");
    }
    private static int[] findClosestTwoPoints(double[][] points) {
        int[] minIndexes = {0, 0};
        double shortestDistance = 1000;
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = 0; j < points.length; j++) {
                if (i == j) continue;
                else if (findDistance(points[i], points[j]) < shortestDistance) {
                    minIndexes[0] = i;
                    minIndexes[1] = j;
                    shortestDistance = findDistance(points[i], points[j]);
                }
            }
        }
        return minIndexes;
    }
    private static double findDistance(double[] point1, double[] point2) {
        return Math.sqrt(
                Math.pow(point1[0] - point2[0], 2)          //x
                        + Math.pow(point1[1] - point2[1], 2)        //y
                        + Math.pow(point1[2] - point2[2], 2));      //z
    }
}