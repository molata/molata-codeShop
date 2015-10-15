package Simulation;

import java.util.List;

import GuitarEnum.GuitarBuilder;
import GuitarEnum.GuitarType;
import GuitarEnum.GuitarWood;
import GuitarShop.Instrment;
import GuitarShop.Inventory;

public class GuitarSimulation {
	public static void main(String args[]){
		// set up inventory
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		Instrment guitar =  new Instrment("", 0, GuitarBuilder.FENDER, "Stratocastor",
				GuitarType.ELECTRIC, GuitarWood.ALDER, GuitarWood.ALDER);
		List<Instrment> guitars = inventory.searchGuitar(guitar.getGuitarSpec());
		if (guitars != null){
			System.out.println(x);
		}
	}

	private static void initializeInventory(Inventory inventory) {
		// TODO Auto-generated method stub
		inventory.addGuitar(new Instrment("1", 100, GuitarBuilder.FENDER, "sex", 
				GuitarType.CLASSIC, GuitarWood.BRAZILIAN_ROSWOOD, GuitarWood.INDIAN_ROSEWOOD));
		inventory.addGuitar(new Instrment("V95693", (float)1499.5, GuitarBuilder.FENDER, "Stratocastor", 
				GuitarType.ELECTRIC, GuitarWood.ALDER, GuitarWood.ALDER));
	}
}
