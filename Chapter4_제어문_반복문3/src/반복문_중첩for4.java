/*
 * i    j
 * 1    4
 * 2    3
 * 3    2    j=5-i
 * 
 * 
 */
import java.util.Scanner;
public class 반복문_중첩for4 {   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan=new Scanner (System.in);
		System.out.println("정수 입력:");
		int user=scan.nextInt();*/
		
		for(int i=1;i<=4;i++) { //정렬, 빈도 구하기
			char c='A';
			for(int j=1;j<=i;j++) {
				
					System.out.print(c++);
				  
				}
			
			System.out.println();
				}
		
		for(int i =1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i =4;i<=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i==j) {
					System.out.print("*");
				}else {
					System.out.print("☆");
				}
				
			}
			System.out.println();
		}
		
		
		
		
		
		
			
			}
	
	
	
	
}

	


