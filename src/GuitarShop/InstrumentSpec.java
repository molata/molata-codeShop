package GuitarShop;

import GuitarEnum.GuitarBuilder;
import GuitarEnum.GuitarType;
import GuitarEnum.GuitarWood;

/*º™À˚ Ù–‘¿‡*/
public abstract class InstrumentSpec {
	
	private  GuitarBuilder builder;
	private String model;
	private GuitarType type;
	private GuitarWood frontWood;
	private GuitarWood backWood;
	public InstrumentSpec(GuitarBuilder builder, String model, GuitarType type, GuitarWood frontWood, GuitarWood backWood) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.frontWood = frontWood;
		this.backWood = backWood;
	}
	
	// check if the guitar is proper
	public boolean matchGuitar (InstrumentSpec guitarSpec){
		if (!this.builder.equals(guitarSpec.builder)){
			return false;
		}else if (!this.model.equals(guitarSpec.model)){
			return false;
		}else if (!this.type.equals(guitarSpec.type)){
			return false;
		}else if (!this.frontWood.equals(guitarSpec.frontWood)){
			return false;
		}else if (!this.backWood.equals(guitarSpec.backWood)){
			return false;
		}
		return true;
	}
}
