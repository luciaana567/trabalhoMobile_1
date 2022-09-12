package com.example.avaliacao_01.data;

import com.example.avaliacao_01.models.Noticia;

import java.util.ArrayList;
import java.util.Date;

public class NoticiaData {
    private ArrayList<Noticia> noticias = new ArrayList<>();

    private void setarInformacoes(){
        Noticia noticia1 = new Noticia(0,"titulo 1", "@drawable/adao_negro_the_rock_1550x647", "corpoTexto iefhwsfcsdhchdchhechehchehchecwescwece ufyefdyfucyuhdwbcfuyhswdbcfuyhwbdsuhcbuhd dfchbwegdfcbwue dsufchwuec iuehcwuecb gweuyd fc udecfuew efwgucyhsgwdcf dyuwfciwuyfc fucwgfcuf cufc wgyugfcywdgfcywsdghuhc",
                new Date(), "");
        noticias.add(noticia1) ;

        Noticia noticia2 = new Noticia(1,"titulo 2", "@drawable/adao_negro_the_rock_1550x647", "corpoTexto iefhwsfcsdhchdchhechehchehchecwescwece ufyefdyfucyuhdwbcfuyhswdbcfuyhwbdsuhcbuhd dfchbwegdfcbwue dsufchwuec iuehcwuecb gweuyd fc udecfuew efwgucyhsgwdcf dyuwfciwuyfc fucwgfcuf cufc wgyugfcywdgfcywsdghuhc",
                new Date(), "");
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
}
