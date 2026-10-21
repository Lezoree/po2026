package agh.po.lab2_3;

import java.util.ArrayList;
import java.util.Random;

public class Lotto3 {
    public static void main (String[] args){
        ArrayList<Integer> typowanie = new ArrayList<>();
        for(int i = 0; i < args.length; i++){
            int typ = Integer.parseInt(args[i]);
            typowanie.add(typ);
        }
        ArrayList<Integer> wylosowane = new ArrayList<>();
        Random random = new Random();

        long liczbaLosowan = 0;
        int liczbaTrafien = 0;

        long start = System.currentTimeMillis();

        while(liczbaTrafien < 6) {
            liczbaLosowan++;
            wylosowane.clear();

        while (wylosowane.size() < 6) {
            int liczba = random.nextInt(49) + 1;

            if (!wylosowane.contains(liczba)) {
                wylosowane.add(liczba);
            }
        }
            ArrayList<Integer> trafione = new ArrayList<>(typowanie);
            trafione.retainAll(wylosowane);
            liczbaTrafien = trafione.size();
        }
        long stop = System.currentTimeMillis();
        long ileCzasu = stop - start;

        System.out.println("Typy " + typowanie);
        System.out.println("Wylosowane liczby " + wylosowane);
        System.out.println("Czas dzialania programu " + ileCzasu);
        System.out.println("Liczba wsyztskich losowan " + liczbaLosowan);
    }

}
