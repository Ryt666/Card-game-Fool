package com.company;
import java.util.*;

public class Main {
    public static List coloda = new ArrayList();

    public static ArrayList general = new ArrayList();
    public static int score;
    public static int r;

    public static int max = 0;

    public static void Sixkart() {
        Object[][] ar1 = new Object[1][2];
        ar1[0][0] = "6-ka PIK";
        ar1[0][1] = 6;
        coloda.add(ar1);
        Object[][] ar2 = new Object[1][2];
        ar2[0][0] = "6-ka BUBNI";
        ar2[0][1] = 6;
        coloda.add(ar2);
        Object[][] ar3 = new Object[1][2];
        ar3[0][0] = "6-ka KRESTE";
        ar3[0][1] = 6;
        coloda.add(ar3);
        Object[][] ar4 = new Object[1][2];
        ar4[0][0] = "6-ka CHERVI";
        ar4[0][1] = 6;
        coloda.add(ar4);

    }

    public static void Sevenkart() {
        Object[][] ar1 = new Object[1][2];
        ar1[0][0] = "7-ka PIK";
        ar1[0][1] = 7;
        coloda.add(ar1);
        Object[][] ar2 = new Object[1][2];
        ar2[0][0] = "7-ka BUBNI";
        ar2[0][1] = 7;
        coloda.add(ar2);
        Object[][] ar3 = new Object[1][2];
        ar3[0][0] = "7-ka KRESTE";
        ar3[0][1] = 7;
        coloda.add(ar3);
        Object[][] ar4 = new Object[1][2];
        ar4[0][0] = "7-ka CHERVI";
        ar4[0][1] = 7;
        coloda.add(ar4);
    }

    public static void Eightkart() {
        Object[][] ar1 = new Object[1][2];
        ar1[0][0] = "8-ka PIK";
        ar1[0][1] = 8;
        coloda.add(ar1);
        Object[][] ar2 = new Object[1][2];
        ar2[0][0] = "8-ka BUBNI";
        ar2[0][1] = 8;
        coloda.add(ar2);
        Object[][] ar3 = new Object[1][2];
        ar3[0][0] = "8-ka KRESTE";
        ar3[0][1] = 8;
        coloda.add(ar3);
        Object[][] ar4 = new Object[1][2];
        ar4[0][0] = "8-ka CHERVI";
        ar4[0][1] = 8;
        coloda.add(ar4);
    }

    public static void Ninekart() {
        Object[][] ar1 = new Object[1][2];
        ar1[0][0] = "9-ka PIK";
        ar1[0][1] = 9;
        coloda.add(ar1);
        Object[][] ar2 = new Object[1][2];
        ar2[0][0] = "9-ka BUBNI";
        ar2[0][1] = 9;
        coloda.add(ar2);
        Object[][] ar3 = new Object[1][2];
        ar3[0][0] = "9-ka KRESTE";
        ar3[0][1] = 9;
        coloda.add(ar3);
        Object[][] ar4 = new Object[1][2];
        ar4[0][0] = "9-ka CHERVI";
        ar4[0][1] = 9;
        coloda.add(ar4);
    }

    public static void Tenkart() {
        Object[][] ar1 = new Object[1][2];
        ar1[0][0] = "10-ka PIK";
        ar1[0][1] = 10;
        coloda.add(ar1);
        Object[][] ar2 = new Object[1][2];
        ar2[0][0] = "10-ka BUBNI";
        ar2[0][1] = 10;
        coloda.add(ar2);
        Object[][] ar3 = new Object[1][2];
        ar3[0][0] = "10-ka KRESTE";
        ar3[0][1] = 10;
        coloda.add(ar3);
        Object[][] ar4 = new Object[1][2];
        ar4[0][0] = "10-ka CHERVI";
        ar4[0][1] = 10;
        coloda.add(ar4);
    }

    public static void Jackkart() {
        Object[][] ar1 = new Object[1][2];
        ar1[0][0] = "JACK PIK";
        ar1[0][1] = 2;
        coloda.add(ar1);
        Object[][] ar2 = new Object[1][2];
        ar2[0][0] = "JACK BUBNI";
        ar2[0][1] = 2;
        coloda.add(ar2);
        Object[][] ar3 = new Object[1][2];
        ar3[0][0] = "JACK KRESTE";
        ar3[0][1] = 2;
        coloda.add(ar3);
        Object[][] ar4 = new Object[1][2];
        ar4[0][0] = "JACK CHERVI";
        ar4[0][1] = 2;
        coloda.add(ar4);
    }

    public static void Ledykart() {
        Object[][] ar1 = new Object[1][2];
        ar1[0][0] = "LEDY PIK";
        ar1[0][1] = 3;
        coloda.add(ar1);
        Object[][] ar2 = new Object[1][2];
        ar2[0][0] = "LEDY BUBNI";
        ar2[0][1] = 3;
        coloda.add(ar2);
        Object[][] ar3 = new Object[1][2];
        ar3[0][0] = "LEDY KRESTE";
        ar3[0][1] = 3;
        coloda.add(ar3);
        Object[][] ar4 = new Object[1][2];
        ar4[0][0] = "LEDY CHERVI";
        ar4[0][1] = 3;
        coloda.add(ar4);
    }

    public static void Kingkart() {
        Object[][] ar1 = new Object[1][2];
        ar1[0][0] = "KING PIK";
        ar1[0][1] = 4;
        coloda.add(ar1);
        Object[][] ar2 = new Object[1][2];
        ar2[0][0] = "KING BUBNI";
        ar2[0][1] = 4;
        coloda.add(ar2);
        Object[][] ar3 = new Object[1][2];
        ar3[0][0] = "KING KRESTE";
        ar3[0][1] = 4;
        coloda.add(ar3);
        Object[][] ar4 = new Object[1][2];
        ar4[0][0] = "KING CHERVI";
        ar4[0][1] = 4;
        coloda.add(ar4);
    }

    public static void Acekart() {
        Object[][] ar1 = new Object[1][2];
        ar1[0][0] = "ACE PIK";
        ar1[0][1] = 11;
        coloda.add(ar1);
        Object[][] ar2 = new Object[1][2];
        ar2[0][0] = "ACE BUBNI";
        ar2[0][1] = 11;
        coloda.add(ar2);
        Object[][] ar3 = new Object[1][2];
        ar3[0][0] = "ACE KRESTE";
        ar3[0][1] = 11;
        coloda.add(ar3);
        Object[][] ar4 = new Object[1][2];
        ar4[0][0] = "ACE CHERVI";
        ar4[0][1] = 11;
        coloda.add(ar4);
    }

    /*public static void Read_kard(Object[][] ar) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println(" ");
        }
    }*/

    public static int Rnd(int min, int max) {
        int rnd = (min + (int) (Math.random() * (max - min)));
        while (rnd == 5) {
            rnd = (min + (int) (Math.random() * (max - min)));
        }
        return rnd;
    }

    public static Object[][] Card_from_coloda() {
        r = Rnd(0, coloda.size() - 1);
        Save_score((Object[][]) coloda.get(r));
        //System.out.print("кол-во карт в колоде: "+ coloda.size());
        return (Object[][]) coloda.get(r);
    }

    public static void Build_player() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Object[][] cell = new Object[1][2];
        cell[0][1] = 0;
        cell[0][0] = name;
        general.add(cell);
    }

    public static void Read_List(Object[][] cell) {
        for (int i = 0; i < cell.length; i++) {
            for (int j = 0; j < cell[0].length; j++) {
                System.out.println(cell[i][j] + " ");
            }
        }
    }

    public static void Save_score(Object[][] cell) {
        score = (int) cell[0][1];
    }

    public static void General_func(Object[][] cell, int score) {
        cell[0][1] = (int) cell[0][1] + score;
    }

    public static void Game_start(int n) {
        for (int i = 0; i < 2; i++) {
            // System.out.println("Player" + i + ":");
            Read_List(Card_from_coloda());// card output
            General_func((Object[][]) general.get(n), score);
            coloda.remove(r);

        }
    }

    public static void Game_start_1(int n) {
        for (int i = 0; i < 1; i++) {

            Read_List(Card_from_coloda());// card output
            General_func((Object[][]) general.get(n), score);
            coloda.remove(r);

        }
    }

    public static void Score() {
        for (int i = 0; i < general.size(); i++) {
            Read_List((Object[][]) general.get(i));

        }
    }

    public static void Choose() {
        for (int i = 0; i < general.size(); i++) {
            System.out.print("Do you (Player 1) want take a card \n1(yes)        2(no)        \nChoice: " + " ");
            Scanner scanner = new Scanner(System.in);
            int k = scanner.nextInt();
            if (k == 1) {
                Game_start_1(0);
                Score();
                Choose();

            }
            if (k == 2) {
                Score();
                Choose_2();
            }
        }
    }
    public static void Choose_2() {
        int[] array_for_score = new int[general.size()];
        System.out.println("Player 2: ");
        System.out.print("Do you (Player 2) want take a card \n1(yes)        2(no that is all)      \nChoice: " + " ");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        if (k == 1) {
            Game_start_1(1);
            Score();
            Choose_2();

        }
        if (k == 2) {
            for (int i = 0; i < general.size(); i++) {

                max_array(array_for_score, (Object[][]) general.get(i));
            }
        }
    }

    public static void max_array(int[] ar, Object[][] cell) {
        for (int i = 0; i < general.size()-1; i++) {
            ar[i] = (int) cell[0][1];

            // if (ar[i] > max) {
            // max = ar[i];
            // System.out.println(ar[i]);
            if (ar[i] == 21) {
                System.out.println(cell[0][0] + " " + "You are a winner!!!!");
                Score();
            }
            if (ar[i] < 21) {
                if (ar[i] < ar[i + 1]) {
                    System.out.println(cell[0][0] + " " + "You are a winner!!!!");
                    Score();

                }
            }
            if (ar[i] > 21) {
                if (ar[i] > ar[i + 1]) {

                    System.out.println(cell[0][0] + " " + "You are a lose!!!!");
                    Score();

                }
            }
        }
    }


    public static void main(String[] args) {
        Sixkart();
        Sevenkart();
        Eightkart();
        Ninekart();
        Tenkart();
        Jackkart();
        Ledykart();
        Kingkart();
        Acekart();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter quenty players: ");
        int q = scanner.nextInt();
        for (int i=1; i< q+1; i++)
        {
            System.out.print("Write name of player" + " " + i + " "+ ":" );
            Build_player();
        }
        Score();
        //Read_List((Object[][]) general.get(0));
        for (int i=0;i< general.size();i++)
        {
            System.out.println("Player" + i + ":");
            Game_start(i);
        }
        Score();
        Choose();
        /*for(int i=0;i<coloda.size();i++)
        {
            Read_kard((Object[][]) coloda.get(i));
        }*/

    }

}