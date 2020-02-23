package com.example.lendahand;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
// Initialize Firebase Auth


    public void signUpButtonClicked(View view)
    {
        Intent signup = new Intent(getApplicationContext(),SignupActivity.class);
        startActivity(signup);

    }


    public void loginButtonClicked(View view)
    {

        final String userString = username.getText().toString();
        final String passString = password.getText().toString();

        //Toast.makeText(this, "Hello " + userString, Toast.LENGTH_SHORT).show();

        if(userString.matches("") || passString.matches(""))

        {
            Toast.makeText(this, "Please enter the details ", Toast.LENGTH_SHORT).show();

        }
        else if (userString.matches("Jagrit") &&  passString.matches("17bit0167"))
        {
            Intent mainIntent = new Intent(getApplicationContext(), IndexActivity.class);

            mainIntent.putExtra("Name", userString);

            startActivity(mainIntent);

        }
        else
        {
            Toast.makeText(this, "Invalid Details", Toast.LENGTH_SHORT).show();
        }




    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.userEditView);
        password = (EditText) findViewById(R.id.passEditView);


    }

}
