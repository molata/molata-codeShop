package GuitarShop;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List guitars;

	public Inventory() {
		guitars = new LinkedList<Instrment>();
	}
	
	public void addGuitar(Instrment guitar){
		guitars.add(guitar);
	}

	public List getGuitars() {
		return guitars;
	}

	public void setGuitars(List guitars) {
		this.guitars = guitars;
	}
	
	public List searchGuitar(InstrumentSpec guitarSpec){
		List<Instrment> validGuitars = new LinkedList<Instrment>();
		for (Iterator i = guitars.iterator(); i.hasNext();){
			Instrment guitar = (Instrment) i.next();
			if (guitar.getGuitarSpec().equals(guitarSpec)){
				validGuitars.add(guitar);
			}
		}
		return validGuitars;
	}
	
	
}
