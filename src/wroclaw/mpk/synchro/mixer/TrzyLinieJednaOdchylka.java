package wroclaw.mpk.synchro.mixer;

import wroclaw.mpk.synchro.LineVariant;
import wroclaw.mpk.synchro.MpkNode;
import wroclaw.mpk.synchro.NodeName;
import wroclaw.mpk.synchro.Period;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TrzyLinieJednaOdchylka {




    public static List<LineVariant> execute(List<LineVariant> lines, NodeName node) {
        List<LineVariant> goodLineVariants = new ArrayList<>();

        switch (Period.TAKT) {

            case 12:
                byte min = 3;
                byte max = 5;

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

                min = 4;
                max = 6;

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

                min = 5;
                max = 8;

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
}
