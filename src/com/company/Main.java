package com.company;
import static com.company.Graph.*;
import java.io.File;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        File file = new File(System.getProperty("user.dir") + "/INPUT//sgb-words.txt");
        Graph graph = new Graph(file);

        System.out.println("So thanh phan lien thong la ");
        System.out.println(getccNum(graph));


        System.out.println("Nhap 2 tu de thuc hien tim duong ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        graph.FindWay(a,b);
        sc.close();
    }
}