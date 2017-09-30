import java.util.*;
public class Main {
//身高體重
    public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int x,y;
	double A,B;
	//float a=2.54f;
	//float b=0.454f;這裡這樣會數字不一樣
	x=in.nextInt();
    y=in.nextInt();
    A=x/2.54;
    B=y/0.454;
    System.out.printf("%.14f\n%.14f\n",A,B);
    }
}
