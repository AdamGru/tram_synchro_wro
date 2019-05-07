package wroclaw.mpk.synchro.mixer;

import wroclaw.mpk.synchro.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DwieLinieMaxOdstepIstniejaceLineVarianty {



    public static List<LineVariant> execute(List<LineVariant> lines, LineName
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
}
