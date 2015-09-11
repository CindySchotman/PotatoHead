package com.example.cindy.mr_potato_head;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MrPotatoHeadActivity extends Activity {

    private CheckBox checkboxHat;
    private CheckBox checkboxArms;
    private CheckBox checkboxEars;
    private CheckBox checkboxEyebrows;
    private CheckBox checkboxEyes;
    private CheckBox checkboxGlasses;
    private CheckBox checkboxMouth;
    private CheckBox checkboxMustache;
    private CheckBox checkboxNose;
    private CheckBox checkboxShoes;

    private ImageView imageviewHat;
    private ImageView imageviewArms;
    private ImageView imageviewEars;
    private ImageView imageviewEyebrows;
    private ImageView imageviewEyes;
    private ImageView imageviewGlasses;
    private ImageView imageviewMouth;
    private ImageView imageviewMustache;
    private ImageView imageviewNose;
    private ImageView imageviewShoes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mr_potato_head);

        imageviewHat = (ImageView) findViewById(R.id.imageHat);
        checkboxHat = (CheckBox) findViewById(R.id.checkHat);
        if(checkboxHat.isChecked()) {
            checkboxHat.setChecked(false);
        } else {
            imageviewHat.setVisibility(View.INVISIBLE);
        }

        checkboxArms = (CheckBox) findViewById(R.id.checkArms);
        if(checkboxArms.isChecked()) {
            checkboxArms.setChecked(false);
        }
        checkboxEars = (CheckBox) findViewById(R.id.checkEars);
        if(checkboxEars.isChecked()) {
            checkboxEars.setChecked(false);
        }
        checkboxEyebrows = (CheckBox) findViewById(R.id.checkEyebrows);
        if(checkboxEyebrows.isChecked()) {
            checkboxEyebrows.setChecked(false);
        }
        checkboxEyes = (CheckBox) findViewById(R.id.checkEyes);
        if(checkboxEyes.isChecked()) {
            checkboxEyes.setChecked(false);
        }
        checkboxGlasses = (CheckBox) findViewById(R.id.checkGlasses);
        if(checkboxGlasses.isChecked()) {
            checkboxGlasses.setChecked(false);
        }
        checkboxMustache = (CheckBox) findViewById(R.id.checkMustache);
        if(checkboxMustache.isChecked()) {
            checkboxMustache.setChecked(false);
        }
        checkboxMouth = (CheckBox) findViewById(R.id.checkMouth);
        if(checkboxMouth.isChecked()) {
            checkboxMouth.setChecked(false);
        }
        checkboxNose = (CheckBox) findViewById(R.id.checkNose);
        if(checkboxNose.isChecked()) {
            checkboxNose.setChecked(false);
        }
        checkboxShoes = (CheckBox) findViewById(R.id.checkShoes);
        if(checkboxShoes.isChecked()) {
            checkboxShoes.setChecked(false);
        }


        imageviewArms = (ImageView) findViewById(R.id.imageArms);
        imageviewArms.setVisibility(View.INVISIBLE);

        imageviewEars = (ImageView) findViewById(R.id.imageEars);
        imageviewEars.setVisibility(View.INVISIBLE);

        imageviewEyebrows = (ImageView) findViewById(R.id.imageEyebrows);
        imageviewEyebrows.setVisibility(View.INVISIBLE);

        imageviewEyes = (ImageView) findViewById(R.id.imageEyes);
        imageviewEyes.setVisibility(View.INVISIBLE);

        imageviewNose = (ImageView) findViewById(R.id.imageNose);
        imageviewNose.setVisibility(View.INVISIBLE);

        imageviewMouth = (ImageView) findViewById(R.id.imageMouth);
        imageviewMouth.setVisibility(View.INVISIBLE);

        imageviewMustache = (ImageView) findViewById(R.id.imageMustache);
        imageviewMustache.setVisibility(View.INVISIBLE);

        imageviewShoes = (ImageView) findViewById(R.id.imageShoes);
        imageviewShoes.setVisibility(View.INVISIBLE);

        imageviewGlasses = (ImageView) findViewById(R.id.imageGlasses);
        imageviewGlasses.setVisibility(View.INVISIBLE);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mr_potato_head, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void onCheckSetVisible(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case R.id.checkHat:
                if (checked)
                    imageviewHat.setVisibility(View.VISIBLE);
                else
                    imageviewHat.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkEars:
                if (checked)
                    imageviewEars.setVisibility(View.VISIBLE);
                else
                    imageviewEars.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkEyebrows:
                if (checked)
                    imageviewEyebrows.setVisibility(View.VISIBLE);
                else
                    imageviewEyebrows.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkEyes:
                if (checked)
                    imageviewEyes.setVisibility(View.VISIBLE);
                else
                    imageviewEyes.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkNose:
                if (checked)
                    imageviewNose.setVisibility(View.VISIBLE);
                else
                    imageviewNose.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkMouth:
                if (checked)
                    imageviewMouth.setVisibility(View.VISIBLE);
                else
                    imageviewMouth.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkMustache:
                if (checked)
                    imageviewMustache.setVisibility(View.VISIBLE);
                else
                    imageviewMustache.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkGlasses:
                if (checked)
                    imageviewGlasses.setVisibility(View.VISIBLE);
                else
                    imageviewGlasses.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkShoes:
                if (checked)
                    imageviewShoes.setVisibility(View.VISIBLE);
                else
                    imageviewShoes.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkArms:
                if (checked)
                    imageviewArms.setVisibility(View.VISIBLE);
                else
                    imageviewArms.setVisibility(View.INVISIBLE);
                break;
        }
    }
}
