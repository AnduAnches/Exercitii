package ro.siit.java.pds;

import java.util.HashSet;
import java.util.Set;

public class Graph {


    private Set<ro.siit.java.pds.Node> nodes = new HashSet<ro.siit.java.pds.Node>();

    public void addNode(ro.siit.java.pds.Node nodeA) {
        nodes.add(nodeA);
    }

    public Set<ro.siit.java.pds.Node> getNodes() {
        return nodes;
    }

    public void setNodes(Set<ro.siit.java.pds.Node> nodes) {
        this.nodes = nodes;
    }

}

