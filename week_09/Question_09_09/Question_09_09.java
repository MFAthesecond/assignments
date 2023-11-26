package week_09.Question_09_09;

public class Question_09_09 {
    public static void main(String[] args) {
        RegularPolygon regularPolygon=new RegularPolygon();
        RegularPolygon regularPolygon1=new RegularPolygon(6,4);
        RegularPolygon regularPolygon2=new RegularPolygon(10,4,5.6,7.8);

        System.out.printf("First RegularPolygon perimeter is : %.1f area is : %f\n",regularPolygon.getPerimeter(),regularPolygon.getArea());
        System.out.printf("Second RegularPolygon perimeter is : %.1f area is : %f\n",regularPolygon1.getPerimeter(),regularPolygon1.getArea());
        System.out.printf("Third RegularPolygon perimeter is : %.1f area is : %f\n",regularPolygon2.getPerimeter(),regularPolygon2.getArea());
    }
}
