package entities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Number {
	
	private Date date;
	protected Integer number;
	//private Integer number;
	
	DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	
	public Number() {
		
	}

	public Number(Integer number) {
		//super();
		this.number = number;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
	
	

}
