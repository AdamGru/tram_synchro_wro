package wroclaw.mpk.synchro.mixer;

import wroclaw.mpk.synchro.LineVariant;
import wroclaw.mpk.synchro.MpkNode;
import wroclaw.mpk.synchro.NodeName;

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
