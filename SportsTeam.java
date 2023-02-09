/**
 * This is the base SportsTeam object for which all Teams will be made.
 * @author Chris Myhre
 * @version 1.0
 * Spring 2023
 */
public abstract class SportsTeam {
	//instance variables set to protected so subclasses can use and manipulate these variables
	protected String teamName;//String variable used for a team name
	protected String teamMascot;//String variable used for a team mascot
	protected String headCoach;//String variabe used for a team's head coach
	protected int wins;//int variable used for a team's wins
	protected int losses;//int variable used for a team's losses
	/*
	 * The empty argument constructor creates a team with a blank name,
	 * blank mascot, blank name for head coach, 0 wins & 0 losses.
	 */
	public SportsTeam() {
		teamName = "";
		teamMascot = "";
		headCoach = "";
		wins=0;
		losses=0;
	}//end Team() default constructor
	/*
	 * This constructor allows the caller to pass in teamName, teamMascot & headCoach
	 * @param teamName, teamMascot, headCoach
	 */
	public SportsTeam(String teamName, String teamMascot, String headCoach) {
		this.teamName=teamName;
		this.teamMascot=teamMascot;
		this.headCoach=headCoach;
		wins=0;
		losses=0;
	}//end Team() preferred constructor
	/*
	 * This method calculates a team's win percentage
	 * To calculate correctly, wins is type casted into a double
	 * @return winPercentage
	 */
	public double getWinPercentage() {
		double winPercentage=((double)wins/(wins+losses)*100);
		return winPercentage;
	}//end getWinPercentage()
	/*
	 * This method requires the child class to create a getStats() method
	 */
	public abstract double [] getStats();
}//end SportsTeam class
