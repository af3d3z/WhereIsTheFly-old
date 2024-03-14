package base;

/**
 * Class that represents a Fly. It contains healthpoints and name attributes.
 * 
 * @author Alonso
 * @author Nestor
 */
public class Fly {

	/**
	 * Health points of the fly
	 */
	private int healthPoints;

	/**
	 * Name of the fly
	 */
	private String name = "";

	/**
	 * modifies the healthpoints of the fly
	 * 
	 * @param hp number of health points to assign to the fly
	 */
	public void setHealthPoints(int hp) {
		if (hp > 0) {
			this.healthPoints = hp;
		}
	}

	/**
	 * returns the fly health points
	 * 
	 * @return Fly's health points
	 */
	public int getHealthPoints() {
		return this.healthPoints;
	}

	/**
	 * Modifies the name of the fly
	 * 
	 * @param name Name for the fly
	 */
	public void setName(String name) {
		if (!name.trim().equals("")) {
			this.name = name;
		}
	}

	/**
	 * Returns the name of the fly
	 * 
	 * @return name of the fly
	 */
	public String getName() {
		return this.name;
	}
	
}