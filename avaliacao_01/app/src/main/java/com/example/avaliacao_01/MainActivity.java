package com.example.avaliacao_01;

import android.provider.MediaStore;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.avaliacao_01.data.NoticiaData;
import com.example.avaliacao_01.models.Noticia;

import java.util.Date;

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

        visibilidadeBotao(view);
    }

    public void anteriroNoticia(View view) {
        noticia = noticias.anterior(noticia.id);
        if(!noticia.equals(null))
            setarInformacoes();

        visibilidadeBotao(view);
    }

    private void setarInformacoes() {

        ImageView imagem = (ImageView) findViewById(R.id.imagemNoticia);
        imagem.setImageResource(noticia.getUrlImagem());

        TextView title = (TextView) findViewById(R.id.titleNotice);
        title.setText(noticia.getTitulo());

        TextView dataNoticia = (TextView) findViewById(R.id.dataNoticia);
        dataNoticia.setText(formatarData(noticia.getDataPublicacao()));

        TextView dataEntrega = (TextView) findViewById(R.id.dataEntrega);
        dataEntrega.setText(formatarData(new Date()));

        TextView textBody = (TextView) findViewById(R.id.textNotice);
        textBody.setText(noticia.getCorpoTexto());

        TextView autor = (TextView) findViewById(R.id.autor);
        autor.setText(noticia.getAutorTexto());

    }

    private void visibilidadeBotao(View view){
        Button botaoProximo = (Button) findViewById(R.id.nextButtom);
        Button botaoAnterior = (Button) findViewById(R.id.previousButtom);

        if(noticia.getId() < noticias.numeroNoticias()-1) {
            botaoProximo.setVisibility(view.VISIBLE);
        } else {
            botaoProximo.setVisibility(view.INVISIBLE);
        }

        if(noticia.getId() == 0) {
            botaoAnterior.setVisibility(view.INVISIBLE);
        } else {
            botaoAnterior.setVisibility(view.VISIBLE);
        }
    }

    private String formatarData(Date data) {
        String dataFormatada;
        Integer dia = data.getDay();
        Integer mes = data.getMonth();

        if(dia < 9) { dataFormatada = 0+dia+"/";
        } else { dataFormatada = dia+"/"; }
        if(mes < 9) { dataFormatada = dataFormatada+mes+"/";
        } else { dataFormatada = dataFormatada+mes+"/"; }

        dataFormatada = dataFormatada+data.getYear();

        return dataFormatada;
    }

}