import java.util.Scanner;

/*
 *   1. 컴퓨터 가위바위보
 *      -------------계속 진행 ===> q,Q입력하면 종료
 */
public class 반복제어문_3 {
    //종료시 break, continue =>잘못된 입력시 경고
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int win=0,lose=0,same=0;
		int count=0;//게임 횟수
		Scanner scan=new Scanner(System.in);
		System.out.println(scan);
	
		//new ==> 메모리가 공간이 다르다
        while(true) {
        	// 난수 발생 ==> 게임 시점 0(가위) 1(바위) 2(보)
        	int com=(int)(Math.random()*3);//0~2
        	// ==>웹 (예약일) 0.0~0.99 ==>0.0~2.999==>0~2
        	System.out.print("가위(0) 바위(1) 보(2) :");
        	int user=scan.nextInt();
        	if(user<0||user>2) {//잘못된 입력
        		System.out.println("가위(0) 바위(1) 보(2)를 입력하세요");
        		continue;//처음부터 다시 실행 ==> while문 조건으로 이동
        	}
        	count++;
        	
        	if(com==0) 
        		System.out.println("컴퓨터: 가위");
        	else if(com==1)
        		System.out.println("컴퓨터 : 바위");
        	else if(com==2)
        		System.out.println("컴퓨터 : 보");
        	
        	if(user==0) 
        		System.out.println("사용자: 가위");
        	else if(user==1)
        		System.out.println("사용자 : 바위");
        	else if(com==2)
        		System.out.println("사용자 : 보");
        	
        	//결과값 출력 / 확인
        	/*                com-user
        	 *   com    user
        	 *     0      0  0
        	 *            1  -1
        	 *            2  -2
        	 *  --------------          
        	 *     1      0  1
        	 *            1  0
        	 *            2   -1
        	 *  --------------
        	 *     2      0 2
        	 *            1  1
        	 *            2  0
        	 * ==================user==>-1,2
        	 *                   com==>-2,1
        	 *                   
        	 */
        	//10번 4승 2무 4패
        	switch(com-user)
        	{
        	case -1,2:
        		System.out.println("사용자 win");
        	    win++;//이긴횟수
        	break;
        	case -2,1:
        		System.out.println("컴퓨터 win");
        	    lose++;//진횟수
        	break;
        	case 0:
        		System.out.println("비겼다");
        		same++;//비긴횟수
        		break;
        	}
        	//종료 여부 확인
        	System.out.println("게임을 계속 진행하시겠습니까?( y / n )");
        	char a=scan.next().charAt(0);//Scanner로 문자하나받기
        	
        	if(a=='y'||a=='Y') {
        		System.out.println("게임을 종료합니다");
        		break;//while문 종료
        	}
        	
        	
        }
        
        System.out.printf("%d전 %d승 %d무 %d패\n",count,win,same,lose);
        
        
	}

}
