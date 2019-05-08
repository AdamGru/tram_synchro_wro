package wroclaw.mpk.synchro.condition.veryfication;

import wroclaw.mpk.synchro.LineVariant;
import wroclaw.mpk.synchro.MpkNode;
import wroclaw.mpk.synchro.NodeName;

import java.util.ArrayList;
import java.util.List;

public class DwieLinieMaxOdstep {


    public static List<LineVariant> execute(List<LineVariant> lines, NodeName node, int gap) {

        List<LineVariant> goodLineVariants = new ArrayList<>();


        for (int i = 0; i < lines.size(); i++) {
            LineVariant currentLineVariant = lines.get(i);
            List<MpkNode> foundnodes = currentLineVariant.findNodes(node);

            if (Math.abs(foundnodes.get(0).time - foundnodes.get(1).time) <= gap) {
                goodLineVariants.add(currentLineVariant);
            }
        }


        return goodLineVariants;
    }
}