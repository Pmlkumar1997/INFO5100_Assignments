/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mohithparvataneni
 */
public class PersonDirectory {
    
    private List<Person> personDirectory;
	
	
	public PersonDirectory ()
	{
		personDirectory = new ArrayList<>();
	}

	
	public void addPerson(Person person)
	{
		personDirectory.add(person);
	}
	
	public List<Person> getPersonDirectory() {
		return personDirectory;
	}
	
    
}
