
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		PseudoExponentialDist ped = new PseudoExponentialDist(10000, 1000);
//		ped.simulatePseudoExponentialDist();
//		ped.showData();
		PseudoErlangK2Dist pek = new PseudoErlangK2Dist(10, 1);
		pek.simulatePseudoErlangK2Dist();
		pek.showData();
		
		System.out.println("");
	}

}
