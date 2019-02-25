package wroclaw.mpk.synchro;

import java.io.*;
import java.util.*;

public class LineVariantFactory {

    // tworzenie wariantów linii


    public List<LineVariant> getPoswietne1() {
        List<MpkNode> wezly1 = new ArrayList<>();
        wezly1.add(new MpkNode(LineName.POSWIETNE_1, NodeName.BISKUPIN, 0, true));
        wezly1.add(new MpkNode(LineName.POSWIETNE_1, NodeName.GRUNWALDZKI, 10, false));
        wezly1.add(new MpkNode(LineName.POSWIETNE_1, NodeName.NADODRZE, 22, false));
        wezly1.add(new MpkNode(LineName.POSWIETNE_1, NodeName.POSWIETNE, 32, false));
        return generateLineVariant((wezly1));

    }


    public List<LineVariant> getBiskupin1() {
        List<MpkNode> wezly2 = new ArrayList<>();
        wezly2.add(new MpkNode(LineName.BISKUPIN_1, NodeName.POSWIETNE, 0, true));
        wezly2.add(new MpkNode(LineName.BISKUPIN_1, NodeName.NADODRZE, 10, false));
        wezly2.add(new MpkNode(LineName.BISKUPIN_1, NodeName.GRUNWALDZKI, 22, false));
        wezly2.add(new MpkNode(LineName.BISKUPIN_1, NodeName.BISKUPIN, 32, false));
        return generateLineVariant(((wezly2)));
    }


    public List<LineVariant> getKrzyki2() {
        List<MpkNode> wezly3 = new ArrayList<>();
        wezly3.add(new MpkNode(LineName.KRZYKI_2, NodeName.BISKUPIN, 0, true));
        wezly3.add(new MpkNode(LineName.KRZYKI_2, NodeName.GRUNWALDZKI, 10, false));
        wezly3.add(new MpkNode(LineName.KRZYKI_2, NodeName.DOMINIKANSKA, 18, false));
        wezly3.add(new MpkNode(LineName.KRZYKI_2, NodeName.GLOWNY, 22, false));
        wezly3.add(new MpkNode(LineName.KRZYKI_2, NodeName.ARKADY, 25, false));
        wezly3.add(new MpkNode(LineName.KRZYKI_2, NodeName.KRZYKI, 36, false));
        return generateLineVariant(((wezly3)));
    }


    public List<LineVariant> getBiskupin2() {
        List<MpkNode> wezly4 = new ArrayList<>();
        wezly4.add(new MpkNode(LineName.BISKUPIN_2, NodeName.KRZYKI, 0, true));
        wezly4.add(new MpkNode(LineName.BISKUPIN_2, NodeName.ARKADY, 11, false));
        wezly4.add(new MpkNode(LineName.BISKUPIN_2, NodeName.GLOWNY, 14, false));
        wezly4.add(new MpkNode(LineName.BISKUPIN_2, NodeName.DOMINIKANSKA, 18, false));
        wezly4.add(new MpkNode(LineName.BISKUPIN_2, NodeName.GRUNWALDZKI, 27, false));
        wezly4.add(new MpkNode(LineName.BISKUPIN_2, NodeName.BISKUPIN, 37, false));
        return generateLineVariant((wezly4));
    }


    public List<LineVariant> getLesnica3() {
        List<MpkNode> wezly5 = new ArrayList<>();
        wezly5.add(new MpkNode(LineName.LESNICA_3, NodeName.KSIEZE, 0, true));
        wezly5.add(new MpkNode(LineName.LESNICA_3, NodeName.DOMINIKANSKA, 15, false));
        wezly5.add(new MpkNode(LineName.LESNICA_3, NodeName.JPII, 22, false));
        wezly5.add(new MpkNode(LineName.LESNICA_3, NodeName.PILCZYCE, 38, false));
        wezly5.add(new MpkNode(LineName.LESNICA_3, NodeName.LESNICA, 51, false));
        return generateLineVariant((wezly5));
    }


    public List<LineVariant> getKsieze3() {
        List<MpkNode> wezly6 = new ArrayList<>();
        wezly6.add(new MpkNode(LineName.KSIEZE_3, NodeName.LESNICA, 0, true));
        wezly6.add(new MpkNode(LineName.KSIEZE_3, NodeName.PILCZYCE, 12, false));
        wezly6.add(new MpkNode(LineName.KSIEZE_3, NodeName.JPII, 27, false));
        wezly6.add(new MpkNode(LineName.KSIEZE_3, NodeName.DOMINIKANSKA, 34, false));
        wezly6.add(new MpkNode(LineName.KSIEZE_3, NodeName.KSIEZE, 49, false));
        return generateLineVariant((wezly6));
    }


    public List<LineVariant> getBiskupin4() {
        List<MpkNode> wezly7 = new ArrayList<>();
        wezly7.add(new MpkNode(LineName.BISKUPIN_4, NodeName.OPOROW, 0, true));
        wezly7.add(new MpkNode(LineName.BISKUPIN_4, NodeName.GRABISZYNSKA_CM, 2, false));
        wezly7.add(new MpkNode(LineName.BISKUPIN_4, NodeName.FAT, 5, false));
        wezly7.add(new MpkNode(LineName.BISKUPIN_4, NodeName.LEGIONOW, 15, false));
        wezly7.add(new MpkNode(LineName.BISKUPIN_4, NodeName.DOMINIKANSKA, 22, false));
        wezly7.add(new MpkNode(LineName.BISKUPIN_4, NodeName.GRUNWALDZKI, 28, false));
        wezly7.add(new MpkNode(LineName.BISKUPIN_4, NodeName.BISKUPIN, 38, false));
        return generateLineVariant((wezly7));
    }


    public List<LineVariant> getOporow4() {
        List<MpkNode> wezly8 = new ArrayList<>();
        wezly8.add(new MpkNode(LineName.OPOROW_4, NodeName.BISKUPIN, 0, true));
        wezly8.add(new MpkNode(LineName.OPOROW_4, NodeName.GRUNWALDZKI, 10, false));
        wezly8.add(new MpkNode(LineName.OPOROW_4, NodeName.DOMINIKANSKA, 15, false));
        wezly8.add(new MpkNode(LineName.OPOROW_4, NodeName.LEGIONOW, 22, false));
        wezly8.add(new MpkNode(LineName.OPOROW_4, NodeName.FAT, 33, false));
        wezly8.add(new MpkNode(LineName.OPOROW_4, NodeName.GRABISZYNSKA_CM, 35, false));
        wezly8.add(new MpkNode(LineName.OPOROW_4, NodeName.OPOROW, 38, false));
        return generateLineVariant((wezly8));
    }


    public List<LineVariant> getKsieze5() {
        List<MpkNode> wezly9 = new ArrayList<>();
        wezly9.add(new MpkNode(LineName.KSIEZE_5, NodeName.OPOROW, 0, true));
        wezly9.add(new MpkNode(LineName.KSIEZE_5, NodeName.GRABISZYNSKA_CM, 2, false));
        wezly9.add(new MpkNode(LineName.KSIEZE_5, NodeName.FAT, 5, false));
        wezly9.add(new MpkNode(LineName.KSIEZE_5, NodeName.LEGIONOW, 15, false));
        wezly9.add(new MpkNode(LineName.KSIEZE_5, NodeName.ARKADY, 17, false));
        wezly9.add(new MpkNode(LineName.KSIEZE_5, NodeName.GLOWNY, 20, false));
        wezly9.add(new MpkNode(LineName.KSIEZE_5, NodeName.DOMINIKANSKA, 24, false));
        wezly9.add(new MpkNode(LineName.KSIEZE_5, NodeName.KSIEZE, 39, false));
        return generateLineVariant((wezly9));
    }


    public List<LineVariant> getOporow5() {
        List<MpkNode> wezly10 = new ArrayList<>();
        wezly10.add(new MpkNode(LineName.OPOROW_5, NodeName.KSIEZE, 0, true));
        wezly10.add(new MpkNode(LineName.OPOROW_5, NodeName.DOMINIKANSKA, 15, false));
        wezly10.add(new MpkNode(LineName.OPOROW_5, NodeName.GLOWNY, 19, false));
        wezly10.add(new MpkNode(LineName.OPOROW_5, NodeName.ARKADY, 22, false));
        wezly10.add(new MpkNode(LineName.OPOROW_5, NodeName.LEGIONOW, 24, false));
        wezly10.add(new MpkNode(LineName.OPOROW_5, NodeName.FAT, 35, false));
        wezly10.add(new MpkNode(LineName.OPOROW_5, NodeName.GRABISZYNSKA_CM, 37, false));
        wezly10.add(new MpkNode(LineName.OPOROW_5, NodeName.OPOROW, 40, false));
        return generateLineVariant((wezly10));
    }


    public List<LineVariant> getKowale6() {
        List<MpkNode> wezly11 = new ArrayList<>();
        wezly11.add(new MpkNode(LineName.KOWALE_6, NodeName.KRZYKI, 0, true));
        wezly11.add(new MpkNode(LineName.KOWALE_6, NodeName.ARKADY, 11, false));
        wezly11.add(new MpkNode(LineName.KOWALE_6, NodeName.BEMA, 23, false));
        wezly11.add(new MpkNode(LineName.KOWALE_6, NodeName.KROMERA, 32, false));
        wezly11.add(new MpkNode(LineName.KOWALE_6, NodeName.KOWALE, 38, false));
        return generateLineVariant((wezly11));
    }


    public List<LineVariant> getKrzyki6() {
        List<MpkNode> wezly12 = new ArrayList<>();
        wezly12.add(new MpkNode(LineName.KRZYKI_6, NodeName.KOWALE, 0, true));
        wezly12.add(new MpkNode(LineName.KRZYKI_6, NodeName.KROMERA, 6, false));
        wezly12.add(new MpkNode(LineName.KRZYKI_6, NodeName.BEMA, 15, false));
        wezly12.add(new MpkNode(LineName.KRZYKI_6, NodeName.ARKADY, 29, false));
        wezly12.add(new MpkNode(LineName.KRZYKI_6, NodeName.KRZYKI, 40, false));
        return generateLineVariant((wezly12));
    }


    public List<LineVariant> getKlecina7() {
        List<MpkNode> wezly13 = new ArrayList<>();
        wezly13.add(new MpkNode(LineName.KLECINA_7, NodeName.POSWIETNE, 0, true));
        wezly13.add(new MpkNode(LineName.KLECINA_7, NodeName.NADODRZE, 10, false));
        wezly13.add(new MpkNode(LineName.KLECINA_7, NodeName.ARKADY, 25, false));
        wezly13.add(new MpkNode(LineName.KLECINA_7, NodeName.KRZYKI, 36, false));
        wezly13.add(new MpkNode(LineName.KLECINA_7, NodeName.PRZYJAZNI, 40, false));
        wezly13.add(new MpkNode(LineName.KLECINA_7, NodeName.KLECINA, 43, false));
        return generateLineVariant((wezly13));
    }


    public List<LineVariant> getPoswietne7() {
        List<MpkNode> wezly14 = new ArrayList<>();
        wezly14.add(new MpkNode(LineName.POSWIETNE_7, NodeName.KLECINA, 0, true));
        wezly14.add(new MpkNode(LineName.POSWIETNE_7, NodeName.PRZYJAZNI, 3, false));
        wezly14.add(new MpkNode(LineName.POSWIETNE_7, NodeName.KRZYKI, 6, false));
        wezly14.add(new MpkNode(LineName.POSWIETNE_7, NodeName.ARKADY, 17, false));
        wezly14.add(new MpkNode(LineName.POSWIETNE_7, NodeName.NADODRZE, 30, false));
        wezly14.add(new MpkNode(LineName.POSWIETNE_7, NodeName.POSWIETNE, 40, false));
        return generateLineVariant((wezly14));
    }


    public List<LineVariant> getTarnogaj8() {
        List<MpkNode> wezly15 = new ArrayList<>();
        wezly15.add(new MpkNode(LineName.TARNOGAJ_8, NodeName.KARLOWICE, 0, true));
        wezly15.add(new MpkNode(LineName.TARNOGAJ_8, NodeName.NADODRZE, 5, false));
        wezly15.add(new MpkNode(LineName.TARNOGAJ_8, NodeName.BEMA, 13, false));
        wezly15.add(new MpkNode(LineName.TARNOGAJ_8, NodeName.DOMINIKANSKA, 17, false));
        wezly15.add(new MpkNode(LineName.TARNOGAJ_8, NodeName.GLOWNY, 22, false));
        wezly15.add(new MpkNode(LineName.TARNOGAJ_8, NodeName.AUTOBUSOWY, 24, false));
        wezly15.add(new MpkNode(LineName.TARNOGAJ_8, NodeName.TARNOGAJ, 36, false));
        return generateLineVariant((wezly15));
    }


    public List<LineVariant> getKarlowice8() {
        List<MpkNode> wezly16 = new ArrayList<>();
        wezly16.add(new MpkNode(LineName.KARLOWICE_8, NodeName.TARNOGAJ, 0, true));
        wezly16.add(new MpkNode(LineName.KARLOWICE_8, NodeName.AUTOBUSOWY, 13, false));
        wezly16.add(new MpkNode(LineName.KARLOWICE_8, NodeName.GLOWNY, 16, false));
        wezly16.add(new MpkNode(LineName.KARLOWICE_8, NodeName.DOMINIKANSKA, 20, false));
        wezly16.add(new MpkNode(LineName.KARLOWICE_8, NodeName.BEMA, 24, false));
        wezly16.add(new MpkNode(LineName.KARLOWICE_8, NodeName.NADODRZE, 32, false));
        wezly16.add(new MpkNode(LineName.KARLOWICE_8, NodeName.KARLOWICE, 37, false));
        return generateLineVariant((wezly16));
    }


    public List<LineVariant> getPark9() {
        List<MpkNode> wezly17 = new ArrayList<>();
        wezly17.add(new MpkNode(LineName.PARK_9, NodeName.SEPOLNO, 0, true));
        wezly17.add(new MpkNode(LineName.PARK_9, NodeName.OLIMPIJSKI, 3, false));
        wezly17.add(new MpkNode(LineName.PARK_9, NodeName.BEMA, 14, false));
        wezly17.add(new MpkNode(LineName.PARK_9, NodeName.DOMINIKANSKA, 18, false));
        wezly17.add(new MpkNode(LineName.PARK_9, NodeName.GLOWNY, 23, false));
        wezly17.add(new MpkNode(LineName.PARK_9, NodeName.AUTOBUSOWY, 25, false));
        wezly17.add(new MpkNode(LineName.PARK_9, NodeName.PARK, 36, false));
        return generateLineVariant((wezly17));
    }


    public List<LineVariant> getSepolno9() {
        List<MpkNode> wezly18 = new ArrayList<>();
        wezly18.add(new MpkNode(LineName.SEPOLNO_9, NodeName.PARK, 0, true));
        wezly18.add(new MpkNode(LineName.SEPOLNO_9, NodeName.AUTOBUSOWY, 11, false));
        wezly18.add(new MpkNode(LineName.SEPOLNO_9, NodeName.GLOWNY, 14, false));
        wezly18.add(new MpkNode(LineName.SEPOLNO_9, NodeName.DOMINIKANSKA, 18, false));
        wezly18.add(new MpkNode(LineName.SEPOLNO_9, NodeName.BEMA, 22, false));
        wezly18.add(new MpkNode(LineName.SEPOLNO_9, NodeName.OLIMPIJSKI, 33, false));
        wezly18.add(new MpkNode(LineName.SEPOLNO_9, NodeName.SEPOLNO, 36, false));
        return generateLineVariant((wezly18));
    }


    public List<LineVariant> getNadodrze0l() {
        List<MpkNode> wezly19 = new ArrayList<>();
        wezly19.add(new MpkNode(LineName.NADODRZE_0L, NodeName.NADODRZE, 0, true));
        wezly19.add(new MpkNode(LineName.NADODRZE_0L, NodeName.STASZICA, 2, false));
        wezly19.add(new MpkNode(LineName.NADODRZE_0L, NodeName.JPII, 8, false));
        wezly19.add(new MpkNode(LineName.NADODRZE_0L, NodeName.ORLAT, 10, false));
        wezly19.add(new MpkNode(LineName.NADODRZE_0L, NodeName.LEGIONOW, 12, false));
        wezly19.add(new MpkNode(LineName.NADODRZE_0L, NodeName.ARKADY, 14, false));
        wezly19.add(new MpkNode(LineName.NADODRZE_0L, NodeName.GLOWNY, 17, false));
        wezly19.add(new MpkNode(LineName.NADODRZE_0L, NodeName.GRUNWALDZKI, 29, false));
        return generateLineVariant((wezly19));
    }


    public List<LineVariant> getNadodrze0p() {
        List<MpkNode> wezly20 = new ArrayList<>();
        wezly20.add(new MpkNode(LineName.NADODRZE_0P, NodeName.NADODRZE, 0, true));
        wezly20.add(new MpkNode(LineName.NADODRZE_0P, NodeName.GRUNWALDZKI, 12, false));
        wezly20.add(new MpkNode(LineName.NADODRZE_0P, NodeName.GLOWNY, 24, false));
        wezly20.add(new MpkNode(LineName.NADODRZE_0P, NodeName.ARKADY, 27, false));
        wezly20.add(new MpkNode(LineName.NADODRZE_0P, NodeName.LEGIONOW, 29, false));
        wezly20.add(new MpkNode(LineName.NADODRZE_0P, NodeName.ORLAT, 31, false));
        wezly20.add(new MpkNode(LineName.NADODRZE_0P, NodeName.JPII, 33, false));
        wezly20.add(new MpkNode(LineName.NADODRZE_0P, NodeName.STASZICA, 40, false));
        return generateLineVariant((wezly20));
    }


    public List<LineVariant> getLesnica10() {
        List<MpkNode> wezly21 = new ArrayList<>();
        wezly21.add(new MpkNode(LineName.LESNICA_10, NodeName.BISKUPIN, 0, true));
        wezly21.add(new MpkNode(LineName.LESNICA_10, NodeName.GRUNWALDZKI, 10, false));
        wezly21.add(new MpkNode(LineName.LESNICA_10, NodeName.DOMINIKANSKA, 18, false));
        wezly21.add(new MpkNode(LineName.LESNICA_10, NodeName.JPII, 25, false));
        wezly21.add(new MpkNode(LineName.LESNICA_10, NodeName.PILCZYCE, 41, false));
        wezly21.add(new MpkNode(LineName.LESNICA_10, NodeName.LESNICA, 54, false));
        return generateLineVariant((wezly21));
    }


    public List<LineVariant> getBiskupin10() {
        List<MpkNode> wezly22 = new ArrayList<>();
        wezly22.add(new MpkNode(LineName.BISKUPIN_10, NodeName.LESNICA, 0, true));
        wezly22.add(new MpkNode(LineName.BISKUPIN_10, NodeName.PILCZYCE, 12, false));
        wezly22.add(new MpkNode(LineName.BISKUPIN_10, NodeName.JPII, 27, false));
        wezly22.add(new MpkNode(LineName.BISKUPIN_10, NodeName.DOMINIKANSKA, 34, false));
        wezly22.add(new MpkNode(LineName.BISKUPIN_10, NodeName.GRUNWALDZKI, 43, false));
        wezly22.add(new MpkNode(LineName.BISKUPIN_10, NodeName.BISKUPIN, 53, false));
        return generateLineVariant((wezly22));
    }


    public List<LineVariant> getKromera11() {
        List<MpkNode> wezly23 = new ArrayList<>();
        wezly23.add(new MpkNode(LineName.KROMERA_11, NodeName.GRABISZYNSKA_CM, 0, true));
        wezly23.add(new MpkNode(LineName.KROMERA_11, NodeName.FAT, 3, false));
        wezly23.add(new MpkNode(LineName.KROMERA_11, NodeName.LEGIONOW, 13, false));
        wezly23.add(new MpkNode(LineName.KROMERA_11, NodeName.ARKADY, 15, false));
        wezly23.add(new MpkNode(LineName.KROMERA_11, NodeName.GLOWNY, 18, false));
        wezly23.add(new MpkNode(LineName.KROMERA_11, NodeName.DOMINIKANSKA, 22, false));
        wezly23.add(new MpkNode(LineName.KROMERA_11, NodeName.BEMA, 26, false));
        wezly23.add(new MpkNode(LineName.KROMERA_11, NodeName.KROMERA, 35, false));
        return generateLineVariant((wezly23));
    }


    public List<LineVariant> getGrabiszynska_cm11() {
        List<MpkNode> wezly24 = new ArrayList<>();
        wezly24.add(new MpkNode(LineName.GRABISZYNSKA_CM_11, NodeName.KROMERA, 0, true));
        wezly24.add(new MpkNode(LineName.GRABISZYNSKA_CM_11, NodeName.BEMA, 9, false));
        wezly24.add(new MpkNode(LineName.GRABISZYNSKA_CM_11, NodeName.DOMINIKANSKA, 13, false));
        wezly24.add(new MpkNode(LineName.GRABISZYNSKA_CM_11, NodeName.GLOWNY, 17, false));
        wezly24.add(new MpkNode(LineName.GRABISZYNSKA_CM_11, NodeName.ARKADY, 20, false));
        wezly24.add(new MpkNode(LineName.GRABISZYNSKA_CM_11, NodeName.LEGIONOW, 22, false));
        wezly24.add(new MpkNode(LineName.GRABISZYNSKA_CM_11, NodeName.FAT, 33, false));
        wezly24.add(new MpkNode(LineName.GRABISZYNSKA_CM_11, NodeName.GRABISZYNSKA_CM, 35, false));
        return generateLineVariant((wezly24));
    }


    public List<LineVariant> getFat14() {
        List<MpkNode> wezly25 = new ArrayList<>();
        wezly25.add(new MpkNode(LineName.FAT_14, NodeName.OSOBOWICE, 0, true));
        wezly25.add(new MpkNode(LineName.FAT_14, NodeName.STASZICA, 11, false));
        wezly25.add(new MpkNode(LineName.FAT_14, NodeName.ARKADY, 22, false));
        wezly25.add(new MpkNode(LineName.FAT_14, NodeName.FAT, 36, false));
        return generateLineVariant((wezly25));
    }


    public List<LineVariant> getOsobowice14() {
        List<MpkNode> wezly26 = new ArrayList<>();
        wezly26.add(new MpkNode(LineName.OSOBOWICE_14, NodeName.FAT, 0, true));
        wezly26.add(new MpkNode(LineName.OSOBOWICE_14, NodeName.LEGIONOW, 11, false));
        wezly26.add(new MpkNode(LineName.OSOBOWICE_14, NodeName.ORLAT, 13, false));
        wezly26.add(new MpkNode(LineName.OSOBOWICE_14, NodeName.JPII, 15, false));
        wezly26.add(new MpkNode(LineName.OSOBOWICE_14, NodeName.STASZICA, 22, false));
        wezly26.add(new MpkNode(LineName.OSOBOWICE_14, NodeName.OSOBOWICE, 33, false));
        return generateLineVariant((wezly26));
    }


    public List<LineVariant> getPark15() {
        List<MpkNode> wezly27 = new ArrayList<>();
        wezly27.add(new MpkNode(LineName.PARK_15, NodeName.POSWIETNE, 0, true));
        wezly27.add(new MpkNode(LineName.PARK_15, NodeName.STASZICA, 10, false));
        wezly27.add(new MpkNode(LineName.PARK_15, NodeName.LEGIONOW, 20, false));
        wezly27.add(new MpkNode(LineName.PARK_15, NodeName.ARKADY, 22, false));
        wezly27.add(new MpkNode(LineName.PARK_15, NodeName.AUTOBUSOWY, 25, false));
        wezly27.add(new MpkNode(LineName.PARK_15, NodeName.PARK, 36, false));
        return generateLineVariant((wezly27));
    }


    public List<LineVariant> getPoswietne15() {
        List<MpkNode> wezly28 = new ArrayList<>();
        wezly28.add(new MpkNode(LineName.POSWIETNE_15, NodeName.PARK, 0, true));
        wezly28.add(new MpkNode(LineName.POSWIETNE_15, NodeName.AUTOBUSOWY, 11, false));
        wezly28.add(new MpkNode(LineName.POSWIETNE_15, NodeName.GLOWNY, 12, false));
        wezly28.add(new MpkNode(LineName.POSWIETNE_15, NodeName.ARKADY, 14, false));
        wezly28.add(new MpkNode(LineName.POSWIETNE_15, NodeName.LEGIONOW, 16, false));
        wezly28.add(new MpkNode(LineName.POSWIETNE_15, NodeName.STASZICA, 26, false));
        wezly28.add(new MpkNode(LineName.POSWIETNE_15, NodeName.POSWIETNE, 37, false));
        return generateLineVariant((wezly28));
    }


    public List<LineVariant> getKlecina17() {
        List<MpkNode> wezly29 = new ArrayList<>();
        wezly29.add(new MpkNode(LineName.KLECINA_17, NodeName.SEPOLNO, 0, true));
        wezly29.add(new MpkNode(LineName.KLECINA_17, NodeName.OLIMPIJSKI, 3, false));
        wezly29.add(new MpkNode(LineName.KLECINA_17, NodeName.BEMA, 14, false));
        wezly29.add(new MpkNode(LineName.KLECINA_17, NodeName.DOMINIKANSKA, 18, false));
        wezly29.add(new MpkNode(LineName.KLECINA_17, NodeName.ARKADY, 25, false));
        wezly29.add(new MpkNode(LineName.KLECINA_17, NodeName.KRZYKI, 36, false));
        wezly29.add(new MpkNode(LineName.KLECINA_17, NodeName.PRZYJAZNI, 40, false));
        wezly29.add(new MpkNode(LineName.KLECINA_17, NodeName.KLECINA, 43, false));
        return generateLineVariant((wezly29));
    }


    public List<LineVariant> getSepolno17() {
        List<MpkNode> wezly30 = new ArrayList<>();
        wezly30.add(new MpkNode(LineName.SEPOLNO_17, NodeName.KLECINA, 0, true));
        wezly30.add(new MpkNode(LineName.SEPOLNO_17, NodeName.PRZYJAZNI, 3, false));
        wezly30.add(new MpkNode(LineName.SEPOLNO_17, NodeName.KRZYKI, 6, false));
        wezly30.add(new MpkNode(LineName.SEPOLNO_17, NodeName.ARKADY, 17, false));
        wezly30.add(new MpkNode(LineName.SEPOLNO_17, NodeName.DOMINIKANSKA, 24, false));
        wezly30.add(new MpkNode(LineName.SEPOLNO_17, NodeName.BEMA, 28, false));
        wezly30.add(new MpkNode(LineName.SEPOLNO_17, NodeName.OLIMPIJSKI, 39, false));
        wezly30.add(new MpkNode(LineName.SEPOLNO_17, NodeName.SEPOLNO, 42, false));
        return generateLineVariant((wezly30));
    }


    public List<LineVariant> getLesnica20() {
        List<MpkNode> wezly31 = new ArrayList<>();
        wezly31.add(new MpkNode(LineName.LESNICA_20, NodeName.OPOROW, 0, true));
        wezly31.add(new MpkNode(LineName.LESNICA_20, NodeName.GRABISZYNSKA_CM, 2, false));
        wezly31.add(new MpkNode(LineName.LESNICA_20, NodeName.FAT, 5, false));
        wezly31.add(new MpkNode(LineName.LESNICA_20, NodeName.ARKADY, 19, false));
        wezly31.add(new MpkNode(LineName.LESNICA_20, NodeName.JPII, 28, false));
        wezly31.add(new MpkNode(LineName.LESNICA_20, NodeName.PILCZYCE, 44, false));
        wezly31.add(new MpkNode(LineName.LESNICA_20, NodeName.LESNICA, 57, false));
        return generateLineVariant((wezly31));
    }


    public List<LineVariant> getOporow20() {
        List<MpkNode> wezly32 = new ArrayList<>();
        wezly32.add(new MpkNode(LineName.OPOROW_20, NodeName.LESNICA, 0, true));
        wezly32.add(new MpkNode(LineName.OPOROW_20, NodeName.PILCZYCE, 12, false));
        wezly32.add(new MpkNode(LineName.OPOROW_20, NodeName.JPII, 27, false));
        wezly32.add(new MpkNode(LineName.OPOROW_20, NodeName.ARKADY, 35, false));
        wezly32.add(new MpkNode(LineName.OPOROW_20, NodeName.FAT, 49, false));
        wezly32.add(new MpkNode(LineName.OPOROW_20, NodeName.GRABISZYNSKA_CM, 52, false));
        wezly32.add(new MpkNode(LineName.OPOROW_20, NodeName.OPOROW, 55, false));
        return generateLineVariant((wezly32));
    }


    public List<LineVariant> getWpp23() {
        List<MpkNode> wezly33 = new ArrayList<>();
        wezly33.add(new MpkNode(LineName.WPP_23, NodeName.KROMERA, 0, true));
        wezly33.add(new MpkNode(LineName.WPP_23, NodeName.BEMA, 9, false));
        wezly33.add(new MpkNode(LineName.WPP_23, NodeName.DOMINIKANSKA, 13, false));
        wezly33.add(new MpkNode(LineName.WPP_23, NodeName.JPII, 20, false));
        wezly33.add(new MpkNode(LineName.WPP_23, NodeName.WPP, 28, false));
        return generateLineVariant((wezly33));
    }


    public List<LineVariant> getKromera23() {
        List<MpkNode> wezly34 = new ArrayList<>();
        wezly34.add(new MpkNode(LineName.KROMERA_23, NodeName.WPP, 0, true));
        wezly34.add(new MpkNode(LineName.KROMERA_23, NodeName.JPII, 7, false));
        wezly34.add(new MpkNode(LineName.KROMERA_23, NodeName.DOMINIKANSKA, 14, false));
        wezly34.add(new MpkNode(LineName.KROMERA_23, NodeName.BEMA, 18, false));
        wezly34.add(new MpkNode(LineName.KROMERA_23, NodeName.KROMERA, 27, false));
        return generateLineVariant((wezly34));
    }


    public List<LineVariant> getFat24() {
        List<MpkNode> wezly35 = new ArrayList<>();
        wezly35.add(new MpkNode(LineName.FAT_24, NodeName.OSOBOWICE, 0, true));
        wezly35.add(new MpkNode(LineName.FAT_24, NodeName.STASZICA, 11, false));
        wezly35.add(new MpkNode(LineName.FAT_24, NodeName.JPII, 17, false));
        wezly35.add(new MpkNode(LineName.FAT_24, NodeName.ORLAT, 19, false));
        wezly35.add(new MpkNode(LineName.FAT_24, NodeName.LEGIONOW, 21, false));
        wezly35.add(new MpkNode(LineName.FAT_24, NodeName.FAT, 33, false));
        return generateLineVariant((wezly35));
    }


    public List<LineVariant> getOsobowice24() {
        List<MpkNode> wezly36 = new ArrayList<>();
        wezly36.add(new MpkNode(LineName.OSOBOWICE_24, NodeName.FAT, 0, true));
        wezly36.add(new MpkNode(LineName.OSOBOWICE_24, NodeName.ARKADY, 14, false));
        wezly36.add(new MpkNode(LineName.OSOBOWICE_24, NodeName.STASZICA, 26, false));
        wezly36.add(new MpkNode(LineName.OSOBOWICE_24, NodeName.OSOBOWICE, 37, false));
        return generateLineVariant((wezly36));
    }


    public List<LineVariant> getGaj31() {
        List<MpkNode> wezly37 = new ArrayList<>();
        wezly37.add(new MpkNode(LineName.GAJ_31, NodeName.ST_WROCLAW, 0, true));
        wezly37.add(new MpkNode(LineName.GAJ_31, NodeName.PILCZYCE, 4, false));
        wezly37.add(new MpkNode(LineName.GAJ_31, NodeName.JPII, 17, false));
        wezly37.add(new MpkNode(LineName.GAJ_31, NodeName.ORLAT, 19, false));
        wezly37.add(new MpkNode(LineName.GAJ_31, NodeName.LEGIONOW, 21, false));
        wezly37.add(new MpkNode(LineName.GAJ_31, NodeName.ARKADY, 23, false));
        wezly37.add(new MpkNode(LineName.GAJ_31, NodeName.AUTOBUSOWY, 26, false));
        wezly37.add(new MpkNode(LineName.GAJ_31, NodeName.GAJ, 37, false));
        return generateLineVariant((wezly37));
    }


    public List<LineVariant> getSt_wroclaw31() {
        List<MpkNode> wezly38 = new ArrayList<>();
        wezly38.add(new MpkNode(LineName.ST_WROCLAW_31, NodeName.GAJ, 0, true));
        wezly38.add(new MpkNode(LineName.ST_WROCLAW_31, NodeName.AUTOBUSOWY, 11, false));
        wezly38.add(new MpkNode(LineName.ST_WROCLAW_31, NodeName.GLOWNY, 12, false));
        wezly38.add(new MpkNode(LineName.ST_WROCLAW_31, NodeName.ARKADY, 14, false));
        wezly38.add(new MpkNode(LineName.ST_WROCLAW_31, NodeName.LEGIONOW, 16, false));
        wezly38.add(new MpkNode(LineName.ST_WROCLAW_31, NodeName.ORLAT, 18, false));
        wezly38.add(new MpkNode(LineName.ST_WROCLAW_31, NodeName.JPII, 20, false));
        wezly38.add(new MpkNode(LineName.ST_WROCLAW_31, NodeName.PILCZYCE, 34, false));
        wezly38.add(new MpkNode(LineName.ST_WROCLAW_31, NodeName.ST_WROCLAW, 38, false));
        return generateLineVariant((wezly38));
    }


    public List<LineVariant> getGaj32() {
        List<MpkNode> wezly39 = new ArrayList<>();
        wezly39.add(new MpkNode(LineName.GAJ_32, NodeName.KOZANOW, 0, true));
        wezly39.add(new MpkNode(LineName.GAJ_32, NodeName.PILCZYCE, 3, false));
        wezly39.add(new MpkNode(LineName.GAJ_32, NodeName.JPII, 16, false));
        wezly39.add(new MpkNode(LineName.GAJ_32, NodeName.ORLAT, 18, false));
        wezly39.add(new MpkNode(LineName.GAJ_32, NodeName.LEGIONOW, 20, false));
        wezly39.add(new MpkNode(LineName.GAJ_32, NodeName.ARKADY, 22, false));
        wezly39.add(new MpkNode(LineName.GAJ_32, NodeName.AUTOBUSOWY, 25, false));
        wezly39.add(new MpkNode(LineName.GAJ_32, NodeName.GAJ, 36, false));
        return generateLineVariant((wezly39));
    }


    public List<LineVariant> getKozanow32() {
        List<MpkNode> wezly40 = new ArrayList<>();
        wezly40.add(new MpkNode(LineName.KOZANOW_32, NodeName.GAJ, 0, true));
        wezly40.add(new MpkNode(LineName.KOZANOW_32, NodeName.AUTOBUSOWY, 11, false));
        wezly40.add(new MpkNode(LineName.KOZANOW_32, NodeName.GLOWNY, 12, false));
        wezly40.add(new MpkNode(LineName.KOZANOW_32, NodeName.ARKADY, 14, false));
        wezly40.add(new MpkNode(LineName.KOZANOW_32, NodeName.LEGIONOW, 16, false));
        wezly40.add(new MpkNode(LineName.KOZANOW_32, NodeName.ORLAT, 18, false));
        wezly40.add(new MpkNode(LineName.KOZANOW_32, NodeName.JPII, 20, false));
        wezly40.add(new MpkNode(LineName.KOZANOW_32, NodeName.PILCZYCE, 34, false));
        wezly40.add(new MpkNode(LineName.KOZANOW_32, NodeName.KOZANOW, 37, false));
        return generateLineVariant((wezly40));
    }


    public List<LineVariant> getPilczyce33() {
        List<MpkNode> wezly41 = new ArrayList<>();
        wezly41.add(new MpkNode(LineName.PILCZYCE_33, NodeName.SEPOLNO, 0, true));
        wezly41.add(new MpkNode(LineName.PILCZYCE_33, NodeName.OLIMPIJSKI, 3, false));
        wezly41.add(new MpkNode(LineName.PILCZYCE_33, NodeName.GRUNWALDZKI, 11, false));
        wezly41.add(new MpkNode(LineName.PILCZYCE_33, NodeName.DOMINIKANSKA, 16, false));
        wezly41.add(new MpkNode(LineName.PILCZYCE_33, NodeName.JPII, 23, false));
        wezly41.add(new MpkNode(LineName.PILCZYCE_33, NodeName.PILCZYCE, 39, false));
        return generateLineVariant((wezly41));
    }


    public List<LineVariant> getSepolno33() {
        List<MpkNode> wezly42 = new ArrayList<>();
        wezly42.add(new MpkNode(LineName.SEPOLNO_33, NodeName.PILCZYCE, 0, true));
        wezly42.add(new MpkNode(LineName.SEPOLNO_33, NodeName.JPII, 15, false));
        wezly42.add(new MpkNode(LineName.SEPOLNO_33, NodeName.DOMINIKANSKA, 22, false));
        wezly42.add(new MpkNode(LineName.SEPOLNO_33, NodeName.GRUNWALDZKI, 28, false));
        wezly42.add(new MpkNode(LineName.SEPOLNO_33, NodeName.OLIMPIJSKI, 35, false));
        wezly42.add(new MpkNode(LineName.SEPOLNO_33, NodeName.SEPOLNO, 38, false));
        return generateLineVariant((wezly42));
    }


    // metoda tworząca listę wariantów dla linii
    private List<LineVariant> generateLineVariant(List<MpkNode> initialNodes) {
        List<LineVariant> variants = new ArrayList<>();
        for (int i = 0; i < Period.TAKT; i++) {
            List<MpkNode> currentNodes = new ArrayList<>();
            for (MpkNode node : initialNodes) {
                MpkNode newNode = new MpkNode(node.lineName, node.nodeName, (node.time + i) % Period.TAKT, node.isFirstStop);
                currentNodes.add(newNode);
            }

            LineVariant variant = new LineVariant(currentNodes);

            variants.add(variant);
        }
        return variants;
    }

}
