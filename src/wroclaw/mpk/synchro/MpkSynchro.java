package wroclaw.mpk.synchro;

import wroclaw.mpk.synchro.mixer.TrzyLinieJednaOdchylka;

import java.io.*;
import java.util.*;

public class MpkSynchro {

    public static void main(String[] args) throws IOException {

        long millisActualTime = System.currentTimeMillis();

        // tworzenie wariantów linii

        LineVariantFactory lineVariantFactory = new LineVariantFactory();

        List<LineVariant> poswietne1 = lineVariantFactory.getPoswietne1();
        List<LineVariant> biskupin1 = lineVariantFactory.getBiskupin1();
        List<LineVariant> krzyki2 = lineVariantFactory.getKrzyki2();
        List<LineVariant> biskupin2 = lineVariantFactory.getBiskupin2();
        List<LineVariant> poswietne1 = lineVariantFactory.getPoswietne1();
        List<LineVariant> poswietne1 = lineVariantFactory.getPoswietne1();
        List<LineVariant> poswietne1 = lineVariantFactory.getPoswietne1();
        List<LineVariant> poswietne1 = lineVariantFactory.getPoswietne1();
        List<LineVariant> poswietne1 = lineVariantFactory.getPoswietne1();
        List<LineVariant> poswietne1 = lineVariantFactory.getPoswietne1();
        List<LineVariant> poswietne1 = lineVariantFactory.getPoswietne1();
        List<LineVariant> poswietne1 = lineVariantFactory.getPoswietne1();
        List<LineVariant> poswietne1 = lineVariantFactory.getPoswietne1();
        List<LineVariant> poswietne1 = lineVariantFactory.getPoswietne1();
        List<LineVariant> poswietne1 = lineVariantFactory.getPoswietne1();
        List<LineVariant> poswietne1 = lineVariantFactory.getPoswietne1();
        List<LineVariant> poswietne1 = lineVariantFactory.getPoswietne1();
        List<LineVariant> poswietne1 = lineVariantFactory.getPoswietne1();
        List<LineVariant> poswietne1 = lineVariantFactory.getPoswietne1();
        List<LineVariant> poswietne1 = lineVariantFactory.getPoswietne1();
        List<LineVariant> poswietne1 = lineVariantFactory.getPoswietne1();


        int counter = 1;
        final String FILE_PATH_QUANTITY_OF_COMBINATION = "D:/quantity_of_combination.csv";


        // dostępne lineVarianty

        List<LineVariant> availableLineVariants = new ArrayList<>();


        availableLineVariants.addAll(poswietne1);
        availableLineVariants.addAll(biskupin1);
        availableLineVariants.addAll(krzyki2);
        availableLineVariants.addAll(biskupin2);
        availableLineVariants.addAll(lesnica3);
        availableLineVariants.addAll(ksieze3);
        availableLineVariants.addAll(biskupin4);
        availableLineVariants.addAll(oporow4);
        availableLineVariants.addAll(ksieze5);
        availableLineVariants.addAll(oporow5);
        availableLineVariants.addAll(kowale6);
        availableLineVariants.addAll(krzyki6);
        availableLineVariants.addAll(klecina7);
        availableLineVariants.addAll(poswietne7);
        availableLineVariants.addAll(tarnogaj8);
        availableLineVariants.addAll(karlowice8);
        availableLineVariants.addAll(park9);
        availableLineVariants.addAll(sepolno9);
        availableLineVariants.addAll(nadodrze0l);
        availableLineVariants.addAll(nadodrze0p);
        availableLineVariants.addAll(lesnica10);
        availableLineVariants.addAll(biskupin10);
        availableLineVariants.addAll(kromera11);
        availableLineVariants.addAll(grabiszynska_cm11);
        availableLineVariants.addAll(fat14);
        availableLineVariants.addAll(osobowice14);
        availableLineVariants.addAll(park15);
        availableLineVariants.addAll(poswietne15);
        availableLineVariants.addAll(klecina17);
        availableLineVariants.addAll(sepolno17);
        availableLineVariants.addAll(lesnica20);
        availableLineVariants.addAll(oporow20);
        availableLineVariants.addAll(wpp23);
        availableLineVariants.addAll(kromera23);
        availableLineVariants.addAll(fat24);
        availableLineVariants.addAll(osobowice24);
        availableLineVariants.addAll(gaj31);
        availableLineVariants.addAll(st_wroclaw31);
        availableLineVariants.addAll(gaj32);
        availableLineVariants.addAll(kozanow32);
        availableLineVariants.addAll(pilczyce33);
        availableLineVariants.addAll(sepolno33);


        ///////////odjazdy z Biskupina 1, 2, 4, 10

        System.out.println("warunek 1");

        List<LineVariant> step = czteryLinieJednaOdchylkaWymuszona(mix4ListLineVariant(poswietne1, krzyki2, oporow4, lesnica10), NodeName.BISKUPIN);
        List<LineVariant> mix = nonexclusiveLineVariant(step);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        /////////////odjazdy z Biskupina 2, 10

        System.out.println("warunek 2");

        step = dwieLinieBezOdchylek(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, krzyki2), useOnlyAvaliableLineVariants(availableLineVariants, lesnica10)), NodeName.BISKUPIN);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        /////////////narzucenie odjazdu 10 z Biskupina

        System.out.println("warunek 3");

        step = narzucenieStartu(lesnica10, NodeName.BISKUPIN, 10);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Galerii Dominikańskiej w strone Dworca i Rynku 2, 4, 10

        System.out.println("warunek 4");

        mix = trzyLinieMinOdstepIstniejaceLineVarianty(mix, LineName.KRZYKI_2, LineName.OPOROW_4, LineName.LESNICA_10, NodeName.DOMINIKANSKA, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);
   

        ///////////przyjazdy do Leśnicy 3, 10, 20

        System.out.println("warunek 5");

        step = trzyLinieJednaOdchylkaWymuszona(mix3ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, lesnica3), useOnlyAvaliableLineVariants(availableLineVariants, lesnica10), useOnlyAvaliableLineVariants(availableLineVariants, lesnica20)), NodeName.PILCZYCE);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Galerii Dominikańskiej w strone Dworca i Rynku 2, 3, 4, 10

        System.out.println("warunek 6");

        mix = czteryLinieMinOdstepIstniejaceLineVarianty(mix, LineName.KRZYKI_2, LineName.LESNICA_3, LineName.OPOROW_4, LineName.LESNICA_10, NodeName.DOMINIKANSKA, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        /////////////Odjazdy z Księża 3, 5

        System.out.println("warunek 7");

        step = dwieLinieBezOdchylek(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, lesnica3), useOnlyAvaliableLineVariants(availableLineVariants, oporow5)), NodeName.KSIEZE);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Galerii Dominikańskiej w strone Dworca i Rynku 2, 3, 4, 5, 10

        System.out.println("warunek 8");

        mix = piecLiniiMinOdstepIstniejaceLineVarianty(mix, LineName.KRZYKI_2, LineName.LESNICA_3, LineName.OPOROW_4, LineName.OPOROW_5, LineName.LESNICA_10, NodeName.DOMINIKANSKA, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        /////////////przyjazdy do Oporowa 4, 5

        System.out.println("warunek 9");

        mix = dwieLinieMinOdstepIstniejaceLineVarianty(mix, LineName.OPOROW_4, LineName.OPOROW_5, NodeName.OPOROW, 4);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////Grabiszyńska w stronę Oporowa 4, 5, 11, 24

        System.out.println("warunek 10");

        step = czteryLinieBezOdchylek(mix4ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, oporow4), useOnlyAvaliableLineVariants(availableLineVariants, oporow5), useOnlyAvaliableLineVariants(availableLineVariants, grabiszynska_cm11), useOnlyAvaliableLineVariants(availableLineVariants, fat24)), NodeName.LEGIONOW);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        /////////////Grabiszyńska w stronę Oporowa 5 i 11

        System.out.println("warunek 11");

        step = dwieLinieBezOdchylek(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, oporow5), useOnlyAvaliableLineVariants(availableLineVariants, grabiszynska_cm11)), NodeName.LEGIONOW);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Galerii Dominikańskiej w kierunku płd (Skargi, Kołłątaja) 2, 5, 11

        System.out.println("warunek 12");

        mix = trzyLinieMinOdstepIstniejaceLineVarianty(mix, LineName.KRZYKI_2, LineName.OPOROW_5, LineName.GRABISZYNSKA_CM_11, NodeName.DOMINIKANSKA, 2);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        /////////////FAT 24

        System.out.println("warunek 13");

        step = dwieLinieMaxOdstepKolejnosc(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, fat24), useOnlyAvaliableLineVariants(availableLineVariants, osobowice24)), LineName.FAT_24, LineName.OSOBOWICE_24, NodeName.FAT, 4);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        /////////////FAT 24

        System.out.println("warunek 14");

        step = dwieLinieMinOdstepKolejnosc(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, fat24), useOnlyAvaliableLineVariants(availableLineVariants, osobowice24)), LineName.FAT_24, LineName.OSOBOWICE_24, NodeName.FAT, 1);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////odjazdy z Osobowic 14 i 24

        System.out.println("warunek 15");

        step = dwieLinieBezOdchylek(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, fat14), useOnlyAvaliableLineVariants(availableLineVariants, fat24)), NodeName.OSOBOWICE);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Powstańców w kierunku płd. od Arkad do Hallera 2, 14

        System.out.println("warunek 16");

        mix = dwieLinieMinOdstepIstniejaceLineVarianty(mix, LineName.KRZYKI_2, LineName.FAT_14, NodeName.ARKADY, 2);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        /////////////przyjazdy do Osobowic 14 i 24

        System.out.println("warunek 17");

        step = dwieLinieBezOdchylek(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, osobowice14), useOnlyAvaliableLineVariants(availableLineVariants, osobowice24)), NodeName.OSOBOWICE);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////FAT 14

        System.out.println("warunek 18");

        step = dwieLinieMaxOdstepKolejnosc(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, fat14), useOnlyAvaliableLineVariants(availableLineVariants, osobowice14)), LineName.FAT_14, LineName.OSOBOWICE_14, NodeName.FAT, 4);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////FAT 14

        System.out.println("warunek 19");

        step = dwieLinieMinOdstepKolejnosc(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, fat14), useOnlyAvaliableLineVariants(availableLineVariants, osobowice14)), LineName.FAT_14, LineName.OSOBOWICE_14, NodeName.FAT, 1);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        /////////////20, 24 Hallera w stronę Powstańców 20 i 24

        System.out.println("warunek 20");

        step = dwieLinieJednaOdchylkaWymuszona(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, lesnica20), useOnlyAvaliableLineVariants(availableLineVariants, osobowice24)), NodeName.FAT);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// przyjazd do Poświętnego 1, 7

        System.out.println("warunek 21");

        step = dwieLinieDwieOdchylkiWymuszone(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, poswietne1), useOnlyAvaliableLineVariants(availableLineVariants, poswietne7)), NodeName.POSWIETNE);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Powstańców w kierunku pn. od Hallera do Arkad 7, 20, 24

        System.out.println("warunek 22");

        mix = trzyLinieMinOdstepIstniejaceLineVarianty(mix, LineName.POSWIETNE_7, LineName.LESNICA_20, LineName.OSOBOWICE_24, NodeName.ARKADY, 2);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Powstańców w kierunku pn. od Hallera do Arkad 6, 7

        System.out.println("warunek 23");

        step = dwieLinieBezOdchylek(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, kowale6), useOnlyAvaliableLineVariants(availableLineVariants, poswietne7)), NodeName.ARKADY);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Powstańców w kierunku pn. od Hallera do Arkad 6, 7, 20, 24

        System.out.println("warunek 24");

        mix = czteryLinieMinOdstepIstniejaceLineVarianty(mix, LineName.KOWALE_6, LineName.POSWIETNE_7, LineName.LESNICA_20, LineName.OSOBOWICE_24, NodeName.ARKADY, 2);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        /////////// przyjazdy do Poświętnego 1, 15

        System.out.println("warunek 25");

        step = dwieLinieMinOdstep(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, poswietne1), useOnlyAvaliableLineVariants(availableLineVariants, poswietne15)), NodeName.POSWIETNE, 4);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// przyjazdy do Poświętnego 1, 7, 15

        System.out.println("warunek 26");

        mix = trzyLinieMinOdstepIstniejaceLineVarianty(mix, LineName.POSWIETNE_1, LineName.POSWIETNE_7, LineName.POSWIETNE_15, NodeName.POSWIETNE, 4);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Staszica w kierunku pn. 14, 15, 24

        System.out.println("warunek 27");

        mix = trzyLinieMinOdstepIstniejaceLineVarianty(mix, LineName.OSOBOWICE_14, LineName.POSWIETNE_15, LineName.OSOBOWICE_24, NodeName.STASZICA, 2);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Piłsudkiego od Dworca w kierunku pl. Legionów 5, 11, 15

        System.out.println("warunek 28");

        mix = trzyLinieMinOdstepIstniejaceLineVarianty(mix, LineName.OPOROW_5, LineName.GRABISZYNSKA_CM_11, LineName.POSWIETNE_15, NodeName.ARKADY, 2);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// odjazdy z Parku 9, 15

        System.out.println("warunek 29");

        step = dwieLinieBezOdchylek(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, sepolno9), useOnlyAvaliableLineVariants(availableLineVariants, poswietne15)), NodeName.PARK);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// przyjazdy na Sępolno 9, 17

        System.out.println("warunek 30");

        step = dwieLinieBezOdchylek(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, sepolno9), useOnlyAvaliableLineVariants(availableLineVariants, sepolno17)), NodeName.SEPOLNO);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Powstańców w kierunku pn. od Hallera do Arkad 6, 7, 17, 20, 24

        System.out.println("warunek 31");

        mix = piecLiniiMinOdstepIstniejaceLineVarianty(mix, LineName.KOWALE_6, LineName.POSWIETNE_7, LineName.SEPOLNO_17, LineName.LESNICA_20, LineName.OSOBOWICE_24, NodeName.ARKADY, 2);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Powstańców w kierunku pn. od Hallera do Arkad 2, 7

        System.out.println("warunek 32");

        step = dwieLinieMinOdstep(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, biskupin2), useOnlyAvaliableLineVariants(availableLineVariants, poswietne7)), NodeName.KRZYKI, 2);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Powstańców w kierunku pn. od Hallera do Arkad 2, 6, 7, 17, 20, 24

        System.out.println("warunek 33");

        mix = szescLiniiMinOdstepIstniejaceLineVarianty(mix, LineName.BISKUPIN_2, LineName.KOWALE_6, LineName.POSWIETNE_7, LineName.SEPOLNO_17, LineName.LESNICA_20, LineName.OSOBOWICE_24, NodeName.ARKADY, 2);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Powstańców w kierunku pn. od Hallera do Arkad 2, 6, 7, 17, 20, 24

        System.out.println("warunek 34");

        mix = szescLiniiMaxOdstepIstniejaceLineVarianty(mix, LineName.BISKUPIN_2, LineName.KOWALE_6, LineName.POSWIETNE_7, LineName.SEPOLNO_17, LineName.LESNICA_20, LineName.OSOBOWICE_24, NodeName.ARKADY, 4);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Dworca w stronę Galerii Dominikańskiej 2, 9

        System.out.println("warunek 35");

        mix = dwieLinieMinOdstepIstniejaceLineVarianty(mix, LineName.BISKUPIN_2, LineName.SEPOLNO_9, NodeName.GLOWNY, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Legnicka od JPII w stronę Pilczyc 10, 31

        System.out.println("warunek 36");

        step = dwieLinieMinOdstep(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, lesnica10), useOnlyAvaliableLineVariants(availableLineVariants, st_wroclaw31)), NodeName.JPII, 2);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Legnicka od JPII w stronę Pilczyc 3, 10, 20, 31

        System.out.println("warunek 37");

        mix = czteryLinieMinOdstepIstniejaceLineVarianty(mix, LineName.LESNICA_3, LineName.LESNICA_10, LineName.LESNICA_20, LineName.ST_WROCLAW_31, NodeName.JPII, 2);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// od Legionów do JPII 14, 31

        System.out.println("warunek 38");

        mix = dwieLinieMinOdstepIstniejaceLineVarianty(mix, LineName.OSOBOWICE_14, LineName.ST_WROCLAW_31, NodeName.LEGIONOW, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Piłsudskiego od Arkad do Legionów 5, 11, 15, 31

        System.out.println("warunek 39");

        mix = czteryLinieMinOdstepIstniejaceLineVarianty(mix, LineName.OPOROW_5, LineName.GRABISZYNSKA_CM_11, LineName.POSWIETNE_15, LineName.ST_WROCLAW_31, NodeName.ARKADY, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Legnicka od JPII w stronę Pilczyc 10, 32

        System.out.println("warunek 40");

        step = dwieLinieMinOdstep(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, lesnica10), useOnlyAvaliableLineVariants(availableLineVariants, kozanow32)), NodeName.JPII, 2);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// odjazdy z Gaju 31, 32

        System.out.println("warunek 41");

        step = dwieLinieBezOdchylek(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, st_wroclaw31), useOnlyAvaliableLineVariants(availableLineVariants, kozanow32)), NodeName.GAJ);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Legnicka od JPII w stronę Pilczyc 3, 10, 20, 31, 32

        System.out.println("warunek 42");

        mix = piecLiniiMinOdstepIstniejaceLineVarianty(mix, LineName.LESNICA_3, LineName.LESNICA_10, LineName.LESNICA_20, LineName.ST_WROCLAW_31, LineName.KOZANOW_32, NodeName.JPII, 2);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// od Legionów do JPII 14, 31, 32

        System.out.println("warunek 43");

        mix = trzyLinieMinOdstepIstniejaceLineVarianty(mix, LineName.OSOBOWICE_14, LineName.ST_WROCLAW_31, LineName.KOZANOW_32, NodeName.LEGIONOW, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Piłsudskiego od Arkad do Legionów 5, 11, 15, 31, 32

        System.out.println("warunek 44");

        mix = piecLiniiMinOdstepIstniejaceLineVarianty(mix, LineName.OPOROW_5, LineName.GRABISZYNSKA_CM_11, LineName.POSWIETNE_15, LineName.ST_WROCLAW_31, LineName.KOZANOW_32, NodeName.ARKADY, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Grabiszyńska od FATu do Legionów 11, 14

        System.out.println("warunek 45");

        step = dwieLinieMinOdstep(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, kromera11), useOnlyAvaliableLineVariants(availableLineVariants, osobowice14)), NodeName.LEGIONOW, 4);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Dworca w stronę Galerii Dominikańskiej 2, 9, 11

        System.out.println("warunek 46");

        mix = trzyLinieMinOdstepIstniejaceLineVarianty(mix, LineName.BISKUPIN_2, LineName.SEPOLNO_9, LineName.KROMERA_11, NodeName.GLOWNY, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Galerii Dominikańskiej do Bema 9, 11, 17

        System.out.println("warunek 47");

        mix = trzyLinieMinOdstepIstniejaceLineVarianty(mix, LineName.SEPOLNO_9, LineName.KROMERA_11, LineName.SEPOLNO_17, NodeName.DOMINIKANSKA, 3);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// przyjazdy na Kromera 6, 11

        System.out.println("warunek 48");

        mix = dwieLinieMinOdstepIstniejaceLineVarianty(mix, LineName.KOWALE_6, LineName.KROMERA_11, NodeName.KROMERA, 5);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Grabiszyńska od FATu do Legionów 4, 14

        System.out.println("warunek 49");

        step = dwieLinieMinOdstep(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, biskupin4), useOnlyAvaliableLineVariants(availableLineVariants, osobowice14)), NodeName.LEGIONOW, 4);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// odjazdy z Oporowa 4, 20

        System.out.println("warunek 50");

        mix = dwieLinieMinOdstepIstniejaceLineVarianty(mix, LineName.BISKUPIN_4, LineName.LESNICA_20, NodeName.OPOROW, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// przyjazdy na Biskupin 2, 4

        System.out.println("warunek 51");

        mix = dwieLinieMinOdstepIstniejaceLineVarianty(mix, LineName.BISKUPIN_2, LineName.BISKUPIN_4, NodeName.BISKUPIN, 3);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Grabiszyńska od FATu do Legionów 5, 14

        System.out.println("warunek 52");

        step = dwieLinieMinOdstep(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, ksieze5), useOnlyAvaliableLineVariants(availableLineVariants, osobowice14)), NodeName.LEGIONOW, 4);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Grabiszyńska od FATu do Legionów 5, 11

        System.out.println("warunek 53");

        step = dwieLinieBezOdchylek(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, ksieze5), useOnlyAvaliableLineVariants(availableLineVariants, kromera11)), NodeName.LEGIONOW);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Dworca w stronę Galerii Dominikańskiej 2, 5, 9, 11

        System.out.println("warunek 54");

        mix = czteryLinieMinOdstepIstniejaceLineVarianty(mix, LineName.BISKUPIN_2, LineName.KSIEZE_5, LineName.SEPOLNO_9, LineName.KROMERA_11, NodeName.GLOWNY, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Galerii Dominikańskiej w strone zach. 2, 4, 5

        System.out.println("warunek 55");

        mix = trzyLinieMinOdstepIstniejaceLineVarianty(mix, LineName.BISKUPIN_2, LineName.BISKUPIN_4, LineName.KSIEZE_5, NodeName.DOMINIKANSKA, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////Grabiszyńska w stronę pl. Legionów 4, 5, 11, 14

        System.out.println("warunek 56");

        step = czteryLinieJednaOdchylkaWymuszona(mix4ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, biskupin4), useOnlyAvaliableLineVariants(availableLineVariants, ksieze5), useOnlyAvaliableLineVariants(availableLineVariants, kromera11), useOnlyAvaliableLineVariants(availableLineVariants, osobowice14)), NodeName.LEGIONOW);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// odjazdy z Oporowa 4, 5, 20

        System.out.println("warunek 57");

        mix = trzyLinieMinOdstepIstniejaceLineVarianty(mix, LineName.BISKUPIN_4, LineName.KSIEZE_5, LineName.LESNICA_20, NodeName.OPOROW, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// przyjazdy na Sępolno 9, 33

        System.out.println("warunek 58");

        step = dwieLinieMinOdstep(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, sepolno9), useOnlyAvaliableLineVariants(availableLineVariants, sepolno33)), NodeName.SEPOLNO, 4);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// przyjazdy na Sępolno 9, 17, 33

        System.out.println("warunek 59");

        mix = trzyLinieMinOdstepIstniejaceLineVarianty(mix, LineName.SEPOLNO_9, LineName.SEPOLNO_17, LineName.SEPOLNO_33, NodeName.SEPOLNO, 4);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Galerii Dominikańskiej w strone zach. 2, 4, 5, 33

        System.out.println("warunek 60");

        mix = czteryLinieMinOdstepIstniejaceLineVarianty(mix, LineName.BISKUPIN_2, LineName.BISKUPIN_4, LineName.KSIEZE_5, LineName.SEPOLNO_33, NodeName.DOMINIKANSKA, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// przyjazdy na Księże 3, 5

        System.out.println("warunek 61");

        step = dwieLinieBezOdchylek(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, ksieze3), useOnlyAvaliableLineVariants(availableLineVariants, ksieze5)), NodeName.KSIEZE);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Galerii Dominikańskiej w strone zach. 2, 3, 4, 5, 33

        System.out.println("warunek 62");

        mix = piecLiniiMinOdstepIstniejaceLineVarianty(mix, LineName.BISKUPIN_2, LineName.KSIEZE_3, LineName.BISKUPIN_4, LineName.KSIEZE_5, LineName.SEPOLNO_33, NodeName.DOMINIKANSKA, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// odjazdy z Leśnicy 3, 10

        System.out.println("warunek 63");

        step = dwieLinieMinOdstep(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, ksieze3), useOnlyAvaliableLineVariants(availableLineVariants, biskupin10)), NodeName.LESNICA, 6);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Galerii Dominikańskiej w strone zach. 2, 3, 4, 5, 10, 33

        System.out.println("warunek 64");

        mix = szescLiniiMinOdstepIstniejaceLineVarianty(mix, LineName.BISKUPIN_2, LineName.KSIEZE_3, LineName.BISKUPIN_4, LineName.KSIEZE_5, LineName.BISKUPIN_10, LineName.SEPOLNO_33, NodeName.DOMINIKANSKA, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// przyjazdy na Biskupin 2, 4, 10

        System.out.println("warunek 65");

        mix = trzyLinieMinOdstepIstniejaceLineVarianty(mix, LineName.BISKUPIN_2, LineName.BISKUPIN_4, LineName.BISKUPIN_10, NodeName.BISKUPIN, 3);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// odjazdy z Leśnicy 3, 20

        System.out.println("warunek 66");

        step = dwieLinieMinOdstep(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, ksieze3), useOnlyAvaliableLineVariants(availableLineVariants, oporow20)), NodeName.LESNICA, 6);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// odjazdy z Leśnicy 3, 10, 20

        System.out.println("warunek 67");

        step = trzyLinieBezOdchylek(mix3ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, ksieze3), useOnlyAvaliableLineVariants(availableLineVariants, biskupin10), useOnlyAvaliableLineVariants(availableLineVariants, oporow20)), NodeName.LESNICA);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Legnicka od Pilczyc w stornę JPII 3, 10, 20, 33

        System.out.println("warunek 68");

        mix = czteryLinieMinOdstepIstniejaceLineVarianty(mix, LineName.KSIEZE_3, LineName.BISKUPIN_10, LineName.OPOROW_20, LineName.SEPOLNO_33, NodeName.JPII, 2);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Powstańców od Arkad do Hallera 2, 14, 20

        System.out.println("warunek 69");

        mix = trzyLinieMinOdstepIstniejaceLineVarianty(mix, LineName.KRZYKI_2, LineName.FAT_14, LineName.OPOROW_20, NodeName.ARKADY, 2);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Hallera od Powstańców do FATu 14, 20

        System.out.println("warunek 70");

        step = dwieLinieDwieOdchylkiWymuszone(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, fat14), useOnlyAvaliableLineVariants(availableLineVariants, oporow20)), NodeName.FAT);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// przyjazdy na Oporów

        System.out.println("warunek 71");

        mix = trzyLinieMinOdstepIstniejaceLineVarianty(mix, LineName.OPOROW_4, LineName.OPOROW_5, LineName.OPOROW_20, NodeName.OPOROW, 2);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Legnicka od Pilczyc do JPII 3, 31

        System.out.println("warunek 72");

        step = dwieLinieMinOdstep(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, ksieze3), useOnlyAvaliableLineVariants(availableLineVariants, gaj31)), NodeName.JPII, 2);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Legnicka od Pilczyc do JPII 3, 10, 20, 31, 33

        System.out.println("warunek 73");

        mix = piecLiniiMinOdstepIstniejaceLineVarianty(mix, LineName.KSIEZE_3, LineName.BISKUPIN_10, LineName.OPOROW_20, LineName.GAJ_31, LineName.SEPOLNO_33, NodeName.JPII, 2);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// od JPII do pl. Legionów 24, 31

        System.out.println("warunek 74");

        mix = dwieLinieMinOdstepIstniejaceLineVarianty(mix, LineName.FAT_24, LineName.GAJ_31, NodeName.JPII, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Piłsudskiego od pl. Legionów do Dworca 5, 11, 31

        System.out.println("warunek 75");

        mix = trzyLinieMinOdstepIstniejaceLineVarianty(mix, LineName.KSIEZE_5, LineName.KROMERA_11, LineName.GAJ_31, NodeName.ARKADY, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Legnicka od Pilczyc do JPII 3, 32

        System.out.println("warunek 76");

        step = dwieLinieMinOdstep(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, ksieze3), useOnlyAvaliableLineVariants(availableLineVariants, gaj32)), NodeName.JPII, 2);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// przyjazdy do Gaju 31, 32

        System.out.println("warunek 77");

        step = dwieLinieBezOdchylek(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, gaj31), useOnlyAvaliableLineVariants(availableLineVariants, gaj32)), NodeName.GAJ);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Legnicka od Pilczyc do JPII 3, 10, 20, 31, 32, 33

        System.out.println("warunek 78");

        mix = szescLiniiMinOdstepIstniejaceLineVarianty(mix, LineName.KSIEZE_3, LineName.BISKUPIN_10, LineName.OPOROW_20, LineName.GAJ_31, LineName.GAJ_32, LineName.SEPOLNO_33, NodeName.JPII, 2);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// od JPII do pl. Legionów 24, 31, 32

        System.out.println("warunek 79");

        mix = trzyLinieMinOdstepIstniejaceLineVarianty(mix, LineName.FAT_24, LineName.GAJ_31, LineName.GAJ_32, NodeName.JPII, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Piłsudskiego od pl. Legionów do Dworca 5, 11, 31, 32

        System.out.println("warunek 80");

        mix = czteryLinieMinOdstepIstniejaceLineVarianty(mix, LineName.KSIEZE_5, LineName.KROMERA_11, LineName.GAJ_31, LineName.GAJ_32, NodeName.ARKADY, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// odjazdy z Kromera 6, 11

        System.out.println("warunek 81");

        step = dwieLinieMinOdstep(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, krzyki6), useOnlyAvaliableLineVariants(availableLineVariants, grabiszynska_cm11)), NodeName.KROMERA, 5);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Powstańców od Arkad do Hallera 2, 6, 14, 20

        System.out.println("warunek 82");

        mix = czteryLinieMinOdstepIstniejaceLineVarianty(mix, LineName.KRZYKI_2, LineName.KRZYKI_6, LineName.FAT_14, LineName.OPOROW_20, NodeName.ARKADY, 2);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Powstańców w kierunku od Arkad do Hallera 6, 7

        System.out.println("warunek 83");

        step = dwieLinieJednaOdchylkaWymuszona(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, krzyki6), useOnlyAvaliableLineVariants(availableLineVariants, klecina7)), NodeName.ARKADY);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Powstańców od Arkad do Hallera 2, 6, 7, 14, 20

        System.out.println("warunek 84");

        mix = piecLiniiMinOdstepIstniejaceLineVarianty(mix, LineName.KRZYKI_2, LineName.KRZYKI_6, LineName.KLECINA_7, LineName.FAT_14, LineName.OPOROW_20, NodeName.ARKADY, 2);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Powstańców w kierunku od Arkad do Hallera 2, 17

        System.out.println("warunek 85");

        step = dwieLinieMinOdstep(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, krzyki2), useOnlyAvaliableLineVariants(availableLineVariants, klecina17)), NodeName.ARKADY, 2);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Powstańców od Arkad do Hallera 2, 6, 7, 14, 17, 20

        System.out.println("warunek 86");

        mix = szescLiniiMinOdstepIstniejaceLineVarianty(mix, LineName.KRZYKI_2, LineName.KRZYKI_6, LineName.KLECINA_7, LineName.FAT_14, LineName.KLECINA_17, LineName.OPOROW_20, NodeName.ARKADY, 2);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Powstańców od Arkad do Hallera 2, 6, 7, 14, 17, 20

        System.out.println("warunek 87");

        mix = szescLiniiMaxOdstepIstniejaceLineVarianty(mix, LineName.KRZYKI_2, LineName.KRZYKI_6, LineName.KLECINA_7, LineName.FAT_14, LineName.KLECINA_17, LineName.OPOROW_20, NodeName.ARKADY, 5);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Bema do Galerii Dominikańskiej 11, 17

        System.out.println("warunek 88");

        mix = dwieLinieMinOdstepIstniejaceLineVarianty(mix, LineName.GRABISZYNSKA_CM_11, LineName.KLECINA_17, NodeName.DOMINIKANSKA, 2);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// odjazdy z Sępolna 9, 17

        System.out.println("warunek 89");

        step = dwieLinieDwieOdchylkiWymuszone(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, park9), useOnlyAvaliableLineVariants(availableLineVariants, klecina17)), NodeName.SEPOLNO);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Bema do Galerii Dominikańskiej 9, 11, 17

        System.out.println("warunek 90");

        mix = trzyLinieMinOdstepIstniejaceLineVarianty(mix, LineName.PARK_9, LineName.GRABISZYNSKA_CM_11, LineName.KLECINA_17, NodeName.DOMINIKANSKA, 2);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Galerii Dominikańskiej w kierunku płd (Skargi, Kołłątaja) 2, 5, 9, 11

        System.out.println("warunek 91");

        mix = czteryLinieMinOdstepIstniejaceLineVarianty(mix, LineName.KRZYKI_2, LineName.OPOROW_5, LineName.PARK_9, LineName.GRABISZYNSKA_CM_11, NodeName.DOMINIKANSKA, 2);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// odjazdy z Poświętnego 1, 7

        System.out.println("warunek 92");

        step = dwieLinieDwieOdchylkiWymuszone(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, biskupin1), useOnlyAvaliableLineVariants(availableLineVariants, klecina7)), NodeName.POSWIETNE);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        /////////// przyjazdy do Biskupina 1, 2, 4, 10

        System.out.println("warunek 93");

        step = czteryLinieJednaOdchylkaWymuszona(mix4ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, biskupin1), useOnlyAvaliableLineVariants(availableLineVariants, biskupin2), useOnlyAvaliableLineVariants(availableLineVariants, biskupin4), useOnlyAvaliableLineVariants(availableLineVariants, biskupin10)), NodeName.BISKUPIN);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        /////////// odjazdy z Sępolna 9, 33

        System.out.println("warunek 94");

        step = dwieLinieMinOdstep(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, park9), useOnlyAvaliableLineVariants(availableLineVariants, pilczyce33)), NodeName.SEPOLNO, 4);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Galerii Dominikańskiej w strone Dworca i Rynku 2, 3, 4, 5, 10, 33

        System.out.println("warunek 95");

        mix = szescLiniiMinOdstepIstniejaceLineVarianty(mix, LineName.KRZYKI_2, LineName.LESNICA_3, LineName.OPOROW_4, LineName.OPOROW_5, LineName.LESNICA_10, LineName.PILCZYCE_33, NodeName.DOMINIKANSKA, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Legnicka od JPII w stronę Pilczyc 3, 10, 20, 31, 32, 33

        System.out.println("warunek 96");

        mix = szescLiniiMinOdstepIstniejaceLineVarianty(mix, LineName.LESNICA_3, LineName.LESNICA_10, LineName.LESNICA_20, LineName.ST_WROCLAW_31, LineName.KOZANOW_32, LineName.PILCZYCE_33, NodeName.JPII, 2);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Legnicka od JPII w stronę Pilczyc 3, 10, 20, 31, 32, 33

        System.out.println("warunek 97");

        mix = szescLiniiMaxOdstepIstniejaceLineVarianty(mix, LineName.LESNICA_3, LineName.LESNICA_10, LineName.LESNICA_20, LineName.ST_WROCLAW_31, LineName.KOZANOW_32, LineName.PILCZYCE_33, NodeName.JPII, 4);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        /////////// przyjazdy do Parku Płd. 9, 15

        System.out.println("warunek 98");

        step = dwieLinieDwieOdchylki(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, park9), useOnlyAvaliableLineVariants(availableLineVariants, park15)), NodeName.PARK);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Piłsudskiego od pl. Legionów do Dworca 5, 11, 15, 31, 32

        System.out.println("warunek 99");

        mix = piecLiniiMinOdstepIstniejaceLineVarianty(mix, LineName.KSIEZE_5, LineName.KROMERA_11, LineName.PARK_15, LineName.GAJ_31, LineName.GAJ_32, NodeName.ARKADY, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Staszica w kierunku pd. 14, 15, 24

        System.out.println("warunek 100");

        mix = trzyLinieMinOdstepIstniejaceLineVarianty(mix, LineName.FAT_14, LineName.PARK_15, LineName.FAT_24, NodeName.STASZICA, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Staszica w kierunku pd. 14, 15

        System.out.println("warunek 101");

        mix = dwieLinieMinOdstepIstniejaceLineVarianty(mix, LineName.FAT_14, LineName.PARK_15, NodeName.STASZICA, 3);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// odjazdy z Poświętnego 1, 7, 15

        System.out.println("warunek 102");

        mix = trzyLinieMinOdstepIstniejaceLineVarianty(mix, LineName.BISKUPIN_1, LineName.KLECINA_7, LineName.PARK_15, NodeName.POSWIETNE, 4);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// odjazdy z Kromera 6, 23

        System.out.println("warunek 103");

        step = dwieLinieMinOdstep(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, krzyki6), useOnlyAvaliableLineVariants(availableLineVariants, wpp23)), NodeName.KROMERA, 5);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// odjazdy z Kromera 6, 11, 23

        System.out.println("warunek 104");

        step = trzyLinieDwieOdchylki(mix3ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, krzyki6), useOnlyAvaliableLineVariants(availableLineVariants, grabiszynska_cm11), useOnlyAvaliableLineVariants(availableLineVariants, wpp23)), NodeName.KROMERA);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);



        ///////////// Odjazdy z Bema do Galerii Dominikańskiej 9, 11, 17, 23

        System.out.println("warunek 105");

        mix = czteryLinieMinOdstepIstniejaceLineVarianty(mix, LineName.PARK_9, LineName.GRABISZYNSKA_CM_11, LineName.KLECINA_17, LineName.WPP_23, NodeName.DOMINIKANSKA, 2);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Kazimierza Wlk. w stronę zach 3, 4, 10, 23, 33

        System.out.println("warunek 106");

        mix = piecLiniiMinOdstepIstniejaceLineVarianty(mix, LineName.LESNICA_3, LineName.OPOROW_4, LineName.LESNICA_10, LineName.WPP_23, LineName.PILCZYCE_33, NodeName.DOMINIKANSKA, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Legnicka od JPII w stronę Pilczyc 3, 10, 20, 23, 31, 32, 33

        System.out.println("warunek 107");

        mix = siedemLiniiMinOdstepIstniejaceLineVarianty(mix, LineName.LESNICA_3, LineName.LESNICA_10, LineName.LESNICA_20, LineName.WPP_23, LineName.ST_WROCLAW_31, LineName.KOZANOW_32, LineName.PILCZYCE_33, NodeName.JPII, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// przyjazdy do Kromera 6, 23

        System.out.println("warunek 108");

        step = dwieLinieMinOdstep(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, kowale6), useOnlyAvaliableLineVariants(availableLineVariants, kromera23)), NodeName.KROMERA, 5);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// przyjazdy do Kromera 6, 11, 23

        System.out.println("warunek 109");

        step = TrzyLinieJednaOdchylka.execute(mix3ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, kowale6), useOnlyAvaliableLineVariants(availableLineVariants, kromera11), useOnlyAvaliableLineVariants(availableLineVariants, kromera23)), NodeName.KROMERA);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Galerii Dominikańskiej do Bema 9, 11, 17, 23

        System.out.println("warunek 110");

        mix = czteryLinieMinOdstepIstniejaceLineVarianty(mix, LineName.SEPOLNO_9, LineName.KROMERA_11, LineName.SEPOLNO_17, LineName.KROMERA_23, NodeName.DOMINIKANSKA, 3);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Kazimierza Wlk. w stronę wsch 3, 4, 10, 23, 33

        System.out.println("warunek 111");

        mix = piecLiniiMinOdstepIstniejaceLineVarianty(mix, LineName.KSIEZE_5, LineName.BISKUPIN_4, LineName.BISKUPIN_10, LineName.KROMERA_23, LineName.SEPOLNO_33, NodeName.DOMINIKANSKA, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Legnicka od Strzegosmkiego w stronę JPII 3, 10, 20, 23, 31, 32, 33

        System.out.println("warunek 112");

        mix = siedemLiniiMinOdstepIstniejaceLineVarianty(mix, LineName.KSIEZE_3, LineName.BISKUPIN_10, LineName.OPOROW_20, LineName.KROMERA_23, LineName.GAJ_31, LineName.GAJ_32, LineName.SEPOLNO_33, NodeName.JPII, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// od Tarnogaju i Gaju w stronę Dworca 8, 31

        System.out.println("warunek 113");

        step = dwieLinieMinOdstep(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, karlowice8), useOnlyAvaliableLineVariants(availableLineVariants, st_wroclaw31)), NodeName.AUTOBUSOWY, 4);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// od Tarnogaju i Gaju w stronę Dworca 8, 31, 32

        System.out.println("warunek 114");

        mix = trzyLinieMinOdstepIstniejaceLineVarianty(mix, LineName.KARLOWICE_8, LineName.ST_WROCLAW_31, LineName.KOZANOW_32, NodeName.AUTOBUSOWY, 4);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Dworca w stronę Galerii Dominikańskiej 2, 5, 8, 9, 11

        System.out.println("warunek 115");

        mix = piecLiniiMinOdstepIstniejaceLineVarianty(mix, LineName.BISKUPIN_2, LineName.KSIEZE_5, LineName.KARLOWICE_8, LineName.SEPOLNO_9, LineName.KROMERA_11, NodeName.GLOWNY, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Galerii Dominikańskiej do Bema 8, 9, 11, 17, 23

        System.out.println("warunek 116");

        mix = piecLiniiMinOdstepIstniejaceLineVarianty(mix, LineName.KARLOWICE_8, LineName.SEPOLNO_9, LineName.KROMERA_11, LineName.SEPOLNO_17, LineName.KROMERA_23, NodeName.DOMINIKANSKA, 2);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// z Bema do Nowowiejskie 6, 8, 11, 23

        System.out.println("warunek 117");

        mix = czteryLinieMinOdstepIstniejaceLineVarianty(mix, LineName.KOWALE_6, LineName.KARLOWICE_8, LineName.KROMERA_11, LineName.KROMERA_23, NodeName.BEMA, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Trzebnicka w kierunku pn. 1, 7, 8

        System.out.println("warunek 118");

        mix = trzyLinieMinOdstepIstniejaceLineVarianty(mix, LineName.POSWIETNE_1, LineName.POSWIETNE_7, LineName.KARLOWICE_8, NodeName.NADODRZE, 2);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// od Dworca do Tarnogaju i Gaju 8, 31

        System.out.println("warunek 119");

        step = dwieLinieMinOdstep(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, tarnogaj8), useOnlyAvaliableLineVariants(availableLineVariants, gaj31)), NodeName.AUTOBUSOWY, 4);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// od Dworca do Tarnogaju i Gaju 8, 31, 32

        System.out.println("warunek 120");

        mix = trzyLinieMinOdstepIstniejaceLineVarianty(mix, LineName.TARNOGAJ_8, LineName.GAJ_31, LineName.GAJ_32, NodeName.AUTOBUSOWY, 4);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Galerii Dominikańskiej w stronę Dworca 2, 5, 8, 9, 11

        System.out.println("warunek 121");

        mix = piecLiniiMinOdstepIstniejaceLineVarianty(mix, LineName.KRZYKI_2, LineName.OPOROW_5, LineName.TARNOGAJ_8, LineName.PARK_9, LineName.GRABISZYNSKA_CM_11, NodeName.GLOWNY, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Bema do Galerii Dominikańskiej 8, 9, 11, 17, 23

        System.out.println("warunek 122");

        mix = piecLiniiMinOdstepIstniejaceLineVarianty(mix, LineName.TARNOGAJ_8, LineName.PARK_9, LineName.GRABISZYNSKA_CM_11, LineName.KLECINA_17, LineName.WPP_23, NodeName.DOMINIKANSKA, 2);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// z Nowowiejskiej do Bema 6, 8, 11, 23

        System.out.println("warunek 123");

        mix = czteryLinieMinOdstepIstniejaceLineVarianty(mix, LineName.KRZYKI_6, LineName.TARNOGAJ_8, LineName.GRABISZYNSKA_CM_11, LineName.WPP_23, NodeName.BEMA, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Trzebnicka w kierunku pd. 1, 7, 8

        System.out.println("warunek 124");

        mix = trzyLinieMinOdstepIstniejaceLineVarianty(mix, LineName.BISKUPIN_1, LineName.KLECINA_7, LineName.TARNOGAJ_8, NodeName.NADODRZE, 2);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        /////////// Nowowiejska 0P i 1

        System.out.println("warunek 125");

        step = dwieLinieJednaOdchylka(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, nadodrze0p), useOnlyAvaliableLineVariants(availableLineVariants, biskupin1)), NodeName.NADODRZE);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Nadodrze 0P, 1, 8

        System.out.println("warunek 126");

        mix = trzyLinieMinOdstepIstniejaceLineVarianty(mix, LineName.NADODRZE_0P, LineName.BISKUPIN_1, LineName.TARNOGAJ_8, NodeName.NADODRZE, 3);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// pl. Grunwaldzki w stronę mostu Grunwaldzkiego 0P, 4, 33

        System.out.println("warunek 127");

        mix = trzyLinieMinOdstepIstniejaceLineVarianty(mix, LineName.NADODRZE_0P, LineName.OPOROW_4, LineName.PILCZYCE_33, NodeName.GRUNWALDZKI, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Piłsudskiego od Arkad do Legionów 0P, 5, 11, 15, 31, 32

        System.out.println("warunek 128");

        mix = szescLiniiMinOdstepIstniejaceLineVarianty(mix, LineName.NADODRZE_0P, LineName.OPOROW_5, LineName.GRABISZYNSKA_CM_11, LineName.POSWIETNE_15, LineName.ST_WROCLAW_31, LineName.KOZANOW_32, NodeName.ARKADY, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// od Legionów do JPII 0P, 14, 31, 32

        System.out.println("warunek 129");

        mix = czteryLinieMinOdstepIstniejaceLineVarianty(mix, LineName.NADODRZE_0P, LineName.OSOBOWICE_14, LineName.ST_WROCLAW_31, LineName.KOZANOW_32, NodeName.LEGIONOW, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// od Legionów do Sztaszica 0P, 14

        System.out.println("warunek 130");

        mix = dwieLinieMinOdstepIstniejaceLineVarianty(mix, LineName.NADODRZE_0P, LineName.OSOBOWICE_14, NodeName.LEGIONOW, 4);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Staszica w kierunku pn. 0P, 14, 15, 24

        System.out.println("warunek 131");

        mix = czteryLinieMinOdstepIstniejaceLineVarianty(mix, LineName.NADODRZE_0P, LineName.OSOBOWICE_14, LineName.POSWIETNE_15, LineName.OSOBOWICE_24, NodeName.STASZICA, 2);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        /////////// Nowowiejska 0L i 1

        System.out.println("warunek 132");

        step = dwieLinieDwieOdchylki(mix2ListLineVariant(useOnlyAvaliableLineVariants(availableLineVariants, nadodrze0l), useOnlyAvaliableLineVariants(availableLineVariants, poswietne1)), NodeName.NADODRZE);
        mix = mix2ListLineVariantNonEx(mix, step);
        mix = addAllNodes(mix, availableLineVariants);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Nadodrze 0L, 1, 8

        System.out.println("warunek 133");

        mix = trzyLinieMinOdstepIstniejaceLineVarianty(mix, LineName.NADODRZE_0L, LineName.POSWIETNE_1, LineName.KARLOWICE_8, NodeName.NADODRZE, 2);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// most Grunwaldzki w stronę pl. Grunwaldzkiego 0L, 4, 33

        System.out.println("warunek 134");

        mix = trzyLinieMinOdstepIstniejaceLineVarianty(mix, LineName.NADODRZE_0L, LineName.BISKUPIN_4, LineName.SEPOLNO_33, NodeName.GRUNWALDZKI, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Piłsudskiego od Legionów do Arkad 0L, 5, 11, 15, 31, 32

        System.out.println("warunek 135");

        mix = szescLiniiMinOdstepIstniejaceLineVarianty(mix, LineName.NADODRZE_0L, LineName.KSIEZE_5, LineName.KROMERA_11, LineName.PARK_15, LineName.GAJ_31, LineName.GAJ_32, NodeName.ARKADY, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// od JPII do Legionów 0L, 24, 31, 32

        System.out.println("warunek 136");

        mix = czteryLinieMinOdstepIstniejaceLineVarianty(mix, LineName.NADODRZE_0L, LineName.FAT_24, LineName.GAJ_31, LineName.GAJ_32, NodeName.LEGIONOW, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// od Staszica do Legionów 0L, 24

        System.out.println("warunek 137");

        mix = dwieLinieMinOdstepIstniejaceLineVarianty(mix, LineName.NADODRZE_0L, LineName.FAT_24, NodeName.LEGIONOW, 4);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Staszica w kierunku płd. 0L, 14, 15, 24

        System.out.println("warunek 138");

        mix = czteryLinieMinOdstepIstniejaceLineVarianty(mix, LineName.NADODRZE_0L, LineName.FAT_14, LineName.PARK_15, LineName.FAT_24, NodeName.STASZICA, 1);
        availableLineVariants = updateAvaliableLineVariants(availableLineVariants, mix);

        counter = scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);;


        //zapisywanie do pliku

        try {
            FileOutputStream strumien = new FileOutputStream("stan.syn");
            ObjectOutputStream os = new ObjectOutputStream(strumien);
            os.writeObject(mix);
            os.writeObject(availableLineVariants);
        } catch (Exception ex) {
            ex.printStackTrace();
        }


//        //odczyt z pliku
//
//        List<LineVariant> mix = null;
//        List<LineVariant> availableLineVariants = null;
//
//        try {
//            ObjectInputStream is = new ObjectInputStream(new FileInputStream("stan.syn"));
//            mix = (List<LineVariant>) is.readObject();
//            availableLineVariants = (List<LineVariant>) is.readObject();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }


        printListLineVariant(availableLineVariants);

//        printListLineVariantOnlyForTerminal(mix);
        writeFile("D:/plik_mix.csv", mix);
        writeFile("D:/plik_availableLineVariants.csv", availableLineVariants);


    }
    // koniec metody main



    // podsumowanie etapu

    static int scopeSummary (int counter, List<LineVariant> mix, long millisActualTime, String filePath) throws IOException {
        System.out.println("liczba kombinacji po zakończeniu etapu " + counter + ": " + mix.size());
        counter++;
        long executionTime = System.currentTimeMillis() - millisActualTime;
        System.out.println(executionTime / 60000 + " min.");
        System.out.println("----------------------\n");
        writeFileQuantityOfCombination(filePath, Integer.toString(mix.size()));
        return counter;
    }




    // metoda tworząca plik tekstowy z wynikiem

    static void writeFile(String filePath, List<LineVariant> listToSave)
            throws IOException {

        FileWriter fileWriter = new FileWriter(filePath);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        try {
            for (LineVariant variant : listToSave) {
                bufferedWriter.write(variant.toString());
                bufferedWriter.newLine();
            }
        } finally {
            bufferedWriter.close();
        }
    }


    // metoda tworząca plik tekstowy z liczbą kombinacji

    static void generateFileQuantityOfCombination(String filePath, String textToSave)
            throws IOException {

        FileWriter fileWriter = new FileWriter(filePath);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        try {

            bufferedWriter.write(textToSave);
            bufferedWriter.newLine();

        } finally {
            bufferedWriter.close();
        }
    }


    // metoda tworząca plik tekstowy z liczbą kombinacji

    static void writeFileQuantityOfCombination(String filePath, String textToSave)
            throws IOException {

        FileWriter fileWriter = new FileWriter(filePath, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        try {

            bufferedWriter.write(textToSave);
            bufferedWriter.newLine();

        } finally {
            bufferedWriter.close();
        }
    }


    //metoda tworząca listę lineVariantów zawierających tylko dostępne lineVarianty

    static List<LineVariant> useOnlyAvaliableLineVariants(List<LineVariant> avaliableListLineVariants, List<LineVariant> currentListLineVariants) {

        for (int i = 0; i < currentListLineVariants.size(); i++) {
            if (isTheSameMpkNode(currentListLineVariants.get(i).nodes.get(0), avaliableListLineVariants)) {

            } else {
                currentListLineVariants.remove(i);
                i--;
            }
        }

        return currentListLineVariants;
    }


    //metoda usuwająca z  listy lineVariantów węzły poza pierwszym

    static List<LineVariant> leaveOnlyFirstNodesInListLineVariant(List<LineVariant> longListLineVariants) {


        List<LineVariant> shortListLineVariants = new ArrayList<>();


        for (int j = 0; j < longListLineVariants.size(); j++) {
            LineVariant currentLineVariant = longListLineVariants.get(j);
            LineVariant shortLineVariant = new LineVariant();

            for (int i = 0; i < currentLineVariant.nodes.size(); i++) {
                if (currentLineVariant.nodes.get(i).isFirstStop == true) {
                    shortLineVariant.nodes.add(currentLineVariant.nodes.get(i));
                }
            }

            shortListLineVariants.add(shortLineVariant);
        }
        return shortListLineVariants;
    }


    // metoda dopisująca wszystkie węzły do pierwszych

    static List<LineVariant> addAllNodes(List<LineVariant> shortListLineVariants, List<LineVariant> avaliableLineVariants) {

        List<LineVariant> longListLineVariants = new ArrayList<>();


        for (int j = 0; j < shortListLineVariants.size(); j++) {

            LineVariant currentLineVariant = shortListLineVariants.get(j);
            LineVariant longLineVariant = new LineVariant();

            for (int i = 0; i < currentLineVariant.nodes.size(); i++) {

                third:
                for (int k = 0; k < avaliableLineVariants.size(); k++) {
                    if (currentLineVariant.nodes.get(i).equals(avaliableLineVariants.get(k).nodes.get(0))) {
                        longLineVariant.nodes.addAll(avaliableLineVariants.get(k).nodes);
                        break third;
                    }
                }


            }
            longListLineVariants.add(longLineVariant);
        }

        return longListLineVariants;
    }


    //metoda aktualizaująca listę dostępnych lineVariantów
    static List<LineVariant> updateAvaliableLineVariants(List<LineVariant> avaliableListLineVariants, List<LineVariant> mix) {


        for (int i = 0; i < avaliableListLineVariants.size(); i++) {
            if (isTheSameLineName(avaliableListLineVariants.get(i).nodes.get(0).lineName, mix)) {

                if (isTheSameMpkNode(avaliableListLineVariants.get(i).nodes.get(0), mix)) {

                } else {

                    avaliableListLineVariants.remove(i);
                    i--;
                }

            }

        }
        return avaliableListLineVariants;
    }


    //metoda sprawdzająca czy na liście LineVariantów występuje LineName
    static boolean isTheSameLineName(LineName lineName, List<LineVariant> mix) {

        boolean isTheSame = false;

        for (int i = 0; i < mix.size(); i++) {

            for (int j = 0; j < mix.get(i).nodes.size(); j++) {

                if (lineName == mix.get(i).nodes.get(j).lineName) {
                    isTheSame = true;
                    break;
                }
            }

        }

        return isTheSame;
    }


    //metoda sprawdzająca czy na liście LineVariantów występuje MpkNode
    static boolean isTheSameMpkNode(MpkNode mpkNode, List<LineVariant> mix) {

        boolean isTheSame = false;

        for (int i = 0; i < mix.size(); i++) {

            for (int j = 0; j < mix.get(i).nodes.size(); j++) {

                if ((mpkNode.lineName == mix.get(i).nodes.get(j).lineName) && (mpkNode.nodeName == mix.get(i).nodes.get(j).nodeName) && (mpkNode.time == mix.get(i).nodes.get(j).time) && (mpkNode.isFirstStop == mix.get(i).nodes.get(j).isFirstStop)) {
                    isTheSame = true;
                    break;
                }
            }

        }

        return isTheSame;
    }





    // metoda drukująca listę wariantów dla linii

    static void printListLineVariant(List<LineVariant> listToPrint) {
        for (int i = 0; i < listToPrint.size(); i++) {

            LineVariant currentLineVariant = listToPrint.get(i);
            currentLineVariant.printLineVariant(currentLineVariant);
            System.out.println("");
        }
        System.out.println("");
    }


    // metoda drukująca listę wariantów dla linii tylko dla odjazdów z pętli

    static void printListLineVariantOnlyForTerminal(List<LineVariant> listToPrint) {
        for (int i = 0; i < listToPrint.size(); i++) {

            LineVariant currentLineVariant = listToPrint.get(i);
            currentLineVariant.printLineVariantOnlyForTerminal(currentLineVariant);
            System.out.println("");
        }
        System.out.println("");
    }


    // metoda tworząca listę LineVariantów dla wszystkich kombinacji - dwie linie

    static List<LineVariant> mix2ListLineVariant(List<LineVariant> line1, List<LineVariant> line2) {


        List<LineVariant> mixedListLineVariant = new ArrayList<>();

        int counter = 0;

        for (int j = 0; j < line1.size(); j++) {
            LineVariant currentLineVariant1 = line1.get(j);

            for (int i = 0; i < line2.size(); i++) {
                LineVariant currentLineVariant2 = line2.get(i);

                LineVariant mixedCurrentLineVariant = new LineVariant();

                mixedCurrentLineVariant.nodes.addAll(currentLineVariant1.nodes);
                mixedCurrentLineVariant.nodes.addAll(currentLineVariant2.nodes);

                mixedCurrentLineVariant.removeDuplicates(mixedCurrentLineVariant);


                mixedListLineVariant.add(mixedCurrentLineVariant);

                counter++;

                if (counter % 100000 == 0) {
                    System.out.println("iteracja mix: " + counter);
                }
            }
        }
        return mixedListLineVariant;
    }


    // metoda tworząca listę LineVariantów dla wszystkich kombinacji z usuwaniem wykluczeń - dwie linie

    static List<LineVariant> mix2ListLineVariantNonEx(List<LineVariant> line1, List<LineVariant> line2) {


        List<LineVariant> mixedListLineVariant = new ArrayList<>();

        int counter = 0;


        line1 = leaveOnlyFirstNodesInListLineVariant(line1);
        line2 = leaveOnlyFirstNodesInListLineVariant(line2);

        for (int j = 0; j < line1.size(); j++) {
            LineVariant currentLineVariant1 = line1.get(j);

            for (int i = 0; i < line2.size(); i++) {
                LineVariant currentLineVariant2 = line2.get(i);

                LineVariant mixedCurrentLineVariant = new LineVariant();

                mixedCurrentLineVariant.nodes.addAll(currentLineVariant1.nodes);
                mixedCurrentLineVariant.nodes.addAll(currentLineVariant2.nodes);

                mixedCurrentLineVariant.removeDuplicates(mixedCurrentLineVariant);


                second:
                for (int k = 0; k < mixedCurrentLineVariant.nodes.size() - 1; k++) {
                    MpkNode currentNode1 = mixedCurrentLineVariant.nodes.get(k);

                    for (int m = k + 1; m < mixedCurrentLineVariant.nodes.size(); m++) {
                        MpkNode currentNode2 = mixedCurrentLineVariant.nodes.get(m);
                        boolean isExclusive = currentNode1.exclusiveNodes(currentNode2);

                        if (isExclusive) {
                            break second;
                        }
                        if (k == mixedCurrentLineVariant.nodes.size() - 2) {
                            mixedListLineVariant.add(mixedCurrentLineVariant);
                        }
                    }
                }


                counter++;

                if (counter % 100000 == 0) {
                    System.out.println("iteracja mix NON_EX: " + counter);
                }
            }
        }
        return mixedListLineVariant;
    }


    //metoda usuwająca duplikaty z listy LineVariantów

    static List<LineVariant> removeDuplicatesInListLineVariants(List<LineVariant> list) {

        List<LineVariant> currentListLineVariant = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            LineVariant currentLineVariant = list.get(i);
            currentLineVariant.removeDuplicates(currentLineVariant);
            currentListLineVariant.add(currentLineVariant);
        }

        return currentListLineVariant;
    }


    // metoda tworząca listę LineVariantów dla wszystkich kombinacji - trzy linie

    static List<LineVariant> mix3ListLineVariant
            (List<LineVariant> line1, List<LineVariant> line2, List<LineVariant> line3) {
        List<LineVariant> mix1 = mix2ListLineVariant(line1, line2);
        List<LineVariant> mix2 = mix2ListLineVariant(mix1, line3);

        return mix2;
    }


    // metoda tworząca listę LineVariantów dla wszystkich kombinacji - cztery linie

    static List<LineVariant> mix4ListLineVariant
            (List<LineVariant> line1, List<LineVariant> line2, List<LineVariant> line3, List<LineVariant> line4) {
        List<LineVariant> mix1 = mix3ListLineVariant(line1, line2, line3);
        List<LineVariant> mix2 = mix2ListLineVariant(mix1, line4);

        return mix2;
    }


    // metoda tworząca listę LineVariantów dla wszystkich kombinacji - pięć linii

    static List<LineVariant> mix5ListLineVariant
            (List<LineVariant> line1, List<LineVariant> line2, List<LineVariant> line3, List<LineVariant> line4, List<LineVariant> line5) {
        List<LineVariant> mix1 = mix4ListLineVariant(line1, line2, line3, line4);
        List<LineVariant> mix2 = mix2ListLineVariant(mix1, line5);

        return mix2;
    }


    //metoda łącząca listy niewykluczających się LineVariantów


    static List<LineVariant> nonexclusiveLineVariant(List<LineVariant> lines) {

        List<LineVariant> goodLineVariants = new ArrayList<>();

        for (int k = 0; k < lines.size(); k++) {

            LineVariant currentLineVariant = lines.get(k);

            second:
            for (int j = 0; j < currentLineVariant.nodes.size() - 1; j++) {
                MpkNode currentNode1 = currentLineVariant.nodes.get(j);

                for (int i = j + 1; i < currentLineVariant.nodes.size(); i++) {
                    MpkNode currentNode2 = currentLineVariant.nodes.get(i);
                    boolean isExclusive = currentNode1.exclusiveNodes(currentNode2);

                    if (isExclusive) {
                        break second;
                    }
                    if (j == currentLineVariant.nodes.size() - 2) {
                        goodLineVariants.add(lines.get(k));
                    }
                }
            }

            if (k % 10000 == 0) {
                System.out.println("iteracja nonEX: " + k);

            }
        }
        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - narzucenie startu

    static List<LineVariant> narzucenieStartu(List<LineVariant> lines, NodeName node, int time) {
        List<LineVariant> goodLineVariants = new ArrayList<>();

        for (int i = 0; i < lines.size(); i++) {
            LineVariant currentLineVariant = lines.get(i);
            List<MpkNode> foundnodes = currentLineVariant.findFirstNodes(node);

            if (foundnodes.get(0).time == time) {
                goodLineVariants.add(currentLineVariant);
            }
        }
        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - dwie linie bez odchyłek

    static List<LineVariant> dwieLinieBezOdchylek(List<LineVariant> lines, NodeName node) {

        List<LineVariant> goodLineVariants = new ArrayList<>();

        switch (Period.TAKT) {

            case 12:

                byte min = 6;
                byte max = 6;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(1).time) == Period.TAKT)) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;


            case 15:

                min = 7;
                max = 8;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(1).time) == Period.TAKT)) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;


            case 20:

                min = 10;
                max = 10;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(1).time) == Period.TAKT)) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;

        }
        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - dwie linie z jedną odchyłką

    static List<LineVariant> dwieLinieJednaOdchylka(List<LineVariant> lines, NodeName node) {
        List<LineVariant> goodLineVariants = new ArrayList<>();

        switch (Period.TAKT) {

            case 12:

                byte min = 5;
                byte max = 7;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(1).time) == Period.TAKT)) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;

            case 15:

                min = 6;
                max = 9;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(1).time) == Period.TAKT)) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;


            case 20:

                min = 9;
                max = 11;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(1).time) == Period.TAKT)) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
        }
        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - dwie linie z jedną odchyłką wymuszoną

    static List<LineVariant> dwieLinieJednaOdchylkaWymuszona(List<LineVariant> lines, NodeName node) {
        List<LineVariant> goodLineVariants = new ArrayList<>();

        switch (Period.TAKT) {

            case 12:

                byte min = 5;
                byte max = 7;
                byte minB = 6;
                byte maxB = 6;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (
                            (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                                    && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(1).time) == Period.TAKT))
                                    &&
                                    !(((foundnodes.get(1).time - foundnodes.get(0).time >= minB) && (foundnodes.get(1).time - foundnodes.get(0).time <= maxB))
                                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(1).time) == Period.TAKT))


                    ) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;

            case 15:

                min = 6;
                max = 9;
                minB = 7;
                maxB = 8;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (
                            (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                                    && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(1).time) == Period.TAKT))

                                    &&
                                    !(((foundnodes.get(1).time - foundnodes.get(0).time >= minB) && (foundnodes.get(1).time - foundnodes.get(0).time <= maxB))
                                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(1).time) == Period.TAKT))


                    ) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;


            case 20:

                min = 9;
                max = 11;
                minB = 10;
                maxB = 10;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (
                            ((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                                    && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(1).time) == Period.TAKT)

                                    &&
                                    !((foundnodes.get(1).time - foundnodes.get(0).time >= minB) && (foundnodes.get(1).time - foundnodes.get(0).time <= maxB))
                                    && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(1).time) == Period.TAKT)


                    ) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
        }
        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - dwie linie z dwoma odchyłkąmi

    static List<LineVariant> dwieLinieDwieOdchylki(List<LineVariant> lines, NodeName node) {
        List<LineVariant> goodLineVariants = new ArrayList<>();

        switch (Period.TAKT) {

            case 12:
                byte min = 4;
                byte max = 8;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(1).time) == Period.TAKT)) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;

            case 15:

                min = 5;
                max = 10;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(1).time) == Period.TAKT)) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;

            case 20:

                min = 8;
                max = 12;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(1).time) == Period.TAKT)) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;
        }
        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - dwie linie z dwoma odchyłkami wymuszonymi

    static List<LineVariant> dwieLinieDwieOdchylkiWymuszone(List<LineVariant> lines, NodeName node) {
        List<LineVariant> goodLineVariants = new ArrayList<>();

        switch (Period.TAKT) {

            case 12:
                byte min = 4;
                byte max = 8;
                byte minB = 5;
                byte maxB = 7;
                byte minC = 6;
                byte maxC = 6;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (
                            (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                                    && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(1).time) == Period.TAKT))

                                    &&
                                    !(((foundnodes.get(1).time - foundnodes.get(0).time >= minB) && (foundnodes.get(1).time - foundnodes.get(0).time <= maxB))
                                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(1).time) == Period.TAKT))

                                    &&
                                    !(((foundnodes.get(1).time - foundnodes.get(0).time >= minC) && (foundnodes.get(1).time - foundnodes.get(0).time <= maxC))
                                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(1).time) == Period.TAKT))


                    ) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;

            case 15:

                min = 5;
                max = 10;
                minB = 6;
                maxB = 9;
                minC = 7;
                maxC = 8;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (
                            ((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                                    && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(1).time) == Period.TAKT)

                                    &&
                                    !((foundnodes.get(1).time - foundnodes.get(0).time >= minB) && (foundnodes.get(1).time - foundnodes.get(0).time <= maxB))
                                    && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(1).time) == Period.TAKT)

                                    &&
                                    !((foundnodes.get(1).time - foundnodes.get(0).time >= minC) && (foundnodes.get(1).time - foundnodes.get(0).time <= maxC))
                                    && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(1).time) == Period.TAKT)


                    ) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;

            case 20:

                min = 8;
                max = 12;
                minB = 9;
                maxB = 11;
                minC = 10;
                maxC = 10;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (

                            ((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                                    && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(1).time) == Period.TAKT)

                                    &&
                                    !((foundnodes.get(1).time - foundnodes.get(0).time >= minB) && (foundnodes.get(1).time - foundnodes.get(0).time <= maxB))
                                    && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(1).time) == Period.TAKT)

                                    &&
                                    !((foundnodes.get(1).time - foundnodes.get(0).time >= minC) && (foundnodes.get(1).time - foundnodes.get(0).time <= maxC))
                                    && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(1).time) == Period.TAKT)


                    ) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;
        }
        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - dwie linie z trzema odchyłkami

    static List<LineVariant> dwieLinieTrzyOdchylki(List<LineVariant> lines, NodeName node) {
        List<LineVariant> goodLineVariants = new ArrayList<>();

        switch (Period.TAKT) {

            case 12:
                byte min = 3;
                byte max = 9;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(1).time) == Period.TAKT)) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;

            case 15:

                min = 4;
                max = 11;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(1).time) == Period.TAKT)) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;

            case 20:

                min = 7;
                max = 13;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(1).time) == Period.TAKT)) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;
        }
        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - trzy linie bez odchyłek

    static List<LineVariant> trzyLinieBezOdchylek(List<LineVariant> lines, NodeName node) {
        List<LineVariant> goodLineVariants = new ArrayList<>();

        switch (Period.TAKT) {

            case 12:
                byte min = 4;
                byte max = 4;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                            && ((foundnodes.get(2).time - foundnodes.get(1).time >= min) && (foundnodes.get(2).time - foundnodes.get(1).time <= max))
                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time >= min) && (foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time <= max))
                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(2).time - foundnodes.get(1).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time) == Period.TAKT)
                    ) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;

            case 15:

                min = 5;
                max = 5;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                            && ((foundnodes.get(2).time - foundnodes.get(1).time >= min) && (foundnodes.get(2).time - foundnodes.get(1).time <= max))
                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time >= min) && (foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time <= max))
                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(2).time - foundnodes.get(1).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time) == Period.TAKT)
                    ) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;

            case 20:

                min = 6;
                max = 7;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                            && ((foundnodes.get(2).time - foundnodes.get(1).time >= min) && (foundnodes.get(2).time - foundnodes.get(1).time <= max))
                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time >= min) && (foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time <= max))
                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(2).time - foundnodes.get(1).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time) == Period.TAKT)
                    ) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;

        }
        return goodLineVariants;
    }



    // metoda sprawdzająca warunki - trzy linie z jedną odchyłką wymuszoną


    static List<LineVariant> trzyLinieJednaOdchylkaWymuszona(List<LineVariant> lines, NodeName node) {
        List<LineVariant> goodLineVariants = new ArrayList<>();

        switch (Period.TAKT) {

            case 12:
                byte min = 3;
                byte max = 5;

                byte minB = 4;
                byte maxB = 4;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (
                            (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                                    && ((foundnodes.get(2).time - foundnodes.get(1).time >= min) && (foundnodes.get(2).time - foundnodes.get(1).time <= max))
                                    && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time >= min) && (foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time <= max))
                                    && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(2).time - foundnodes.get(1).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time) == Period.TAKT))

                                    &&

                                    !(((foundnodes.get(1).time - foundnodes.get(0).time >= minB) && (foundnodes.get(1).time - foundnodes.get(0).time <= maxB))
                                            && ((foundnodes.get(2).time - foundnodes.get(1).time >= minB) && (foundnodes.get(2).time - foundnodes.get(1).time <= maxB))
                                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time >= minB) && (foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time <= maxB))
                                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(2).time - foundnodes.get(1).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time) == Period.TAKT))


                    ) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;

            case 15:

                min = 4;
                max = 6;
                minB = 5;
                maxB = 5;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (

                            (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                                    && ((foundnodes.get(2).time - foundnodes.get(1).time >= min) && (foundnodes.get(2).time - foundnodes.get(1).time <= max))
                                    && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time >= min) && (foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time <= max))
                                    && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(2).time - foundnodes.get(1).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time) == Period.TAKT))

                                    &&

                                    !(((foundnodes.get(1).time - foundnodes.get(0).time >= minB) && (foundnodes.get(1).time - foundnodes.get(0).time <= maxB))
                                            && ((foundnodes.get(2).time - foundnodes.get(1).time >= minB) && (foundnodes.get(2).time - foundnodes.get(1).time <= maxB))
                                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time >= minB) && (foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time <= maxB))
                                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(2).time - foundnodes.get(1).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time) == Period.TAKT))


                    ) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;

            case 20:

                min = 5;
                max = 8;
                minB = 6;
                maxB = 7;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (
                            (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                                    && ((foundnodes.get(2).time - foundnodes.get(1).time >= min) && (foundnodes.get(2).time - foundnodes.get(1).time <= max))
                                    && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time >= min) && (foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time <= max))
                                    && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(2).time - foundnodes.get(1).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time) == Period.TAKT))


                                    &&

                                    !(((foundnodes.get(1).time - foundnodes.get(0).time >= minB) && (foundnodes.get(1).time - foundnodes.get(0).time <= maxB))
                                            && ((foundnodes.get(2).time - foundnodes.get(1).time >= minB) && (foundnodes.get(2).time - foundnodes.get(1).time <= maxB))
                                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time >= minB) && (foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time <= maxB))
                                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(2).time - foundnodes.get(1).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time) == Period.TAKT))

                    ) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;

        }
        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - trzy linie z dwoma odchyłkami

    static List<LineVariant> trzyLinieDwieOdchylki(List<LineVariant> lines, NodeName node) {
        List<LineVariant> goodLineVariants = new ArrayList<>();

        switch (Period.TAKT) {

            case 12:
                byte min = 2;
                byte max = 6;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                            && ((foundnodes.get(2).time - foundnodes.get(1).time >= min) && (foundnodes.get(2).time - foundnodes.get(1).time <= max))
                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time >= min) && (foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time <= max))
                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(2).time - foundnodes.get(1).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time) == Period.TAKT)
                    ) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;

            case 15:

                min = 3;
                max = 7;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                            && ((foundnodes.get(2).time - foundnodes.get(1).time >= min) && (foundnodes.get(2).time - foundnodes.get(1).time <= max))
                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time >= min) && (foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time <= max))
                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(2).time - foundnodes.get(1).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time) == Period.TAKT)
                    ) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;

            case 20:

                min = 4;
                max = 9;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                            && ((foundnodes.get(2).time - foundnodes.get(1).time >= min) && (foundnodes.get(2).time - foundnodes.get(1).time <= max))
                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time >= min) && (foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time <= max))
                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(2).time - foundnodes.get(1).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time) == Period.TAKT)
                    ) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;

        }
        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - cztery linie bez odchyłek

    static List<LineVariant> czteryLinieBezOdchylek(List<LineVariant> lines, NodeName node) {
        List<LineVariant> goodLineVariants = new ArrayList<>();

        switch (Period.TAKT) {

            case 12:

                byte min = 3;
                byte max = 3;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                            && ((foundnodes.get(2).time - foundnodes.get(1).time >= min) && (foundnodes.get(2).time - foundnodes.get(1).time <= max))
                            && ((foundnodes.get(3).time - foundnodes.get(2).time >= min) && (foundnodes.get(3).time - foundnodes.get(2).time <= max))
                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time >= min) && (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time <= max))
                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(2).time - foundnodes.get(1).time) + (foundnodes.get(3).time - foundnodes.get(2).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time) == Period.TAKT)
                    ) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;

            case 15:
                min = 3;
                max = 4;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                            && ((foundnodes.get(2).time - foundnodes.get(1).time >= min) && (foundnodes.get(2).time - foundnodes.get(1).time <= max))
                            && ((foundnodes.get(3).time - foundnodes.get(2).time >= min) && (foundnodes.get(3).time - foundnodes.get(2).time <= max))
                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time >= min) && (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time <= max))
                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(2).time - foundnodes.get(1).time) + (foundnodes.get(3).time - foundnodes.get(2).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time) == Period.TAKT)
                    ) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;

            case 20:
                min = 5;
                max = 5;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                            && ((foundnodes.get(2).time - foundnodes.get(1).time >= min) && (foundnodes.get(2).time - foundnodes.get(1).time <= max))
                            && ((foundnodes.get(3).time - foundnodes.get(2).time >= min) && (foundnodes.get(3).time - foundnodes.get(2).time <= max))
                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time >= min) && (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time <= max))
                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(2).time - foundnodes.get(1).time) + (foundnodes.get(3).time - foundnodes.get(2).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time) == Period.TAKT)
                    ) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;

        }
        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - cztery linie z jedną odchyłką

    static List<LineVariant> czteryLinieJednaOdchylka(List<LineVariant> lines, NodeName node) {
        List<LineVariant> goodLineVariants = new ArrayList<>();

        switch (Period.TAKT) {

            case 12:

                byte min = 2;
                byte max = 4;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                            && ((foundnodes.get(2).time - foundnodes.get(1).time >= min) && (foundnodes.get(2).time - foundnodes.get(1).time <= max))
                            && ((foundnodes.get(3).time - foundnodes.get(2).time >= min) && (foundnodes.get(3).time - foundnodes.get(2).time <= max))
                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time >= min) && (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time <= max))
                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(2).time - foundnodes.get(1).time) + (foundnodes.get(3).time - foundnodes.get(2).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time) == Period.TAKT)
                    ) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;

            case 15:
                min = 3;
                max = 5;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                            && ((foundnodes.get(2).time - foundnodes.get(1).time >= min) && (foundnodes.get(2).time - foundnodes.get(1).time <= max))
                            && ((foundnodes.get(3).time - foundnodes.get(2).time >= min) && (foundnodes.get(3).time - foundnodes.get(2).time <= max))
                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time >= min) && (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time <= max))
                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(2).time - foundnodes.get(1).time) + (foundnodes.get(3).time - foundnodes.get(2).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time) == Period.TAKT)
                    ) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;

            case 20:
                min = 4;
                max = 6;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                            && ((foundnodes.get(2).time - foundnodes.get(1).time >= min) && (foundnodes.get(2).time - foundnodes.get(1).time <= max))
                            && ((foundnodes.get(3).time - foundnodes.get(2).time >= min) && (foundnodes.get(3).time - foundnodes.get(2).time <= max))
                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time >= min) && (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time <= max))
                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(2).time - foundnodes.get(1).time) + (foundnodes.get(3).time - foundnodes.get(2).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time) == Period.TAKT)
                    ) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;

        }
        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - cztery linie z jedną odchyłką wymuszoną

    static List<LineVariant> czteryLinieJednaOdchylkaWymuszona(List<LineVariant> lines, NodeName node) {
        List<LineVariant> goodLineVariants = new ArrayList<>();

        switch (Period.TAKT) {

            case 12:

                byte min = 2;
                byte max = 4;
                byte minB = 3;
                byte maxB = 3;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (

                            (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                                    && ((foundnodes.get(2).time - foundnodes.get(1).time >= min) && (foundnodes.get(2).time - foundnodes.get(1).time <= max))
                                    && ((foundnodes.get(3).time - foundnodes.get(2).time >= min) && (foundnodes.get(3).time - foundnodes.get(2).time <= max))
                                    && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time >= min) && (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time <= max))
                                    && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(2).time - foundnodes.get(1).time) + (foundnodes.get(3).time - foundnodes.get(2).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time) == Period.TAKT))

                                    &&
                                    !(((foundnodes.get(1).time - foundnodes.get(0).time >= minB) && (foundnodes.get(1).time - foundnodes.get(0).time <= maxB))
                                            && ((foundnodes.get(2).time - foundnodes.get(1).time >= minB) && (foundnodes.get(2).time - foundnodes.get(1).time <= maxB))
                                            && ((foundnodes.get(3).time - foundnodes.get(2).time >= minB) && (foundnodes.get(3).time - foundnodes.get(2).time <= maxB))
                                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time >= minB) && (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time <= maxB))
                                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(2).time - foundnodes.get(1).time) + (foundnodes.get(3).time - foundnodes.get(2).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time) == Period.TAKT))

                    ) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;

            case 15:
                min = 3;
                max = 5;
                minB = 3;
                maxB = 4;


                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (
                            (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                                    && ((foundnodes.get(2).time - foundnodes.get(1).time >= min) && (foundnodes.get(2).time - foundnodes.get(1).time <= max))
                                    && ((foundnodes.get(3).time - foundnodes.get(2).time >= min) && (foundnodes.get(3).time - foundnodes.get(2).time <= max))
                                    && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time >= min) && (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time <= max))
                                    && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(2).time - foundnodes.get(1).time) + (foundnodes.get(3).time - foundnodes.get(2).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time) == Period.TAKT))

                                    &&
                                    !(((foundnodes.get(1).time - foundnodes.get(0).time >= minB) && (foundnodes.get(1).time - foundnodes.get(0).time <= maxB))
                                            && ((foundnodes.get(2).time - foundnodes.get(1).time >= minB) && (foundnodes.get(2).time - foundnodes.get(1).time <= maxB))
                                            && ((foundnodes.get(3).time - foundnodes.get(2).time >= minB) && (foundnodes.get(3).time - foundnodes.get(2).time <= maxB))
                                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time >= minB) && (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time <= maxB))
                                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(2).time - foundnodes.get(1).time) + (foundnodes.get(3).time - foundnodes.get(2).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time) == Period.TAKT))

                    ) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;

            case 20:
                min = 4;
                max = 6;
                minB = 5;
                maxB = 5;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (
                            (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                                    && ((foundnodes.get(2).time - foundnodes.get(1).time >= min) && (foundnodes.get(2).time - foundnodes.get(1).time <= max))
                                    && ((foundnodes.get(3).time - foundnodes.get(2).time >= min) && (foundnodes.get(3).time - foundnodes.get(2).time <= max))
                                    && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time >= min) && (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time <= max))
                                    && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(2).time - foundnodes.get(1).time) + (foundnodes.get(3).time - foundnodes.get(2).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time) == Period.TAKT))

                                    &&
                                    !(((foundnodes.get(1).time - foundnodes.get(0).time >= minB) && (foundnodes.get(1).time - foundnodes.get(0).time <= maxB))
                                            && ((foundnodes.get(2).time - foundnodes.get(1).time >= minB) && (foundnodes.get(2).time - foundnodes.get(1).time <= maxB))
                                            && ((foundnodes.get(3).time - foundnodes.get(2).time >= minB) && (foundnodes.get(3).time - foundnodes.get(2).time <= maxB))
                                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time >= minB) && (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time <= maxB))
                                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(2).time - foundnodes.get(1).time) + (foundnodes.get(3).time - foundnodes.get(2).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time) == Period.TAKT))

                    ) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;

        }
        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - cztery linie z dwoma odchyłkami

    static List<LineVariant> czteryLinieDwieOdchylki(List<LineVariant> lines, NodeName node) {
        List<LineVariant> goodLineVariants = new ArrayList<>();

        switch (Period.TAKT) {

            case 12:

                byte min = 1;
                byte max = 5;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                            && ((foundnodes.get(2).time - foundnodes.get(1).time >= min) && (foundnodes.get(2).time - foundnodes.get(1).time <= max))
                            && ((foundnodes.get(3).time - foundnodes.get(2).time >= min) && (foundnodes.get(3).time - foundnodes.get(2).time <= max))
                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time >= min) && (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time <= max))
                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(2).time - foundnodes.get(1).time) + (foundnodes.get(3).time - foundnodes.get(2).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time) == Period.TAKT)
                    ) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;

            case 15:
                min = 2;
                max = 6;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                            && ((foundnodes.get(2).time - foundnodes.get(1).time >= min) && (foundnodes.get(2).time - foundnodes.get(1).time <= max))
                            && ((foundnodes.get(3).time - foundnodes.get(2).time >= min) && (foundnodes.get(3).time - foundnodes.get(2).time <= max))
                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time >= min) && (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time <= max))
                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(2).time - foundnodes.get(1).time) + (foundnodes.get(3).time - foundnodes.get(2).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time) == Period.TAKT)
                    ) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;

            case 20:
                min = 3;
                max = 7;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                            && ((foundnodes.get(2).time - foundnodes.get(1).time >= min) && (foundnodes.get(2).time - foundnodes.get(1).time <= max))
                            && ((foundnodes.get(3).time - foundnodes.get(2).time >= min) && (foundnodes.get(3).time - foundnodes.get(2).time <= max))
                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time >= min) && (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time <= max))
                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(2).time - foundnodes.get(1).time) + (foundnodes.get(3).time - foundnodes.get(2).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time) == Period.TAKT)
                    ) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;

        }
        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - cztery linie z dwoma odchyłkami wymuszonymi

    static List<LineVariant> czteryLinieDwieOdchylkiWymuszone(List<LineVariant> lines, NodeName node) {
        List<LineVariant> goodLineVariants = new ArrayList<>();

        switch (Period.TAKT) {

            case 12:

                byte min = 1;
                byte max = 5;
                byte minB = 2;
                byte maxB = 4;
                byte minC = 3;
                byte maxC = 3;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (
                            (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                                    && ((foundnodes.get(2).time - foundnodes.get(1).time >= min) && (foundnodes.get(2).time - foundnodes.get(1).time <= max))
                                    && ((foundnodes.get(3).time - foundnodes.get(2).time >= min) && (foundnodes.get(3).time - foundnodes.get(2).time <= max))
                                    && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time >= min) && (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time <= max))
                                    && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(2).time - foundnodes.get(1).time) + (foundnodes.get(3).time - foundnodes.get(2).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time) == Period.TAKT))


                                    &&
                                    !(((foundnodes.get(1).time - foundnodes.get(0).time >= minB) && (foundnodes.get(1).time - foundnodes.get(0).time <= maxB))
                                            && ((foundnodes.get(2).time - foundnodes.get(1).time >= minB) && (foundnodes.get(2).time - foundnodes.get(1).time <= maxB))
                                            && ((foundnodes.get(3).time - foundnodes.get(2).time >= minB) && (foundnodes.get(3).time - foundnodes.get(2).time <= maxB))
                                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time >= minB) && (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time <= maxB))
                                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(2).time - foundnodes.get(1).time) + (foundnodes.get(3).time - foundnodes.get(2).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time) == Period.TAKT))

                                    &&
                                    !(((foundnodes.get(1).time - foundnodes.get(0).time >= minC) && (foundnodes.get(1).time - foundnodes.get(0).time <= maxC))
                                            && ((foundnodes.get(2).time - foundnodes.get(1).time >= minC) && (foundnodes.get(2).time - foundnodes.get(1).time <= maxC))
                                            && ((foundnodes.get(3).time - foundnodes.get(2).time >= minC) && (foundnodes.get(3).time - foundnodes.get(2).time <= maxC))
                                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time >= minC) && (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time <= maxC))
                                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(2).time - foundnodes.get(1).time) + (foundnodes.get(3).time - foundnodes.get(2).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time) == Period.TAKT))


                    ) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;

            case 15:
                min = 2;
                max = 6;
                minB = 3;
                maxB = 5;
                minC = 3;
                maxC = 4;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (

                            (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                                    && ((foundnodes.get(2).time - foundnodes.get(1).time >= min) && (foundnodes.get(2).time - foundnodes.get(1).time <= max))
                                    && ((foundnodes.get(3).time - foundnodes.get(2).time >= min) && (foundnodes.get(3).time - foundnodes.get(2).time <= max))
                                    && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time >= min) && (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time <= max))
                                    && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(2).time - foundnodes.get(1).time) + (foundnodes.get(3).time - foundnodes.get(2).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time) == Period.TAKT))


                                    &&
                                    !(((foundnodes.get(1).time - foundnodes.get(0).time >= minB) && (foundnodes.get(1).time - foundnodes.get(0).time <= maxB))
                                            && ((foundnodes.get(2).time - foundnodes.get(1).time >= minB) && (foundnodes.get(2).time - foundnodes.get(1).time <= maxB))
                                            && ((foundnodes.get(3).time - foundnodes.get(2).time >= minB) && (foundnodes.get(3).time - foundnodes.get(2).time <= maxB))
                                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time >= minB) && (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time <= maxB))
                                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(2).time - foundnodes.get(1).time) + (foundnodes.get(3).time - foundnodes.get(2).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time) == Period.TAKT))

                                    &&
                                    !(((foundnodes.get(1).time - foundnodes.get(0).time >= minC) && (foundnodes.get(1).time - foundnodes.get(0).time <= maxC))
                                            && ((foundnodes.get(2).time - foundnodes.get(1).time >= minC) && (foundnodes.get(2).time - foundnodes.get(1).time <= maxC))
                                            && ((foundnodes.get(3).time - foundnodes.get(2).time >= minC) && (foundnodes.get(3).time - foundnodes.get(2).time <= maxC))
                                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time >= minC) && (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time <= maxC))
                                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(2).time - foundnodes.get(1).time) + (foundnodes.get(3).time - foundnodes.get(2).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time) == Period.TAKT))

                    ) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;

            case 20:
                min = 3;
                max = 7;
                minB = 4;
                maxB = 6;
                minC = 5;
                maxC = 5;

                for (int i = 0; i < lines.size(); i++) {
                    LineVariant currentLineVariant = lines.get(i);
                    List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

                    Collections.sort(foundnodes);

                    if (
                            (((foundnodes.get(1).time - foundnodes.get(0).time >= min) && (foundnodes.get(1).time - foundnodes.get(0).time <= max))
                                    && ((foundnodes.get(2).time - foundnodes.get(1).time >= min) && (foundnodes.get(2).time - foundnodes.get(1).time <= max))
                                    && ((foundnodes.get(3).time - foundnodes.get(2).time >= min) && (foundnodes.get(3).time - foundnodes.get(2).time <= max))
                                    && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time >= min) && (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time <= max))
                                    && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(2).time - foundnodes.get(1).time) + (foundnodes.get(3).time - foundnodes.get(2).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time) == Period.TAKT))

                                    &&
                                    !(((foundnodes.get(1).time - foundnodes.get(0).time >= minB) && (foundnodes.get(1).time - foundnodes.get(0).time <= maxB))
                                            && ((foundnodes.get(2).time - foundnodes.get(1).time >= minB) && (foundnodes.get(2).time - foundnodes.get(1).time <= maxB))
                                            && ((foundnodes.get(3).time - foundnodes.get(2).time >= minB) && (foundnodes.get(3).time - foundnodes.get(2).time <= maxB))
                                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time >= minB) && (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time <= maxB))
                                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(2).time - foundnodes.get(1).time) + (foundnodes.get(3).time - foundnodes.get(2).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time) == Period.TAKT))

                                    &&
                                    !(((foundnodes.get(1).time - foundnodes.get(0).time >= minC) && (foundnodes.get(1).time - foundnodes.get(0).time <= maxC))
                                            && ((foundnodes.get(2).time - foundnodes.get(1).time >= minC) && (foundnodes.get(2).time - foundnodes.get(1).time <= maxC))
                                            && ((foundnodes.get(3).time - foundnodes.get(2).time >= minC) && (foundnodes.get(3).time - foundnodes.get(2).time <= maxC))
                                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time >= minC) && (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time <= maxC))
                                            && ((foundnodes.get(1).time - foundnodes.get(0).time) + (foundnodes.get(2).time - foundnodes.get(1).time) + (foundnodes.get(3).time - foundnodes.get(2).time) + (foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time) == Period.TAKT))

                    ) {
                        goodLineVariants.add(currentLineVariant);
                    }
                }
                break;

        }
        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - dwie linie minimalny odstęp

    static List<LineVariant> dwieLinieMinOdstep(List<LineVariant> lines, NodeName node, int gap) {

        List<LineVariant> goodLineVariants = new ArrayList<>();


        for (int i = 0; i < lines.size(); i++) {
            LineVariant currentLineVariant = lines.get(i);
            List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

            if (Math.abs(foundnodes.get(0).time - foundnodes.get(1).time) >= gap) {
                goodLineVariants.add(currentLineVariant);
            }
        }


        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - dwie linie minimalny odstęp z zachowaniem kolejności

    static List<LineVariant> dwieLinieMinOdstepKolejnosc(List<LineVariant> lines, LineName lineName1, LineName
            lineName2, NodeName node, int gap) {

        List<LineVariant> goodLineVariants = new ArrayList<>();


        for (int i = 0; i < lines.size(); i++) {
            LineVariant currentLineVariant = lines.get(i);
            List<MpkNode> foundnodes = currentLineVariant.findOnlyOneLineAndNode(lineName1, node);
            foundnodes.addAll(currentLineVariant.findOnlyOneLineAndNode(lineName2, node));

            if ((foundnodes.get(1).time - foundnodes.get(0).time >= gap) || ((foundnodes.get(1).time - foundnodes.get(0).time < 0) && (foundnodes.get(1).time + Period.TAKT - foundnodes.get(0).time >= gap))) {
                goodLineVariants.add(currentLineVariant);
            }
        }


        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - trzy linie minimalny odstęp

    static List<LineVariant> trzyLinieMinOdstep(List<LineVariant> lines, NodeName node, int gap) {
        List<LineVariant> goodLineVariants = new ArrayList<>();

        for (int i = 0; i < lines.size(); i++) {
            LineVariant currentLineVariant = lines.get(i);
            List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

            if ((Math.abs(foundnodes.get(0).time - foundnodes.get(1).time) >= gap) && (Math.abs(foundnodes.get(1).time - foundnodes.get(2).time) >= gap) && (Math.abs(foundnodes.get(0).time - foundnodes.get(2).time) >= gap)
            ) {
                goodLineVariants.add(currentLineVariant);
            }
        }

        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - cztery linie minimalny odstęp

    static List<LineVariant> czteryLinieMinOdstep(List<LineVariant> lines, NodeName node, int gap) {
        List<LineVariant> goodLineVariants = new ArrayList<>();


        for (int i = 0; i < lines.size(); i++) {
            LineVariant currentLineVariant = lines.get(i);
            List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

            if ((Math.abs(foundnodes.get(0).time - foundnodes.get(1).time) >= gap) && (Math.abs(foundnodes.get(0).time - foundnodes.get(2).time) >= gap) && (Math.abs(foundnodes.get(0).time - foundnodes.get(3).time) >= gap) && (Math.abs(foundnodes.get(1).time - foundnodes.get(2).time) >= gap) && (Math.abs(foundnodes.get(1).time - foundnodes.get(3).time) >= gap) && (Math.abs(foundnodes.get(2).time - foundnodes.get(3).time) >= gap)


            ) {
                goodLineVariants.add(currentLineVariant);
            }
        }

        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - pięć linii minimalny odstęp

    static List<LineVariant> piecLiniiMinOdstep(List<LineVariant> lines, NodeName node, int gap) {
        List<LineVariant> goodLineVariants = new ArrayList<>();


        for (int i = 0; i < lines.size(); i++) {
            LineVariant currentLineVariant = lines.get(i);
            List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

            if ((Math.abs(foundnodes.get(0).time - foundnodes.get(1).time) >= gap) && (Math.abs(foundnodes.get(0).time - foundnodes.get(2).time) >= gap) && (Math.abs(foundnodes.get(0).time - foundnodes.get(3).time) >= gap) && (Math.abs(foundnodes.get(0).time - foundnodes.get(4).time) >= gap) && (Math.abs(foundnodes.get(1).time - foundnodes.get(2).time) >= gap) && (Math.abs(foundnodes.get(1).time - foundnodes.get(3).time) >= gap) && (Math.abs(foundnodes.get(1).time - foundnodes.get(4).time) >= gap) && (Math.abs(foundnodes.get(2).time - foundnodes.get(3).time) >= gap) && (Math.abs(foundnodes.get(2).time - foundnodes.get(4).time) >= gap) && (Math.abs(foundnodes.get(3).time - foundnodes.get(4).time) >= gap)


            ) {
                goodLineVariants.add(currentLineVariant);
            }
        }

        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - dwie linie minimalny odstęp (tylko dla istniejącej listy LineVariantów)

    static List<LineVariant> dwieLinieMinOdstepIstniejaceLineVarianty(List<LineVariant> lines, LineName
            lineName1, LineName lineName2, NodeName node, int gap) {
        List<LineVariant> goodLineVariants = new ArrayList<>();


        for (int i = 0; i < lines.size(); i++) {
            LineVariant currentLineVariant = lines.get(i);
            List<MpkNode> foundnodes = currentLineVariant.findLineAndNodes(lineName1, lineName2, node);


            Collections.sort(foundnodes);

            if (
                    ((foundnodes.get(1).time - foundnodes.get(0).time) >= gap)
                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(1).time) >= gap)
            ) goodLineVariants.add(currentLineVariant);
        }

        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - trzy linie minimalny odstęp (tylko dla istniejącej listy LineVariantów)

    static List<LineVariant> trzyLinieMinOdstepIstniejaceLineVarianty(List<LineVariant> lines, LineName
            lineName1, LineName lineName2, LineName lineName3, NodeName node, int gap) {
        List<LineVariant> goodLineVariants = new ArrayList<>();


        for (int i = 0; i < lines.size(); i++) {
            LineVariant currentLineVariant = lines.get(i);
            List<MpkNode> foundnodes = currentLineVariant.findLineAndNodes(lineName1, lineName2, lineName3, node);


            Collections.sort(foundnodes);

            if (
                    ((foundnodes.get(1).time - foundnodes.get(0).time) >= gap)
                            && ((foundnodes.get(2).time - foundnodes.get(1).time) >= gap)
                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time) >= gap)
            ) {
                goodLineVariants.add(currentLineVariant);
            }
        }

        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - cztery linie minimalny odstęp (tylko dla istniejącej listy LineVariantów)

    static List<LineVariant> czteryLinieMinOdstepIstniejaceLineVarianty(List<LineVariant> lines, LineName
            lineName1, LineName lineName2, LineName lineName3, LineName lineName4, NodeName node, int gap) {
        List<LineVariant> goodLineVariants = new ArrayList<>();


        for (int i = 0; i < lines.size(); i++) {
            LineVariant currentLineVariant = lines.get(i);
            List<MpkNode> foundnodes = currentLineVariant.findLineAndNodes(lineName1, lineName2, lineName3, lineName4, node);


            Collections.sort(foundnodes);

            if (
                    ((foundnodes.get(1).time - foundnodes.get(0).time) >= gap)
                            && ((foundnodes.get(2).time - foundnodes.get(1).time) >= gap)
                            && ((foundnodes.get(3).time - foundnodes.get(2).time) >= gap)
                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time) >= gap)
            ) {
                goodLineVariants.add(currentLineVariant);
            }
        }

        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - piec linii minimalny odstęp (tylko dla istniejącej listy LineVariantów)

    static List<LineVariant> piecLiniiMinOdstepIstniejaceLineVarianty(List<LineVariant> lines, LineName
            lineName1, LineName lineName2, LineName lineName3, LineName lineName4, LineName lineName5, NodeName node, int gap) {
        List<LineVariant> goodLineVariants = new ArrayList<>();


        for (int i = 0; i < lines.size(); i++) {
            LineVariant currentLineVariant = lines.get(i);
            List<MpkNode> foundnodes = currentLineVariant.findLineAndNodes(lineName1, lineName2, lineName3, lineName4, lineName5, node);


            Collections.sort(foundnodes);

            if (
                    ((foundnodes.get(1).time - foundnodes.get(0).time) >= gap)
                            && ((foundnodes.get(2).time - foundnodes.get(1).time) >= gap)
                            && ((foundnodes.get(3).time - foundnodes.get(2).time) >= gap)
                            && ((foundnodes.get(4).time - foundnodes.get(3).time) >= gap)
                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(4).time) >= gap)
            ) {
                goodLineVariants.add(currentLineVariant);
            }
        }

        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - sześć linii minimalny odstęp (tylko dla istniejącej listy LineVariantów)

    static List<LineVariant> szescLiniiMinOdstepIstniejaceLineVarianty(List<LineVariant> lines, LineName
            lineName1, LineName lineName2, LineName lineName3, LineName lineName4, LineName lineName5, LineName
                                                                               lineName6, NodeName node, int gap) {
        List<LineVariant> goodLineVariants = new ArrayList<>();


        for (int i = 0; i < lines.size(); i++) {
            LineVariant currentLineVariant = lines.get(i);
            List<MpkNode> foundnodes = currentLineVariant.findLineAndNodes(lineName1, lineName2, lineName3, lineName4, lineName5, lineName6, node);


            Collections.sort(foundnodes);

            if (
                    ((foundnodes.get(1).time - foundnodes.get(0).time) >= gap)
                            && ((foundnodes.get(2).time - foundnodes.get(1).time) >= gap)
                            && ((foundnodes.get(3).time - foundnodes.get(2).time) >= gap)
                            && ((foundnodes.get(4).time - foundnodes.get(3).time) >= gap)
                            && ((foundnodes.get(5).time - foundnodes.get(4).time) >= gap)
                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(5).time) >= gap)
            ) {
                goodLineVariants.add(currentLineVariant);
            }
        }

        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - siedem linii minimalny odstęp (tylko dla istniejącej listy LineVariantów)

    static List<LineVariant> siedemLiniiMinOdstepIstniejaceLineVarianty(List<LineVariant> lines, LineName
            lineName1, LineName lineName2, LineName lineName3, LineName lineName4, LineName lineName5, LineName
                                                                                lineName6, LineName lineName7, NodeName node, int gap) {
        List<LineVariant> goodLineVariants = new ArrayList<>();


        for (int i = 0; i < lines.size(); i++) {
            LineVariant currentLineVariant = lines.get(i);
            List<MpkNode> foundnodes = currentLineVariant.findLineAndNodes(lineName1, lineName2, lineName3, lineName4, lineName5, lineName6, lineName7, node);


            Collections.sort(foundnodes);

            if (
                    ((foundnodes.get(1).time - foundnodes.get(0).time) >= gap)
                            && ((foundnodes.get(2).time - foundnodes.get(1).time) >= gap)
                            && ((foundnodes.get(3).time - foundnodes.get(2).time) >= gap)
                            && ((foundnodes.get(4).time - foundnodes.get(3).time) >= gap)
                            && ((foundnodes.get(5).time - foundnodes.get(4).time) >= gap)
                            && ((foundnodes.get(6).time - foundnodes.get(5).time) >= gap)
                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(6).time) >= gap)
            ) {
                goodLineVariants.add(currentLineVariant);
            }
        }

        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - osiem linii minimalny odstęp (tylko dla istniejącej listy LineVariantów)

    static List<LineVariant> osiemLiniiMinOdstepIstniejaceLineVarianty(List<LineVariant> lines, LineName
            lineName1, LineName lineName2, LineName lineName3, LineName lineName4, LineName lineName5, LineName
                                                                               lineName6, LineName lineName7, LineName lineName8, NodeName node, int gap) {
        List<LineVariant> goodLineVariants = new ArrayList<>();


        for (int i = 0; i < lines.size(); i++) {
            LineVariant currentLineVariant = lines.get(i);
            List<MpkNode> foundnodes = currentLineVariant.findLineAndNodes(lineName1, lineName2, lineName3, lineName4, lineName5, lineName6, lineName7, lineName8, node);


            Collections.sort(foundnodes);

            if (
                    ((foundnodes.get(1).time - foundnodes.get(0).time) >= gap)
                            && ((foundnodes.get(2).time - foundnodes.get(1).time) >= gap)
                            && ((foundnodes.get(3).time - foundnodes.get(2).time) >= gap)
                            && ((foundnodes.get(4).time - foundnodes.get(3).time) >= gap)
                            && ((foundnodes.get(5).time - foundnodes.get(4).time) >= gap)
                            && ((foundnodes.get(6).time - foundnodes.get(5).time) >= gap)
                            && ((foundnodes.get(7).time - foundnodes.get(6).time) >= gap)
                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(7).time) >= gap)
            ) {
                goodLineVariants.add(currentLineVariant);
            }
        }

        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - dziewięć linii minimalny odstęp (tylko dla istniejącej listy LineVariantów)

    static List<LineVariant> dziewiecLiniiMinOdstepIstniejaceLineVarianty(List<LineVariant> lines, LineName
            lineName1, LineName lineName2, LineName lineName3, LineName lineName4, LineName lineName5, LineName
                                                                                  lineName6, LineName lineName7, LineName lineName8, LineName lineName9, NodeName node, int gap) {
        List<LineVariant> goodLineVariants = new ArrayList<>();


        for (int i = 0; i < lines.size(); i++) {
            LineVariant currentLineVariant = lines.get(i);
            List<MpkNode> foundnodes = currentLineVariant.findLineAndNodes(lineName1, lineName2, lineName3, lineName4, lineName5, lineName6, lineName7, lineName8, lineName9, node);


            Collections.sort(foundnodes);

            if (
                    ((foundnodes.get(1).time - foundnodes.get(0).time) >= gap)
                            && ((foundnodes.get(2).time - foundnodes.get(1).time) >= gap)
                            && ((foundnodes.get(3).time - foundnodes.get(2).time) >= gap)
                            && ((foundnodes.get(4).time - foundnodes.get(3).time) >= gap)
                            && ((foundnodes.get(5).time - foundnodes.get(4).time) >= gap)
                            && ((foundnodes.get(6).time - foundnodes.get(5).time) >= gap)
                            && ((foundnodes.get(7).time - foundnodes.get(6).time) >= gap)
                            && ((foundnodes.get(8).time - foundnodes.get(7).time) >= gap)
                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(8).time) >= gap)
            ) {
                goodLineVariants.add(currentLineVariant);
            }
        }

        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - dziesięć linii minimalny odstęp (tylko dla istniejącej listy LineVariantów)

    static List<LineVariant> dziesiecLiniiMinOdstepIstniejaceLineVarianty(List<LineVariant> lines, LineName
            lineName1, LineName lineName2, LineName lineName3, LineName lineName4, LineName lineName5, LineName
                                                                                  lineName6, LineName lineName7, LineName lineName8, LineName lineName9, LineName lineName10, NodeName node,
                                                                          int gap) {
        List<LineVariant> goodLineVariants = new ArrayList<>();


        for (int i = 0; i < lines.size(); i++) {
            LineVariant currentLineVariant = lines.get(i);
            List<MpkNode> foundnodes = currentLineVariant.findLineAndNodes(lineName1, lineName2, lineName3, lineName4, lineName5, lineName6, lineName7, lineName8, lineName9, lineName10, node);


            Collections.sort(foundnodes);

            if (
                    ((foundnodes.get(1).time - foundnodes.get(0).time) >= gap)
                            && ((foundnodes.get(2).time - foundnodes.get(1).time) >= gap)
                            && ((foundnodes.get(3).time - foundnodes.get(2).time) >= gap)
                            && ((foundnodes.get(4).time - foundnodes.get(3).time) >= gap)
                            && ((foundnodes.get(5).time - foundnodes.get(4).time) >= gap)
                            && ((foundnodes.get(6).time - foundnodes.get(5).time) >= gap)
                            && ((foundnodes.get(7).time - foundnodes.get(6).time) >= gap)
                            && ((foundnodes.get(8).time - foundnodes.get(7).time) >= gap)
                            && ((foundnodes.get(9).time - foundnodes.get(8).time) >= gap)
                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(9).time) >= gap)
            ) {
                goodLineVariants.add(currentLineVariant);
            }
        }

        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - jedenaście linii minimalny odstęp (tylko dla istniejącej listy LineVariantów)

    static List<LineVariant> jedenascieLiniiMinOdstepIstniejaceLineVarianty(List<LineVariant> lines, LineName
            lineName1, LineName lineName2, LineName lineName3, LineName lineName4, LineName lineName5, LineName
                                                                                    lineName6, LineName lineName7, LineName lineName8, LineName lineName9, LineName lineName10, LineName
                                                                                    lineName11, NodeName node, int gap) {
        List<LineVariant> goodLineVariants = new ArrayList<>();


        for (int i = 0; i < lines.size(); i++) {
            LineVariant currentLineVariant = lines.get(i);
            List<MpkNode> foundnodes = currentLineVariant.findLineAndNodes(lineName1, lineName2, lineName3, lineName4, lineName5, lineName6, lineName7, lineName8, lineName9, lineName10, lineName11, node);


            Collections.sort(foundnodes);

            if (
                    ((foundnodes.get(1).time - foundnodes.get(0).time) >= gap)
                            && ((foundnodes.get(2).time - foundnodes.get(1).time) >= gap)
                            && ((foundnodes.get(3).time - foundnodes.get(2).time) >= gap)
                            && ((foundnodes.get(4).time - foundnodes.get(3).time) >= gap)
                            && ((foundnodes.get(5).time - foundnodes.get(4).time) >= gap)
                            && ((foundnodes.get(6).time - foundnodes.get(5).time) >= gap)
                            && ((foundnodes.get(7).time - foundnodes.get(6).time) >= gap)
                            && ((foundnodes.get(8).time - foundnodes.get(7).time) >= gap)
                            && ((foundnodes.get(9).time - foundnodes.get(8).time) >= gap)
                            && ((foundnodes.get(10).time - foundnodes.get(9).time) >= gap)
                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(10).time) >= gap)
            ) {
                goodLineVariants.add(currentLineVariant);
            }
        }

        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - dwanaście linii minimalny odstęp (tylko dla istniejącej listy LineVariantów)

    static List<LineVariant> dwanascieLiniiMinOdstepIstniejaceLineVarianty(List<LineVariant> lines, LineName
            lineName1, LineName lineName2, LineName lineName3, LineName lineName4, LineName lineName5, LineName
                                                                                   lineName6, LineName lineName7, LineName lineName8, LineName lineName9, LineName lineName10, LineName
                                                                                   lineName11, LineName lineName12, NodeName node, int gap) {
        List<LineVariant> goodLineVariants = new ArrayList<>();


        for (int i = 0; i < lines.size(); i++) {
            LineVariant currentLineVariant = lines.get(i);
            List<MpkNode> foundnodes = currentLineVariant.findLineAndNodes(lineName1, lineName2, lineName3, lineName4, lineName5, lineName6, lineName7, lineName8, lineName9, lineName10, lineName11, lineName12, node);


            Collections.sort(foundnodes);

            if (
                    ((foundnodes.get(1).time - foundnodes.get(0).time) >= gap)
                            && ((foundnodes.get(2).time - foundnodes.get(1).time) >= gap)
                            && ((foundnodes.get(3).time - foundnodes.get(2).time) >= gap)
                            && ((foundnodes.get(4).time - foundnodes.get(3).time) >= gap)
                            && ((foundnodes.get(5).time - foundnodes.get(4).time) >= gap)
                            && ((foundnodes.get(6).time - foundnodes.get(5).time) >= gap)
                            && ((foundnodes.get(7).time - foundnodes.get(6).time) >= gap)
                            && ((foundnodes.get(8).time - foundnodes.get(7).time) >= gap)
                            && ((foundnodes.get(9).time - foundnodes.get(8).time) >= gap)
                            && ((foundnodes.get(10).time - foundnodes.get(9).time) >= gap)
                            && ((foundnodes.get(11).time - foundnodes.get(10).time) >= gap)
                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(11).time) >= gap)
            ) {
                goodLineVariants.add(currentLineVariant);
            }
        }

        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - trzynaście linii minimalny odstęp (tylko dla istniejącej listy LineVariantów)

    static List<LineVariant> trzynascieLiniiMinOdstepIstniejaceLineVarianty(List<LineVariant> lines, LineName
            lineName1, LineName lineName2, LineName lineName3, LineName lineName4, LineName lineName5, LineName
                                                                                    lineName6, LineName lineName7, LineName lineName8, LineName lineName9, LineName lineName10, LineName
                                                                                    lineName11, LineName lineName12, LineName lineName13, NodeName node, int gap) {
        List<LineVariant> goodLineVariants = new ArrayList<>();


        for (int i = 0; i < lines.size(); i++) {
            LineVariant currentLineVariant = lines.get(i);
            List<MpkNode> foundnodes = currentLineVariant.findLineAndNodes(lineName1, lineName2, lineName3, lineName4, lineName5, lineName6, lineName7, lineName8, lineName9, lineName10, lineName11, lineName12, lineName13, node);


            Collections.sort(foundnodes);

            if (
                    ((foundnodes.get(1).time - foundnodes.get(0).time) >= gap)
                            && ((foundnodes.get(2).time - foundnodes.get(1).time) >= gap)
                            && ((foundnodes.get(3).time - foundnodes.get(2).time) >= gap)
                            && ((foundnodes.get(4).time - foundnodes.get(3).time) >= gap)
                            && ((foundnodes.get(5).time - foundnodes.get(4).time) >= gap)
                            && ((foundnodes.get(6).time - foundnodes.get(5).time) >= gap)
                            && ((foundnodes.get(7).time - foundnodes.get(6).time) >= gap)
                            && ((foundnodes.get(8).time - foundnodes.get(7).time) >= gap)
                            && ((foundnodes.get(9).time - foundnodes.get(8).time) >= gap)
                            && ((foundnodes.get(10).time - foundnodes.get(9).time) >= gap)
                            && ((foundnodes.get(11).time - foundnodes.get(10).time) >= gap)
                            && ((foundnodes.get(12).time - foundnodes.get(11).time) >= gap)
                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(12).time) >= gap)
            ) {
                goodLineVariants.add(currentLineVariant);
            }
        }

        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - czternaście linii minimalny odstęp (tylko dla istniejącej listy LineVariantów)

    static List<LineVariant> czternascieLiniiMinOdstepIstniejaceLineVarianty(List<LineVariant> lines, LineName
            lineName1, LineName lineName2, LineName lineName3, LineName lineName4, LineName lineName5, LineName
                                                                                     lineName6, LineName lineName7, LineName lineName8, LineName lineName9, LineName lineName10, LineName
                                                                                     lineName11, LineName lineName12, LineName lineName13, LineName lineName14, NodeName node, int gap) {
        List<LineVariant> goodLineVariants = new ArrayList<>();


        for (int i = 0; i < lines.size(); i++) {
            LineVariant currentLineVariant = lines.get(i);
            List<MpkNode> foundnodes = currentLineVariant.findLineAndNodes(lineName1, lineName2, lineName3, lineName4, lineName5, lineName6, lineName7, lineName8, lineName9, lineName10, lineName11, lineName12, lineName13, lineName14, node);


            Collections.sort(foundnodes);

            if (
                    ((foundnodes.get(1).time - foundnodes.get(0).time) >= gap)
                            && ((foundnodes.get(2).time - foundnodes.get(1).time) >= gap)
                            && ((foundnodes.get(3).time - foundnodes.get(2).time) >= gap)
                            && ((foundnodes.get(4).time - foundnodes.get(3).time) >= gap)
                            && ((foundnodes.get(5).time - foundnodes.get(4).time) >= gap)
                            && ((foundnodes.get(6).time - foundnodes.get(5).time) >= gap)
                            && ((foundnodes.get(7).time - foundnodes.get(6).time) >= gap)
                            && ((foundnodes.get(8).time - foundnodes.get(7).time) >= gap)
                            && ((foundnodes.get(9).time - foundnodes.get(8).time) >= gap)
                            && ((foundnodes.get(10).time - foundnodes.get(9).time) >= gap)
                            && ((foundnodes.get(11).time - foundnodes.get(10).time) >= gap)
                            && ((foundnodes.get(12).time - foundnodes.get(11).time) >= gap)
                            && ((foundnodes.get(13).time - foundnodes.get(12).time) >= gap)
                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(13).time) >= gap)
            ) {
                goodLineVariants.add(currentLineVariant);
            }
        }

        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - piętnaście linii minimalny odstęp (tylko dla istniejącej listy LineVariantów)

    static List<LineVariant> pietnascieLiniiMinOdstepIstniejaceLineVarianty(List<LineVariant> lines, LineName
            lineName1, LineName lineName2, LineName lineName3, LineName lineName4, LineName lineName5, LineName
                                                                                    lineName6, LineName lineName7, LineName lineName8, LineName lineName9, LineName lineName10, LineName
                                                                                    lineName11, LineName lineName12, LineName lineName13, LineName lineName14, LineName lineName15, NodeName node,
                                                                            int gap) {
        List<LineVariant> goodLineVariants = new ArrayList<>();


        for (int i = 0; i < lines.size(); i++) {
            LineVariant currentLineVariant = lines.get(i);
            List<MpkNode> foundnodes = currentLineVariant.findLineAndNodes(lineName1, lineName2, lineName3, lineName4, lineName5, lineName6, lineName7, lineName8, lineName9, lineName10, lineName11, lineName12, lineName13, lineName14, lineName15, node);


            Collections.sort(foundnodes);

            if (
                    ((foundnodes.get(1).time - foundnodes.get(0).time) >= gap)
                            && ((foundnodes.get(2).time - foundnodes.get(1).time) >= gap)
                            && ((foundnodes.get(3).time - foundnodes.get(2).time) >= gap)
                            && ((foundnodes.get(4).time - foundnodes.get(3).time) >= gap)
                            && ((foundnodes.get(5).time - foundnodes.get(4).time) >= gap)
                            && ((foundnodes.get(6).time - foundnodes.get(5).time) >= gap)
                            && ((foundnodes.get(7).time - foundnodes.get(6).time) >= gap)
                            && ((foundnodes.get(8).time - foundnodes.get(7).time) >= gap)
                            && ((foundnodes.get(9).time - foundnodes.get(8).time) >= gap)
                            && ((foundnodes.get(10).time - foundnodes.get(9).time) >= gap)
                            && ((foundnodes.get(11).time - foundnodes.get(10).time) >= gap)
                            && ((foundnodes.get(12).time - foundnodes.get(11).time) >= gap)
                            && ((foundnodes.get(13).time - foundnodes.get(12).time) >= gap)
                            && ((foundnodes.get(14).time - foundnodes.get(13).time) >= gap)
                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(14).time) >= gap)
            ) {
                goodLineVariants.add(currentLineVariant);
            }
        }

        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - szesnaście linii minimalny odstęp (tylko dla istniejącej listy LineVariantów)

    static List<LineVariant> szesnascieLiniiMinOdstepIstniejaceLineVarianty(List<LineVariant> lines, LineName
            lineName1, LineName lineName2, LineName lineName3, LineName lineName4, LineName lineName5, LineName
                                                                                    lineName6, LineName lineName7, LineName lineName8, LineName lineName9, LineName lineName10, LineName
                                                                                    lineName11, LineName lineName12, LineName lineName13, LineName lineName14, LineName lineName15, LineName
                                                                                    lineName16, NodeName node, int gap) {
        List<LineVariant> goodLineVariants = new ArrayList<>();


        for (int i = 0; i < lines.size(); i++) {
            LineVariant currentLineVariant = lines.get(i);
            List<MpkNode> foundnodes = currentLineVariant.findLineAndNodes(lineName1, lineName2, lineName3, lineName4, lineName5, lineName6, lineName7, lineName8, lineName9, lineName10, lineName11, lineName12, lineName13, lineName14, lineName15, lineName16, node);


            Collections.sort(foundnodes);

            if (
                    ((foundnodes.get(1).time - foundnodes.get(0).time) >= gap)
                            && ((foundnodes.get(2).time - foundnodes.get(1).time) >= gap)
                            && ((foundnodes.get(3).time - foundnodes.get(2).time) >= gap)
                            && ((foundnodes.get(4).time - foundnodes.get(3).time) >= gap)
                            && ((foundnodes.get(5).time - foundnodes.get(4).time) >= gap)
                            && ((foundnodes.get(6).time - foundnodes.get(5).time) >= gap)
                            && ((foundnodes.get(7).time - foundnodes.get(6).time) >= gap)
                            && ((foundnodes.get(8).time - foundnodes.get(7).time) >= gap)
                            && ((foundnodes.get(9).time - foundnodes.get(8).time) >= gap)
                            && ((foundnodes.get(10).time - foundnodes.get(9).time) >= gap)
                            && ((foundnodes.get(11).time - foundnodes.get(10).time) >= gap)
                            && ((foundnodes.get(12).time - foundnodes.get(11).time) >= gap)
                            && ((foundnodes.get(13).time - foundnodes.get(12).time) >= gap)
                            && ((foundnodes.get(14).time - foundnodes.get(13).time) >= gap)
                            && ((foundnodes.get(15).time - foundnodes.get(14).time) >= gap)
                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(15).time) >= gap)
            ) {
                goodLineVariants.add(currentLineVariant);
            }
        }

        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - dwie linie maksymalny odstęp

    static List<LineVariant> dwieLinieMaxOdstep(List<LineVariant> lines, NodeName node, int gap) {

        List<LineVariant> goodLineVariants = new ArrayList<>();


        for (int i = 0; i < lines.size(); i++) {
            LineVariant currentLineVariant = lines.get(i);
            List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

            if (Math.abs(foundnodes.get(0).time - foundnodes.get(1).time) <= gap) {
                goodLineVariants.add(currentLineVariant);
            }
        }


        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - dwie linie maksymalny odstęp z zachowaniem kolejności

    static List<LineVariant> dwieLinieMaxOdstepKolejnosc(List<LineVariant> lines, LineName lineName1, LineName
            lineName2, NodeName node, int gap) {

        List<LineVariant> goodLineVariants = new ArrayList<>();


        for (int i = 0; i < lines.size(); i++) {
            LineVariant currentLineVariant = lines.get(i);
            List<MpkNode> foundnodes = currentLineVariant.findOnlyOneLineAndNode(lineName1, node);
            foundnodes.addAll(currentLineVariant.findOnlyOneLineAndNode(lineName2, node));

            if ((foundnodes.get(1).time - foundnodes.get(0).time <= gap) || ((foundnodes.get(1).time - foundnodes.get(0).time < 0) && (foundnodes.get(1).time + Period.TAKT - foundnodes.get(0).time <= gap))) {
                goodLineVariants.add(currentLineVariant);
            }
        }


        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - dwie linie maksymalny odstęp (tylko dla istniejącej listy LineVariantów)

    static List<LineVariant> dwieLinieMaxOdstepIstniejaceLineVarianty(List<LineVariant> lines, LineName
            lineName1, LineName lineName2, NodeName node, int gap) {
        List<LineVariant> goodLineVariants = new ArrayList<>();


        for (int i = 0; i < lines.size(); i++) {
            LineVariant currentLineVariant = lines.get(i);
            List<MpkNode> foundnodes = currentLineVariant.findLineAndNodes(lineName1, lineName2, node);


            Collections.sort(foundnodes);

            if (
                    ((foundnodes.get(1).time - foundnodes.get(0).time) <= gap)
                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(1).time) <= gap)
            ) goodLineVariants.add(currentLineVariant);
        }

        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - trzy linie maksymalny odstęp (tylko dla istniejącej listy LineVariantów)

    static List<LineVariant> trzyLinieMaxOdstepIstniejaceLineVarianty(List<LineVariant> lines, LineName
            lineName1, LineName lineName2, LineName lineName3, NodeName node, int gap) {
        List<LineVariant> goodLineVariants = new ArrayList<>();


        for (int i = 0; i < lines.size(); i++) {
            LineVariant currentLineVariant = lines.get(i);
            List<MpkNode> foundnodes = currentLineVariant.findLineAndNodes(lineName1, lineName2, lineName3, node);


            Collections.sort(foundnodes);

            if (
                    ((foundnodes.get(1).time - foundnodes.get(0).time) <= gap)
                            && ((foundnodes.get(2).time - foundnodes.get(1).time) <= gap)
                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(2).time) <= gap)
            ) {
                goodLineVariants.add(currentLineVariant);
            }
        }

        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - cztery linie maksymalny odstęp (tylko dla istniejącej listy LineVariantów)

    static List<LineVariant> czteryLinieMaxOdstepIstniejaceLineVarianty(List<LineVariant> lines, LineName
            lineName1, LineName lineName2, LineName lineName3, LineName lineName4, NodeName node, int gap) {
        List<LineVariant> goodLineVariants = new ArrayList<>();


        for (int i = 0; i < lines.size(); i++) {
            LineVariant currentLineVariant = lines.get(i);
            List<MpkNode> foundnodes = currentLineVariant.findLineAndNodes(lineName1, lineName2, lineName3, lineName4, node);


            Collections.sort(foundnodes);

            if (
                    ((foundnodes.get(1).time - foundnodes.get(0).time) <= gap)
                            && ((foundnodes.get(2).time - foundnodes.get(1).time) <= gap)
                            && ((foundnodes.get(3).time - foundnodes.get(2).time) <= gap)
                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(3).time) <= gap)
            ) {
                goodLineVariants.add(currentLineVariant);
            }
        }

        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - piec linii maksymalny odstęp (tylko dla istniejącej listy LineVariantów)

    static List<LineVariant> piecLiniiMaxOdstepIstniejaceLineVarianty(List<LineVariant> lines, LineName
            lineName1, LineName lineName2, LineName lineName3, LineName lineName4, LineName lineName5, NodeName node, int gap) {
        List<LineVariant> goodLineVariants = new ArrayList<>();


        for (int i = 0; i < lines.size(); i++) {
            LineVariant currentLineVariant = lines.get(i);
            List<MpkNode> foundnodes = currentLineVariant.findLineAndNodes(lineName1, lineName2, lineName3, lineName4, lineName5, node);


            Collections.sort(foundnodes);

            if (
                    ((foundnodes.get(1).time - foundnodes.get(0).time) <= gap)
                            && ((foundnodes.get(2).time - foundnodes.get(1).time) <= gap)
                            && ((foundnodes.get(3).time - foundnodes.get(2).time) <= gap)
                            && ((foundnodes.get(4).time - foundnodes.get(3).time) <= gap)
                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(4).time) <= gap)
            ) {
                goodLineVariants.add(currentLineVariant);
            }
        }

        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - sześć linii maksymalny odstęp (tylko dla istniejącej listy LineVariantów)

    static List<LineVariant> szescLiniiMaxOdstepIstniejaceLineVarianty(List<LineVariant> lines, LineName
            lineName1, LineName lineName2, LineName lineName3, LineName lineName4, LineName lineName5, LineName
                                                                               lineName6, NodeName node, int gap) {
        List<LineVariant> goodLineVariants = new ArrayList<>();


        for (int i = 0; i < lines.size(); i++) {
            LineVariant currentLineVariant = lines.get(i);
            List<MpkNode> foundnodes = currentLineVariant.findLineAndNodes(lineName1, lineName2, lineName3, lineName4, lineName5, lineName6, node);


            Collections.sort(foundnodes);

            if (
                    ((foundnodes.get(1).time - foundnodes.get(0).time) <= gap)
                            && ((foundnodes.get(2).time - foundnodes.get(1).time) <= gap)
                            && ((foundnodes.get(3).time - foundnodes.get(2).time) <= gap)
                            && ((foundnodes.get(4).time - foundnodes.get(3).time) <= gap)
                            && ((foundnodes.get(5).time - foundnodes.get(4).time) <= gap)
                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(5).time) >= gap)
            ) {
                goodLineVariants.add(currentLineVariant);
            }
        }

        return goodLineVariants;
    }


    // metoda sprawdzająca warunki - siedem linii maksymalny odstęp (tylko dla istniejącej listy LineVariantów)

    static List<LineVariant> siedemLiniiMaxOdstepIstniejaceLineVarianty(List<LineVariant> lines, LineName
            lineName1, LineName lineName2, LineName lineName3, LineName lineName4, LineName lineName5, LineName
                                                                                lineName6, LineName lineName7, NodeName node, int gap) {
        List<LineVariant> goodLineVariants = new ArrayList<>();


        for (int i = 0; i < lines.size(); i++) {
            LineVariant currentLineVariant = lines.get(i);
            List<MpkNode> foundnodes = currentLineVariant.findLineAndNodes(lineName1, lineName2, lineName3, lineName4, lineName5, lineName6, lineName7, node);


            Collections.sort(foundnodes);

            if (
                    ((foundnodes.get(1).time - foundnodes.get(0).time) <= gap)
                            && ((foundnodes.get(2).time - foundnodes.get(1).time) <= gap)
                            && ((foundnodes.get(3).time - foundnodes.get(2).time) <= gap)
                            && ((foundnodes.get(4).time - foundnodes.get(3).time) <= gap)
                            && ((foundnodes.get(5).time - foundnodes.get(4).time) <= gap)
                            && ((foundnodes.get(6).time - foundnodes.get(5).time) <= gap)
                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(6).time) <= gap)
            ) {
                goodLineVariants.add(currentLineVariant);
            }
        }

        return goodLineVariants;
    }


}


