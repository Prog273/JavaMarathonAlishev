package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand boneyM = new MusicBand("Boney M.", 1975);
        MusicBand slayer = new MusicBand("Slayer", 1981);
        MusicBand aria = new MusicBand("Ария", 1985);
        MusicBand timeMachine = new MusicBand("Машина времени", 1969);
        MusicBand scorpions = new MusicBand("Scorpions", 1965);
        MusicBand blackCoffee = new MusicBand("Чёрный кофе", 1979);
        MusicBand beasts = new MusicBand("Звери", 2001);
        MusicBand ankor = new MusicBand("Ankor", 2003);
        MusicBand timeSquare = new MusicBand("Таймсквер", 2009);
        MusicBand heaven = new MusicBand("Небо", 2002);
        MusicBand dorothy = new MusicBand("Dorothy", 2014);
        MusicBand bossHoss = new MusicBand("The Boss Hoss", 2004);

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(boneyM);
        musicBands.add(slayer);
        musicBands.add(aria);
        musicBands.add(timeMachine);
        musicBands.add(scorpions);
        musicBands.add(blackCoffee);
        musicBands.add(beasts);
        musicBands.add(ankor);
        musicBands.add(timeSquare);
        musicBands.add(heaven);
        musicBands.add(dorothy);
        musicBands.add(bossHoss);

        Collections.shuffle(musicBands);
        List groupsAfter2000 = groupsAfter2000(musicBands);

        for (int i = 0; i < musicBands.size(); i++) {
            System.out.println(musicBands.get(i));
        }
        System.out.println();
        for (int i = 0; i < groupsAfter2000.size(); i++) {
            System.out.println(groupsAfter2000.get(i));
        }
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> groupsAfter2000 = new ArrayList<>();
        for (int i = 0; i < bands.size(); i++) {
            if (bands.get(i).getYear() > 2000) {
                groupsAfter2000.add(bands.get(i));
            }
        }
        return groupsAfter2000;
    }
}
