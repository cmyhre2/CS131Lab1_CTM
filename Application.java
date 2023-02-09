/**
 * This is the Application object that will launch our application
 * @author Chris Myhre
 * @version 1.0
 * Spring 2023
 */
public class Application {
/*
 * main() method tests every constructor from NonPlayerCharacter & BasketBallTeam classes.
 */
	public static void main(String[] args) {
		//NonPlayerCharacter methods
		NonPlayerCharacter npc = new NonPlayerCharacter();//creates default npc
		System.out.println(npc.reportStructure());//prints nps info
		npc.setActive(false);//sets npc to not active
		npc.getActive();//gets npc activity level
		NonPlayerCharacter jerry = new NonPlayerCharacter("Bob", "KIND", true, "AVERAGE");//creates npc "jerry" with preferred constructor.
		System.out.println(jerry.reportStructure());//prints npc "jerry" info
		jerry.setActive(false);//sets npc "jerry" to not active
		jerry.setUniqueID("Jerry");//changes npc "jerry" name
		jerry.setPersonality("Outgoing");//changes npc "jerry" personality type
		jerry.setIntelligenceType("SMART");//changes npc "jerry" personality
		System.out.println(jerry.reportStructure());//prints npc "jerry" info
		System.out.println(jerry.introduce());//gets npc "jerry" to say hi and his name
		System.out.println(jerry.exclaim());//gets npc "jerry" to say a random line
		
		//BasketBallTeam methods
		BasketBallTeam bellarmine = new BasketBallTeam("Bellarmine","Knight","Scott Davenport");//creates the BasketBallTeam "bellarmine" with preferred constructor
		bellarmine.setStats(10, 11, 12, 13, 14, 15);//sets BasketBallTeam "ballarmine" stats
		double [] stats = bellarmine.getStats();//creates a double array to take in getStats() array
		System.out.printf("\nWin Percentage: " + "%,.2f",stats[0]);//prints win percentage rounded to 2 decimal places
		System.out.printf("\nField Goal Percentage: " + "%,.2f",stats[1]);//prints field goal percentage rounded to 2 decimal places
		System.out.printf("\nFree Throw Percentage: " + "%,.2f",stats[2]);//prints throw percentage rounded to 2 decimal places
	}//end main

}//end class