public class SnakeandLadder {
	public static void main(String[] args) {
		System.out.println("Welcome");
		
		int currentPosition =0;
		System.out.println("Initial Position is "+currentPosition);

		int die = (int) Math.floor(Math.random()*10)%6+1;
		System.out.println("die is "+die);
	}
}
	