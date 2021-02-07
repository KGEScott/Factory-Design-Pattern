/**
 * Sets up the bike store and passes in the type to then create the type of bike, then calls upon the createBike method to input the information.
 * @author Kyrtis Scott
 *
 */
public class BikeStore	{
	
	/**
	 * Takes the type of bike and selects whether it is a tricycle, strider, or kids bike, then returns the information. It also sets the create bike and get price information.
	 * @param type passes in the type of bike that it is.
	 * @return returns the bike information.
	 */
	public Bike orderBike(String type) {
		Bike bike;
		
		if(type.equals("tricycle")) {
			bike = new Tricycle();
		}
		else if(type.equals("strider")) {
			bike = new Strider();
			}
		else
			bike = new KidsBike();
		bike.createBike();
		bike.getPrice();
		return bike;
	}
	/**
	 * This creates the bike using the type of bike that is passed within.
	 * @param type passes in the type of bike.
	 * @return returns the bike information.
	 */
	private Bike createBike(String type) {
		Bike bike = null;
		
		if(type.equals("tricycle")) {
			bike = new Tricycle();
		}
		else if(type.equals("strider")) {
			bike = new Strider();
			}
		else
			bike = new KidsBike();
		return bike;
	}

}
