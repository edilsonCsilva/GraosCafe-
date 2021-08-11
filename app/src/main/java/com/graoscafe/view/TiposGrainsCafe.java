package com.graoscafe.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

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
        private RecyclerView mRecyclerViewGrains;
        private Context ctx;


    }



    public class LineHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public LineHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.main_line_title);
        }
    }





}