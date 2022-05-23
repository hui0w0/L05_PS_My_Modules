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
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnBack = findViewById(R.id.buttonBack);

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


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ModuleDetailActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}