package com.sinergia.verificadormbp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.sinergia.verificadormbp.R;

public class MainActivity extends AppCompatActivity {

    public EditText editText_barCode;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hideSystemUI();
        BindUI();

        editText_barCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Codigo = editText_barCode.getText().toString();
                Toast.makeText(MainActivity.this, "" + Codigo, Toast.LENGTH_SHORT).show();
                editText_barCode.setText("");
            }
        });

    }

















    void BindUI(){
        editText_barCode = findViewById(R.id.editText_barCode);
        editText_barCode.setInputType(InputType.TYPE_NULL);
    }


    private void hideSystemUI() {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        // Set the content to appear under the system bars so that the
                        // content doesn't resize when the system bars hide and show.

                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        // Hide the nav bar and status bar
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }


}