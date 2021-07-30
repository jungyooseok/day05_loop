package day05_loop;

public class Quiz01 {
	public static void main(String[] args) {
		for(int i=1; i<5 ; i++) {
			System.out.println(i+".hello");
		}
		int sum=0;
		for(int i=0; i<=100 ;i++) {
			sum+=i;
			//System.out.println(i+" : "+sum);
			if(sum == 528) {
				System.out.println(i);
			}
		}
		for(int i=1; i<=25 ; i++) {
			/*System.out.print(i+ "  ");
			if(i%5 == 0) {
				System.out.println();
			}
			*/
			if(i%5 == 0) {
				System.out.println(i);
			}else {
				System.out.print(i+"\t");
			}
		}
	}
}





