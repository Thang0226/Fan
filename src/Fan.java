public class Fan {
	private int speed = Constants.SLOW;
	private boolean on = false;
	private double radius = 5.0;
	private String color = "blue";

	Fan() {
	};

	public int getSpeed() {
		return this.speed;
	}

	public void setSpeed(int newSpeed) {
		this.speed = newSpeed;
	}

	public boolean getState() {
		return this.on;
	}

	public void setState(boolean newState) {
		this.on = newState;
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String newColor) {
		this.color = newColor;
	}

	@Override
	public String toString() {
		String str = "";
		if (this.on) {
			str += "Fan is on";
			str += "    Speed: " + this.speed;
			str += "    Radius: " + this.radius;
			str += "    Color: " + this.color;
		} else {
			str += "Fan is off";
			str += "    Radius: " + this.radius;
			str += "    Color: " + this.color;
		}
		return str;
	}
}
