package com.example.group10driverlicense;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayData extends AppCompatActivity {

    TextView lastnames;
    TextView firstname;
    TextView middlename;
    TextView nationality;
    TextView sexs;
    TextView bdates;
    TextView weights;
    TextView heights;
    TextView addresss;
    TextView licensenos;
    TextView expirations;
    TextView agencys;
    TextView bloodtypes;
    TextView eyescolors;
    TextView restrictions;
    TextView conditions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_data);


        lastnames = findViewById(R.id.lastname);
        firstname = findViewById(R.id.firstname);
        middlename = findViewById(R.id.middlename);
        nationality = findViewById(R.id.nationality);
        sexs=findViewById(R.id.sex);
        bdates=findViewById(R.id.birthdate);
        weights=findViewById(R.id.weight);
        heights=findViewById(R.id.height);
        addresss=findViewById(R.id.address);
        licensenos=findViewById(R.id.licenseno);
        expirations=findViewById(R.id.expirationdate);
        agencys=findViewById(R.id.agencycode);
        bloodtypes=findViewById(R.id.bloodtype);
        eyescolors=findViewById(R.id.eyescolor);
        restrictions=findViewById(R.id.restriction);
        conditions=findViewById(R.id.condition);



        String lastname = getIntent().getExtras().getString("lnameko");
        lastnames.setText("Last name:" +lastname);

        String fname = getIntent().getExtras().getString("fname");
        firstname.setText("First Name:" +fname);

        String mname = getIntent().getExtras().getString("middlename");
        middlename.setText("Middle Name:" +mname);

        String datanations = getIntent().getExtras().getString("nationality");
        nationality.setText("Nationality:" +datanations);

        String sexdata = getIntent().getExtras().getString("sex");
        sexs.setText("Sex:" +sexdata);

        String databdate = getIntent().getExtras().getString("bdate");
        bdates.setText("Birthday:" +databdate);

        String dataweight = getIntent().getExtras().getString("weight");
        weights.setText("Wt(kg)" +dataweight);

        String dataheight = getIntent().getExtras().getString("height");
        heights.setText("Ht(cm)" +dataheight);

        String dataaddress = getIntent().getExtras().getString("address");
        addresss.setText("Address:" +dataaddress);

        String datalicenseno = getIntent().getExtras().getString("license");
        licensenos.setText("License No:" +datalicenseno);

        String dataexpiration = getIntent().getExtras().getString("expiration");
        expirations.setText("Expiration:" +dataexpiration);

        String dataagency = getIntent().getExtras().getString("agency");
        agencys.setText("Agency:" +dataagency);

        String databloodtype = getIntent().getExtras().getString("blood");
        bloodtypes.setText("Bloodtype:" +databloodtype);

        String dataeyescolor = getIntent().getExtras().getString("eyescolor");
        eyescolors.setText("Eye Color:" +dataeyescolor);

        String datarestriction = getIntent().getExtras().getString("restriction");
        restrictions.setText("Restriction:" +datarestriction);

        String datacondition = getIntent().getExtras().getString("condition");
        conditions.setText("Condition:" +datacondition);
    }
}