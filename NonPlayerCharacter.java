/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author Chris Myhre (v1.4) & Rob Kelley (v1.3)
 * @version 1.4
 * Spring 2023
 */

public class NonPlayerCharacter extends GameCharacter {
private boolean active;
private String intelligenceType;
public void setActive(boolean newActive){
	active=newActive;
}//end setActive

public boolean getActive() {
	return active;
}//end getActive

public void setIntelligenceType(String newIntelligenceType) {
	intelligenceType=newIntelligenceType;
}//end setIntelligenceType

public String getIntelligenceType() {
	return intelligenceType;
}//end getIntelligenceType

public NonPlayerCharacter(){
	super();
	setActive(false);
	setIntelligenceType("AVERAGE");
}//end NonPlayerCharacter() default constructor

public NonPlayerCharacter(String newID, String newPersonality, boolean newActive, String newIntelligenceType){
	uniqueID=newID;
	personality=newPersonality;
	active=newActive;
	intelligenceType=newIntelligenceType;
}//end NonPlayerCharacter preferred constructor.

public String reportStructure(){
	StringBuilder sb = new StringBuilder(super.reportStructure());
	sb.append("==================================\n");
	sb.append("Active: "+getActive()+"\n");
	sb.append("Intelligence: "+getIntelligenceType()+"\n");
	sb.append("==================================\n");
	
	return sb.toString();
}//end reportStructure

public String introduce() {
	String introduction = "Hello, my name is " + uniqueID;
	return introduction;
}//end introduce

public String exclaim() {
	String [] exclaims = new String[] {"Dag Gummit", "Doggone it", "Holy Cow", "Jeez", "Well cheese and crackers"};
	int i = (int) Math.random()*5;
	return exclaims[i];
}

}//end class
