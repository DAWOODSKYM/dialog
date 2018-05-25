package com.example.dave.dialogapp;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Register(View view) {
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setTitle("Register Here");
        dialog.setMessage("Fill in all Details");

        //to show the registration layout page
        final LayoutInflater inflator=LayoutInflater.from(this);
        View register= inflator.inflate(R.layout.register,null);
        dialog.setView(register);
        final EditText inputNames=register.findViewById(R.id.inputNames);
        final EditText inputEmail=register.findViewById(R.id.inputEmail);

        dialog.setPositiveButton("Sign In", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String names=inputNames.getText().toString();
                String email=inputEmail.getText().toString();
                Toast.makeText(MainActivity.this,names+ "" +email,Toast.LENGTH_SHORT).show();

            }
        });
        dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        dialog.show();
    }
}
