package mathsComputer.f;

public class sz extends ddxs implements khj {
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
	@Override
	public kys hj() {
		// TODO Auto-generated method stub
		return new sz(n);
	}

}
