public class SnakeandLadder {
	static final int noPlay = 0;
	static final int ladder = 1;
	static final int snake = 2;
	
	public static void main(String[] args) {
		System.out.println("Welcome");
		
		int currentPosition =0;
		System.out.println("Initial Position is "+currentPosition);

		int die = (int) Math.floor(Math.random()*10)%6+1;
		System.out.println("die is "+die);
	
int option = (int) Math.floor(Math.random()*10)%3;
		

		
		switch(option)
		{
		case noPlay:
			System.out.println("No change- Position is = "+currentPosition);
			
			break;
		case ladder:
			currentPosition = currentPosition + die;
			System.out.println("Goes Ahead by " + die +" Position is = "+currentPosition);
			
			break;
		case snake:
			currentPosition = currentPosition - die;
			System.out.println("Goes Behind by "+ die + " Position is = "+currentPosition);
			
			break;
		default:
			break;
		}
	}
}
	