package mathsComputer;

public class sz extends ddxs implements kys {
	private int n;
	public sz(int i) {
		n=i;
	}
	//
	public int getInt() {
		return n;
	}
	//	
	public sz toChen(sz aSz) {
		int jg=n*aSz.getInt();
		return new sz(jg);
	}
	public sz toAdd(sz aSz) {
		int jg=n+aSz.getInt();
		return new sz(jg);
	}
	
	@Override
	public void hj() {
		// TODO Auto-generated method stub
	}

}
