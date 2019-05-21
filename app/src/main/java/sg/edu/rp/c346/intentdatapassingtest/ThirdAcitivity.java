package sg.edu.rp.c346.intentdatapassingtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdAcitivity extends AppCompatActivity {

    TextView tvChar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_acitivity);

        tvChar = findViewById(R.id.textView3);
        Intent intentReceived = getIntent();
        char value = intentReceived.getCharExtra("value", ' ');
        tvChar.setText("Character value received is: " + value);
    }
}
