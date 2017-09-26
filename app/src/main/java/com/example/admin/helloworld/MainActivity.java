package com.example.admin.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//changes
    EditText etUpdateValue;
    Button btnUpdateTextView;
    TextView tvUpdatedValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUpdateValue = (EditText) findViewById(R.id.etInputValue);
        btnUpdateTextView = (Button) findViewById(R.id.btnUpdateTextView);
        tvUpdatedValue = (TextView) findViewById(R.id.tvUpdatedValue);

        btnUpdateTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvUpdatedValue.setText(etUpdateValue.getText().toString());
            }
        });
    }
}
