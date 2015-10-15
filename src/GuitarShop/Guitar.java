package GuitarShop;
import GuitarEnum.GuitarBuilder;
import GuitarEnum.GuitarType;
import GuitarEnum.GuitarWood;

public class Guitar {
	private String serialNumber;
	private float price;
	private GuitarSpec guitarSpec;
	
	public Guitar(String serialNumber, float price, 
			GuitarBuilder builder, String model, GuitarType type, GuitarWood frontWood, GuitarWood backWood ) {
		super();
		this.serialNumber = serialNumber;
		this.price = price;
		this.guitarSpec = new GuitarSpec(builder, model, type, frontWood, backWood);
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	public float getPrice() {
		return price;
	}
	public GuitarSpec getGuitarSpec() {
		return guitarSpec;
	}
	
	
	
}
