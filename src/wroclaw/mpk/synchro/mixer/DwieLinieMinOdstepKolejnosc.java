package wroclaw.mpk.synchro.mixer;

import wroclaw.mpk.synchro.*;

import java.util.ArrayList;
import java.util.List;

public class DwieLinieMinOdstepKolejnosc {



    public static List<LineVariant> execute(List<LineVariant> lines, LineName lineName1, LineName
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

}
