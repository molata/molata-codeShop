package GuitarShop;
import GuitarEnum.GuitarBuilder;
import GuitarEnum.GuitarType;
import GuitarEnum.GuitarWood;

public abstract class Instrment {
	private String serialNumber;
	private float price;
	private InstrumentSpec guitarSpec;
	
	public Instrment(String serialNumber, float price, 
			InstrumentSpec instrumentSpec ) {
		super();
		this.serialNumber = serialNumber;
		this.price = price;
		this.guitarSpec = instrumentSpec;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}

	public float getPrice() {
		return price;
	}
	public InstrumentSpec getGuitarSpec() {
		return guitarSpec;
	}
	
}
