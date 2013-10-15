package invokerGame;

public class InvokerGameSpells {

	private String orbCombination;
	private String spellName;
	
	public InvokerGameSpells(String orbCombination, String spellName) {
		this.orbCombination = orbCombination;
		this.spellName = spellName;
	}
	
	public String getOrbCombination() {
		return orbCombination;
	}
	
	public String getSpellName() {
		return spellName;
	}
}
