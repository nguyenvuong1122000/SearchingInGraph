package com.company;
import static com.company.Graph.getccNum;
import static com.company.Vertice.*;
import java.io.File;


public class Main {
    public static void main(String[] args) {
        File file = new File(System.getProperty("user.dir") + "/INPUT//sgb-words.txt");
        Graph graph = new Graph(file);
        System.out.println(getccNum(graph));
        print(graph.FindWay("there", "these"));

    }
}
