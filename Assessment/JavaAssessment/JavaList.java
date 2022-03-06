package JavaAssessment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			 list.add(sc.nextInt());
		}
		
		
		int q = sc.nextInt();
		for(int i=1;i<=q;i++) {
			
			String c = sc.next();
			
			if(c.equals("Insert")) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				list.add(x,y);
				}
			else {
				int z = sc.nextInt();
				list.remove(z);
				
			}
			
		}
		  Iterator<Integer> it = list.iterator(); 
	        while(it.hasNext()) {
	        	System.out.print(it.next()+" "); 
	        }
	        sc.close();
		
	}

}