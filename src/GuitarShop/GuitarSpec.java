package GuitarShop;

import GuitarEnum.GuitarBuilder;
import GuitarEnum.GuitarType;
import GuitarEnum.GuitarWood;

public class GuitarSpec extends InstrumentSpec {
	private int numString;
	public GuitarSpec(GuitarBuilder builder, String model, GuitarType type, 
			GuitarWood frontWood, GuitarWood backWood, int numString) {
		super(builder, model, type, frontWood, backWood);
		// TODO Auto-generated constructor stub
		this.numString = numString;
	}
	
	public int getNumString() {
		return numString;
	}

	@Override
	public boolean matchGuitar(InstrumentSpec otherGuitarSpec) {
		// TODO Auto-generated method stub
		if (!super.matchGuitar(otherGuitarSpec))
			return false;
		if (!(otherGuitarSpec instanceof GuitarSpec))
			return false;
		GuitarSpec spec = (GuitarSpec) otherGuitarSpec;
		if (this.numString != spec.numString)
			return false;
		return true;
	}
}
