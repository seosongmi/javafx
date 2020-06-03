package view_pack;

import javafx.beans.property.SimpleStringProperty;

public class Phone {
	private SimpleStringProperty smartPhone;
	private SimpleStringProperty image;
	
	Phone(String smartphone, String image) {
		this.smartPhone = new SimpleStringProperty(smartphone);
		this.image = new SimpleStringProperty(image);
	}
	
	public void setSmartPhone(String smartphone) {
		this.smartPhone.set(smartphone);
	}
	
	public String getSmartPhone() {
		return this.smartPhone.get();
	}
	public SimpleStringProperty smartPhoneProperty() {
		return this.smartPhone;
	}
	
	public void setImage(String image) {
		this.image.set(image);
	}
	
	public String getImage() {
		return this.image.get();
	}
	public SimpleStringProperty imageProperty() {
		return this.image;
	}
}
