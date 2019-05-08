package wroclaw.mpk.synchro.veryfication;

import wroclaw.mpk.synchro.structure.LineVariant;
import wroclaw.mpk.synchro.structure.MpkNode;
import wroclaw.mpk.synchro.structure.NodeName;

import java.util.ArrayList;
import java.util.List;

public class NarzucenieStartu {




    public static List<LineVariant> execute(List<LineVariant> lines, NodeName node, int time) {
        List<LineVariant> goodLineVariants = new ArrayList<>();

        for (int i = 0; i < lines.size(); i++) {
            LineVariant currentLineVariant = lines.get(i);
            List<MpkNode> foundnodes = currentLineVariant.findFirstNodes(node);

            if (foundnodes.get(0).time == time) {
                goodLineVariants.add(currentLineVariant);
            }
        }
        return goodLineVariants;
    }
}
