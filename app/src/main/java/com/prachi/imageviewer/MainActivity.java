package com.prachi.imageviewer;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RadioButton rdoRajesh,rdoDahayang,rdoBhuwan;
    ImageView imgHero;
    AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdoRajesh=findViewById(R.id.rdoRajesh);
        rdoBhuwan=findViewById(R.id.rdoBhuwan);
        rdoDahayang=findViewById(R.id.rdoDahayang);


        imgHero =findViewById(R.id.imgHero);

        rdoDahayang.setOnClickListener(this);
        rdoBhuwan.setOnClickListener(this);
        rdoRajesh.setOnClickListener(this);
        builder=new AlertDialog.Builder(this);
    }

    @Override
    public void onClick(View v) {



        switch(v.getId())
        {

            case R.id.rdoBhuwan :


                builder.setMessage("Do you want to close this application")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                imgHero.setImageResource(R.drawable.bhuwan);
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });

                AlertDialog alert=builder.create();
                alert.setTitle("title");
                alert.show();

            break;

            case R.id.rdoDahayang :
                
                imgHero.setImageResource(R.drawable.daya);
                break;
            case R.id.rdoRajesh :
                imgHero.setImageResource(R.drawable.rajesh);
                break;
        }

    }
}
