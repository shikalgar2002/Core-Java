package encapsulation;

public class BikeMainEncapsulation {

	public static void main(String[] args) {
	
		BikeEncapsulation b  = new BikeEncapsulation();
		
		b.setColor("Black");
		b.setName("Splendor");
		b.setPrize(90000);
		
		System.out.println(b.getColor());
		System.out.println(b.getName());
		System.out.println(b.getPrize());
	}

}
