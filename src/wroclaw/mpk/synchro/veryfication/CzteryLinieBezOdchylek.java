package wroclaw.mpk.synchro.veryfication;

import wroclaw.mpk.synchro.structure.LineVariant;
import wroclaw.mpk.synchro.structure.MpkNode;
import wroclaw.mpk.synchro.structure.NodeName;
import wroclaw.mpk.synchro.structure.Period;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CzteryLinieBezOdchylek {



    public static List<LineVariant> execute(List<LineVariant> lines, NodeName node) {
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



}
