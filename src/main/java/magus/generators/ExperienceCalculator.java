package magus.generators;

import magus.model.Caste;
import magus.model.Character;

public class ExperienceCalculator {

    private Character character;

    public ExperienceCalculator(Character character) {
        this.character = character;
    }

    public void calculateXP(Caste caste, int level) {
        switch (caste) {
            case WARRIOR:
                warriorXP(level);
                break;
            case GLADIATOR:
                GladiatorXP(level);
                break;
            case HEADHUNTER:
                HeadhunterXP(level);
                break;
            case KNIGHT:
                KnightXP(level);
                break;
            case AMAZON:
                AmazonXP(level);
                break;
            case BARBARIAN:
                break;
            case DUELER:
                break;
            case THIEF:
                ThiefXP(level);
                break;
            case BARD:
                BardXP(level);
                break;
            case PRIEST:
                PriestXP(level);
                break;
            case PALADIN:
                PaladinXP(level);
                break;
            case PSY_MASTER:
            case MARTIAL_ARTIST:
                MartialArtistXP(level);
                break;
            case SWORD_ARTIST:
                SwordArtistXP(level);
                break;
            case WITCH:
                break;
            case WITCH_MASTER:
                break;
            case ILLUSIONIST:
            case FIRE_MAGE:
                break;
            case WIZARD:
                break;
        }
    }



    private void warriorXP(int level) {
        switch (level) {
            case 1:
                character.setExperiencePoint(0);
                character.setXpForNextLevel(161);
                break;
            case 2:
                character.setExperiencePoint(161);
                character.setXpForNextLevel(160);
                break;
            case 3:
                character.setExperiencePoint(321);
                character.setXpForNextLevel(320);
                break;
            case 4:
                character.setExperiencePoint(641);
                character.setXpForNextLevel(800);
                break;
            case 5:
                character.setExperiencePoint(1441);
                character.setXpForNextLevel(1360);
                break;
            case 6:
                character.setExperiencePoint(2801);
                character.setXpForNextLevel(2800);
                break;
            case 7:
                character.setExperiencePoint(5601);
                character.setXpForNextLevel(4400);
                break;
            case 8:
                character.setExperiencePoint(10001);
                character.setXpForNextLevel(10000);
                break;
            case 9:
                character.setExperiencePoint(20001);
                character.setXpForNextLevel(20000);
                break;
            case 10:
                character.setExperiencePoint(40001);
                character.setXpForNextLevel(20000);
                break;
            case 11:
                character.setExperiencePoint(60001);
                character.setXpForNextLevel(20000);
                break;
            case 12:
                character.setExperiencePoint(80001);
                character.setXpForNextLevel(32000);
                break;

            default:
                character.setExperiencePoint(112001 + ((character.getLevel() - 13) * 31200));
                character.setXpForNextLevel(31200);
                break;
        }
    }

    private void GladiatorXP(int level) {
        switch (level) {
            case 1:
                character.setExperiencePoint(0);
                character.setXpForNextLevel(189);
                break;
            case 2:
                character.setExperiencePoint(189);
                character.setXpForNextLevel(188);
                break;
            case 3:
                character.setExperiencePoint(377);
                character.setXpForNextLevel(449);
                break;
            case 4:
                character.setExperiencePoint(826);
                character.setXpForNextLevel(825);
                break;
            case 5:
                character.setExperiencePoint(1651);
                character.setXpForNextLevel(1650);
                break;
            case 6:
                character.setExperiencePoint(3301);
                character.setXpForNextLevel(3950);
                break;
            case 7:
                character.setExperiencePoint(7251);
                character.setXpForNextLevel(4800);
                break;
            case 8:
                character.setExperiencePoint(12051);
                character.setXpForNextLevel(11950);
                break;
            case 9:
                character.setExperiencePoint(24001);
                character.setXpForNextLevel(24000);
                break;
            case 10:
                character.setExperiencePoint(48001);
                character.setXpForNextLevel(20000);
                break;
            case 11:
                character.setExperiencePoint(68001);
                character.setXpForNextLevel(25000);
                break;
            case 12:
                character.setExperiencePoint(93001);
                character.setXpForNextLevel(37000);
                break;

            default:
                character.setExperiencePoint(130001 + ((character.getLevel() - 13) * 40000));
                character.setXpForNextLevel(40000);
                break;
        }
    }

    private void HeadhunterXP(int level) {
        switch (level) {
            case 1:
                character.setExperiencePoint(0);
                character.setXpForNextLevel(191);
                break;
            case 2:
                character.setExperiencePoint(191);
                character.setXpForNextLevel(210);
                break;
            case 3:
                character.setExperiencePoint(401);
                character.setXpForNextLevel(500);
                break;
            case 4:
                character.setExperiencePoint(901);
                character.setXpForNextLevel(900);
                break;
            case 5:
                character.setExperiencePoint(1801);
                character.setXpForNextLevel(1700);
                break;
            case 6:
                character.setExperiencePoint(3501);
                character.setXpForNextLevel(4000);
                break;
            case 7:
                character.setExperiencePoint(7501);
                character.setXpForNextLevel(7500);
                break;
            case 8:
                character.setExperiencePoint(15001);
                character.setXpForNextLevel(15000);
                break;
            case 9:
                character.setExperiencePoint(30001);
                character.setXpForNextLevel(30000);
                break;
            case 10:
                character.setExperiencePoint(60001);
                character.setXpForNextLevel(50000);
                break;
            case 11:
                character.setExperiencePoint(110001);
                character.setXpForNextLevel(50000);
                break;
            case 12:
                character.setExperiencePoint(160001);
                character.setXpForNextLevel(60000);
                break;

            default:
                character.setExperiencePoint(220001 + ((character.getLevel() - 13) * 60000));
                character.setXpForNextLevel(60000);
                break;
        }
    }

    private void KnightXP(int level) {
        switch (level) {
            case 1:
                character.setExperiencePoint(0);
                character.setXpForNextLevel(181);
                break;
            case 2:
                character.setExperiencePoint(181);
                character.setXpForNextLevel(190);
                break;
            case 3:
                character.setExperiencePoint(371);
                character.setXpForNextLevel(430);
                break;
            case 4:
                character.setExperiencePoint(801);
                character.setXpForNextLevel(850);
                break;
            case 5:
                character.setExperiencePoint(1651);
                character.setXpForNextLevel(1550);
                break;
            case 6:
                character.setExperiencePoint(3201);
                character.setXpForNextLevel(3200);
                break;
            case 7:
                character.setExperiencePoint(6401);
                character.setXpForNextLevel(5600);
                break;
            case 8:
                character.setExperiencePoint(12001);
                character.setXpForNextLevel(13000);
                break;
            case 9:
                character.setExperiencePoint(25001);
                character.setXpForNextLevel(20000);
                break;
            case 10:
                character.setExperiencePoint(45001);
                character.setXpForNextLevel(20000);
                break;
            case 11:
                character.setExperiencePoint(65001);
                character.setXpForNextLevel(25000);
                break;
            case 12:
                character.setExperiencePoint(90001);
                character.setXpForNextLevel(20000);
                break;

            default:
                character.setExperiencePoint(110001 + ((character.getLevel() - 13) * 35000));
                character.setXpForNextLevel(35000);
                break;
        }
    }

    private void AmazonXP(int level) {
        // ???
    }

    private void ThiefXP(int level) {
        switch (level) {
            case 1:
                character.setExperiencePoint(0);
                character.setXpForNextLevel(101);
                break;
            case 2:
                character.setExperiencePoint(101);
                character.setXpForNextLevel(102);
                break;
            case 3:
                character.setExperiencePoint(203);
                character.setXpForNextLevel(198);
                break;
            case 4:
                character.setExperiencePoint(401);
                character.setXpForNextLevel(402);
                break;
            case 5:
                character.setExperiencePoint(803);
                character.setXpForNextLevel(898);
                break;
            case 6:
                character.setExperiencePoint(1701);
                character.setXpForNextLevel(2800);
                break;
            case 7:
                character.setExperiencePoint(4501);
                character.setXpForNextLevel(4500);
                break;
            case 8:
                character.setExperiencePoint(9001);
                character.setXpForNextLevel(13000);
                break;
            case 9:
                character.setExperiencePoint(22001);
                character.setXpForNextLevel(24500);
                break;
            case 10:
                character.setExperiencePoint(46501);
                character.setXpForNextLevel(22000);
                break;
            case 11:
                character.setExperiencePoint(68501);
                character.setXpForNextLevel(29500);
                break;
            case 12:
                character.setExperiencePoint(98001);
                character.setXpForNextLevel(33500);
                break;

            default:
                character.setExperiencePoint(131501 + ((character.getLevel() - 13) * 33500));
                character.setXpForNextLevel(33500);
                break;
        }
    }

    private void BardXP(int level) {
        switch (level) {
            case 1:
                character.setExperiencePoint(0);
                character.setXpForNextLevel(170);
                break;
            case 2:
                character.setExperiencePoint(171);
                character.setXpForNextLevel(280);
                break;
            case 3:
                character.setExperiencePoint(351);
                character.setXpForNextLevel(650);
                break;
            case 4:
                character.setExperiencePoint(1001);
                character.setXpForNextLevel(1200);
                break;
            case 5:
                character.setExperiencePoint(2201);
                character.setXpForNextLevel(2200);
                break;
            case 6:
                character.setExperiencePoint(4401);
                character.setXpForNextLevel(3100);
                break;
            case 7:
                character.setExperiencePoint(7501);
                character.setXpForNextLevel(7500);
                break;
            case 8:
                character.setExperiencePoint(15001);
                character.setXpForNextLevel(15000);
                break;
            case 9:
                character.setExperiencePoint(30001);
                character.setXpForNextLevel(25000);
                break;
            case 10:
                character.setExperiencePoint(55001);
                character.setXpForNextLevel(20000);
                break;
            case 11:
                character.setExperiencePoint(75001);
                character.setXpForNextLevel(20000);
                break;
            case 12:
                character.setExperiencePoint(95001);
                character.setXpForNextLevel(50000);
                break;

            default:
                character.setExperiencePoint(145001 + ((character.getLevel() - 13) * 40000));
                character.setXpForNextLevel(40000);
                break;
        }
    }

    private void PriestXP(int level) {
        switch (level) {
            case 1:
                character.setExperiencePoint(0);
                character.setXpForNextLevel(161);
                break;
            case 2:
                character.setExperiencePoint(161);
                character.setXpForNextLevel(170);
                break;
            case 3:
                character.setExperiencePoint(331);
                character.setXpForNextLevel(330);
                break;
            case 4:
                character.setExperiencePoint(661);
                character.setXpForNextLevel(640);
                break;
            case 5:
                character.setExperiencePoint(1301);
                character.setXpForNextLevel(1300);
                break;
            case 6:
                character.setExperiencePoint(2601);
                character.setXpForNextLevel(2400);
                break;
            case 7:
                character.setExperiencePoint(5001);
                character.setXpForNextLevel(4000);
                break;
            case 8:
                character.setExperiencePoint(9001);
                character.setXpForNextLevel(14000);
                break;
            case 9:
                character.setExperiencePoint(23001);
                character.setXpForNextLevel(27000);
                break;
            case 10:
                character.setExperiencePoint(50001);
                character.setXpForNextLevel(40000);
                break;
            case 11:
                character.setExperiencePoint(90001);
                character.setXpForNextLevel(40000);
                break;
            case 12:
                character.setExperiencePoint(130001);
                character.setXpForNextLevel(35000);
                break;

            default:
                character.setExperiencePoint(165001 + ((character.getLevel() - 13) * 50000));
                character.setXpForNextLevel(50000);
                break;
        }
    }

    private void PaladinXP(int level) {
        switch (level) {
            case 1:
                character.setExperiencePoint(0);
                character.setXpForNextLevel(176);
                break;
            case 2:
                character.setExperiencePoint(176);
                character.setXpForNextLevel(177);
                break;
            case 3:
                character.setExperiencePoint(353);
                character.setXpForNextLevel(368);
                break;
            case 4:
                character.setExperiencePoint(721);
                character.setXpForNextLevel(780);
                break;
            case 5:
                character.setExperiencePoint(1501);
                character.setXpForNextLevel(2000);
                break;
            case 6:
                character.setExperiencePoint(3501);
                character.setXpForNextLevel(3500);
                break;
            case 7:
                character.setExperiencePoint(7001);
                character.setXpForNextLevel(3500);
                break;
            case 8:
                character.setExperiencePoint(10501);
                character.setXpForNextLevel(10500);
                break;
            case 9:
                character.setExperiencePoint(21001);
                character.setXpForNextLevel(27000);
                break;
            case 10:
                character.setExperiencePoint(48001);
                character.setXpForNextLevel(30000);
                break;
            case 11:
                character.setExperiencePoint(78001);
                character.setXpForNextLevel(30000);
                break;
            case 12:
                character.setExperiencePoint(108001);
                character.setXpForNextLevel(30000);
                break;

            default:
                character.setExperiencePoint(138001 + ((character.getLevel() - 13) * 38000));
                character.setXpForNextLevel(38000);
                break;
        }
    }

    private void MartialArtistXP(int level) {
        switch (level) {
            case 1:
                character.setExperiencePoint(0);
                character.setXpForNextLevel(221);
                break;
            case 2:
                character.setExperiencePoint(221);
                character.setXpForNextLevel(222);
                break;
            case 3:
                character.setExperiencePoint(443);
                character.setXpForNextLevel(508);
                break;
            case 4:
                character.setExperiencePoint(951);
                character.setXpForNextLevel(1050);
                break;
            case 5:
                character.setExperiencePoint(2001);
                character.setXpForNextLevel(2500);
                break;
            case 6:
                character.setExperiencePoint(4501);
                character.setXpForNextLevel(4500);
                break;
            case 7:
                character.setExperiencePoint(9001);
                character.setXpForNextLevel(7000);
                break;
            case 8:
                character.setExperiencePoint(16001);
                character.setXpForNextLevel(16000);
                break;
            case 9:
                character.setExperiencePoint(32001);
                character.setXpForNextLevel(33000);
                break;
            case 10:
                character.setExperiencePoint(65001);
                character.setXpForNextLevel(55000);
                break;
            case 11:
                character.setExperiencePoint(120001);
                character.setXpForNextLevel(50000);
                break;
            case 12:
                character.setExperiencePoint(170001);
                character.setXpForNextLevel(70000);
                break;

            default:
                character.setExperiencePoint(240001 + ((character.getLevel() - 13) * 65000));
                character.setXpForNextLevel(65000);
                break;
        }
    }

    private void SwordArtistXP(int level) {
        switch (level) {
            case 1:
                character.setExperiencePoint(0);
                character.setXpForNextLevel(201);
                break;
            case 2:
                character.setExperiencePoint(201);
                character.setXpForNextLevel(200);
                break;
            case 3:
                character.setExperiencePoint(401);
                character.setXpForNextLevel(525);
                break;
            case 4:
                character.setExperiencePoint(926);
                character.setXpForNextLevel(975);
                break;
            case 5:
                character.setExperiencePoint(1901);
                character.setXpForNextLevel(2100);
                break;
            case 6:
                character.setExperiencePoint(4001);
                character.setXpForNextLevel(4250);
                break;
            case 7:
                character.setExperiencePoint(8251);
                character.setXpForNextLevel(7250);
                break;
            case 8:
                character.setExperiencePoint(15501);
                character.setXpForNextLevel(15500);
                break;
            case 9:
                character.setExperiencePoint(31001);
                character.setXpForNextLevel(31500);
                break;
            case 10:
                character.setExperiencePoint(62501);
                character.setXpForNextLevel(52500);
                break;
            case 11:
                character.setExperiencePoint(115001);
                character.setXpForNextLevel(50000);
                break;
            case 12:
                character.setExperiencePoint(165001);
                character.setXpForNextLevel(70000);
                break;

            default:
                character.setExperiencePoint(230001 + ((character.getLevel() - 13) * 62000));
                character.setXpForNextLevel(62000);
                break;
        }
    }
}
