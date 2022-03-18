package Q2;

public class Feet {
	 private int feet;
	 private int inches;
	 
	 public Feet(int feet, int inches){
		 this.feet = feet;
		 this.inches=inches;
	 }
	 
	 public Feet (Feet len) {
		 this.feet = len.feet;
		 this.inches = len.inches;
	 }
	 
	// Add f1+f2 feet and store in current feet
	 public void add(Feet f1, Feet f2){
		 feet = f1.feet + f2.feet;
		 inches = f1.inches + f2.inches;
	 }
	 
	 public void add(Feet f1) { 
		 
		 feet = feet + f1.feet;
		 inches = inches + f1.inches;
		 
		 while (inches >= 12)
		 {
		       int remain = inches / 12;

		       feet += remain;
		       inches -= (remain * 12);
		 }

	 }
	 
	 public static void print(Feet f)
	 {
		 System.out.println(f.feet+"'"+f.inches+'"'); 
	 }
	 
	 public static Feet add(Feet f1, Feet f2,Feet f3){
		 
		 	Feet f5 = new Feet(0,0);
		 
		 	f5.feet = f1.feet+ f2.feet+f3.feet;
		 	f5.inches = f1.inches + f2.inches +f3.inches;
		 	
			 while (f5.inches >= 12)
			 {
			       int remain = f5.inches / 12;

			       f5.feet += remain;
			       f5.inches -= (remain * 12);
			 }
		 	
		 	return f5;
		 	
	 }
	 
	 
	 public void print() {
		 System.out.println(feet+"'"+inches+'"');
	 }
	 
	// Display a Length e.g 5’6”
	public void print(String msg) {
		System.out.println(msg+" : "+feet +"'"+inches+'"');
	}
	
}
