package com.company;

import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;

public class Graph {
    int V;
    Map<String,LinkedList> adjVertice;
    Map<String,String> parent;

    //contrustor
    Graph(int V){
        this.V = V;

        LinkedList[] linkedLists = new LinkedList[V];
        for(int i = 0; i < V; i++ ){
            linkedLists[i] = new LinkedList<String>();
        }
    }

    boolean checkEdge(String s1, String s2){
        int count = 0;
        for(int i = 0; i < s1.toCharArray().length; i++){
            if(s1.toCharArray()[i] == s2.toCharArray()[i]){
                count++;
            }
        }
        return (count == 4);
    }
    void addEgde(String s1,String s2){

        adjVertice.put()
    }
    void addfromFile(File file){
        try {
            int V = 0;
            Scanner sc = new Scanner(file);
            while (sc.hasNextInt()){
                V++;

            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}


