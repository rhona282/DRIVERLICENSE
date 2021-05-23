package com.example.group10driverlicense;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText lname;
    EditText fname;
    EditText mname;
    EditText nation;
    EditText sex;
    EditText bdate;
    EditText weight;
    EditText height;
    EditText address;
    EditText licenseno;
    EditText expiration;
    EditText agency;
    EditText bloodtype;
    EditText eyescolor;
    EditText restriction;
    EditText condition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lname=findViewById(R.id.lastname);
        fname=findViewById(R.id.firstname);
        mname=findViewById(R.id.middlename);
        nation=findViewById(R.id.nationality);
        sex=findViewById(R.id.sex);
        bdate=findViewById(R.id.birthdate);
        weight=findViewById(R.id.weight);
        height=findViewById(R.id.height);
        address=findViewById(R.id.address);
        licenseno=findViewById(R.id.licenseno);
        expiration=findViewById(R.id.expirationdate);
        agency=findViewById(R.id.agencycode);
        bloodtype=findViewById(R.id.bloodtype);
        eyescolor=findViewById(R.id.eyescolor);
        restriction=findViewById(R.id.restriction);
        condition=findViewById(R.id.condition);

    }

    public void submitall(View view) {

        String strlastname = lname.getText().toString();
        String strfirstname = fname.getText().toString();
        String strmiddlename = mname.getText().toString();
        String strnation = nation.getText().toString();
        String strsex = sex.getText().toString();
        String strdate = bdate.getText().toString();
        String strweight = weight.getText().toString();
        String strheight = height.getText().toString();
        String straddress = address.getText().toString();
        String strlicenseno = licenseno.getText().toString();
        String strexpiration = expiration.getText().toString();
        String stragency = agency.getText().toString();
        String strbloodtype = bloodtype.getText().toString();
        String streyescolor = eyescolor.getText().toString();
        String strrestriction = restriction.getText().toString();
        String strcondition = condition.getText().toString();


        if (strlastname.trim().equals("") && strfirstname.trim().equals("") && strmiddlename.trim().equals("")
                && strnation.trim().equals("") && strsex.trim().equals("") && strdate.trim().equals("")
                && strweight.trim().equals("") && strheight.trim().equals("") && straddress.trim().equals("")
                && strlicenseno.trim().equals("") && strlicenseno.trim().equals("") && strexpiration.trim().equals("")
                && stragency.trim().equals("") && strbloodtype.trim().equals("") && streyescolor.trim().equals("")
                && strrestriction.trim().equals("") && strcondition.trim().equals("")
        ) {

            Intent intent = new Intent(this, NoDisplayData.class);
            startActivity(intent);
            return;

        }else if(strlastname.trim().equals("")){

            Toast.makeText(this, "Please Input Last Name!", Toast.LENGTH_SHORT).show();
            return;

        }else if(strfirstname.trim().equals("")){

            Toast.makeText(this, "Please Input First Name!", Toast.LENGTH_SHORT).show();
            return;

        }else if(strmiddlename.trim().equals("")){

            Toast.makeText(this, "Please Input Middle Name!", Toast.LENGTH_SHORT).show();
            return;

        }else if(strnation.trim().equals("")){

            Toast.makeText(this, "Please Input Nationality!", Toast.LENGTH_SHORT).show();
            return;

        }else if(strsex.trim().equals("")){

            Toast.makeText(this, "Please Input Sex!", Toast.LENGTH_SHORT).show();
            return;

        }else if(strdate.trim().equals("")){

            Toast.makeText(this, "Please Input Birth Date!", Toast.LENGTH_SHORT).show();
            return;

        }else if(strweight.trim().equals("")){

            Toast.makeText(this, "Please Input Weight!", Toast.LENGTH_SHORT).show();
            return;

        }else if(strheight.trim().equals("")){

            Toast.makeText(this, "Please Input Height!", Toast.LENGTH_SHORT).show();
            return;

        }else if(straddress.trim().equals("")){

            Toast.makeText(this, "Please Input Address!", Toast.LENGTH_SHORT).show();
            return;

        }else if(strlicenseno.trim().equals("")){

            Toast.makeText(this, "Please Input License Number!", Toast.LENGTH_SHORT).show();
            return;

        }else if(strexpiration.trim().equals("")){

            Toast.makeText(this, "Please Input Expiration Date!", Toast.LENGTH_SHORT).show();
            return;

        }else if(stragency.trim().equals("")){

            Toast.makeText(this, "Please Input Agency!", Toast.LENGTH_SHORT).show();
            return;

        }else if(strbloodtype.trim().equals("")){

            Toast.makeText(this, "Please Input Blood Type!", Toast.LENGTH_SHORT).show();
            return;

        }else if(streyescolor.trim().equals("")){

            Toast.makeText(this, "Please Input Eyes Color!", Toast.LENGTH_SHORT).show();
            return;

        }else if(strrestriction.trim().equals("")){

            Toast.makeText(this, "Please Input Restriction!", Toast.LENGTH_SHORT).show();
            return;

        }else if(strcondition.trim().equals("")){

            Toast.makeText(this, "Please Input Condition!", Toast.LENGTH_SHORT).show();
            return;

        }else{

            Intent senddata = new Intent(MainActivity.this, DisplayData.class);
            senddata.putExtra("lnameko", lname.getText().toString());
            senddata.putExtra("fname", fname.getText().toString());
            senddata.putExtra("middlename", mname.getText().toString());
            senddata.putExtra("nationality", nation.getText().toString());
            senddata.putExtra("sex", sex.getText().toString());
            senddata.putExtra("bdate", bdate.getText().toString());
            senddata.putExtra("weight", weight.getText().toString());
            senddata.putExtra("height", height.getText().toString());
            senddata.putExtra("address", address.getText().toString());
            senddata.putExtra("license", licenseno.getText().toString());
            senddata.putExtra("expiration", expiration.getText().toString());
            senddata.putExtra("agency", agency.getText().toString());
            senddata.putExtra("blood", bloodtype.getText().toString());
            senddata.putExtra("eyescolor", eyescolor.getText().toString());
            senddata.putExtra("restriction", restriction.getText().toString());
            senddata.putExtra("condition", condition.getText().toString());
            startActivity(senddata);

        }
    }
}

