public class SnakeandLadder {
	static final int noPlay = 0;
	static final int ladder = 1;
	static final int snake = 2;
	
	public static void main(String[] args) {
		System.out.println("Welcome");
		
		int i=0;
		
		int count=0;
		int currentPosition =0;
		System.out.println("Initial Position is "+currentPosition);
		
		int die;
		
		int option;
		
		
		
		while(currentPosition <= 100 && i==0) {
			
			die = (int) Math.floor(Math.random()*10)%6+1;
			System.out.println("die is "+die);
			count++;
			
			
			
			option = (int) Math.floor(Math.random()*10)%3;
			
		switch(option)
		{
		case noPlay:
			System.out.println("No change- Position is = "+currentPosition);
			
			break;
		case ladder:
			currentPosition = currentPosition + die;
			System.out.println("(Ladder) Goes Ahead by " + die +" Position is = "+currentPosition);
			
			if(currentPosition>=100) {
				if(currentPosition > 100) {
					currentPosition = currentPosition - die;
				}
				else 
				{
					System.out.println("*****\nwinning psition = "+currentPosition+"\n********");
					i=1;
				}
				}
			
			break;
		case snake:
			currentPosition = currentPosition - die;
			if(currentPosition < 0) {
			currentPosition=0;
			}
			System.out.println("(Snake) Goes Behind by "+ die + " Position is = "+currentPosition);
			break;
		default:
			break;
		}
		}
		
		System.out.println("\ndice rolled "+count+" times");
	}

}
	