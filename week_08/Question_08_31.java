package week_08;

import java.util.Scanner;

public class Question_08_31 {
    public static void main(String[] args) {
        double[][] points = initializePoints();
        double[] intersectingPoint = getIntersectingPoint(points);
        if (getIntersectingPoint(points) == null) {
            System.out.println("The two lines are parallel");
        } else {
            System.out.printf("The intersecting point is at (%.5f, %.5f)", intersectingPoint[0], intersectingPoint[1]);
        }
    }

    private static double[] getIntersectingPoint(double[][] points) {
        double[] interSectPoint = new double[2];

        double a = points[0][1] - points[1][1];
        double b = points[0][0] - points[1][0];
        double c = points[2][1] - points[3][1];
        double d = points[2][0] - points[3][0];
        double e = (points[0][1] - points[1][1]) * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];
        double f = (points[2][1] - points[3][1]) * points[2][0] - (points[2][0] - points[3][0]) * points[2][1];

        interSectPoint[0] = (e * d - b * f) / (a * d - b * c);
        interSectPoint[1] = -(a * f - e * c) / (a * d - b * c);

        if (a * d - b * c == 0) {
            return null;
        }
        return interSectPoint;
    }

    private static double[][] initializePoints() {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[4][2];
        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        return points;
    }
}
/*
2 2 5 -1 4 2 -1 -2

2 2 7 6 4 8 -1 -2
 */