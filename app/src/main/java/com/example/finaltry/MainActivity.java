package com.example.finaltry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }

    public void onBtnClick(View view)
    {
        TextView lblFName = findViewById(R.id.lblFirstName);
        TextView lblLName = findViewById(R.id.lblLastName);
        TextView lblEmail = findViewById(R.id.lblEmail);

        EditText txtFName = findViewById(R.id.edtFirstNameField);
        EditText txtLName = findViewById(R.id.edtLastNameField);
        EditText txtEmail = findViewById(R.id.edtEmailField);

        lblFName.setText("First Name"+": "+txtFName.getText().toString());
        lblLName.setText("Last Name"+": "+txtLName.getText().toString());
        lblEmail.setText("Email"+": "+txtEmail.getText().toString());

        txtFName.onEditorAction(EditorInfo.IME_ACTION_DONE);
        txtLName.onEditorAction(EditorInfo.IME_ACTION_DONE);
        txtEmail.onEditorAction(EditorInfo.IME_ACTION_DONE);


        txtFName.setText("");
        txtLName.setText("");
        txtEmail.setText("");



    }
}