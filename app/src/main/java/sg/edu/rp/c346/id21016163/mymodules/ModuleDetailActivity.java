package sg.edu.rp.c346.id21016163.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvModCode;
    TextView tvModName;
    TextView tvYear;
    TextView tvSem;
    TextView tvModCredit;
    TextView tvVenue;
    TextView tvModCode2;
    TextView tvModName2;
    TextView tvYear2;
    TextView tvSem2;
    TextView tvModCredit2;
    TextView tvVenue2;
    TextView tvModCode3;
    TextView tvModName3;
    TextView tvYear3;
    TextView tvSem3;
    TextView tvModCredit3;
    TextView tvVenue3;
    TextView tvModCode4;
    TextView tvModName4;
    TextView tvYear4;
    TextView tvSem4;
    TextView tvModCredit4;
    TextView tvVenue4;
    TextView tvModCode5;
    TextView tvModName5;
    TextView tvYear5;
    TextView tvSem5;
    TextView tvModCredit5;
    TextView tvVenue5;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnBack = findViewById(R.id.buttonBack);

        if(getIntent().hasExtra("code")&&getIntent().hasExtra("name")&&getIntent().hasExtra("year")
                &&getIntent().hasExtra("sem")&&getIntent().hasExtra("credit")&&getIntent().hasExtra("venue")) {
            tvModCode = findViewById(R.id.textViewModCode);
            Intent intentReceived = getIntent();
            String value = intentReceived.getStringExtra("code");
            tvModCode.setText("Module Code: " + value);

            tvModName = findViewById(R.id.textViewModName);
            Intent intentReceived2 = getIntent();
            String value2 = intentReceived2.getStringExtra("name");
            tvModName.setText("Module Name: " + value2);

            tvYear = findViewById(R.id.textViewYear);
            Intent intentReceived3 = getIntent();
            String value3 = intentReceived3.getStringExtra("year");
            tvYear.setText("Academic Year: " + value3);

            tvSem = findViewById(R.id.textViewSem);
            Intent intentReceived4 = getIntent();
            String value4 = intentReceived4.getStringExtra("sem");
            tvSem.setText("Semester: " + value4);

            tvModCredit = findViewById(R.id.textViewModCredit);
            Intent intentReceived5 = getIntent();
            String value5 = intentReceived5.getStringExtra("credit");
            tvModCredit.setText("Module Credit: " + value5);

            tvVenue = findViewById(R.id.textViewVenue);
            Intent intentReceived6 = getIntent();
            String value6 = intentReceived6.getStringExtra("venue");
            tvVenue.setText("Venue: " + value6);

        }else if(getIntent().hasExtra("code2")&&getIntent().hasExtra("name2")&&getIntent().hasExtra("year2")
                &&getIntent().hasExtra("sem2")&&getIntent().hasExtra("credit2")&&getIntent().hasExtra("venue2")) {
            tvModCode2 = findViewById(R.id.textViewModCode);
            Intent intentReceived = getIntent();
            String value = intentReceived.getStringExtra("code2");
            tvModCode2.setText("Module Code: " + value);

            tvModName2 = findViewById(R.id.textViewModName);
            Intent intentReceived2 = getIntent();
            String value2 = intentReceived2.getStringExtra("name2");
            tvModName2.setText("Module Name: " + value2);

            tvYear2 = findViewById(R.id.textViewYear);
            Intent intentReceived3 = getIntent();
            String value3 = intentReceived3.getStringExtra("year2");
            tvYear2.setText("Academic Year: " + value3);

            tvSem2 = findViewById(R.id.textViewSem);
            Intent intentReceived4 = getIntent();
            String value4 = intentReceived4.getStringExtra("sem2");
            tvSem2.setText("Semester: " + value4);

            tvModCredit2 = findViewById(R.id.textViewModCredit);
            Intent intentReceived5 = getIntent();
            String value5 = intentReceived5.getStringExtra("credit2");
            tvModCredit2.setText("Module Credit: " + value5);

            tvVenue2 = findViewById(R.id.textViewVenue);
            Intent intentReceived6 = getIntent();
            String value6 = intentReceived6.getStringExtra("venue2");
            tvVenue2.setText("Venue: " + value6);

        }else if(getIntent().hasExtra("code3")&&getIntent().hasExtra("name3")&&getIntent().hasExtra("year3")
                &&getIntent().hasExtra("sem3")&&getIntent().hasExtra("credit3")&&getIntent().hasExtra("venue3")) {
            tvModCode3 = findViewById(R.id.textViewModCode);
            Intent intentReceived = getIntent();
            String value = intentReceived.getStringExtra("code3");
            tvModCode3.setText("Module Code: " + value);

            tvModName3 = findViewById(R.id.textViewModName);
            Intent intentReceived2 = getIntent();
            String value2 = intentReceived2.getStringExtra("name3");
            tvModName3.setText("Module Name: " + value2);

            tvYear3 = findViewById(R.id.textViewYear);
            Intent intentReceived3 = getIntent();
            String value3 = intentReceived3.getStringExtra("year3");
            tvYear3.setText("Academic Year: " + value3);

            tvSem3 = findViewById(R.id.textViewSem);
            Intent intentReceived4 = getIntent();
            String value4 = intentReceived4.getStringExtra("sem3");
            tvSem3.setText("Semester: " + value4);

            tvModCredit3 = findViewById(R.id.textViewModCredit);
            Intent intentReceived5 = getIntent();
            String value5 = intentReceived5.getStringExtra("credit3");
            tvModCredit3.setText("Module Credit: " + value5);

            tvVenue3 = findViewById(R.id.textViewVenue);
            Intent intentReceived6 = getIntent();
            String value6 = intentReceived6.getStringExtra("venue3");
            tvVenue3.setText("Venue: " + value6);

        }else if(getIntent().hasExtra("code4")&&getIntent().hasExtra("name4")&&getIntent().hasExtra("year4")
                &&getIntent().hasExtra("sem4")&&getIntent().hasExtra("credit4")&&getIntent().hasExtra("venue4")) {
            tvModCode4 = findViewById(R.id.textViewModCode);
            Intent intentReceived = getIntent();
            String value = intentReceived.getStringExtra("code4");
            tvModCode4.setText("Module Code: " + value);

            tvModName4 = findViewById(R.id.textViewModName);
            Intent intentReceived2 = getIntent();
            String value2 = intentReceived2.getStringExtra("name4");
            tvModName4.setText("Module Name: " + value2);

            tvYear4 = findViewById(R.id.textViewYear);
            Intent intentReceived3 = getIntent();
            String value3 = intentReceived3.getStringExtra("year4");
            tvYear4.setText("Academic Year: " + value3);

            tvSem4 = findViewById(R.id.textViewSem);
            Intent intentReceived4 = getIntent();
            String value4 = intentReceived4.getStringExtra("sem4");
            tvSem4.setText("Semester: " + value4);

            tvModCredit4 = findViewById(R.id.textViewModCredit);
            Intent intentReceived5 = getIntent();
            String value5 = intentReceived5.getStringExtra("credit4");
            tvModCredit4.setText("Module Credit: " + value5);

            tvVenue4 = findViewById(R.id.textViewVenue);
            Intent intentReceived6 = getIntent();
            String value6 = intentReceived6.getStringExtra("venue4");
            tvVenue4.setText("Venue: " + value6);

        }else if(getIntent().hasExtra("code5")&&getIntent().hasExtra("name5")&&getIntent().hasExtra("year5")
                &&getIntent().hasExtra("sem5")&&getIntent().hasExtra("credit5")&&getIntent().hasExtra("venue5")) {
            tvModCode5 = findViewById(R.id.textViewModCode);
            Intent intentReceived = getIntent();
            String value = intentReceived.getStringExtra("code5");
            tvModCode5.setText("Module Code: " + value);

            tvModName5 = findViewById(R.id.textViewModName);
            Intent intentReceived2 = getIntent();
            String value2 = intentReceived2.getStringExtra("name5");
            tvModName5.setText("Module Name: " + value2);

            tvYear5 = findViewById(R.id.textViewYear);
            Intent intentReceived3 = getIntent();
            String value3 = intentReceived3.getStringExtra("year5");
            tvYear5.setText("Academic Year: " + value3);

            tvSem5 = findViewById(R.id.textViewSem);
            Intent intentReceived4 = getIntent();
            String value4 = intentReceived4.getStringExtra("sem5");
            tvSem5.setText("Semester: " + value4);

            tvModCredit5 = findViewById(R.id.textViewModCredit);
            Intent intentReceived5 = getIntent();
            String value5 = intentReceived5.getStringExtra("credit5");
            tvModCredit5.setText("Module Credit: " + value5);

            tvVenue5 = findViewById(R.id.textViewVenue);
            Intent intentReceived6 = getIntent();
            String value6 = intentReceived6.getStringExtra("venue5");
            tvVenue5.setText("Venue: " + value6);
        }

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ModuleDetailActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}