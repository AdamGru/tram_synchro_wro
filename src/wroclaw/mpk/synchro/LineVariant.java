package wroclaw.mpk.synchro;

import java.io.Serializable;
import java.util.*;

public class LineVariant implements Serializable {

    public List<MpkNode> nodes;

    public LineVariant(List<MpkNode> nodes) {
        this.nodes = nodes;
    }

    public LineVariant() {
        nodes = new ArrayList<>();
    }

    public List<MpkNode> findNodes(NodeName nodeName) {
        List<MpkNode> result = new ArrayList<>();
        for (MpkNode node : nodes) {
            if (node.nodeName == nodeName) {
                result.add(node);
            }
        }
        return result;
    }


    public List<MpkNode> findFirstNodes(NodeName nodeName) {
        List<MpkNode> result = new ArrayList<>();
        for (MpkNode node : nodes) {
            if ((node.nodeName == nodeName) && (node.isFirstStop)) {
                result.add(node);
            }
        }
        return result;
    }


    public List<MpkNode> findOnlyOneLineAndNode(LineName lineName, NodeName nodeName) {
        List<MpkNode> result = new ArrayList<>();
        for (MpkNode node : nodes) {
            if (((node.lineName == lineName) && (node.nodeName == nodeName))
            ) {
                result.add(node);
            }
        }
        return result;
    }


    public List<MpkNode> findLineAndNodes(LineName lineName1, LineName lineName2, NodeName nodeName) {
        List<MpkNode> result = new ArrayList<>();
        for (MpkNode node : nodes) {
            if (((node.lineName == lineName1) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName2) && (node.nodeName == nodeName))
            ) {
                result.add(node);
            }
        }
        return result;
    }


    public List<MpkNode> findLineAndNodes(LineName lineName1, LineName lineName2, LineName lineName3, NodeName nodeName) {
        List<MpkNode> result = new ArrayList<>();
        for (MpkNode node : nodes) {
            if (((node.lineName == lineName1) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName2) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName3) && (node.nodeName == nodeName))
            ) {
                result.add(node);
            }
        }
        return result;
    }


    public List<MpkNode> findLineAndNodes(LineName lineName1, LineName lineName2, LineName lineName3, LineName lineName4, NodeName nodeName) {
        List<MpkNode> result = new ArrayList<>();
        for (MpkNode node : nodes) {
            if (((node.lineName == lineName1) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName2) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName3) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName4) && (node.nodeName == nodeName))
            ) {
                result.add(node);
            }
        }
        return result;
    }


    public List<MpkNode> findLineAndNodes(LineName lineName1, LineName lineName2, LineName lineName3, LineName lineName4, LineName lineName5, NodeName nodeName) {
        List<MpkNode> result = new ArrayList<>();
        for (MpkNode node : nodes) {
            if (((node.lineName == lineName1) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName2) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName3) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName4) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName5) && (node.nodeName == nodeName))

            ) {
                result.add(node);
            }
        }
        return result;
    }


    public List<MpkNode> findLineAndNodes(LineName lineName1, LineName lineName2, LineName lineName3, LineName lineName4, LineName lineName5, LineName lineName6, NodeName nodeName) {
        List<MpkNode> result = new ArrayList<>();
        for (MpkNode node : nodes) {
            if (((node.lineName == lineName1) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName2) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName3) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName4) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName5) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName6) && (node.nodeName == nodeName))

            ) {
                result.add(node);
            }
        }
        return result;
    }


    public List<MpkNode> findLineAndNodes(LineName lineName1, LineName lineName2, LineName lineName3, LineName lineName4, LineName lineName5, LineName lineName6, LineName lineName7, NodeName nodeName) {
        List<MpkNode> result = new ArrayList<>();
        for (MpkNode node : nodes) {
            if (((node.lineName == lineName1) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName2) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName3) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName4) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName5) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName6) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName7) && (node.nodeName == nodeName))
            ) {
                result.add(node);
            }
        }
        return result;
    }


    public List<MpkNode> findLineAndNodes(LineName lineName1, LineName lineName2, LineName lineName3, LineName lineName4, LineName lineName5, LineName lineName6, LineName lineName7, LineName lineName8, NodeName nodeName) {
        List<MpkNode> result = new ArrayList<>();
        for (MpkNode node : nodes) {
            if (((node.lineName == lineName1) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName2) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName3) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName4) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName5) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName6) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName7) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName8) && (node.nodeName == nodeName))
            ) {
                result.add(node);
            }
        }
        return result;
    }


    public List<MpkNode> findLineAndNodes(LineName lineName1, LineName lineName2, LineName lineName3, LineName lineName4, LineName lineName5, LineName lineName6, LineName lineName7, LineName lineName8, LineName lineName9, NodeName nodeName) {
        List<MpkNode> result = new ArrayList<>();
        for (MpkNode node : nodes) {
            if (((node.lineName == lineName1) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName2) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName3) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName4) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName5) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName6) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName7) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName8) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName9) && (node.nodeName == nodeName))
            ) {
                result.add(node);
            }
        }
        return result;
    }


    public List<MpkNode> findLineAndNodes(LineName lineName1, LineName lineName2, LineName lineName3, LineName lineName4, LineName lineName5, LineName lineName6, LineName lineName7, LineName lineName8, LineName lineName9, LineName lineName10, NodeName nodeName) {
        List<MpkNode> result = new ArrayList<>();
        for (MpkNode node : nodes) {
            if (((node.lineName == lineName1) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName2) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName3) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName4) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName5) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName6) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName7) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName8) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName9) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName10) && (node.nodeName == nodeName))
            ) {
                result.add(node);
            }
        }
        return result;
    }


    public List<MpkNode> findLineAndNodes(LineName lineName1, LineName lineName2, LineName lineName3, LineName lineName4, LineName lineName5, LineName lineName6, LineName lineName7, LineName lineName8, LineName lineName9, LineName lineName10, LineName lineName11, NodeName nodeName) {
        List<MpkNode> result = new ArrayList<>();
        for (MpkNode node : nodes) {
            if (((node.lineName == lineName1) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName2) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName3) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName4) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName5) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName6) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName7) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName8) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName9) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName10) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName11) && (node.nodeName == nodeName))
            ) {
                result.add(node);
            }
        }
        return result;
    }


    public List<MpkNode> findLineAndNodes(LineName lineName1, LineName lineName2, LineName lineName3, LineName lineName4, LineName lineName5, LineName lineName6, LineName lineName7, LineName lineName8, LineName lineName9, LineName lineName10, LineName lineName11, LineName lineName12, NodeName nodeName) {
        List<MpkNode> result = new ArrayList<>();
        for (MpkNode node : nodes) {
            if (((node.lineName == lineName1) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName2) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName3) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName4) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName5) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName6) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName7) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName8) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName9) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName10) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName11) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName12) && (node.nodeName == nodeName))
            ) {
                result.add(node);
            }
        }
        return result;
    }


    public List<MpkNode> findLineAndNodes(LineName lineName1, LineName lineName2, LineName lineName3, LineName lineName4, LineName lineName5, LineName lineName6, LineName lineName7, LineName lineName8, LineName lineName9, LineName lineName10, LineName lineName11, LineName lineName12, LineName lineName13, NodeName nodeName) {
        List<MpkNode> result = new ArrayList<>();
        for (MpkNode node : nodes) {
            if (((node.lineName == lineName1) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName2) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName3) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName4) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName5) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName6) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName7) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName8) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName9) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName10) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName11) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName12) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName13) && (node.nodeName == nodeName))
            ) {
                result.add(node);
            }
        }
        return result;
    }


    public List<MpkNode> findLineAndNodes(LineName lineName1, LineName lineName2, LineName lineName3, LineName lineName4, LineName lineName5, LineName lineName6, LineName lineName7, LineName lineName8, LineName lineName9, LineName lineName10, LineName lineName11, LineName lineName12, LineName lineName13, LineName lineName14, NodeName nodeName) {
        List<MpkNode> result = new ArrayList<>();
        for (MpkNode node : nodes) {
            if (((node.lineName == lineName1) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName2) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName3) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName4) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName5) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName6) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName7) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName8) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName9) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName10) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName11) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName12) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName13) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName14) && (node.nodeName == nodeName))
            ) {
                result.add(node);
            }
        }
        return result;
    }


    public List<MpkNode> findLineAndNodes(LineName lineName1, LineName lineName2, LineName lineName3, LineName lineName4, LineName lineName5, LineName lineName6, LineName lineName7, LineName lineName8, LineName lineName9, LineName lineName10, LineName lineName11, LineName lineName12, LineName lineName13, LineName lineName14, LineName lineName15, NodeName nodeName) {
        List<MpkNode> result = new ArrayList<>();
        for (MpkNode node : nodes) {
            if (((node.lineName == lineName1) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName2) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName3) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName4) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName5) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName6) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName7) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName8) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName9) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName10) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName11) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName12) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName13) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName14) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName15) && (node.nodeName == nodeName))
            ) {
                result.add(node);
            }
        }
        return result;
    }


    public List<MpkNode> findLineAndNodes(LineName lineName1, LineName lineName2, LineName lineName3, LineName lineName4, LineName lineName5, LineName lineName6, LineName lineName7, LineName lineName8, LineName lineName9, LineName lineName10, LineName lineName11, LineName lineName12, LineName lineName13, LineName lineName14, LineName lineName15, LineName lineName16, NodeName nodeName) {
        List<MpkNode> result = new ArrayList<>();
        for (MpkNode node : nodes) {
            if (((node.lineName == lineName1) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName2) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName3) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName4) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName5) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName6) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName7) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName8) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName9) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName10) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName11) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName12) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName13) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName14) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName15) && (node.nodeName == nodeName))
                    || ((node.lineName == lineName16) && (node.nodeName == nodeName))
            ) {
                result.add(node);
            }
        }
        return result;
    }


    // metoda drukująca LineVariant
    public void printLineVariant(LineVariant lineVariantToPrint) {
        for (int i = 0; i < nodes.size(); i++) {
            System.out.print(nodes.get(i).lineName.toString() + ", " + nodes.get(i).nodeName.toString() + ", "
                    + nodes.get(i).time + ";");
        }
    }


    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < nodes.size(); i++) {
//            if (nodes.get(i).isFirstStop == true) {

            result = result + nodes.get(i).lineName.toString() + ", " + nodes.get(i).nodeName.toString() + ", "
                    + nodes.get(i).time + ";";
//            }
            ;
        }
        return result;
    }

    // metoda drukująca LineVariant tylko z odjazdami z pętli
    public void printLineVariantOnlyForTerminal(LineVariant lineVariantToPrint) {
        for (int i = 0; i < nodes.size(); i++) {
            if (nodes.get(i).isFirstStop == true) {
                System.out.print(nodes.get(i).lineName.toString() + ", " + nodes.get(i).nodeName.toString() + ", "
                        + nodes.get(i).time + ";");
            }
        }
    }


    // metoda usuwająca duplikaty w LineVariancie

    public LineVariant removeDuplicates(LineVariant lineVariant) {
        Set<MpkNode> hs = new LinkedHashSet<>();
        hs.addAll(lineVariant.nodes);
        lineVariant.nodes.clear();
        lineVariant.nodes.addAll(hs);

        return lineVariant;
    }


}
