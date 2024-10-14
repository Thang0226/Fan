public class Main {
	public static void main(String[] args) {
		Fan fan1 = new Fan();
		fan1.setSpeed(Constants.FAST);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setState(true);

		Fan fan2 = new Fan();
		fan2.setSpeed(Constants.MEDIUM);

		System.out.println("Fan 1 information: " + fan1);
		System.out.println("Fan 2 information: " + fan2);
	}
}