import java.util.Scanner;

//11. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇개인지 출력하는 프로그램 작성

public class 문제11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int i=1;
		int a=0;
		int res=0;
		while(i<=10) {
			System.out.print(i+"번째 정수를 입력하시오:");
			a=scan.nextInt();
			
			if(a%2==0) {
				res+=1;
			}
			i++;
		}
		System.out.println("10개의 정수를 입력받아 그 수들 중 짝수의 개수:"+res);

	}

}
