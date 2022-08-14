import java.util.Scanner;
public class LineComparision {
    static void lengthOfLine(double a,double b,double c,double d)
    {
        double x1=a ,y1=b, x2=c, y2=d;
        double length=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("Distance Btw Two Points:"+length);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1,y1,x2,y2;
        System.out.println("Welcome To Line Comparison Computation Program");
        System.out.println("enter cord x1 value");
        x1 = sc.nextDouble();
        System.out.println("enter cord y1 value");
        y1 = sc.nextDouble();
        System.out.println("enter cord x2 value");
        x2 = sc.nextDouble();
        System.out.println("enter cord y2 value");
        y2 = sc.nextDouble();
        lengthOfLine(x1,y1,x2,y2);
    }

}