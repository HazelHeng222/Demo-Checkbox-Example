package sg.edu.ep.c346.id20029318.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    CheckBox cbEnabled;
    Button btnCheck;
    TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbEnabled = findViewById(R.id.checkBDiscount);
        btnCheck = findViewById(R.id.butCheck);
        tvShow = findViewById(R.id.txtView);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View ViewBut) {
                Log.i("MyActivity", "Inside onClick()");
                Toast.makeText(MainActivity.this,"Button Click", Toast.LENGTH_LONG).show();
                String havDiscount = "The discount is given. You need to pay ";
                if(cbEnabled.isChecked()){
                    double pay = calPay(100,20):
                    tvShow.setText(havDiscount + pay);
                }
                else{
                    double pay = calPay(100,0);
                    havDiscount ="The discount is not given. You need to pay ";
                    tvShow.setText(havDiscount + pay);
                }


            }
        });


    }
    private double calPay(double price, double discount){
        double pay = price * (1 - discount/100);
        return pay;
    }

}