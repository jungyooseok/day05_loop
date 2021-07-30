package day05_loop;

public class Test {
	public static void main(String[] args) {
		int su1=0, su2=0;
		for(su1=1; su1<=5; su1++) {
			for(su2=1; su2<=5; su2++) {
				System.out.println("su1 : "+su1+", su2 : "+su2);
			}
		}
		for(su1=1; su1<=5; su1++) {
			for(su2=1; su2<=4; su2++) {
				System.out.print(su2+"\t");
			}
		}
	}
}
