package entities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
//import java.util.ArrayList;
import java.util.Date;
//import java.util.List;

public class Number {
	
	private Date date;
	//protected Integer number;
	//private Integer number;
	
	DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	//List<Number> list = new ArrayList<>();
	public Number() {
		
	}

    public Number(Date date) {
		//super();
		this.date = date;
	}

//	public Number(Integer number) {
//		//super();
//		this.number = number;
//	}
//
//	public Integer getNumber() {
//		return number;
//	}
//
//	public void setNumber(Integer number) {
//		this.number = number;
//	}
	
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

//	public String toString() {
//		StringBuilder sb = new StringBuilder();
//		sb.append("--- RESULTADO DA MEGASENA ---\n");
//		sb.append("--- Data/Hora do sorteio  ---\n");
//		sb.append(df.format(date)+"\n");
//		sb.append("----NÚMEROS SORTEADOS--------\n");
//		
//		return sb.toString();
//		}
	}


