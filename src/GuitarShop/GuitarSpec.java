package GuitarShop;

import GuitarEnum.GuitarBuilder;
import GuitarEnum.GuitarType;
import GuitarEnum.GuitarWood;

/*º™À˚ Ù–‘¿‡*/
public class GuitarSpec {
	
	private  GuitarBuilder builder;
	private String model;
	private GuitarType type;
	private GuitarWood frontWood;
	private GuitarWood backWood;
	public GuitarSpec(GuitarBuilder builder, String model, GuitarType type, GuitarWood frontWood, GuitarWood backWood) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.frontWood = frontWood;
		this.backWood = backWood;
	}
	public GuitarBuilder getBuilder() {
		return builder;
	}
	public String getModel() {
		return model;
	}
	public GuitarType getType() {
		return type;
	}
	public GuitarWood getFrontWood() {
		return frontWood;
	}
	public GuitarWood getBackWood() {
		return backWood;
	}
	
	public boolean matchGuitar (GuitarSpec guitarSpec){
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
