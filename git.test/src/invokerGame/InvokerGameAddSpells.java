package invokerGame;

import java.util.ArrayList;

public class InvokerGameAddSpells {

	private ArrayList<InvokerGameSpells> spells;
	
	public InvokerGameAddSpells() {
		spells = new ArrayList<InvokerGameSpells>();
		
		//Cold Snap
		spells.add(new InvokerGameSpells("qqq", "Cold snap"));
				
		//Ghost walk
		spells.add(new InvokerGameSpells("qqw", "Ghost walk"));
		spells.add(new InvokerGameSpells("qwq", "Ghost walk"));
		spells.add(new InvokerGameSpells("wqq", "Ghost walk"));
				
		//Ice wall
		spells.add(new InvokerGameSpells("qqe", "Ice wall"));
		spells.add(new InvokerGameSpells("qeq", "Ice wall"));
		spells.add(new InvokerGameSpells("eqq", "Ice wall"));
		
		//EMP
		spells.add(new InvokerGameSpells("www", "EMP"));
		
		//Tornado
		spells.add(new InvokerGameSpells("wwq", "Tornado"));
		spells.add(new InvokerGameSpells("wqw", "Tornado"));
		spells.add(new InvokerGameSpells("qww", "Tornado"));
		
		//Alacrity
		spells.add(new InvokerGameSpells("wwe", "Tornado"));
		spells.add(new InvokerGameSpells("wew", "Tornado"));
		spells.add(new InvokerGameSpells("eww", "Tornado"));
		
		//Sun strike
		spells.add(new InvokerGameSpells("eee", "Sun strike"));
		
		//Forge spirit
		spells.add(new InvokerGameSpells("eeq", "Forge spirit"));
		spells.add(new InvokerGameSpells("eqe", "Forge spirit"));
		spells.add(new InvokerGameSpells("qee", "Forge spirit"));
		
		//Chaos meteor
		spells.add(new InvokerGameSpells("eew", "Chaos meteor"));
		spells.add(new InvokerGameSpells("ewe", "Chaos meteor"));
		spells.add(new InvokerGameSpells("wee", "Chaos meteor"));
		
		//Deafening blast
		spells.add(new InvokerGameSpells("qwe", "Deafening blast"));
		spells.add(new InvokerGameSpells("qew", "Deafening blast"));
		spells.add(new InvokerGameSpells("wqe", "Deafening blast"));
		spells.add(new InvokerGameSpells("weq", "Deafening blast"));
		spells.add(new InvokerGameSpells("eqw", "Deafening blast"));
		spells.add(new InvokerGameSpells("ewq", "Deafening blast"));
	}
	
	public ArrayList<InvokerGameSpells> getSpells() {
		return spells;
	}
}
