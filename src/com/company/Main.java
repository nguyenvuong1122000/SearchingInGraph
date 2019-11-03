package com.company;
import static com.company.Graph.getccNum;
import static com.company.Vertice.*;
import java.io.File;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;


public class Main {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        long begin = calendar.getInstance().getTimeInMillis();
        File file = new File(System.getProperty("user.dir") + "/INPUT//sgb-words.txt");
        Graph graph = new Graph(file);
        System.out.println(getccNum(graph));
        print(graph.FindWay("words", "graph"));
        long end = calendar.getInstance().getTimeInMillis();

    }
}