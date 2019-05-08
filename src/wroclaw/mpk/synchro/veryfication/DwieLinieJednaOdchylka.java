package wroclaw.mpk.synchro.veryfication;

import wroclaw.mpk.synchro.structure.LineVariant;
import wroclaw.mpk.synchro.structure.MpkNode;
import wroclaw.mpk.synchro.structure.NodeName;
import wroclaw.mpk.synchro.structure.Period;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DwieLinieJednaOdchylka {



    public static List<LineVariant> execute(List<LineVariant> lines, NodeName node) {
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


}
