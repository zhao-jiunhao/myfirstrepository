package ai;
import java.util.*;
public class hole {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int b=0;
			System.out.println("输入数字");
			int a=sc.nextInt();
			String shuzi=String.valueOf(a);
			int n=shuzi.length();
			int jieguo=0;
			for(int i=0;i<n;i++) {
				String shuwei=shuzi.substring(i,i+1);
				int shu=Integer.parseInt(shuwei);			
				jieguo=jieguo+shu*shu*shu;
				}
			System.out.println(jieguo);
			if(jieguo==a) {
				System.out.println("是黑洞数");
				b++;
			}
			while(b==0) {
			a=jieguo;
			jieguo=0;
			String shuzi1=String.valueOf(a);
			int n1=shuzi1.length();
			for(int i1=0;i1<n1;i1++) {
				String shuwei1=shuzi1.substring(i1,i1+1);
				int shu1=Integer.parseInt(shuwei1);	
				jieguo=(jieguo+shu1*shu1*shu1);
				}
			jieguo=(int) Math.pow(jieguo, 1/3);
			System.out.println(jieguo);
			if(jieguo==a) {
				System.out.println("是黑洞数");
				b++;
			}else {
				System.out.println("不是黑洞数");
		}
	}

}
}
