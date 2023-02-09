/**
 * This is our BasketBall Teams that will inherit SportsTeams as it represents
 * what the game controls.
 * @author Chris Myhre
 * @version 1.0
 * Spring 2023
 */
public class BasketBallTeam extends SportsTeam {
	//instance variables set to private so they can only be get/set with this class's getters/setters
	private int fieldGoals;//double variable used for a basketball team's field goals
	private int fieldGoalsAttempted;//double variable used for a basketball's goals attempted
	private int freeThrows;//double variable used for a basketball team's free throws
	private int freeThrowsAttempted;//double variable used for a basketball team's free throws attempted
	
	/*
	 * The empty argument constructor generates a new team with all instance
	 * Strings/int fields set to "" or 0
	 */
	public BasketBallTeam() {
		teamName="";
		teamMascot="";
		headCoach="";
		wins=0;
		losses=0;
		fieldGoals=0;
		fieldGoalsAttempted=0;
		freeThrows=0;
		freeThrowsAttempted=0;
	}//end BasketBallTeam() default constructor
	
	/*
	 * This constructor allows the caller to pass in teamName, teamMascot & headCoach
	 * @param teamName, teamMascot, headCoach
	 */
	public BasketBallTeam(String teamName, String teamMascot, String headCoach) {
		this.teamName=teamName;
		this.teamMascot=teamMascot;
		this.headCoach=headCoach;
		wins=0;
		losses=0;
		fieldGoals=0;
		fieldGoalsAttempted=0;
		freeThrows=0;
		freeThrowsAttempted=0;
	}//end BasketBallTeam() preferred constructor
	
	/*
	 * This method calculates the field goal percentage
	 * To calculate correctly, fieldGoals is type casted into a double
	 * @return fGoalPercentage
	 */
	public double fieldGoalPercentage() {
		double fGoalPercentage=((double)fieldGoals/fieldGoalsAttempted)*100;
		return fGoalPercentage;
	}//end fieldGoalPercentage()
	
	/*
	 * This method calculates the free throw percentage
	 * To calculate correctly, freeThrows is type casted into a double.
	 * @return fThrowpercentage
	 */
	public double freeThrowPercentage() {
		double fThrowPercentage=((double)freeThrows/freeThrowsAttempted)*100;
		return fThrowPercentage;
	}//end freeThrowPercentage()
	
	/*
	 * This method alls the caller to set game stats by passing in wins, losses,
	 * fieldGoals, fieldGoalsAttempted,freeThrows, freeThrowsAttempted.
	 * @param wins, losses, fieldGoals, fieldGoalsAttempted, freeThrows, freeThrowsAttempted
	 */
	public void setStats(int wins, int losses, int fieldGoals, int fieldGoalsAttempted, int freeThrows, int freeThrowsAttempted){
		this.wins=wins;
		this.losses=losses;
		this.fieldGoals=fieldGoals;
		this.fieldGoalsAttempted=fieldGoalsAttempted;
		this.freeThrows=freeThrows;
		this.freeThrowsAttempted=freeThrowsAttempted;
	}//end setStats()
	
	/*
	 * This method overrides the super class's getStats() abstract method puts
	 * the game stats in an array stats
	 * @return stats
	 * @override super.getStats()
	 */
	public double[] getStats() {
		double [] stats = new double[3];
		stats[0]=getWinPercentage();
		stats[1]=fieldGoalPercentage();
		stats[2]=freeThrowPercentage();
		return stats;
	}//end getStats()
}//end BasketBallTeam class