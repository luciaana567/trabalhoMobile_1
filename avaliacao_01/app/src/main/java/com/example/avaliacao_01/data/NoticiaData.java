package com.example.avaliacao_01.data;

import com.example.avaliacao_01.R;
import com.example.avaliacao_01.models.Noticia;

import java.util.ArrayList;
import java.util.Date;

public class NoticiaData {
    private ArrayList<Noticia> noticias = new ArrayList<>();

    private void setarInformacoes(){
        Noticia noticia1 = new Noticia(0,"Adão Negro | The Rock aparece imponente em nova foto",
                R.drawable.adao_negro_the_rock_1550x647,
                "Além de Johnson, Adão Negro ainda conta com Noah Centineo como Esmaga Átomo; Quintessa Swindell como Ciclone; Pierce Brosnan como Senhor Destino; Aldis Hodge como Gavião Negro e mais. O filme solo de Adão Negro tem direção de Jaume Collet-Serra (A Orfã), roteiro de Adam Szytkiel, e estreia marcada para 21 de outubro de 2022.",
                new Date(2022,9,7), "MARIANA CANHISARES");
        noticias.add(noticia1) ;

        Noticia noticia2 = new Noticia(1,"titulo 2",
                R.drawable.mandaloriano,
                " corpoTexto iefhwsfcsdhchdchhechehchehchecwescwece ufyefdyfucyuhdwbcfuyhswdbcfuyhwbdsuhcbuhd dfchbwegdfcbwue dsufchwuec iuehcwuecb gweuyd fc udecfuew efwgucyhsgwdcf dyuwfciwuyfc fucwgfcuf cufc wgyugfcywdgfcywsdghuhc",
                new Date(2022,9,7), "");
        noticias.add(noticia2) ;
    }

    public Noticia defaultNoticia() {
        if(noticias.size() == 0) setarInformacoes();
        return noticias.get(0);
    }

    public Noticia proxima(int id) {
        if(id < noticias.size()) {
            return noticias.get(id + 1);
        }
        return null;
    };

    public Noticia anterior(int id) {
        if(id > 0) {
            return noticias.get(id - 1);
        }
        return null;
    }

    public Integer numeroNoticias() {
        return noticias.size();
    }

}
