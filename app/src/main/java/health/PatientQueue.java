package health;

import java.util.ArrayList;

import people.Doctor;
import people.Patient;

public class PatientQueue {
    private ArrayList<Patient> patientQue = new ArrayList<Patient>();
    private String hospital, department;
    private Doctor doctor;

    public PatientQueue(String hospital, String department, Doctor doctor) {
        this.hospital = hospital;
        this.department = department;
        this.doctor = doctor;
    }

    public void addPatient(Patient patient) {
        this.patientQue.add(patient);
    }

    public String printQue() {
        String wholeQueue = "Treatment queue in " + this.hospital;
        wholeQueue += "\nDoctor in charge: " + this.doctor.getInfo();
        wholeQueue += "\nQueue: ";
        int i=1;

        for (Patient p : this.patientQue) {
            wholeQueue += "\n   " + i + ". " + p.getInfo();
            i++;
        }

        return wholeQueue;
    }
}
