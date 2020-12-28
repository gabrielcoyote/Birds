package com.example.birds.activity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.birds.Adapter.MeuAdaptador;
import com.example.birds.R;
import com.example.birds.model.Passaros;
import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Passaros> passaros;
    private String order = "ASC";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        recyclerView = findViewById(R.id.minha_lista);
        passaros = new ArrayList<>();
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        passaros.add(new Passaros("Beija-flor",R.drawable.beijaflor));
        passaros.add(new Passaros("Papagaio",R.drawable.papagaio));
        passaros.add(new Passaros("Bem-te-vi",R.drawable.bemtevi));
        passaros.add(new Passaros("João-de-barro",R.drawable.joaodebarro));
        passaros.add(new Passaros("Coleiro",R.drawable.coleiro));
        passaros.add(new Passaros("Sabiá-laranjeira",R.drawable.sabialaranjeiraa));
        passaros.add(new Passaros("Rolinha-roxa",R.drawable.rolinha));

        MeuAdaptador meuAdaptador = new MeuAdaptador(passaros, getApplicationContext(), new MeuAdaptador.OnItemClickListener() {
            @Override
            public void onItemClick(Passaros passaros) { }
        });
        recyclerView.setAdapter(meuAdaptador);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

    }


    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflar o menu; isso adiciona itens à barra de ação, se houver.

        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Lidar com cliques do item da barra de ação aqui.
        // lida automaticamente com cliques no botão
        // conforme você especifica uma atividade ela responde aqui


        int id = item.getItemId();

            if (id == R.id.Crescente) {
                order = "ASC";
            } else if(id == R.id.Decescente){
                order = "DESC";
            }

        return super.onOptionsItemSelected(item);
    }

}