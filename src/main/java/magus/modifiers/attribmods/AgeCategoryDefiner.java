package magus.modifiers.attribmods;

import magus.model.Race;

public class AgeCategoryDefiner {

    public int RacialAgeCategoryFinder(Race race, int age){
        if(race == Race.DWARF) return DwarfAgeCategories(age);
        else if(race == Race.ORC || race == Race.KHAAL) return OrcAgeCategories(age);
        else if(race == Race.ELF) return ElfAgeCategories(age);
        else if(race == Race.HALF_ELF || race == Race.GNOME) return HalfElfAgeCategories(age);
        else if(race == Race.DZSENN) return DzsennAgeCategories(age);
        else return HumanAgeCategories(age);
    }

    public int DwarfAgeCategories(int age){
        if(25 <= age && age <= 40) return 1;
        else if(41 <= age && age <= 350) return 2;
        else if(351 <= age && age <= 600) return 3;
        else if(601 <= age && age <= 680) return 4;
        else if(681 <= age && age <= 750) return 5;
        else return 6;
    }

    public int OrcAgeCategories(int age){
        if(12 <= age && age <= 14) return 1;
        else if(15 <= age && age <= 25) return 2;
        else if(26 <= age && age <= 35) return 3;
        else if(36 <= age && age <= 50) return 4;
        else if(51 <= age && age <= 60) return 5;
        else return 6;
    }

    public int ElfAgeCategories(int age){
        if(30 <= age && age <= 50) return 1;
        else if(51 <= age && age <= 1400) return 2;
        else if(1401 <= age && age <= 1600) return 3;
        else if(1601 <= age && age <= 1800) return 4;
        else if(1801 <= age && age <= 1900) return 5;
        else return 6;
    }

    public int HumanAgeCategories(int age){
        if(13 <= age && age <= 16) return 1;
        else if(17 <= age && age <= 30) return 2;
        else if(31 <= age && age <= 42) return 3;
        else if(43 <= age && age <= 55) return 4;
        else if(56 <= age && age <= 75) return 5;
        else return 6;
    }

    public int HalfElfAgeCategories(int age){
        if(16 <= age && age <= 22) return 1;
        else if(23 <= age && age <= 110) return 2;
        else if(111 <= age && age <= 130) return 3;
        else if(131 <= age && age <= 150) return 4;
        else if(151 <= age && age <= 170) return 5;
        else return 6;
    }

    public int DzsennAgeCategories(int age){
        if(19 <= age && age <= 29) return 1;
        else if(30 <= age && age <= 92) return 2;
        else if(93 <= age && age <= 128) return 3;
        else if(129 <= age && age <= 167) return 4;
        else if(168 <= age && age <= 225) return 5;
        else return 6;
    }
}
