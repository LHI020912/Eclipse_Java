package ch05.sec02;
import java.util.Random;
public class ArrayEx2 {

	public static void main(String[] args) {
		// 로또번호 생성
		int a[] = new int[6];
		Random r = new Random();
		
		for(int i=0; i<a.length; i++) {
			int num = r.nextInt(45)+1;
			a[i] =num;
			boolean dupl = false;
			
			for(int j=0; j<i; j++) {
				if(a[j] == a[i]) {
					i--;
					dupl = true;
					break;
				}
			}
			if(!dupl)
				System.out.print(a[i]+" ");
		}
	}
}