package com.graoscafe.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.graoscafe.R;
import com.graoscafe.model.TiposGraosCafe;
import com.graoscafe.services.SevicesGrains;

import java.util.List;

public class TiposGrainsCafe extends AppCompatActivity {
    private final Gui gui = new Gui();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipos_grao_cafe);
        Intent i = getIntent();
        gui.ctx = this;
        gui.tiposGraosCafeList = (List<TiposGraosCafe>) i.getSerializableExtra("typesCoffers");


    }




    public  static class Gui{
        private List<TiposGraosCafe> tiposGraosCafeList;
        private Context ctx;

    }





}