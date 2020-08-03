package ai;
import java.math.BigDecimal;
public class pi2 {
	public static void main(String[] args) {
		BigDecimal pi=new BigDecimal("0");
		BigDecimal pp=new BigDecimal("0");
		BigDecimal p=new BigDecimal("0");
		var a=new BigDecimal("1");
		var b=new BigDecimal("4");
		for(int i = 0;i<2000000000;i++) {
			double zf=Math.pow(-1,i);
			double k=(2*i+1)*zf;
			BigDecimal k1=BigDecimal.valueOf(k);
			p=a.divide(k1,100,BigDecimal.ROUND_HALF_EVEN);
			pi=pi.add(p);
			pp=b.multiply(pi);
			System.out.println(pp);
		}
	}

}
