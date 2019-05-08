package wroclaw.mpk.synchro.condition.veryfication;

import wroclaw.mpk.synchro.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CzteryLinieMaxOdstepIstniejaceLineVarianty {



    public static List<LineVariant> execute(List<LineVariant> lines, LineName
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

}
