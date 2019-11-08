package com.company;
import static com.company.Graph.getccNum;
import static com.company.Vertice.*;
import java.io.File;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        long begin = calendar.getInstance().getTimeInMillis();
        File file = new File(System.getProperty("user.dir") + "/INPUT//sgb-words.txt");
        Graph graph = new Graph(file);

        System.out.println("So thanh phan lien thong la ");
        System.out.println(getccNum(graph));


        System.out.println("Nhap 2 tu de thuc hien tim duong ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        graph.FindWay(a,b);

        long end = calendar.getInstance().getTimeInMillis();

    }
}