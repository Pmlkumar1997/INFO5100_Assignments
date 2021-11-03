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
public class Patient extends Person{
    
    private String patientId;
    private EncounterHistory encounterHistory;

    public Patient(String firstName, String lastName, String phoneNumber, String sex, int age, House house, String maritalStatus, String patientId) {
        super(firstName, lastName, phoneNumber, sex, age, house, maritalStatus);
        this.patientId = patientId;
        this.encounterHistory = new EncounterHistory();
        
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    public void addEncounter(Encounter encounter){
       
        encounterHistory.addEncounter(encounter);
    }
   
    
}


