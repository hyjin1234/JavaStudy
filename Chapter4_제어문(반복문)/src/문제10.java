//10. 1~100까지의 정수 중 4의 배수의 합계를 구하라

public class 문제10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
		int sum=0;
		while(i<=100) {
			if(i%4==0) {
				sum+=i;
			}
			i++;
		}

		System.out.println("1~100까지의 정수 중 4의 배수의 합계:"+sum);
	}

}
