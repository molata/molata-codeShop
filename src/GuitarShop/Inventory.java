package GuitarShop;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List guitars;

	public Inventory() {
		guitars = new LinkedList<Guitar>();
	}
	
	public void addGuitar(Guitar guitar){
		guitars.add(guitar);
	}

	public List getGuitars() {
		return guitars;
	}

	public void setGuitars(List guitars) {
		this.guitars = guitars;
	}
	
	public List searchGuitar(GuitarSpec guitarSpec){
		List<Guitar> validGuitars = new LinkedList<Guitar>();
		for (Iterator i = guitars.iterator(); i.hasNext();){
			Guitar guitar = (Guitar) i.next();
			if (guitar.getGuitarSpec().equals(guitarSpec)){
				validGuitars.add(guitar);
			}
		}
		return validGuitars;
	}
	
	
}
