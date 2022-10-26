import java.util.Scanner;

//12. 10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램

public class 문제12 {
	//갯수 : ++ , 누적 +=

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int sum3=0;
		int sum5=0;
		
		for(int i=1;i<=10;i++) {
			/*System.out.println(i+"번째 정수를 입력:");
			int a=scan.nextInt();*/
			
			int num=(int)(Math.random()*100)+1;
			System.out.println(i+"번째 num:"+num);
			
			if(num%3==0) 
				sum3+=1;
			if(num%5==0)
				sum5+=1;
			
			
			
		}
		System.out.println("3의 배수의 갯수:"+sum3+", 5의배수의갯수:"+sum5);

	}

}
