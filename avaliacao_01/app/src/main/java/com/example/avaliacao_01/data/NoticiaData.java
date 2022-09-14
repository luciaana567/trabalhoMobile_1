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

        Noticia noticia2 = new Noticia(1,"Equipe de The Mandalorian já sabe quando a série vai acabar, diz atriz",
                R.drawable.mandaloriano,
                "Dave Filoni e Jon Favreau já tem um final em mente para The Mandalorian, e inclusive sabem quantas temporadas precisarão para chegar lá. A informação é da atriz Katee Sackhoff, a Bo-Katan, em entrevista à Variety [via ScreenRant].\n" +
                        "\n" +
                        "\"Sabe, eles me disseram [quantas temporadas a série terá], mas vamos esperar para ver se isso acontecesse mesmo. E sim, é a quantidade de temporadas que achei que teria\", comentou ela.",
                new Date(2022,9,14), "CAIO COLETTI");
        noticias.add(noticia2) ;

        Noticia noticia3 = new Noticia(2,
                "A Casa do Dragão | Desconfiança toma conta do reino no 4º episódio",
                R.drawable.casadodragao,
                "Depois de um encerramento épico e cheio de ação na semana passada, A Casa do Dragão voltou suas atenções para as disputas políticas em seu quarto episódio. Isso não quer dizer, no entanto, que o derivado de Game of Thrones tenha tirado o pé do acelerador - muito pelo contrário. O capítulo deste domingo (11) trouxe de volta toda a tensão de bastidores que transformou sua produção-mãe em um grande fenômeno. Logo de cara, acompanhamos Rhaenyra (Milly Alcock) avaliando diversos candidatos a noivo selecionados pelo rei, mas nenhum lhe agrada. O primeiro que vemos é mais velho que seu pai, enquanto o segundo, apesar de vir de uma das famílias mais tradicionais de Westeros, é apenas uma criança. Enquanto discursa para a princesa, o garoto é interrompido e ofendido por um outro nobre presente e, enquanto a herdeira do trono se retira, cansada dos pretendentes decepcionantes que conheceu, o jovem lorde e o rapaz que o ofendia começam a brigar, com o menino saindo vitorioso após matar seu ofensor.\n" +
                        "\n",
                new Date(2011,9,11),"NICO GARÓFALO");
        noticias.add(noticia3);

        Noticia noticia4 = new Noticia(3,
                "Stranger Things | Maya Hawke quer morte heroica para Robin",
                R.drawable.strangerthings,
                "A quinta e última temporada de Stranger Things nem ao menos tem previsão de estreia, mas já domina toda e qualquer conversa que envolva seu elenco. Inclusive, Maya Hawke, que vive Robin na produção, já tem um final em mente para a sua personagem. “Adoraria morrer e ter meu momento heróico”, disse a atriz à Rolling Stone.\n" +
                        "\n" +
                        "“É a última temporada, então algumas pessoas provavelmente vão morrer (...). Adoraria morrer de forma honrada, como qualquer outro ator adoraria”, continuou Hawke que, embora entenda algumas críticas à sobrevivência do elenco principal, admira o carinho que Shawn Levy e os Irmãos Duffer têm pelos personagens. “A razão pela qual eles escrevem tão bem para mim e para todos os outros é porque eles se apaixonam por seus atores e personagens, e não querem matá-los. Acho que é uma bela qualidade e não gostaria que isso fosse embora”.\n" +
                        "\n",
                new Date(2022,9,14), "NICO GARÓFALO");
        noticias.add(noticia4);
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
