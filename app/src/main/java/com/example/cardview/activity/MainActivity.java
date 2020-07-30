package com.example.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.cardview.R;
import com.example.cardview.adapter.PostagemAdapter;
import com.example.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerViewCard);

        //Define Layout
        //LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);

        recyclerPostagem.setLayoutManager(layoutManager);

        //Define adapter
        this.prepararPostagem();
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);

    }

    public void prepararPostagem(){

        Postagem p = new Postagem("Thiago Abdelnoor", "Viagem massa", R.drawable.imagem1);
        this.postagens.add(p);

        p = new Postagem("Maria Paula", "O loco meu", R.drawable.imagem2);
        this.postagens.add(p);
        p = new Postagem("Pedro Damanc", "Ta doido", R.drawable.imagem3);
        this.postagens.add(p);
        p = new Postagem("Luiz Otávio", "É isso aí", R.drawable.imagem4);
        this.postagens.add(p);



    }

}