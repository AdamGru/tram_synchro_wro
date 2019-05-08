package wroclaw.mpk.synchro.condition.veryfication;

import wroclaw.mpk.synchro.LineVariant;
import wroclaw.mpk.synchro.MpkNode;
import wroclaw.mpk.synchro.NodeName;
import wroclaw.mpk.synchro.Period;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DwieLinieDwieOdchylkiWYmuszone {



    public static List<LineVariant> exectue(List<LineVariant> lines, NodeName node) {
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



}
