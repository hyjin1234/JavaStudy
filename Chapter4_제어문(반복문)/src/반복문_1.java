//1~100까지 합을 구해라
public class 반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수 1~100합을 누적하는 변수
		System.out.println("========for==========");
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
		    System.out.println("i:"+i+",sum:"+sum);
		
		}
		System.out.println("for문 : 1~100까지의 합: "+sum);
		
		System.out.println("========while==========");
		int i=1;
		int sum1=0;
		while(i<=100) {
			sum1+=i;
			System.out.println("i:"+i+",sum1:"+sum1);
			i++;
		}
		System.out.println("while문 : 1~100까지의 합: "+sum1);
		
		System.out.println("========do~while========");
		sum=0;
		i=1;
		do {
			sum+=i;
			System.out.println("i:"+i+",sum:"+sum);
			i++;
		}while(i<=100);
		
		System.out.println("do~while문 : 1~100까지의 합: "+sum);
		//명령문은 같다 형식이 다르다

	}

}
