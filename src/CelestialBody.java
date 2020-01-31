

/**
 * Celestial Body class for NBody
 * @author Kathleen Chen
 *
 */
public class CelestialBody {

	private double myXPos;
	private double myYPos;
	private double myXVel;
	private double myYVel;
	private double myMass;
	private String myFileName;

	/**
	 * Create a Body from parameters	
	 * @param xp initial x position
	 * @param yp initial y position
	 * @param xv initial x velocity
	 * @param yv initial y velocity
	 * @param mass of object
	 * @param filename of image for object animation
	 */
	public CelestialBody(double xp, double yp, double xv,
			             double yv, double mass, String filename){
		// TODO: complete constructor
		myXPos = xp;
		myYPos = yp;
		myXVel = xv;
		myYVel = yv;
		myMass = mass;
		myFileName = filename;
	}

	/**
	 * Copy constructor: copy instance variables from one
	 * body to this body
	 * @param b used to initialize this body
	 */
	public CelestialBody(CelestialBody b){
		// TODO: complete constructor
		myXPos = b.getX();
		myYPos = b.getY();
		myXVel = b.getXVel();
		myYVel = b.getYVel();
		myMass = b.getMass();
		myFileName = b.getName();
	}

	public double getX() {
		// TODO: complete method
		return this.myXPos;
	}
	public double getY() {
		// TODO: complete method
		return this.myYPos;
	}
	public double getXVel() {
		// TODO: complete method
		return this.myXVel;
	}
	/**
	 * Return y-velocity of this Body.
	 * @return value of y-velocity.
	 */
	public double getYVel() {
		// TODO: complete method
		return this.myYVel;
	}
	
	public double getMass() {
		// TODO: complete method
		return this.myMass;
	}
	public String getName() {
		// TODO: complete method
		return this.myFileName;
	}

	/**
	 * Return the distance between this body and another
	 * @param b the other body to which distance is calculated
	 * @return distance between this body and b
	 */
	public double calcDistance(CelestialBody b) {
		// TODO: complete method
		double distance = Math.sqrt((b.getX() - this.myXPos) * (b.getX() - this.myXPos) + (b.getY() - this.myYPos) * (b.getY() - this.myYPos));
		return distance;
	}

	public double calcForceExertedBy(CelestialBody b) {
		// TODO: complete method
		double G = 6.67e-11;
		double F = (G * b.getMass() * this.myMass) / (calcDistance(b) * calcDistance(b));
		return F;
	}

	public double calcForceExertedByX(CelestialBody b) {
		// TODO: complete method
		double ForceX = 0.0;
		return ForceX;
	}
	public double calcForceExertedByY(CelestialBody b) {
		// TODO: complete method
		return 0.0;
	}

	public double calcNetForceExertedByX(CelestialBody[] bodies) {
		// TODO: complete method
		return 0.0;
	}

	public double calcNetForceExertedByY(CelestialBody[] bodies) {
		// TODO: complete method
		return 0.0;
	}

	public void update(double deltaT, 
			           double xforce, double yforce) {
		// TODO: complete method
	}

	public void draw() {
		// TODO: complete method
	}
}
