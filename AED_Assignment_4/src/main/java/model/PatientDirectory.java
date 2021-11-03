/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.*;
/**
 *
 * @author mohithparvataneni
 */
public class PatientDirectory {
  
    
    private List<Patient> patientDirectory;


    public PatientDirectory ()
    {
            patientDirectory = new ArrayList<>();
    }



    public void addPatient(Patient patient)
    {
            patientDirectory.add(patient);
    }



    public List<Patient> getPatientDirectory() {
            return patientDirectory;
    }
    
    public Patient getPatient(String patientId){
        
        for (Patient patient : patientDirectory) {

            if(patientId.equals(patient.getPatientId()))
                  return patient;
        }
        return null;
    }


    public void removePatient(String patientId){

        for (Patient patient : patientDirectory) {

                if(patientId.equals(patient.getPatientId()))
                                patientDirectory.remove(patient);
        }
    }


    public boolean isValidPatientId(String patientId) {

            for (Patient patient : patientDirectory) {

                    if(patientId.equals(patient.getPatientId()))
                                    return false;
            }
            return true;

    }
    
    
}

    

