package IUT.BoBot.SmartCells;

import IUT.BoBot.SmartCell;

public class AuRevoirCell implements SmartCell {
	
	public String ask(String question) {
		if(question.contains("revoir") || question.contains("Revoir"))
		  return "Au Revoir!";
		else
		  return null;
	}
	
}

