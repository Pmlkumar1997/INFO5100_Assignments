/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author mohithparvataneni
 */


public class Encounter {
	
	private LocalDate date;
	private VitalSign vitalSign;

	
	/**
	 * @param date
	 * @param vitalSign
	 */
	public Encounter(LocalDate date, VitalSign vitalSign) {
		super();
		this.date = date;
		this.vitalSign = vitalSign;
	}
	
	
	public LocalDate getDate() {
		return date;
	}
	
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
	public VitalSign getVitalSign() {
		return vitalSign;
	}
	
	
	public void setVitalSign(VitalSign vitalSign) {
		this.vitalSign = vitalSign;
	}	

}
