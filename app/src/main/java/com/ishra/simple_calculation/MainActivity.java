package com.ishra.simple_calculation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.b1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum();
                percent();
              final String n= installment();
                Toast.makeText(getApplicationContext(),"Click the button Again to go Second Activity",Toast.LENGTH_LONG).show();
                findViewById(R.id.b1).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(MainActivity.this,Secnd.class);
                        i.putExtra("v1",n);
                        startActivity(i);
                    }
                });
            }
        });
    }
Double total,tp;

    public void sum(){
        EditText num1=findViewById(R.id.E1);
        EditText num2=findViewById(R.id.E2);
        EditText sum1=findViewById(R.id.E3);

        String gnum =num1.getText().toString();
        String gnum2 =num2.getText().toString();

         Double iid=Double.valueOf(gnum);  //....Convert to Double
         Double iid2=Double.valueOf(gnum2);

         total=iid+iid2;
        String gtotal=String.valueOf(total);
       sum1.setText(gtotal);
    }
    public void percent(){
        EditText num3=findViewById(R.id.E4);
        EditText pc=findViewById(R.id.E5);

        String gnum3=num3.getText().toString();

        Double iid3=Double.valueOf(gnum3);
         tp=total*(iid3/100);

        String gt=String.valueOf(tp);
        pc.setText(gt);

    }

    public String installment(){
        EditText n4 =findViewById(R.id.E6);
        EditText n5 =findViewById(R.id.E7);

        String gnum4=n4.getText().toString();

        Double iid4=Double.valueOf(gnum4);
        Double ti=total+tp;
        Double total_installment=ti/iid4;
        String gi=String.valueOf(total_installment);
        n5.setText(gi);
return gi;
    }

}
