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
                intent.putExtra("code2", "C203");
                intent.putExtra("name2", "HTML");
                intent.putExtra("year2","2022");
                intent.putExtra("sem2","1");
                intent.putExtra("credit2","4");
                intent.putExtra("venue2","W65H");
                startActivity(intent);
            }
        });

        tvMod3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("code3", "C206");
                intent.putExtra("name3", "Software Development Process");
                intent.putExtra("year3","2022");
                intent.putExtra("sem3","1");
                intent.putExtra("credit3","4");
                intent.putExtra("venue3","E66K");
                startActivity(intent);
            }
        });

        tvMod4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("code4", "C218");
                intent.putExtra("name4", "UI/UX Design");
                intent.putExtra("year4","2022");
                intent.putExtra("sem4","1");
                intent.putExtra("credit4","4");
                intent.putExtra("venue4","E66B");
                startActivity(intent);
            }
        });

        tvMod5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("code5", "C345");
                intent.putExtra("name5", "IT Security and Management");
                intent.putExtra("year5","2022");
                intent.putExtra("sem5","1");
                intent.putExtra("credit5","4");
                intent.putExtra("venue5","E66A");
                startActivity(intent);
            }
        });
    }
}