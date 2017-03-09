//Fibonacci数列：1,1,2,3,5,8，...第40个数的值   （非递归调用）
public class Fab {
	public static void main(String[] args) {
		System.out.println(f(40));
	}
	
	public static long f(int index) {
		if(index==1||index==2) {
			return 1;
		}
		
			long f1 = 1L;
			long f2 = 1L;
			long f3 = 0;
			
			for(int i=1;i<=index-2;i++) {
				f3 = f1 + f2;
				f1 = f2;
				f2 = f3;
			}
			
			return f3;
		
	}
} 