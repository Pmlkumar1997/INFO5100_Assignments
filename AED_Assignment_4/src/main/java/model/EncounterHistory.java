/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author mohithparvataneni
 */
import java.util.ArrayList;
import java.util.List;

public class EncounterHistory {
	
private List<Encounter> encounterDirectory;
	
	
    EncounterHistory ()
    {
            encounterDirectory = new ArrayList<>();
    }


    public void addEncounter(Encounter encounter)
    {
            encounterDirectory.add(encounter);
    }

    public List<Encounter> getEncounterDirectory() {
            return encounterDirectory;
    }
    
    public void removeEncounterAtIndex(int i){
        
        if (i > 0 && i < encounterDirectory.size()){
            encounterDirectory.remove(i);
        }
    }
	

}
