package com.example.charles.quizzapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RadioButton radioButton=(RadioButton)findViewById(R.id.pressure);
        final RadioButton radioButton1=(RadioButton)findViewById(R.id.spark);
        final RadioButton radioButton2=(RadioButton)findViewById(R.id.flow);
        final RadioButton radioButton3=(RadioButton)findViewById(R.id.pvr);
        final RadioButton radioButton4=(RadioButton)findViewById(R.id.pvi);
        final RadioButton radioButton5=(RadioButton)findViewById(R.id.pir);
        final RadioButton radioButton6=(RadioButton) findViewById(R.id.loop);
        final RadioButton radioButton7=(RadioButton)findViewById(R.id.junction);
        final RadioButton radioButton8=(RadioButton)findViewById(R.id.propotional);
        final CheckBox checkBox=(CheckBox)findViewById(R.id.VIR);
        final CheckBox checkBox1=(CheckBox)findViewById(R.id.v2i);
        final CheckBox checkBox2=(CheckBox)findViewById(R.id.v2r);
        final CheckBox checkBox3=(CheckBox)findViewById(R.id.volts);
        final CheckBox checkBox4=(CheckBox)findViewById(R.id.flowof);
        final CheckBox checkBox5=(CheckBox)findViewById(R.id.resistance);
        final CheckBox checkBox6=(CheckBox)findViewById(R.id.rvi);
        final CheckBox checkBox7=(CheckBox)findViewById(R.id.voltages);
        final CheckBox checkBox8=(CheckBox)findViewById(R.id.directly);
        final CheckBox checkBox9=(CheckBox)findViewById(R.id.magnetic);
        final CheckBox checkBoxx=(CheckBox)findViewById(R.id.emf);

        Button button = (Button)findViewById(R.id.score);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int count=0;
                if (radioButton.isChecked()){
                    count-- ;
                }

                if (radioButton2.isChecked()){
                     count++ ;
                }
                if (radioButton4.isChecked()){
                    count++ ;
                }
                if (radioButton7.isChecked()){
                    count++ ;
                }
                if (checkBox.isChecked()){
                    count++ ;
                }
                if (checkBox2.isChecked()){
                    count++ ;
                    if (checkBox3.isChecked()){
                        count-- ;
                    }
                }
                if (checkBox5.isChecked()){
                    count++ ;
                    if (checkBox6.isChecked()){
                        count++ ;
                    }
                    if (checkBox7.isChecked()){
                        count-- ;
                    }
                    if (checkBox8.isChecked()){
                        count-- ;
                    }
                }
                if (radioButton6.isChecked()){
                    count-- ;
                }
                if (checkBox9.isChecked()){
                    count++ ;
                }
                if (checkBoxx.isChecked()){
                    count++ ;
                }
                if (radioButton8.isChecked()){
                    count-- ;
                }
                if (checkBox4.isChecked()){
                    count-- ;
                }
                if (radioButton3.isChecked()){
                    count-- ;
                }

                if (radioButton1.isChecked()){
                    count-- ;
                }
                if (radioButton5.isChecked()){
                    count-- ;
                }
                if (checkBox1.isChecked()){
                    count-- ;
                }
                Toast.makeText(MainActivity.this, "you scored " +count, Toast.LENGTH_SHORT).show();
            }
        });
    }
    }