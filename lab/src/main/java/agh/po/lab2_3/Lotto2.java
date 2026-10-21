package agh.po.lab2_3;

import java.util.ArrayList;
import java.util.Random;

public class Lotto2 {
    public static void main (String[] args){
        ArrayList<Integer> typowanie = new ArrayList<>();
        for(int i = 0; i < args.length; i++){
            int typ = Integer.parseInt(args[i]);
            typowanie.add(typ);
        }
        ArrayList<Integer> wylosowane = new ArrayList<>();
        Random random = new Random();

        while (wylosowane.size() < 6) {
            int liczba = random.nextInt(49) + 1;

            if (!wylosowane.contains(liczba)) {
                wylosowane.add(liczba);
            }
        }
        ArrayList<Integer> trafione = new ArrayList<>(typowanie);
        trafione.retainAll(wylosowane);

        System.out.println("Typy " + typowanie);

        System.out.println("Wylosowane liczby " + wylosowane);

        System.out.println("Ile trafien " + trafione.size());
    }

}