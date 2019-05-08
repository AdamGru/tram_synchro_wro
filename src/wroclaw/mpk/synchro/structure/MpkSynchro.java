package wroclaw.mpk.synchro.structure;

import wroclaw.mpk.synchro.veryfication.*;
import wroclaw.mpk.synchro.operation.Operation;
import wroclaw.mpk.synchro.veryfication.*;

import java.io.*;
import java.util.*;

public class MpkSynchro {

    public void doSynchroCalculate() throws IOException {

        long millisActualTime = System.currentTimeMillis();

        // tworzenie wariantów linii

        LineVariantFactory lineVariantFactory = new LineVariantFactory();

        List<LineVariant> poswietne1 = lineVariantFactory.getPoswietne1();
        List<LineVariant> biskupin1 = lineVariantFactory.getBiskupin1();
        List<LineVariant> krzyki2 = lineVariantFactory.getKrzyki2();
        List<LineVariant> biskupin2 = lineVariantFactory.getBiskupin2();
        List<LineVariant> ksieze3 = lineVariantFactory.getKsieze3();
        List<LineVariant> lesnica3 = lineVariantFactory.getLesnica3();
        List<LineVariant> biskupin4 = lineVariantFactory.getBiskupin4();
        List<LineVariant> oporow4 = lineVariantFactory.getOporow4();
        List<LineVariant> ksieze5 = lineVariantFactory.getKsieze5();
        List<LineVariant> oporow5 = lineVariantFactory.getOporow5();
        List<LineVariant> krzyki6 = lineVariantFactory.getKrzyki6();
        List<LineVariant> kowale6 = lineVariantFactory.getKowale6();
        List<LineVariant> poswietne7 = lineVariantFactory.getPoswietne7();
        List<LineVariant> klecina7 = lineVariantFactory.getKlecina7();
        List<LineVariant> tarnogaj8 = lineVariantFactory.getTarnogaj8();
        List<LineVariant> karlowice8 = lineVariantFactory.getKarlowice8();
        List<LineVariant> sepolno9 = lineVariantFactory.getSepolno9();
        List<LineVariant> park9 = lineVariantFactory.getPark9();
        List<LineVariant> lesnica10 = lineVariantFactory.getLesnica10();
        List<LineVariant> biskupin10 = lineVariantFactory.getBiskupin10();
        List<LineVariant> grabiszynska_cm11 = lineVariantFactory.getGrabiszynska_cm11();
        List<LineVariant> kromera11 = lineVariantFactory.getKromera11();
        List<LineVariant> fat14 = lineVariantFactory.getFat14();
        List<LineVariant> osobowice14 = lineVariantFactory.getOsobowice14();
        List<LineVariant> park15 = lineVariantFactory.getPark15();
        List<LineVariant> poswietne15 = lineVariantFactory.getPoswietne15();
        List<LineVariant> sepolno17 = lineVariantFactory.getSepolno17();
        List<LineVariant> klecina17 = lineVariantFactory.getKlecina17();
        List<LineVariant> oporow20 = lineVariantFactory.getOporow20();
        List<LineVariant> lesnica20 = lineVariantFactory.getLesnica20();
        List<LineVariant> wpp23 = lineVariantFactory.getWpp23();
        List<LineVariant> kromera23 = lineVariantFactory.getKromera23();
        List<LineVariant> fat24 = lineVariantFactory.getFat24();
        List<LineVariant> osobowice24 = lineVariantFactory.getOsobowice24();
        List<LineVariant> gaj31 = lineVariantFactory.getGaj31();
        List<LineVariant> st_wroclaw31 = lineVariantFactory.getSt_wroclaw31();
        List<LineVariant> gaj32 = lineVariantFactory.getGaj32();
        List<LineVariant> kozanow32 = lineVariantFactory.getKozanow32();
        List<LineVariant> nadodrze0l = lineVariantFactory.getNadodrze0l();
        List<LineVariant> nadodrze0p = lineVariantFactory.getNadodrze0p();
        List<LineVariant> pilczyce33 = lineVariantFactory.getPilczyce33();
        List<LineVariant> sepolno33 = lineVariantFactory.getSepolno33();

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

        List<LineVariant> step = CzteryLinieJednaOdchylkaWymuszona.execute(Operation.mix4ListLineVariant(poswietne1, krzyki2, oporow4, lesnica10), NodeName.BISKUPIN);
        List<LineVariant> mix = Operation.nonExclusiveLineVariant(step);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        /////////////odjazdy z Biskupina 2, 10

        System.out.println("warunek 2");

        step = DwieLinieBezOdchylek.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, krzyki2), Operation.useOnlyAvaliableLineVariants(availableLineVariants, lesnica10)), NodeName.BISKUPIN);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        /////////////narzucenie odjazdu 10 z Biskupina

        System.out.println("warunek 3");

        step = NarzucenieStartu.execute(lesnica10, NodeName.BISKUPIN, 10);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Galerii Dominikańskiej w strone Dworca i Rynku 2, 4, 10

        System.out.println("warunek 4");

        mix = TrzyLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.KRZYKI_2, LineName.OPOROW_4, LineName.LESNICA_10, NodeName.DOMINIKANSKA, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////przyjazdy do Leśnicy 3, 10, 20

        System.out.println("warunek 5");

        step = TrzyLinieJednaOdchylkaWymuszona.execute(Operation.mix3ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, lesnica3), Operation.useOnlyAvaliableLineVariants(availableLineVariants, lesnica10), Operation.useOnlyAvaliableLineVariants(availableLineVariants, lesnica20)), NodeName.PILCZYCE);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Galerii Dominikańskiej w strone Dworca i Rynku 2, 3, 4, 10

        System.out.println("warunek 6");

        mix = CzteryLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.KRZYKI_2, LineName.LESNICA_3, LineName.OPOROW_4, LineName.LESNICA_10, NodeName.DOMINIKANSKA, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        /////////////Odjazdy z Księża 3, 5

        System.out.println("warunek 7");

        step = DwieLinieBezOdchylek.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, lesnica3), Operation.useOnlyAvaliableLineVariants(availableLineVariants, oporow5)), NodeName.KSIEZE);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Galerii Dominikańskiej w strone Dworca i Rynku 2, 3, 4, 5, 10

        System.out.println("warunek 8");

        mix = PiecLiniiMinOdstepIstniejaceLineVarianty.execute(mix, LineName.KRZYKI_2, LineName.LESNICA_3, LineName.OPOROW_4, LineName.OPOROW_5, LineName.LESNICA_10, NodeName.DOMINIKANSKA, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        /////////////przyjazdy do Oporowa 4, 5

        System.out.println("warunek 9");

        mix = DwieLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.OPOROW_4, LineName.OPOROW_5, NodeName.OPOROW, 4);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////Grabiszyńska w stronę Oporowa 4, 5, 11, 24

        System.out.println("warunek 10");

        step = CzteryLinieBezOdchylek.execute(Operation.mix4ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, oporow4), Operation.useOnlyAvaliableLineVariants(availableLineVariants, oporow5), Operation.useOnlyAvaliableLineVariants(availableLineVariants, grabiszynska_cm11), Operation.useOnlyAvaliableLineVariants(availableLineVariants, fat24)), NodeName.LEGIONOW);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        /////////////Grabiszyńska w stronę Oporowa 5 i 11

        System.out.println("warunek 11");

        step = DwieLinieBezOdchylek.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, oporow5), Operation.useOnlyAvaliableLineVariants(availableLineVariants, grabiszynska_cm11)), NodeName.LEGIONOW);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Galerii Dominikańskiej w kierunku płd (Skargi, Kołłątaja) 2, 5, 11

        System.out.println("warunek 12");

        mix = TrzyLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.KRZYKI_2, LineName.OPOROW_5, LineName.GRABISZYNSKA_CM_11, NodeName.DOMINIKANSKA, 2);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        /////////////FAT 24

        System.out.println("warunek 13");

        step = DwieLinieMaxOdstepKolejnosc.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, fat24), Operation.useOnlyAvaliableLineVariants(availableLineVariants, osobowice24)), LineName.FAT_24, LineName.OSOBOWICE_24, NodeName.FAT, 4);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        /////////////FAT 24

        System.out.println("warunek 14");

        step = DwieLinieMinOdstepKolejnosc.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, fat24), Operation.useOnlyAvaliableLineVariants(availableLineVariants, osobowice24)), LineName.FAT_24, LineName.OSOBOWICE_24, NodeName.FAT, 1);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////odjazdy z Osobowic 14 i 24

        System.out.println("warunek 15");

        step = DwieLinieBezOdchylek.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, fat14), Operation.useOnlyAvaliableLineVariants(availableLineVariants, fat24)), NodeName.OSOBOWICE);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Powstańców w kierunku płd. od Arkad do Hallera 2, 14

        System.out.println("warunek 16");

        mix = DwieLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.KRZYKI_2, LineName.FAT_14, NodeName.ARKADY, 2);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        /////////////przyjazdy do Osobowic 14 i 24

        System.out.println("warunek 17");

        step = DwieLinieBezOdchylek.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, osobowice14), Operation.useOnlyAvaliableLineVariants(availableLineVariants, osobowice24)), NodeName.OSOBOWICE);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////FAT 14

        System.out.println("warunek 18");

        step = DwieLinieMaxOdstepKolejnosc.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, fat14), Operation.useOnlyAvaliableLineVariants(availableLineVariants, osobowice14)), LineName.FAT_14, LineName.OSOBOWICE_14, NodeName.FAT, 4);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////FAT 14

        System.out.println("warunek 19");

        step = DwieLinieMinOdstepKolejnosc.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, fat14), Operation.useOnlyAvaliableLineVariants(availableLineVariants, osobowice14)), LineName.FAT_14, LineName.OSOBOWICE_14, NodeName.FAT, 1);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        /////////////20, 24 Hallera w stronę Powstańców 20 i 24

        System.out.println("warunek 20");

        step = DwieLinieJednaOdchylkaWymuszona.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, lesnica20), Operation.useOnlyAvaliableLineVariants(availableLineVariants, osobowice24)), NodeName.FAT);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// przyjazd do Poświętnego 1, 7

        System.out.println("warunek 21");

        step = DwieLinieDwieOdchylkiWYmuszone.exectue(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, poswietne1), Operation.useOnlyAvaliableLineVariants(availableLineVariants, poswietne7)), NodeName.POSWIETNE);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Powstańców w kierunku pn. od Hallera do Arkad 7, 20, 24

        System.out.println("warunek 22");

        mix = TrzyLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.POSWIETNE_7, LineName.LESNICA_20, LineName.OSOBOWICE_24, NodeName.ARKADY, 2);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Powstańców w kierunku pn. od Hallera do Arkad 6, 7

        System.out.println("warunek 23");

        step = DwieLinieBezOdchylek.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, kowale6), Operation.useOnlyAvaliableLineVariants(availableLineVariants, poswietne7)), NodeName.ARKADY);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Powstańców w kierunku pn. od Hallera do Arkad 6, 7, 20, 24

        System.out.println("warunek 24");

        mix = CzteryLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.KOWALE_6, LineName.POSWIETNE_7, LineName.LESNICA_20, LineName.OSOBOWICE_24, NodeName.ARKADY, 2);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        /////////// przyjazdy do Poświętnego 1, 15

        System.out.println("warunek 25");

        step = DwieLinieMinOdstep.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, poswietne1), Operation.useOnlyAvaliableLineVariants(availableLineVariants, poswietne15)), NodeName.POSWIETNE, 4);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// przyjazdy do Poświętnego 1, 7, 15

        System.out.println("warunek 26");

        mix = TrzyLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.POSWIETNE_1, LineName.POSWIETNE_7, LineName.POSWIETNE_15, NodeName.POSWIETNE, 4);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Staszica w kierunku pn. 14, 15, 24

        System.out.println("warunek 27");

        mix = TrzyLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.OSOBOWICE_14, LineName.POSWIETNE_15, LineName.OSOBOWICE_24, NodeName.STASZICA, 2);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Piłsudkiego od Dworca w kierunku pl. Legionów 5, 11, 15

        System.out.println("warunek 28");

        mix = TrzyLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.OPOROW_5, LineName.GRABISZYNSKA_CM_11, LineName.POSWIETNE_15, NodeName.ARKADY, 2);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// odjazdy z Parku 9, 15

        System.out.println("warunek 29");

        step = DwieLinieBezOdchylek.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, sepolno9), Operation.useOnlyAvaliableLineVariants(availableLineVariants, poswietne15)), NodeName.PARK);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// przyjazdy na Sępolno 9, 17

        System.out.println("warunek 30");

        step = DwieLinieBezOdchylek.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, sepolno9), Operation.useOnlyAvaliableLineVariants(availableLineVariants, sepolno17)), NodeName.SEPOLNO);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Powstańców w kierunku pn. od Hallera do Arkad 6, 7, 17, 20, 24

        System.out.println("warunek 31");

        mix = PiecLiniiMinOdstepIstniejaceLineVarianty.execute(mix, LineName.KOWALE_6, LineName.POSWIETNE_7, LineName.SEPOLNO_17, LineName.LESNICA_20, LineName.OSOBOWICE_24, NodeName.ARKADY, 2);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Powstańców w kierunku pn. od Hallera do Arkad 2, 7

        System.out.println("warunek 32");

        step = DwieLinieMinOdstep.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, biskupin2), Operation.useOnlyAvaliableLineVariants(availableLineVariants, poswietne7)), NodeName.KRZYKI, 2);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Powstańców w kierunku pn. od Hallera do Arkad 2, 6, 7, 17, 20, 24

        System.out.println("warunek 33");

        mix = SzescLiniiMinOdstepIstniejaceLineVarianty.execute(mix, LineName.BISKUPIN_2, LineName.KOWALE_6, LineName.POSWIETNE_7, LineName.SEPOLNO_17, LineName.LESNICA_20, LineName.OSOBOWICE_24, NodeName.ARKADY, 2);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Powstańców w kierunku pn. od Hallera do Arkad 2, 6, 7, 17, 20, 24

        System.out.println("warunek 34");

        mix = SzescLiniiMaxOdstepIstniejaceLineVarianty.execute(mix, LineName.BISKUPIN_2, LineName.KOWALE_6, LineName.POSWIETNE_7, LineName.SEPOLNO_17, LineName.LESNICA_20, LineName.OSOBOWICE_24, NodeName.ARKADY, 4);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Dworca w stronę Galerii Dominikańskiej 2, 9

        System.out.println("warunek 35");

        mix = DwieLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.BISKUPIN_2, LineName.SEPOLNO_9, NodeName.GLOWNY, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Legnicka od JPII w stronę Pilczyc 10, 31

        System.out.println("warunek 36");

        step = DwieLinieMinOdstep.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, lesnica10), Operation.useOnlyAvaliableLineVariants(availableLineVariants, st_wroclaw31)), NodeName.JPII, 2);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Legnicka od JPII w stronę Pilczyc 3, 10, 20, 31

        System.out.println("warunek 37");

        mix = CzteryLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.LESNICA_3, LineName.LESNICA_10, LineName.LESNICA_20, LineName.ST_WROCLAW_31, NodeName.JPII, 2);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// od Legionów do JPII 14, 31

        System.out.println("warunek 38");

        mix = DwieLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.OSOBOWICE_14, LineName.ST_WROCLAW_31, NodeName.LEGIONOW, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Piłsudskiego od Arkad do Legionów 5, 11, 15, 31

        System.out.println("warunek 39");

        mix = CzteryLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.OPOROW_5, LineName.GRABISZYNSKA_CM_11, LineName.POSWIETNE_15, LineName.ST_WROCLAW_31, NodeName.ARKADY, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Legnicka od JPII w stronę Pilczyc 10, 32

        System.out.println("warunek 40");

        step = DwieLinieMinOdstep.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, lesnica10), Operation.useOnlyAvaliableLineVariants(availableLineVariants, kozanow32)), NodeName.JPII, 2);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// odjazdy z Gaju 31, 32

        System.out.println("warunek 41");

        step = DwieLinieBezOdchylek.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, st_wroclaw31), Operation.useOnlyAvaliableLineVariants(availableLineVariants, kozanow32)), NodeName.GAJ);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Legnicka od JPII w stronę Pilczyc 3, 10, 20, 31, 32

        System.out.println("warunek 42");

        mix = PiecLiniiMinOdstepIstniejaceLineVarianty.execute(mix, LineName.LESNICA_3, LineName.LESNICA_10, LineName.LESNICA_20, LineName.ST_WROCLAW_31, LineName.KOZANOW_32, NodeName.JPII, 2);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// od Legionów do JPII 14, 31, 32

        System.out.println("warunek 43");

        mix = TrzyLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.OSOBOWICE_14, LineName.ST_WROCLAW_31, LineName.KOZANOW_32, NodeName.LEGIONOW, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Piłsudskiego od Arkad do Legionów 5, 11, 15, 31, 32

        System.out.println("warunek 44");

        mix = PiecLiniiMinOdstepIstniejaceLineVarianty.execute(mix, LineName.OPOROW_5, LineName.GRABISZYNSKA_CM_11, LineName.POSWIETNE_15, LineName.ST_WROCLAW_31, LineName.KOZANOW_32, NodeName.ARKADY, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Grabiszyńska od FATu do Legionów 11, 14

        System.out.println("warunek 45");

        step = DwieLinieMinOdstep.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, kromera11), Operation.useOnlyAvaliableLineVariants(availableLineVariants, osobowice14)), NodeName.LEGIONOW, 4);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Dworca w stronę Galerii Dominikańskiej 2, 9, 11

        System.out.println("warunek 46");

        mix = TrzyLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.BISKUPIN_2, LineName.SEPOLNO_9, LineName.KROMERA_11, NodeName.GLOWNY, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Galerii Dominikańskiej do Bema 9, 11, 17

        System.out.println("warunek 47");

        mix = TrzyLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.SEPOLNO_9, LineName.KROMERA_11, LineName.SEPOLNO_17, NodeName.DOMINIKANSKA, 3);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// przyjazdy na Kromera 6, 11

        System.out.println("warunek 48");

        mix = DwieLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.KOWALE_6, LineName.KROMERA_11, NodeName.KROMERA, 5);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Grabiszyńska od FATu do Legionów 4, 14

        System.out.println("warunek 49");

        step = DwieLinieMinOdstep.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, biskupin4), Operation.useOnlyAvaliableLineVariants(availableLineVariants, osobowice14)), NodeName.LEGIONOW, 4);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// odjazdy z Oporowa 4, 20

        System.out.println("warunek 50");

        mix = DwieLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.BISKUPIN_4, LineName.LESNICA_20, NodeName.OPOROW, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// przyjazdy na Biskupin 2, 4

        System.out.println("warunek 51");

        mix = DwieLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.BISKUPIN_2, LineName.BISKUPIN_4, NodeName.BISKUPIN, 3);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Grabiszyńska od FATu do Legionów 5, 14

        System.out.println("warunek 52");

        step = DwieLinieMinOdstep.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, ksieze5), Operation.useOnlyAvaliableLineVariants(availableLineVariants, osobowice14)), NodeName.LEGIONOW, 4);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Grabiszyńska od FATu do Legionów 5, 11

        System.out.println("warunek 53");

        step = DwieLinieBezOdchylek.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, ksieze5), Operation.useOnlyAvaliableLineVariants(availableLineVariants, kromera11)), NodeName.LEGIONOW);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Dworca w stronę Galerii Dominikańskiej 2, 5, 9, 11

        System.out.println("warunek 54");

        mix = CzteryLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.BISKUPIN_2, LineName.KSIEZE_5, LineName.SEPOLNO_9, LineName.KROMERA_11, NodeName.GLOWNY, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Galerii Dominikańskiej w strone zach. 2, 4, 5

        System.out.println("warunek 55");

        mix = TrzyLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.BISKUPIN_2, LineName.BISKUPIN_4, LineName.KSIEZE_5, NodeName.DOMINIKANSKA, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////Grabiszyńska w stronę pl. Legionów 4, 5, 11, 14

        System.out.println("warunek 56");

        step = CzteryLinieJednaOdchylkaWymuszona.execute(Operation.mix4ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, biskupin4), Operation.useOnlyAvaliableLineVariants(availableLineVariants, ksieze5), Operation.useOnlyAvaliableLineVariants(availableLineVariants, kromera11), Operation.useOnlyAvaliableLineVariants(availableLineVariants, osobowice14)), NodeName.LEGIONOW);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// odjazdy z Oporowa 4, 5, 20

        System.out.println("warunek 57");

        mix = TrzyLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.BISKUPIN_4, LineName.KSIEZE_5, LineName.LESNICA_20, NodeName.OPOROW, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// przyjazdy na Sępolno 9, 33

        System.out.println("warunek 58");

        step = DwieLinieMinOdstep.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, sepolno9), Operation.useOnlyAvaliableLineVariants(availableLineVariants, sepolno33)), NodeName.SEPOLNO, 4);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// przyjazdy na Sępolno 9, 17, 33

        System.out.println("warunek 59");

        mix = TrzyLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.SEPOLNO_9, LineName.SEPOLNO_17, LineName.SEPOLNO_33, NodeName.SEPOLNO, 4);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Galerii Dominikańskiej w strone zach. 2, 4, 5, 33

        System.out.println("warunek 60");

        mix = CzteryLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.BISKUPIN_2, LineName.BISKUPIN_4, LineName.KSIEZE_5, LineName.SEPOLNO_33, NodeName.DOMINIKANSKA, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// przyjazdy na Księże 3, 5

        System.out.println("warunek 61");

        step = DwieLinieBezOdchylek.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, ksieze3), Operation.useOnlyAvaliableLineVariants(availableLineVariants, ksieze5)), NodeName.KSIEZE);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Galerii Dominikańskiej w strone zach. 2, 3, 4, 5, 33

        System.out.println("warunek 62");

        mix = PiecLiniiMinOdstepIstniejaceLineVarianty.execute(mix, LineName.BISKUPIN_2, LineName.KSIEZE_3, LineName.BISKUPIN_4, LineName.KSIEZE_5, LineName.SEPOLNO_33, NodeName.DOMINIKANSKA, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// odjazdy z Leśnicy 3, 10

        System.out.println("warunek 63");

        step = DwieLinieMinOdstep.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, ksieze3), Operation.useOnlyAvaliableLineVariants(availableLineVariants, biskupin10)), NodeName.LESNICA, 6);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Galerii Dominikańskiej w strone zach. 2, 3, 4, 5, 10, 33

        System.out.println("warunek 64");

        mix = SzescLiniiMinOdstepIstniejaceLineVarianty.execute(mix, LineName.BISKUPIN_2, LineName.KSIEZE_3, LineName.BISKUPIN_4, LineName.KSIEZE_5, LineName.BISKUPIN_10, LineName.SEPOLNO_33, NodeName.DOMINIKANSKA, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// przyjazdy na Biskupin 2, 4, 10

        System.out.println("warunek 65");

        mix = TrzyLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.BISKUPIN_2, LineName.BISKUPIN_4, LineName.BISKUPIN_10, NodeName.BISKUPIN, 3);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// odjazdy z Leśnicy 3, 20

        System.out.println("warunek 66");

        step = DwieLinieMinOdstep.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, ksieze3), Operation.useOnlyAvaliableLineVariants(availableLineVariants, oporow20)), NodeName.LESNICA, 6);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// odjazdy z Leśnicy 3, 10, 20

        System.out.println("warunek 67");

        step = TrzyLinieBezOdchylek.execute(Operation.mix3ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, ksieze3), Operation.useOnlyAvaliableLineVariants(availableLineVariants, biskupin10), Operation.useOnlyAvaliableLineVariants(availableLineVariants, oporow20)), NodeName.LESNICA);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Legnicka od Pilczyc w stornę JPII 3, 10, 20, 33

        System.out.println("warunek 68");

        mix = CzteryLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.KSIEZE_3, LineName.BISKUPIN_10, LineName.OPOROW_20, LineName.SEPOLNO_33, NodeName.JPII, 2);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Powstańców od Arkad do Hallera 2, 14, 20

        System.out.println("warunek 69");

        mix = TrzyLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.KRZYKI_2, LineName.FAT_14, LineName.OPOROW_20, NodeName.ARKADY, 2);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Hallera od Powstańców do FATu 14, 20

        System.out.println("warunek 70");

        step = DwieLinieDwieOdchylkiWYmuszone.exectue(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, fat14), Operation.useOnlyAvaliableLineVariants(availableLineVariants, oporow20)), NodeName.FAT);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// przyjazdy na Oporów

        System.out.println("warunek 71");

        mix = TrzyLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.OPOROW_4, LineName.OPOROW_5, LineName.OPOROW_20, NodeName.OPOROW, 2);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Legnicka od Pilczyc do JPII 3, 31

        System.out.println("warunek 72");

        step = DwieLinieMinOdstep.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, ksieze3), Operation.useOnlyAvaliableLineVariants(availableLineVariants, gaj31)), NodeName.JPII, 2);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Legnicka od Pilczyc do JPII 3, 10, 20, 31, 33

        System.out.println("warunek 73");

        mix = PiecLiniiMinOdstepIstniejaceLineVarianty.execute(mix, LineName.KSIEZE_3, LineName.BISKUPIN_10, LineName.OPOROW_20, LineName.GAJ_31, LineName.SEPOLNO_33, NodeName.JPII, 2);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// od JPII do pl. Legionów 24, 31

        System.out.println("warunek 74");

        mix = DwieLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.FAT_24, LineName.GAJ_31, NodeName.JPII, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Piłsudskiego od pl. Legionów do Dworca 5, 11, 31

        System.out.println("warunek 75");

        mix = TrzyLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.KSIEZE_5, LineName.KROMERA_11, LineName.GAJ_31, NodeName.ARKADY, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Legnicka od Pilczyc do JPII 3, 32

        System.out.println("warunek 76");

        step = DwieLinieMinOdstep.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, ksieze3), Operation.useOnlyAvaliableLineVariants(availableLineVariants, gaj32)), NodeName.JPII, 2);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// przyjazdy do Gaju 31, 32

        System.out.println("warunek 77");

        step = DwieLinieBezOdchylek.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, gaj31), Operation.useOnlyAvaliableLineVariants(availableLineVariants, gaj32)), NodeName.GAJ);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Legnicka od Pilczyc do JPII 3, 10, 20, 31, 32, 33

        System.out.println("warunek 78");

        mix = SzescLiniiMinOdstepIstniejaceLineVarianty.execute(mix, LineName.KSIEZE_3, LineName.BISKUPIN_10, LineName.OPOROW_20, LineName.GAJ_31, LineName.GAJ_32, LineName.SEPOLNO_33, NodeName.JPII, 2);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// od JPII do pl. Legionów 24, 31, 32

        System.out.println("warunek 79");

        mix = TrzyLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.FAT_24, LineName.GAJ_31, LineName.GAJ_32, NodeName.JPII, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Piłsudskiego od pl. Legionów do Dworca 5, 11, 31, 32

        System.out.println("warunek 80");

        mix = CzteryLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.KSIEZE_5, LineName.KROMERA_11, LineName.GAJ_31, LineName.GAJ_32, NodeName.ARKADY, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// odjazdy z Kromera 6, 11

        System.out.println("warunek 81");

        step = DwieLinieMinOdstep.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, krzyki6), Operation.useOnlyAvaliableLineVariants(availableLineVariants, grabiszynska_cm11)), NodeName.KROMERA, 5);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Powstańców od Arkad do Hallera 2, 6, 14, 20

        System.out.println("warunek 82");

        mix = CzteryLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.KRZYKI_2, LineName.KRZYKI_6, LineName.FAT_14, LineName.OPOROW_20, NodeName.ARKADY, 2);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Powstańców w kierunku od Arkad do Hallera 6, 7

        System.out.println("warunek 83");

        step = DwieLinieJednaOdchylkaWymuszona.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, krzyki6), Operation.useOnlyAvaliableLineVariants(availableLineVariants, klecina7)), NodeName.ARKADY);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Powstańców od Arkad do Hallera 2, 6, 7, 14, 20

        System.out.println("warunek 84");

        mix = PiecLiniiMinOdstepIstniejaceLineVarianty.execute(mix, LineName.KRZYKI_2, LineName.KRZYKI_6, LineName.KLECINA_7, LineName.FAT_14, LineName.OPOROW_20, NodeName.ARKADY, 2);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Powstańców w kierunku od Arkad do Hallera 2, 17

        System.out.println("warunek 85");

        step = DwieLinieMinOdstep.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, krzyki2), Operation.useOnlyAvaliableLineVariants(availableLineVariants, klecina17)), NodeName.ARKADY, 2);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Powstańców od Arkad do Hallera 2, 6, 7, 14, 17, 20

        System.out.println("warunek 86");

        mix = SzescLiniiMinOdstepIstniejaceLineVarianty.execute(mix, LineName.KRZYKI_2, LineName.KRZYKI_6, LineName.KLECINA_7, LineName.FAT_14, LineName.KLECINA_17, LineName.OPOROW_20, NodeName.ARKADY, 2);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Powstańców od Arkad do Hallera 2, 6, 7, 14, 17, 20

        System.out.println("warunek 87");

        mix = SzescLiniiMaxOdstepIstniejaceLineVarianty.execute(mix, LineName.KRZYKI_2, LineName.KRZYKI_6, LineName.KLECINA_7, LineName.FAT_14, LineName.KLECINA_17, LineName.OPOROW_20, NodeName.ARKADY, 5);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Bema do Galerii Dominikańskiej 11, 17

        System.out.println("warunek 88");

        mix = DwieLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.GRABISZYNSKA_CM_11, LineName.KLECINA_17, NodeName.DOMINIKANSKA, 2);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// odjazdy z Sępolna 9, 17

        System.out.println("warunek 89");

        step = DwieLinieDwieOdchylkiWYmuszone.exectue(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, park9), Operation.useOnlyAvaliableLineVariants(availableLineVariants, klecina17)), NodeName.SEPOLNO);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Bema do Galerii Dominikańskiej 9, 11, 17

        System.out.println("warunek 90");

        mix = TrzyLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.PARK_9, LineName.GRABISZYNSKA_CM_11, LineName.KLECINA_17, NodeName.DOMINIKANSKA, 2);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Galerii Dominikańskiej w kierunku płd (Skargi, Kołłątaja) 2, 5, 9, 11

        System.out.println("warunek 91");

        mix = CzteryLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.KRZYKI_2, LineName.OPOROW_5, LineName.PARK_9, LineName.GRABISZYNSKA_CM_11, NodeName.DOMINIKANSKA, 2);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// odjazdy z Poświętnego 1, 7

        System.out.println("warunek 92");

        step = DwieLinieDwieOdchylkiWYmuszone.exectue(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, biskupin1), Operation.useOnlyAvaliableLineVariants(availableLineVariants, klecina7)), NodeName.POSWIETNE);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        /////////// przyjazdy do Biskupina 1, 2, 4, 10

        System.out.println("warunek 93");

        step = CzteryLinieJednaOdchylkaWymuszona.execute(Operation.mix4ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, biskupin1), Operation.useOnlyAvaliableLineVariants(availableLineVariants, biskupin2), Operation.useOnlyAvaliableLineVariants(availableLineVariants, biskupin4), Operation.useOnlyAvaliableLineVariants(availableLineVariants, biskupin10)), NodeName.BISKUPIN);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        /////////// odjazdy z Sępolna 9, 33

        System.out.println("warunek 94");

        step = DwieLinieMinOdstep.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, park9), Operation.useOnlyAvaliableLineVariants(availableLineVariants, pilczyce33)), NodeName.SEPOLNO, 4);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Galerii Dominikańskiej w strone Dworca i Rynku 2, 3, 4, 5, 10, 33

        System.out.println("warunek 95");

        mix = SzescLiniiMinOdstepIstniejaceLineVarianty.execute(mix, LineName.KRZYKI_2, LineName.LESNICA_3, LineName.OPOROW_4, LineName.OPOROW_5, LineName.LESNICA_10, LineName.PILCZYCE_33, NodeName.DOMINIKANSKA, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Legnicka od JPII w stronę Pilczyc 3, 10, 20, 31, 32, 33

        System.out.println("warunek 96");

        mix = SzescLiniiMinOdstepIstniejaceLineVarianty.execute(mix, LineName.LESNICA_3, LineName.LESNICA_10, LineName.LESNICA_20, LineName.ST_WROCLAW_31, LineName.KOZANOW_32, LineName.PILCZYCE_33, NodeName.JPII, 2);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Legnicka od JPII w stronę Pilczyc 3, 10, 20, 31, 32, 33

        System.out.println("warunek 97");

        mix = SzescLiniiMaxOdstepIstniejaceLineVarianty.execute(mix, LineName.LESNICA_3, LineName.LESNICA_10, LineName.LESNICA_20, LineName.ST_WROCLAW_31, LineName.KOZANOW_32, LineName.PILCZYCE_33, NodeName.JPII, 4);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        /////////// przyjazdy do Parku Płd. 9, 15

        System.out.println("warunek 98");

        step = DwieLinieDwieOdchylki.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, park9), Operation.useOnlyAvaliableLineVariants(availableLineVariants, park15)), NodeName.PARK);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Piłsudskiego od pl. Legionów do Dworca 5, 11, 15, 31, 32

        System.out.println("warunek 99");

        mix = PiecLiniiMinOdstepIstniejaceLineVarianty.execute(mix, LineName.KSIEZE_5, LineName.KROMERA_11, LineName.PARK_15, LineName.GAJ_31, LineName.GAJ_32, NodeName.ARKADY, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Staszica w kierunku pd. 14, 15, 24

        System.out.println("warunek 100");

        mix = TrzyLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.FAT_14, LineName.PARK_15, LineName.FAT_24, NodeName.STASZICA, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Staszica w kierunku pd. 14, 15

        System.out.println("warunek 101");

        mix = DwieLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.FAT_14, LineName.PARK_15, NodeName.STASZICA, 3);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// odjazdy z Poświętnego 1, 7, 15

        System.out.println("warunek 102");

        mix = TrzyLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.BISKUPIN_1, LineName.KLECINA_7, LineName.PARK_15, NodeName.POSWIETNE, 4);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// odjazdy z Kromera 6, 23

        System.out.println("warunek 103");

        step = DwieLinieMinOdstep.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, krzyki6), Operation.useOnlyAvaliableLineVariants(availableLineVariants, wpp23)), NodeName.KROMERA, 5);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// odjazdy z Kromera 6, 11, 23

        System.out.println("warunek 104");

        step = TrzyLinieDwieOdchylki.execute(Operation.mix3ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, krzyki6), Operation.useOnlyAvaliableLineVariants(availableLineVariants, grabiszynska_cm11), Operation.useOnlyAvaliableLineVariants(availableLineVariants, wpp23)), NodeName.KROMERA);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Bema do Galerii Dominikańskiej 9, 11, 17, 23

        System.out.println("warunek 105");

        mix = CzteryLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.PARK_9, LineName.GRABISZYNSKA_CM_11, LineName.KLECINA_17, LineName.WPP_23, NodeName.DOMINIKANSKA, 2);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Kazimierza Wlk. w stronę zach 3, 4, 10, 23, 33

        System.out.println("warunek 106");

        mix = PiecLiniiMinOdstepIstniejaceLineVarianty.execute(mix, LineName.LESNICA_3, LineName.OPOROW_4, LineName.LESNICA_10, LineName.WPP_23, LineName.PILCZYCE_33, NodeName.DOMINIKANSKA, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Legnicka od JPII w stronę Pilczyc 3, 10, 20, 23, 31, 32, 33

        System.out.println("warunek 107");

        mix = SiedemLiniiMinOdstepIstniejaceLineVarianty.execute(mix, LineName.LESNICA_3, LineName.LESNICA_10, LineName.LESNICA_20, LineName.WPP_23, LineName.ST_WROCLAW_31, LineName.KOZANOW_32, LineName.PILCZYCE_33, NodeName.JPII, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// przyjazdy do Kromera 6, 23

        System.out.println("warunek 108");

        step = DwieLinieMinOdstep.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, kowale6), Operation.useOnlyAvaliableLineVariants(availableLineVariants, kromera23)), NodeName.KROMERA, 5);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// przyjazdy do Kromera 6, 11, 23

        System.out.println("warunek 109");

        step = TrzyLinieJednaOdchylka.execute(Operation.mix3ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, kowale6), Operation.useOnlyAvaliableLineVariants(availableLineVariants, kromera11), Operation.useOnlyAvaliableLineVariants(availableLineVariants, kromera23)), NodeName.KROMERA);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Galerii Dominikańskiej do Bema 9, 11, 17, 23

        System.out.println("warunek 110");

        mix = CzteryLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.SEPOLNO_9, LineName.KROMERA_11, LineName.SEPOLNO_17, LineName.KROMERA_23, NodeName.DOMINIKANSKA, 3);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Kazimierza Wlk. w stronę wsch 3, 4, 10, 23, 33

        System.out.println("warunek 111");

        mix = PiecLiniiMinOdstepIstniejaceLineVarianty.execute(mix, LineName.KSIEZE_5, LineName.BISKUPIN_4, LineName.BISKUPIN_10, LineName.KROMERA_23, LineName.SEPOLNO_33, NodeName.DOMINIKANSKA, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Legnicka od Strzegosmkiego w stronę JPII 3, 10, 20, 23, 31, 32, 33

        System.out.println("warunek 112");

        mix = SiedemLiniiMinOdstepIstniejaceLineVarianty.execute(mix, LineName.KSIEZE_3, LineName.BISKUPIN_10, LineName.OPOROW_20, LineName.KROMERA_23, LineName.GAJ_31, LineName.GAJ_32, LineName.SEPOLNO_33, NodeName.JPII, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// od Tarnogaju i Gaju w stronę Dworca 8, 31

        System.out.println("warunek 113");

        step = DwieLinieMinOdstep.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, karlowice8), Operation.useOnlyAvaliableLineVariants(availableLineVariants, st_wroclaw31)), NodeName.AUTOBUSOWY, 4);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// od Tarnogaju i Gaju w stronę Dworca 8, 31, 32

        System.out.println("warunek 114");

        mix = TrzyLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.KARLOWICE_8, LineName.ST_WROCLAW_31, LineName.KOZANOW_32, NodeName.AUTOBUSOWY, 4);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Dworca w stronę Galerii Dominikańskiej 2, 5, 8, 9, 11

        System.out.println("warunek 115");

        mix = PiecLiniiMinOdstepIstniejaceLineVarianty.execute(mix, LineName.BISKUPIN_2, LineName.KSIEZE_5, LineName.KARLOWICE_8, LineName.SEPOLNO_9, LineName.KROMERA_11, NodeName.GLOWNY, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Galerii Dominikańskiej do Bema 8, 9, 11, 17, 23

        System.out.println("warunek 116");

        mix = PiecLiniiMinOdstepIstniejaceLineVarianty.execute(mix, LineName.KARLOWICE_8, LineName.SEPOLNO_9, LineName.KROMERA_11, LineName.SEPOLNO_17, LineName.KROMERA_23, NodeName.DOMINIKANSKA, 2);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// z Bema do Nowowiejskie 6, 8, 11, 23

        System.out.println("warunek 117");

        mix = CzteryLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.KOWALE_6, LineName.KARLOWICE_8, LineName.KROMERA_11, LineName.KROMERA_23, NodeName.BEMA, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Trzebnicka w kierunku pn. 1, 7, 8

        System.out.println("warunek 118");

        mix = TrzyLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.POSWIETNE_1, LineName.POSWIETNE_7, LineName.KARLOWICE_8, NodeName.NADODRZE, 2);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// od Dworca do Tarnogaju i Gaju 8, 31

        System.out.println("warunek 119");

        step = DwieLinieMinOdstep.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, tarnogaj8), Operation.useOnlyAvaliableLineVariants(availableLineVariants, gaj31)), NodeName.AUTOBUSOWY, 4);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// od Dworca do Tarnogaju i Gaju 8, 31, 32

        System.out.println("warunek 120");

        mix = TrzyLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.TARNOGAJ_8, LineName.GAJ_31, LineName.GAJ_32, NodeName.AUTOBUSOWY, 4);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Galerii Dominikańskiej w stronę Dworca 2, 5, 8, 9, 11

        System.out.println("warunek 121");

        mix = PiecLiniiMinOdstepIstniejaceLineVarianty.execute(mix, LineName.KRZYKI_2, LineName.OPOROW_5, LineName.TARNOGAJ_8, LineName.PARK_9, LineName.GRABISZYNSKA_CM_11, NodeName.GLOWNY, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Odjazdy z Bema do Galerii Dominikańskiej 8, 9, 11, 17, 23

        System.out.println("warunek 122");

        mix = PiecLiniiMinOdstepIstniejaceLineVarianty.execute(mix, LineName.TARNOGAJ_8, LineName.PARK_9, LineName.GRABISZYNSKA_CM_11, LineName.KLECINA_17, LineName.WPP_23, NodeName.DOMINIKANSKA, 2);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// z Nowowiejskiej do Bema 6, 8, 11, 23

        System.out.println("warunek 123");

        mix = CzteryLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.KRZYKI_6, LineName.TARNOGAJ_8, LineName.GRABISZYNSKA_CM_11, LineName.WPP_23, NodeName.BEMA, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Trzebnicka w kierunku pd. 1, 7, 8

        System.out.println("warunek 124");

        mix = TrzyLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.BISKUPIN_1, LineName.KLECINA_7, LineName.TARNOGAJ_8, NodeName.NADODRZE, 2);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        /////////// Nowowiejska 0P i 1

        System.out.println("warunek 125");

        step = DwieLinieJednaOdchylka.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, nadodrze0p), Operation.useOnlyAvaliableLineVariants(availableLineVariants, biskupin1)), NodeName.NADODRZE);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Nadodrze 0P, 1, 8

        System.out.println("warunek 126");

        mix = TrzyLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.NADODRZE_0P, LineName.BISKUPIN_1, LineName.TARNOGAJ_8, NodeName.NADODRZE, 3);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// pl. Grunwaldzki w stronę mostu Grunwaldzkiego 0P, 4, 33

        System.out.println("warunek 127");

        mix = TrzyLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.NADODRZE_0P, LineName.OPOROW_4, LineName.PILCZYCE_33, NodeName.GRUNWALDZKI, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Piłsudskiego od Arkad do Legionów 0P, 5, 11, 15, 31, 32

        System.out.println("warunek 128");

        mix = SzescLiniiMinOdstepIstniejaceLineVarianty.execute(mix, LineName.NADODRZE_0P, LineName.OPOROW_5, LineName.GRABISZYNSKA_CM_11, LineName.POSWIETNE_15, LineName.ST_WROCLAW_31, LineName.KOZANOW_32, NodeName.ARKADY, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// od Legionów do JPII 0P, 14, 31, 32

        System.out.println("warunek 129");

        mix = CzteryLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.NADODRZE_0P, LineName.OSOBOWICE_14, LineName.ST_WROCLAW_31, LineName.KOZANOW_32, NodeName.LEGIONOW, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// od Legionów do Sztaszica 0P, 14

        System.out.println("warunek 130");

        mix = DwieLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.NADODRZE_0P, LineName.OSOBOWICE_14, NodeName.LEGIONOW, 4);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Staszica w kierunku pn. 0P, 14, 15, 24

        System.out.println("warunek 131");

        mix = CzteryLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.NADODRZE_0P, LineName.OSOBOWICE_14, LineName.POSWIETNE_15, LineName.OSOBOWICE_24, NodeName.STASZICA, 2);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        /////////// Nowowiejska 0L i 1

        System.out.println("warunek 132");

        step = DwieLinieDwieOdchylki.execute(Operation.mix2ListLineVariant(Operation.useOnlyAvaliableLineVariants(availableLineVariants, nadodrze0l), Operation.useOnlyAvaliableLineVariants(availableLineVariants, poswietne1)), NodeName.NADODRZE);
        mix = Operation.mix2ListLineVariantNonEx(mix, step);
        mix = Operation.addAllNodes(mix, availableLineVariants);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Nadodrze 0L, 1, 8

        System.out.println("warunek 133");

        mix = TrzyLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.NADODRZE_0L, LineName.POSWIETNE_1, LineName.KARLOWICE_8, NodeName.NADODRZE, 2);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// most Grunwaldzki w stronę pl. Grunwaldzkiego 0L, 4, 33

        System.out.println("warunek 134");

        mix = TrzyLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.NADODRZE_0L, LineName.BISKUPIN_4, LineName.SEPOLNO_33, NodeName.GRUNWALDZKI, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Piłsudskiego od Legionów do Arkad 0L, 5, 11, 15, 31, 32

        System.out.println("warunek 135");

        mix = SzescLiniiMinOdstepIstniejaceLineVarianty.execute(mix, LineName.NADODRZE_0L, LineName.KSIEZE_5, LineName.KROMERA_11, LineName.PARK_15, LineName.GAJ_31, LineName.GAJ_32, NodeName.ARKADY, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// od JPII do Legionów 0L, 24, 31, 32

        System.out.println("warunek 136");

        mix = CzteryLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.NADODRZE_0L, LineName.FAT_24, LineName.GAJ_31, LineName.GAJ_32, NodeName.LEGIONOW, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// od Staszica do Legionów 0L, 24

        System.out.println("warunek 137");

        mix = DwieLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.NADODRZE_0L, LineName.FAT_24, NodeName.LEGIONOW, 4);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


        ///////////// Staszica w kierunku płd. 0L, 14, 15, 24

        System.out.println("warunek 138");

        mix = CzteryLinieMinOdstepIstniejaceLineVarianty.execute(mix, LineName.NADODRZE_0L, LineName.FAT_14, LineName.PARK_15, LineName.FAT_24, NodeName.STASZICA, 1);
        availableLineVariants = Operation.updateAvaliableLineVariants(availableLineVariants, mix);

        counter = Operation.scopeSummary(counter, mix, millisActualTime, FILE_PATH_QUANTITY_OF_COMBINATION);


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


        Operation.printListLineVariant(availableLineVariants);

//        printListLineVariantOnlyForTerminal(mix);
        Operation.writeFile("D:/plik_mix.csv", mix);
        Operation.writeFile("D:/plik_availableLineVariants.csv", availableLineVariants);


    }


}








