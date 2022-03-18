package Q2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Feet f1 = new Feet(5,6);
		Feet f2 = new Feet(6,7);
		Feet f3 = new Feet(5,5);
		
			Feet f5 = Feet.add(f1, f2, f3);
			f5.print();
		
	f1.add(f2);
	f1.print();
	}

}
