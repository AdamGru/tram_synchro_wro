package wroclaw.mpk.synchro.veryfication;

import wroclaw.mpk.synchro.structure.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DziesiecLiniiMinOdstepIstniejaceLineVarianty {



    public static List<LineVariant> execute(List<LineVariant> lines, LineName
            lineName1, LineName lineName2, LineName lineName3, LineName lineName4, LineName lineName5, LineName
                                                                                  lineName6, LineName lineName7, LineName lineName8, LineName lineName9, LineName lineName10, NodeName node,
                                            int gap) {
        List<LineVariant> goodLineVariants = new ArrayList<>();


        for (int i = 0; i < lines.size(); i++) {
            LineVariant currentLineVariant = lines.get(i);
            List<MpkNode> foundnodes = currentLineVariant.findLineAndNodes(lineName1, lineName2, lineName3, lineName4, lineName5, lineName6, lineName7, lineName8, lineName9, lineName10, node);


            Collections.sort(foundnodes);

            if (
                    ((foundnodes.get(1).time - foundnodes.get(0).time) >= gap)
                            && ((foundnodes.get(2).time - foundnodes.get(1).time) >= gap)
                            && ((foundnodes.get(3).time - foundnodes.get(2).time) >= gap)
                            && ((foundnodes.get(4).time - foundnodes.get(3).time) >= gap)
                            && ((foundnodes.get(5).time - foundnodes.get(4).time) >= gap)
                            && ((foundnodes.get(6).time - foundnodes.get(5).time) >= gap)
                            && ((foundnodes.get(7).time - foundnodes.get(6).time) >= gap)
                            && ((foundnodes.get(8).time - foundnodes.get(7).time) >= gap)
                            && ((foundnodes.get(9).time - foundnodes.get(8).time) >= gap)
                            && ((foundnodes.get(0).time + Period.TAKT - foundnodes.get(9).time) >= gap)
            ) {
                goodLineVariants.add(currentLineVariant);
            }
        }

        return goodLineVariants;
    }


}
