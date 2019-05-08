package wroclaw.mpk.synchro.condition.veryfication;

import wroclaw.mpk.synchro.LineVariant;
import wroclaw.mpk.synchro.MpkNode;
import wroclaw.mpk.synchro.NodeName;
import wroclaw.mpk.synchro.Period;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CzteryLinieDwieOdchylkiWymuszone {


    public static List<LineVariant> execute(List<LineVariant> lines, NodeName node) {
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

}
