import java.util.Scanner;

/*
 * 6. 사용자로부터 두개의 정수(시작,끝)를 입력받아 시작(포함)해서 
   끝(포함)까지의 곱을 출력하는 프로그램을 작성하시오.

 */
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  Scanner scan=new Scanner(System.in);
	  System.out.println("정수 두개(시작,끝)을 입력하시오(10 10):");
	  int num1=scan.nextInt();
	  int num2=scan.nextInt();
	  int gop=1;
	  
	  for(int i=num1;i<=num2;i++) {
		  gop*=i;
	  }

	  System.out.println("답:"+gop);
	}

}
