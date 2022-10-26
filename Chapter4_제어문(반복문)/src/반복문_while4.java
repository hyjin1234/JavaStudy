// 사용자가 정수 10개 입력 => 입력된 값을 누적합을 출력
import java.util.Scanner;
public class 반복문_while4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int sum=0;
		/*System.out.println("1번째 정수 입력:");
		int num=scan.nextInt();
		//sum에 누적
		sum+=num;
		
		System.out.println("2번째 정수 입력:");
		 num=scan.nextInt();
		//sum에 누적
		sum+=num;
		
		System.out.println("3번째 정수 입력:");
		 num=scan.nextInt();
		//sum에 누적
		sum+=num;
		
		System.out.println("4번째 정수 입력:");
		 num=scan.nextInt();
		//sum에 누적
		sum+=num;*/
		
		int i=1;
		while(i<=10) {
			System.out.println(i+"번째 정수 입력:");
			 int a=scan.nextInt();
			 sum+=a;
			i++;
		}
		System.out.println("sum:"+sum);
		
		String[] arr= {"홍길동","심청이","춘향","반문수","이순신"};
		for(int a=0;a<=4;a++) {
			System.out.print(arr[a]+" ");
		}
		

	}

}
