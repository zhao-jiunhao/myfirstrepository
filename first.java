package ai;

import java.util.*;
public class first {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		int thanks;
		while (true) {
			String str;
			str=sc.next();
			str=str.replace("Âð", "");
			str=str.replace("£¿", "£¡");
			int n=str.length();
			int checkInt=0;
			thanks=0;
			for(int i1=0;i1<=n-1;i1++) {
				char cp=str.charAt(i1);
				StringBuilder a=new StringBuilder();
				a.append(cp);
				String check=a.toString();
				if(check.equals("ºÃ")) {
					checkInt++;
				}else if(check.equals("°ô")) {
					thanks=1;
				}
				if(check.equals("Éµ")) {
					checkInt=1;
					thanks=0;
				}
			}
			if(thanks==1) {
				str="Ð»Ð»£¡";
			}else if(checkInt==0) {
				str=str.replace("Äã","ÎÒ");
			}
				System.out.println(str);
			}
	}
}
		
		
	
