import java.util.*;
public class Main {
//身高體重
    public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int x,y;
	double A,B;
	float a=2.54f;
	float b=0.454f;
	x=in.nextInt();
    y=in.nextInt();
    A=x/a;
    B=y/b;
    System.out.printf("%.14f\n%.14f\n",A,B);
    }
}
