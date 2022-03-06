package JavaAssessment;

import java.util.HashMap;
import java.util.Scanner;

public class JavaMap {

	public static void main(String[] args) {
		HashMap<String, Integer> hash = new HashMap<>();
		
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        sc.nextLine();
        
        for(int i=0;i<n;i++)
        {
            String name=sc.nextLine();
            int phoneno=sc.nextInt();
            sc.nextLine();
            hash.put(name,phoneno);
        }
        while(sc.hasNext())
        {
            
        	String s=sc.nextLine();
            try
            {
                int out=hash.get(s);
                System.out.println(s+"="+out);
            }
            catch(Exception e)
            {
                System.out.println("Not found");
            }
        }
        sc.close();

	}

}