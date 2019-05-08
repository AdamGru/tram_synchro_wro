package wroclaw.mpk.synchro.operation;

import wroclaw.mpk.synchro.LineName;
import wroclaw.mpk.synchro.LineVariant;
import wroclaw.mpk.synchro.MpkNode;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Operation {


    //metoda łącząca listy niewykluczających się LineVariantów
    public static List<LineVariant> nonExclusiveLineVariant(List<LineVariant> lines) {

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


    // metoda tworząca listę LineVariantów dla wszystkich kombinacji z usuwaniem wykluczeń - dwie linie
    public static List<LineVariant> mix2ListLineVariantNonEx(List<LineVariant> line1, List<LineVariant> line2) {


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


    //metoda usuwająca z  listy lineVariantów węzły poza pierwszym
    public static List<LineVariant> leaveOnlyFirstNodesInListLineVariant(List<LineVariant> longListLineVariants) {


        List<LineVariant> shortListLineVariants = new ArrayList<>();


        for (int j = 0; j < longListLineVariants.size(); j++) {
            LineVariant currentLineVariant = longListLineVariants.get(j);
            LineVariant shortLineVariant = new LineVariant();

            for (int i = 0; i < currentLineVariant.nodes.size(); i++) {
                if (currentLineVariant.nodes.get(i).isFirstStop) {
                    shortLineVariant.nodes.add(currentLineVariant.nodes.get(i));
                }
            }

            shortListLineVariants.add(shortLineVariant);
        }
        return shortListLineVariants;
    }


    // podsumowanie etapu
    public static int scopeSummary(int counter, List<LineVariant> mix, long millisActualTime, String filePath) throws IOException {
        System.out.println("liczba kombinacji po zakończeniu etapu " + counter + ": " + mix.size());
        counter++;
        long executionTime = System.currentTimeMillis() - millisActualTime;
        System.out.println(executionTime / 60000 + " min.");
        System.out.println("----------------------\n");
        writeFileQuantityOfCombination(filePath, Integer.toString(mix.size()));
        return counter;
    }


    // metoda tworząca plik tekstowy z wynikiem
    public static void writeFile(String filePath, List<LineVariant> listToSave)
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
    public static void generateFileQuantityOfCombination(String filePath, String textToSave)
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
    public static void writeFileQuantityOfCombination(String filePath, String textToSave)
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

    public static List<LineVariant> useOnlyAvaliableLineVariants(List<LineVariant> avaliableListLineVariants, List<LineVariant> currentListLineVariants) {

        for (int i = 0; i < currentListLineVariants.size(); i++) {
            if (isTheSameMpkNode(currentListLineVariants.get(i).nodes.get(0), avaliableListLineVariants)) {

            } else {
                currentListLineVariants.remove(i);
                i--;
            }
        }

        return currentListLineVariants;
    }


    // metoda dopisująca wszystkie węzły do pierwszych
    public static List<LineVariant> addAllNodes(List<LineVariant> shortListLineVariants, List<LineVariant> avaliableLineVariants) {

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
    public static List<LineVariant> updateAvaliableLineVariants(List<LineVariant> avaliableListLineVariants, List<LineVariant> mix) {


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
    public static boolean isTheSameLineName(LineName lineName, List<LineVariant> mix) {

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
    public static boolean isTheSameMpkNode(MpkNode mpkNode, List<LineVariant> mix) {

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
    public static void printListLineVariant(List<LineVariant> listToPrint) {
        for (int i = 0; i < listToPrint.size(); i++) {

            LineVariant currentLineVariant = listToPrint.get(i);
            currentLineVariant.printLineVariant(currentLineVariant);
            System.out.println("");
        }
        System.out.println("");
    }


    // metoda drukująca listę wariantów dla linii tylko dla odjazdów z pętli

    public static void printListLineVariantOnlyForTerminal(List<LineVariant> listToPrint) {
        for (int i = 0; i < listToPrint.size(); i++) {

            LineVariant currentLineVariant = listToPrint.get(i);
            currentLineVariant.printLineVariantOnlyForTerminal(currentLineVariant);
            System.out.println("");
        }
        System.out.println("");
    }


    // metoda tworząca listę LineVariantów dla wszystkich kombinacji - dwie linie
    public static List<LineVariant> mix2ListLineVariant(List<LineVariant> line1, List<LineVariant> line2) {


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


    //metoda usuwająca duplikaty z listy LineVariantów
    public static List<LineVariant> removeDuplicatesInListLineVariants(List<LineVariant> list) {

        List<LineVariant> currentListLineVariant = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            LineVariant currentLineVariant = list.get(i);
            currentLineVariant.removeDuplicates(currentLineVariant);
            currentListLineVariant.add(currentLineVariant);
        }

        return currentListLineVariant;
    }


    // metoda tworząca listę LineVariantów dla wszystkich kombinacji - trzy linie
    public static List<LineVariant> mix3ListLineVariant
            (List<LineVariant> line1, List<LineVariant> line2, List<LineVariant> line3) {
        List<LineVariant> mix1 = mix2ListLineVariant(line1, line2);
        List<LineVariant> mix2 = mix2ListLineVariant(mix1, line3);

        return mix2;
    }


    // metoda tworząca listę LineVariantów dla wszystkich kombinacji - cztery linie
    public static List<LineVariant> mix4ListLineVariant
            (List<LineVariant> line1, List<LineVariant> line2, List<LineVariant> line3, List<LineVariant> line4) {
        List<LineVariant> mix1 = mix3ListLineVariant(line1, line2, line3);
        List<LineVariant> mix2 = mix2ListLineVariant(mix1, line4);

        return mix2;
    }


    // metoda tworząca listę LineVariantów dla wszystkich kombinacji - pięć linii
    public static List<LineVariant> mix5ListLineVariant
            (List<LineVariant> line1, List<LineVariant> line2, List<LineVariant> line3, List<LineVariant> line4, List<LineVariant> line5) {
        List<LineVariant> mix1 = mix4ListLineVariant(line1, line2, line3, line4);
        List<LineVariant> mix2 = mix2ListLineVariant(mix1, line5);

        return mix2;
    }


}
