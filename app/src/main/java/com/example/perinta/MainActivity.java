package com.example.perinta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import health.PatientQueue;
import people.Doctor;
import people.Patient;
import people.Person;

public class MainActivity extends AppCompatActivity {
    private TextView tvAllOutPut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvAllOutPut = findViewById(R.id.tvTest);
        // Hae viittaus textView widgetiin
        String allText = "** LUOKKIEN TESTAUS **\n";
        Person p1 = new Person("Maija Poppanen");
        allText += "\nPerson: " + p1.getInfo();
        Doctor doc = new Doctor("Laku Lääkäri", "Kallonkutistaja");
        allText += "\nDoctor: " + doc.getInfo();
        Patient pat1 = new Patient("Potilas Pekkarinen","Lobotomia", 80,120);
        Patient pat2 = new Patient("Kake Kukkanen","Verikoe", 100,150);
        Patient pat3 = new Patient("Maikki Mallikas","Amputaatio", 80,130);
        allText += "\nPatient: " + pat1.getInfo();
        allText = "";

        PatientQueue que = new PatientQueue("Kukkalan sairaala", "Jaahas", doc);
        que.addPatient(pat1);
        que.addPatient(pat2);
        que.addPatient(pat3);
        allText += que.printQue();

        tvAllOutPut.setText(allText);
    }
}
