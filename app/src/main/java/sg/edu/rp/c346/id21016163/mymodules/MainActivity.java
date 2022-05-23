package sg.edu.rp.c346.id21016163.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvMod1;
    TextView tvMod2;
    TextView tvMod3;
    TextView tvMod4;
    TextView tvMod5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMod1 = findViewById(R.id.C346_1);
        tvMod2 = findViewById(R.id.C203_2);
        tvMod3 = findViewById(R.id.C206_3);
        tvMod4 = findViewById(R.id.C218_4);
        tvMod5 = findViewById(R.id.C235_5);

        tvMod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C346");
                intent.putExtra("name", "Android Programming");
                intent.putExtra("year","2022");
                intent.putExtra("sem","1");
                intent.putExtra("credit","4");
                intent.putExtra("venue","E62E");
                startActivity(intent);
            }
        });

        tvMod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("code", "C203");
                intent.putExtra("name", "HTML");
                intent.putExtra("year","2022");
                intent.putExtra("sem","1");
                intent.putExtra("credit","4");
                intent.putExtra("venue","W65H");
                startActivity(intent);
            }
        });

        tvMod3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("code", "C206");
                intent.putExtra("name", "Software Development Process");
                intent.putExtra("year","2022");
                intent.putExtra("sem","1");
                intent.putExtra("credit","4");
                intent.putExtra("venue","E66K");
                startActivity(intent);
            }
        });

        tvMod4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("code", "C218");
                intent.putExtra("name", "UI/UX Design");
                intent.putExtra("year","2022");
                intent.putExtra("sem","1");
                intent.putExtra("credit","4");
                intent.putExtra("venue","E66B");
                startActivity(intent);
            }
        });

        tvMod5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("code", "C345");
                intent.putExtra("name", "IT Security and Management");
                intent.putExtra("year","2022");
                intent.putExtra("sem","1");
                intent.putExtra("credit","4");
                intent.putExtra("venue","E66A");
                startActivity(intent);
            }
        });
    }
}