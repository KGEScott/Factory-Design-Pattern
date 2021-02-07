/**
 * Initializes what a bike is and outputs information gathered from the child classes.
 * @author Kyrtis Scott
 *
 */
public abstract class Bike {

	protected String name;
	protected Double price;
	protected int numWheels;
	protected boolean hasPeddals;
	protected boolean hasTrainingWheels;
	
	/**
	 * Creates a bike by creating the frame, wheels, and pedals.
	 */
	public void createBike() {
		this.createFrame();
		this.addWheels();
		this.addPedals();
	}
	
	/**
	 * outputs the name of the bike for assembling the type of frame.
	 */
	private void createFrame() {
		System.out.println("Assembling " + name + " frame.");
	}
	
	/**
	 * outputs the count of wheels and training wheels for adding them to the bike.
	 */
	private void addWheels() {
		if(numWheels >= 2)
		System.out.println("Adding " + numWheels + " wheel(s).");
		
		if(hasTrainingWheels != false)
			System.out.println("Adding training wheels");
	}
	
	/**
	 * outputs the pedals, wether it is a strider bike with no pedals or the other bikes with pedals.
	 */
	private void addPedals() {
		if (hasPeddals != false)
			System.out.println("Adding pedals");
	}
	
	/**
	 * returns the price of the bikes.
	 * @return
	 */
	public double getPrice() {
		System.out.println("Price: $" + price);
		return price;
		
	}
}
