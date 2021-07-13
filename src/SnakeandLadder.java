public class SnakeandLadder {
	static final int noPlay = 0;
	static final int ladder = 1;
	static final int snake = 2;
	
	public static void main(String[] args) {
		System.out.println("Welcome");
		
		int i=0;
		int p=1;
		
		int count=0;
		int currentPosition1 =0;
		int currentPosition2 =0;
		System.out.println("Initial Position is "+currentPosition1);
		
		int die;
		
		int option;
		
		while(i==0) {
		
		while(currentPosition1 <= 100 && i==0 && p==1) {
			
			die = (int) Math.floor(Math.random()*10)%6+1;
			System.out.println("die is "+die);
			count++;
			
			
			
			option = (int) Math.floor(Math.random()*10)%3;
			
		switch(option)
		{
		case noPlay:
			System.out.println("{Player1} No change- Position is = "+currentPosition1);
			p = 2;
			break;
		case ladder:
			currentPosition1 = currentPosition1 + die;
			System.out.println("{Player1}(Ladder) Goes Ahead by " + die +" Position is = "+currentPosition1);
			
			if(currentPosition1>=100) {
				if(currentPosition1 > 100) {
					currentPosition1 = currentPosition1 - die;
				}
				else 
				{
					System.out.println("\n\n **  {Player1 WON}  *****\nwinning psition = "+currentPosition1+"\n********");
					i=1;
				}
				}
			
			break;
		case snake:
			currentPosition1 = currentPosition1 - die;
			if(currentPosition1 < 0) {
			currentPosition1=0;
			}
			System.out.println("{Player1}(Snake) Goes Behind by "+ die + " Position is = "+currentPosition1);
			p = 2;
			break;
		default:
			break;
		}
		}
		
while(currentPosition2 <= 100 && i==0 && p==2) {
			
			die = (int) Math.floor(Math.random()*10)%6+1;
			System.out.println("die is "+die);
			count++;
			
			
			
			option = (int) Math.floor(Math.random()*10)%3;
			
		switch(option)
		{
		case noPlay:
			System.out.println("{Player1}No change- Position is = "+currentPosition2);
			p = 1;
			break;
		case ladder:
			currentPosition2 = currentPosition2 + die;
			System.out.println("{Player1}(Ladder) Goes Ahead by " + die +" Position is = "+currentPosition2);
			
			if(currentPosition2>=100) {
				if(currentPosition2 > 100) {
					currentPosition2 = currentPosition2 - die;
				}
				else 
				{
					System.out.println("\n\n **  {Player2 WON}  *****\nwinning psition = "+currentPosition2+"\n********");
					i=1;
				}
				}
			
			break;
		case snake:
			currentPosition2 = currentPosition2 - die;
			if(currentPosition2 < 0) {
			currentPosition2=0;
			}
			System.out.println("{Player1}(Snake) Goes Behind by "+ die + " Position is = "+currentPosition2);
			p = 1;
			break;
		default:
			break;
		}
		}
		}
		
		System.out.println("\ndice rolled "+count+" times");
	}

}
	