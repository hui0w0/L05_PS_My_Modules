package sg.edu.rp.c346.id21016163.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvMod1;
    TextView tvMod2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMod1 = findViewById(R.id.C346);
        tvMod2 = findViewById(R.id.C349);

        tvMod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C346");
                intent.putExtra("name", "Android Programming");
                intent.putExtra("year","2020");
                intent.putExtra("sem","1");
                intent.putExtra("credit","4");
                intent.putExtra("venue","W66M");
                startActivity(intent);
            }
        });

        tvMod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("code2", "C349");
                intent.putExtra("name2", "iPad Programming");
                intent.putExtra("year2","2020");
                intent.putExtra("sem2","1");
                intent.putExtra("credit2","4");
                intent.putExtra("venue2","W66H");
                startActivity(intent);
            }
        });

    }
}