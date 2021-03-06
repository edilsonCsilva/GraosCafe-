package com.graoscafe.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.graoscafe.R;
import com.graoscafe.model.TiposGraosCafe;
import com.graoscafe.services.SevicesGrains;

import java.util.ArrayList;
import java.util.List;

public class TiposGrainsCafe extends AppCompatActivity {
    private final Gui gui = new Gui();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipos_grao_cafe);
        setTitle(getString(R.string.types_grain_coofers));
        Intent i = getIntent();
        gui.ctx = this;
        gui.ab= getSupportActionBar();
        gui.ab.setDisplayHomeAsUpEnabled(true);
        gui.ab.setHomeButtonEnabled(true);
        gui.mRecyclerViewGrains=(RecyclerView)findViewById(R.id.recycler_view_layour_recycler);
        gui.tiposGraosCafeList = (List<TiposGraosCafe>) i.getSerializableExtra("typesCoffers");

        setupRecycler();

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                startActivity(new Intent(gui.ctx, ShowGraosCafe.class));
                finishAffinity();
                break;
            default:break;
        }
        return true;
    }

    private void setupRecycler() {
        // Configurando o gerenciador de layout para ser uma lista.
        LinearLayoutManager layoutManager = new LinearLayoutManager(gui.ctx);
        gui.mRecyclerViewGrains.setLayoutManager(layoutManager);
        // Adiciona o adapter que ir?? anexar os objetos ?? lista.
        // Est?? sendo criado com lista vazia, pois ser?? preenchida posteriormente.
        gui.mAdapter = new LineGrainAdapter(gui.tiposGraosCafeList);
        gui.mRecyclerViewGrains.setAdapter(gui.mAdapter);


    }



    public  static class Gui{
        private List<TiposGraosCafe> tiposGraosCafeList;
        private RecyclerView mRecyclerViewGrains;
        private LineGrainAdapter mAdapter;
        private Context ctx;
        private  ActionBar ab;


    }



    public static class LineGrainHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public LineGrainHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.main_line_title);
        }
    }

    public static class LineGrainAdapter extends RecyclerView.Adapter<LineGrainHolder> {

        private  List<TiposGraosCafe> typesCoffes = new ArrayList<>();
        public LineGrainAdapter(List<TiposGraosCafe> typesCoffes) {
            this.typesCoffes = typesCoffes;
        }

        @Override
        public LineGrainHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new LineGrainHolder(LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.main_line_view, parent, false));
        }

        @Override
        public void onBindViewHolder(LineGrainHolder holder, int position) {
            holder.title.setText(this.typesCoffes.get(position).getNome());
        }

        @Override
        public int getItemCount() {
            return typesCoffes != null ? typesCoffes.size() : 0;
        }

    }





}