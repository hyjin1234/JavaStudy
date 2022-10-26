/*
 *   난수를 여섯개 추출 => 여섯개의 합 구하기
 *   ---- 1~100
 */
public class 반복문_while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		/*int a=(int)(Math.random()+100)+1; //1~100사이 정수 추출
		sum+=a;
		a=(int)(Math.random()+100)+1; //1~100사이 정수 추출
		sum+=a;
		a=(int)(Math.random()+100)+1; //1~100사이 정수 추출
		sum+=a;
		a=(int)(Math.random()+100)+1; //1~100사이 정수 추출
		sum+=a;
		a=(int)(Math.random()+100)+1; //1~100사이 정수 추출
		sum+=a;*/
		
		int i=1;
		while(i<=6){
			int a=(int)(Math.random()*100)+1;
			// a변수는 while 한번 수행시마다=> 새로운 변수다
			System.out.println(i+"."+a);
			sum+=a;
			i++;
		}//a는 메모리에 의해서 자동 삭제
		//System.out.println("a="+a); ==>오류(지역변수)
	    System.out.println("i="+i);
		System.out.println("sum:"+sum);
		/*
		 * 
		 *   for(int=1;i<=100;i++{
		 *   }
		 *   System.out.println(i)==>오류 블록 벗어났음
		 */

	}

}
