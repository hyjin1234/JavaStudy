/*
 * 173page
 * -------
 *  초기값
 *  do{
 *        반복수행
 *        증가심
 *  }while(조건식)
 *    
 *    int i=1;
 *    do{
 *        System.out.println("i="+i);
 *        i++
 *      }while(i<=10)
 *       
 */
public class 반복문_dowhile {

	public static void main(String[] args) {
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

	}

}
