package sg.edu.rp.c346.intentdatapassingtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tv4 = findViewById(R.id.textView4);
        Intent intent = getIntent();
        double vaule = intent.getDoubleExtra("value",0);
        tv4.setText("Double value received is: " +vaule);

    }
}
