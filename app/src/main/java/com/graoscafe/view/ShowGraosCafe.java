package com.graoscafe.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.graoscafe.R;
import com.graoscafe.model.TiposGraosCafe;
import com.graoscafe.services.SevicesGrains;

import java.util.List;

public class ShowGraosCafe extends AppCompatActivity {

    private final Gui gui = new Gui();
    private Context ctx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ctx= this;
        gui.sevicesGrains =new SevicesGrains();
        gui.btnShowGrain=  (Button) findViewById(R.id.btnShowGrain);
        gui.imgShowGrain= (ImageView) findViewById(R.id.imgShowGrain);
        setTitle(getString(R.string.telaprincipal_title));
        gui.imgShowGrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showGrains();
            }
        });

        gui.btnShowGrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showGrains();
            }
        });
    }

    private void showGrains() {
        List<TiposGraosCafe> all = gui.sevicesGrains.getAll();
        Toast.makeText(ctx,"ooo",Toast.LENGTH_LONG).show();
    }


    public  static class Gui{
        private ImageView imgShowGrain;
        private Button btnShowGrain;
        private SevicesGrains sevicesGrains;
    }
}