package com.example.avaliacao_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.avaliacao_01.data.NoticiaData;
import com.example.avaliacao_01.models.Noticia;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private NoticiaData noticias = new NoticiaData();
    private Noticia noticia = noticias.defaultNoticia();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setarInformacoes();
    }

    public void proximaNoticia(View view) {
        noticia = noticias.proxima(noticia.id);
        if(!noticia.equals(null))
        setarInformacoes();
    }

    private void setarInformacoes() {
        TextView title = (TextView) findViewById(R.id.titleNotice);
        title.setText(noticia.getTitulo());
        //TextView textBody = (TextView) findViewById(R.id.textNotice);
       // title.setText(noticia.getCorpoTexto());
    }
}