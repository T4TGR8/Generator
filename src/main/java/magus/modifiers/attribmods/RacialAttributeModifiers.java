package magus.modifiers.attribmods;

import magus.model.Race;

public class RacialAttributeModifiers {

    public int StrengthRacialModifier(Race race){
        int modifier = 0;
        if(race == Race.DWARF){
            modifier = 1;
        }
        else if(race == Race.ORC){
            modifier = 2;
        }
        else if(race == Race.ELF){
            modifier = -2;
        }
        else if(race == Race.HALF_ELF){
            modifier = -1;
        }
        else if(race == Race.AMUND){
            modifier = 1;
        }
        else if(race == Race.KHAAL){
            modifier = 3;
        }
        else if(race == Race.GNOME){
            modifier = -1;
        }
        else if(race == Race.GOBLIN){
            modifier = -2;
        }
        return modifier;
    }

    public int DexterityRacialModifier(Race race){
        int modifier = 0;
        if(race == Race.KHAAL){
            modifier = 1;
        }
        else if(race == Race.GNOME){
            modifier = 2;
        }
        else if(race == Race.ELF){
            modifier = 1;
        }
        return modifier;
    }

    public int QuicknessRacialModifier(Race race){
        int modifier = 0;
        if(race == Race.KHAAL){
            modifier = 2;
        }
        else if(race == Race.GOBLIN){
            modifier = 2;
        }
        else if(race == Race.ELF){
            modifier = 1;
        }
        else if(race == Race.HALF_ELF){
            modifier = 1;
        }
        return modifier;
    }

    public int EnduranceRacialModifier(Race race){
        int modifier = 0;
        if(race == Race.DWARF){
            modifier = 1;
        }
        else if(race == Race.ORC){
            modifier = 1;
        }
        else if(race == Race.ELF){
            modifier = -1;
        }
        else if(race == Race.AMUND){
            modifier = 1;
        }
        else if(race == Race.KHAAL){
            modifier = 2;
        }
        return modifier;
    }

    public int HealthRacialModifier(Race race){
        int modifier = 0;
        if(race == Race.DWARF){
            modifier = 1;
        }
        else if(race == Race.ORC){
            modifier = 2;
        }
        else if(race == Race.KHAAL){
            modifier = 3;
        }
        else if(race == Race.GNOME){
            modifier = 1;
        }
        return modifier;
    }

    public int IntelligenceRacialModifier(Race race){
        int modifier = 0;
        if(race == Race.DWARF){
            modifier = -1;
        }
        else if(race == Race.ORC){
            modifier = -1;
        }
        else if(race == Race.DZSENN){
            modifier = 2;
        }
        else if(race == Race.KHAAL){
            modifier = -1;
        }
        else if(race == Race.WIER){
            modifier = 1;
        }
        return modifier;
    }

    public int BeautyRacialModifier(Race race){
        int modifier = 0;
        if(race == Race.ELF){
            modifier = 1;
        }
        else if(race == Race.DWARF){
            modifier = -2;
        }
        else if(race == Race.ORC){
            modifier = -3;
        }
        else if(race == Race.AMUND){
            modifier = 3;
        }
        else if(race == Race.WIER){
            modifier = 1;
        }
        else if(race == Race.GNOME){
            modifier = -3;
        }
        else if(race == Race.GOBLIN){
            modifier = -3;
        }
        return modifier;
    }

    public int AstralRacialModifier(Race race){
        int modifier = 0;
        if(race == Race.AMUND){
            modifier = -1;
        }
        else if(race == Race.DWARF){
            modifier = -1;
        }
        else if(race == Race.ORC){
            modifier = -3;
        }
        else if(race == Race.KHAAL){
            modifier = -5;
        }
        return modifier;
    }

    public int PerceptionRacialModifier(Race race){
        int modifier = 0;
        if(race == Race.GNOME){
            modifier = 2;
        }
        else if(race == Race.GOBLIN){
            modifier = 2;
        }
        else if(race == Race.ELF){
            modifier = 2;
        }
        else if(race == Race.HALF_ELF){
            modifier = 1;
        }
        else if(race == Race.ORC){
            modifier = 2;
        }
        else if(race == Race.KHAAL){
            modifier = 2;
        }
        return modifier;
    }
}
