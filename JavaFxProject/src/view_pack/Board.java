package view_pack;

import javafx.beans.property.SimpleStringProperty;

public class Board {
	private SimpleStringProperty title;
	private SimpleStringProperty password;
	private SimpleStringProperty publicity;
	private SimpleStringProperty exitDate;
	private SimpleStringProperty content;
	
	public void settitle(String title) {
		this.title.set(title);
	}
	
	public String gettitle() {
		return this.title.get();
	}
	public SimpleStringProperty title() {
		return this.title;
	}
	
	public void setpassword(String password) {
		this.password.set(password);
	}
	
	public String getpassword() {
		return this.password.get();
	}
	public SimpleStringProperty password() {
		return this.password;
	}
	
	public void setpublicity(String publicity) {
		this.publicity.set(publicity);
	}
	
	public String getpublicity() {
		return this.publicity.get();
	}
	public SimpleStringProperty publicity() {
		return this.publicity;
	}
	
	public void setexitDate(String exitDate) {
		this.exitDate.set(exitDate);
	}
	
	public String getexitDate() {
		return this.exitDate.get();
	}
	public SimpleStringProperty exitDate() {
		return this.exitDate;
	}
	
	public void setcontent(String content) {
		this.content.set(content);
	}
	
	public String getcontent() {
		return this.content.get();
	}
	public SimpleStringProperty content() {
		return this.content;
	}
}


