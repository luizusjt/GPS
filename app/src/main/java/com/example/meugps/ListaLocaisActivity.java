package com.example.meugps;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListaLocaisActivity extends AppCompatActivity {

    private ArrayList<String> lista;
    private ListView locaisListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_locais);
        locaisListView = findViewById(R.id.locaisListView);
        Intent origemIntent = getIntent();
        ArrayList<String> lista = origemIntent.getStringArrayListExtra("lista_locais");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lista);
        locaisListView.setAdapter(adapter);

    }

}
