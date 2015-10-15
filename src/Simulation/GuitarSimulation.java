package Simulation;

import java.util.List;

import GuitarEnum.GuitarBuilder;
import GuitarEnum.GuitarType;
import GuitarEnum.GuitarWood;
import GuitarShop.Guitar;
import GuitarShop.Inventory;

public class GuitarSimulation {
	public static void main(String args[]){
		// set up inventory
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		Guitar guitar =  new Guitar("", 0, GuitarBuilder.FENDER, "Stratocastor",
				GuitarType.ELECTRIC, GuitarWood.ALDER, GuitarWood.ALDER);
		List<Guitar> guitars = inventory.searchGuitar(guitar.getGuitarSpec());
		if (guitars != null){
			System.out.println("we have this guitar!");
		}
	}

	private static void initializeInventory(Inventory inventory) {
		// TODO Auto-generated method stub
		inventory.addGuitar(new Guitar("1", 100, GuitarBuilder.FENDER, "sex", 
				GuitarType.CLASSIC, GuitarWood.BRAZILIAN_ROSWOOD, GuitarWood.INDIAN_ROSEWOOD));
		inventory.addGuitar(new Guitar("V95693", (float)1499.5, GuitarBuilder.FENDER, "Stratocastor", 
				GuitarType.ELECTRIC, GuitarWood.ALDER, GuitarWood.ALDER));
	}
}
