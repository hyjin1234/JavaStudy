import java.util.Scanner;

/*
 *    aBCDE
 *    AbCDE
 *    ABcDE
 *    ABCdE
 *    ABCDe
 *    
 *    ----------------------
 *    주사위 두개를 던져서
 *    합==5가 나오는 경우의 수 출력
 *    [1,4]
 *    [2,3]
 *    [3,2]
 *    [4,1]
 *    
 */
public class 반복문_중첩for6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++) {
			char c='A';
			for(int j=1;j<=5;j++) {
				if(i==j) {
					System.out.print((char)(c+32));
				}else {
					System.out.print(c);
				}
				c++;
			}
			System.out.println();
		}
		
		Scanner scan=new Scanner(System.in);
		System.out.println("2~12사이 정수 입력:");
		int hap=scan.nextInt();
		
		for(int i=1;i<=6;i++) { //첫번째 주사위
			
			for(int j=1;j<=6;j++) { //두번째 주사위
				if(i+j==hap) {
					System.out.println("["+i+","+j+"]");
				}
			}
		}
		

	}
}


