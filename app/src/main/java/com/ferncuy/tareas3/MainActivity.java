package com.ferncuy.tareas3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView rvMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar miActionBar = findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota("Bucky",200,R.drawable.mascota1));
        mascotas.add(new Mascota("Darwin",160,R.drawable.mascota2));
        mascotas.add(new Mascota("Oreo",160,R.drawable.mascota3));
        mascotas.add(new Mascota("Capitan",23,R.drawable.mascota4));
        mascotas.add(new Mascota("Bola",76,R.drawable.mascota6));
        mascotas.add(new Mascota("Gordi",2,R.drawable.mascota7));


        rvMascotas = findViewById(R.id.rvMacotas);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(RecyclerView.VERTICAL);
        rvMascotas.setLayoutManager(llm);

        MascotaAdapter mascotaAdapter = new MascotaAdapter(mascotas);
        rvMascotas.setAdapter(mascotaAdapter);

        FloatingActionButton fab = findViewById(R.id.floatingActionButton);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //rvMascotas.scrollToPosition(0);
                Toast.makeText(MainActivity.this, "Subir una foto", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()){
                case R.id.mFavoritos:
                    Intent intent = new Intent(MainActivity.this, FavoritosActivity.class);
                    startActivity(intent);
                break;
                case R.id.mAbout:
                    Toast.makeText(getApplicationContext(),"By Pablo Fernández",Toast.LENGTH_SHORT).show();
                    break;
            }
        return super.onOptionsItemSelected(item);
    }
}