/*
 *   AAAAA
 *   BBBBB
 *   CCCCC
 *   DDDDD
 *   EEEEE
 *   =========5줄씩 알파벳 5개
 *   for(int i=1;i<=5;i++){
 *            for(int j=1;j<=5;j++){
 *                char c='A';
 *                c++;
 *            }
 *   }
 */
public class 반복문_중첩for2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='A';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(c);
				
			}
			System.out.println();
			c++;
		}

	}

}
