package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return name;
    }

    public static MusicBand transferMembers(MusicBand band1, MusicBand band2) {
        band2.getMembers().addAll(band1.getMembers());
        return band2;
    }
    public MusicBand printMembers() {
        return members;
        //не понимаю, как реализовать этот метод
    }
}


