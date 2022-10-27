/*
 *   1)조건문 중첩
 *   if(조건){  ===>로그인
 *      if(조건){ ===>Admin
 *         ======>if (조건문 && 조건문) ===>Admin 메뉴
 *      }else ==>user{
 *        =========>User메뉴출력
 *      }    
 *   }else{
 *      Guest===>일반 메뉴 출력
 *   }  
 *   
 *   2) 선택문 중첩 ===>게임 , 네트워크 ==>웹(if)
 *      switch(값)
 *      {
 *      case 값:
 *          switch(변수)
 *          {
 *          case 값;
 *          }
 *      }
 *      
 *    3) 반복문 중첩
 *       ===============>for
 *       ***for()
 *       { 
 *            for(){
 *            }
 *       }
 *       
 *       for(){
 *          while(){
 *          }
 *       }  
 *       
 *       while(){
 *          for(){
 *          }
 *       }
 *       
 *       while(){
 *          while(){
 *          }
 *      }
 *      =====================
 *      이중 for문 ==>줄수
 *      for(){
 *           for(){
 *               실제 출력물
 *           }
 *           \n
 *      }
 *      
 *      A
 *      AB
 *      ABC
 *      ABCD
 *      ABCDE
 *      ABCDEF
 *      
 *      --------------------
 *      *
 *      **
 *      ***
 *      ****
 *      *****
 *      
 *      *****
 *      ****
 *      ***
 *      **
 *      *
 *           *
 *          ***
 *         *****
 *        *******
 *        
 *        ===================> 변수 위치
 *        
 *        *****
 *        *****
 *        *****
 *        *****
 *        *****
 *        
 *     형식)          | false =>for 종료
 *              1    2
 *        for(초기값;조건식;증가식){
 *                   |true
 *                        false시 1차 for의 증가식
 *                        --- 
 *                   3     4 <- 6
 *              for(초기값;조건식;증가식){
 *                         |true
 *                       실행문장 5
 *            }
 *        }
 *        
 *        
 *       
 */
public class 반복문_중첩for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("＊＊＊＊＊");
		System.out.println("＊＊＊＊＊");
		System.out.println("＊＊＊＊＊");
		System.out.println("＊＊＊＊＊");
		System.out.println("＊＊＊＊＊");
		
		//1차 for
		for(int i =1;i<=5;i++) {
			System.out.print("★");
			
		}
		System.out.println();
		for(int i =1;i<=5;i++) {
			System.out.print("★");
			
		}
		System.out.println();
		for(int i =1;i<=5;i++) {
			System.out.print("★");
			
		}
		System.out.println();
		for(int i =1;i<=5;i++) {
			System.out.print("★");
			
		}
		System.out.println();
		for(int i =1;i<=5;i++) {
			System.out.print("★");
			System.out.println();
		}
		System.out.println();
		
		System.out.println("2차 for 이용");
		
		for(int i=5;i<=1;i--) {
			for(int j =1;j<=i;j++) {
				System.out.print("★");}
			System.out.println();
		}
	}
}
