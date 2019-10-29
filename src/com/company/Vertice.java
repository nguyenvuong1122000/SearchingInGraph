package com.company;

import java.util.LinkedList;

private public class Vertice {
    Vertice parent;
    int ccnum;
    boolean hasExplored;
    String name;
    LinkedList<Vertice> adjVertice = new LinkedList<>() ;
    static void print(LinkedList<Vertice> linkedList){
        for (Vertice i: linkedList) {
            System.out.print(i.name +"\t");
        }
    }

}
