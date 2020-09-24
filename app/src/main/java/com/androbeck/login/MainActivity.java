package com.androbeck.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import br.com.sapereaude.maskedEditText.MaskedEditText;

public class MainActivity extends AppCompatActivity {

    private LinearLayout nextBtn;
    private MaskedEditText phoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SetCodeActivity.class);
                startActivity(intent);
            }
        });
    }

    public void findViews(){
        nextBtn = findViewById(R.id.ll_next);
        phoneNumber = findViewById(R.id.met_phone_number);
    }
}