package com.company;
import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;
import static com.company.Vertice.print;

public class Graph {

    LinkedList<Vertice> verticeList = new LinkedList<>();
    Map<String, Vertice> verticeMap = new HashMap<>();
    Queue<Vertice> verticeQueue = new LinkedList<>();

    //Contrustor
    Graph(File file) {
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String v1 = sc.nextLine();
                verticeMap.put(v1, new Vertice());
                verticeMap.get(v1).name = v1;
                verticeList.add(verticeMap.get(v1));
                for (Vertice i : verticeList) {
                    if (checkEdge(i, verticeMap.get(v1))) {
                        addEgde(i, verticeMap.get(v1));
                    }
                }
            }
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private boolean checkEdge(Vertice s1, Vertice s2) {
        int count = 0;
        for (int i = 0; i < s1.name.toCharArray().length; i++) {
            if (s1.name.toCharArray()[i] == s2.name.toCharArray()[i]) {
                count++;
            }
        }
        return (count == 4);
    }


    void addEgde(Vertice vertice1, Vertice vertice2) {
        vertice1.adjVertice.add(vertice2);
        vertice2.adjVertice.add(vertice1);
    }


    void explore(Vertice vertice1) {
        vertice1.hasExplored = true;
        for (Vertice vertice : vertice1.adjVertice) {
            if (!vertice.hasExplored) {
                explore(vertice);
            }
        }
    }

    static int getccNum(Graph graph) {
        int ccnum = 0;
        for (Vertice vertice : graph.verticeList) {
            if (!vertice.hasExplored) {
                graph.explore(vertice);
                vertice.ccnum = ccnum;
                ccnum++;

            }

        }
        return ccnum;
    }

    public LinkedList<Vertice> FindWay(String s1, String s2) {
        LinkedList<Vertice> result = new LinkedList<>();
        for (Vertice abc : verticeList) {
            abc.parent = null;
        }
        try {
            Vertice vertice1 = verticeMap.get(s1);
            Vertice vertice2 = verticeMap.get(s2);
            if (vertice1.ccnum == vertice2.ccnum) {
                verticeQueue.add(vertice1);
                while (verticeQueue.size() != 0) {
                    Vertice v3 = verticeQueue.poll();
                    for (Vertice _adjVertice : v3.adjVertice) {
                        if ((_adjVertice.parent == null) && (_adjVertice != vertice1)) {
                            verticeQueue.add(_adjVertice);
                            _adjVertice.parent = v3;
                        }
                    }
                }
                Vertice v1 = vertice2;
                while (v1 != vertice1) {
                    result.add(v1);
                    v1 = v1.parent;
                }
                result.add(vertice1);
                Collections.reverse(result);
            }
            print(result);
        }
        catch (Exception e){
            System.out.println("Check du lieu nhap vao");
        }
        return result;
    }
}



