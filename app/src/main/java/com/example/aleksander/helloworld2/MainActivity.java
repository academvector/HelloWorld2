package com.example.aleksander.helloworld2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView mHelloTextView;
    private EditText mNameEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNameEditText = (EditText) findViewById(R.id.editText);
        mHelloTextView = findViewById(R.id.textView999);
    }

    public void onClick(View view) {
        if (mNameEditText.getText().length() == 0) {
            mHelloTextView.setText("Kek 4ebypek");
        } else mHelloTextView.setText("Привет епта" + mNameEditText.getText());
    }
}
