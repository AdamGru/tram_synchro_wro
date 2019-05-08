package wroclaw.mpk.synchro.veryfication;

import wroclaw.mpk.synchro.structure.LineVariant;
import wroclaw.mpk.synchro.structure.MpkNode;
import wroclaw.mpk.synchro.structure.NodeName;

import java.util.ArrayList;
import java.util.List;

public class DwieLinieMinOdstep {



    public static List<LineVariant> execute(List<LineVariant> lines, NodeName node, int gap) {

        List<LineVariant> goodLineVariants = new ArrayList<>();


        for (int i = 0; i < lines.size(); i++) {
            LineVariant currentLineVariant = lines.get(i);
            List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

            if (Math.abs(foundnodes.get(0).time - foundnodes.get(1).time) >= gap) {
                goodLineVariants.add(currentLineVariant);
            }
        }


        return goodLineVariants;
    }
}
