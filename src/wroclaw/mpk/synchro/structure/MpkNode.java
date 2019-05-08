package wroclaw.mpk.synchro.structure;


import java.io.Serializable;
import java.util.Objects;

public class MpkNode implements Comparable<MpkNode>, Serializable {
    public LineName lineName;
    public NodeName nodeName;
    public int time;
    public boolean isFirstStop;

    public MpkNode(LineName lineName, NodeName nodeName, int time, boolean isFirstStop) {
        this.lineName = lineName;
        this.nodeName = nodeName;
        this.time = time;
        this.isFirstStop = isFirstStop;
    }

    public MpkNode() {
    }


    public boolean exclusiveNodes(MpkNode mpkNode) {
        return time != mpkNode.time && lineName == mpkNode.lineName && nodeName == mpkNode.nodeName;
    }


    public void printNode(MpkNode mpkNode) {
        System.out.print(lineName.toString() + ", " + nodeName.toString() + ", " + time + " ");
    }

    @Override
    public int compareTo(MpkNode o) {
        if (time > o.time) return 1;
        if (time < o.time) return -1;
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MpkNode mpkNode = (MpkNode) o;
        return time == mpkNode.time &&
                isFirstStop == mpkNode.isFirstStop &&
                lineName == mpkNode.lineName &&
                nodeName == mpkNode.nodeName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lineName, nodeName, time, isFirstStop);
    }
}


