package test;

public class Pattern {
	public static void main(String[] args) {
		pattern(5);
	}
	
	public static void pattern(int n) {
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		
		for(int i=n;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}
