import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AbstractFactoryTest {

    @Test
    void testHavenFraction(){
        Fraction fraction = createFraction(FractionType.HAVEN);
        assertTrue(fraction.getHero() instanceof HavenHero);
        assertEquals(fraction.getHero().getName(), "Knight");
        assertTrue(fraction.getSkill() instanceof HavenSkill);
        assertEquals(fraction.getSkill().getName(), "Training");
        assertTrue(fraction.getUnits() instanceof HavenUnits);
        assertEquals(fraction.getUnits().getUnits().toString(), "[Peasants, Archers, Footmen, Griffins, Priests, Cavaliers, Angels]");
    }

    @Test
    void testInfernoFraction(){
        Fraction fraction = createFraction(FractionType.INFERNO);
        assertTrue(fraction.getHero() instanceof InfernoHero);
        assertEquals(fraction.getHero().getName(), "Demon Lord");
        assertTrue(fraction.getSkill() instanceof InfernoSkill);
        assertEquals(fraction.getSkill().getName(), "Gating");
        assertTrue(fraction.getUnits() instanceof InfernoUnits);
        assertEquals(fraction.getUnits().getUnits().toString(), "[Imps, Horned Demons, Hell Hounds, Succubi, Hell Chargers, Pit Fiends, Devils]");
    }

    @Test
    void testNecropolisFraction(){
        Fraction fraction = createFraction(FractionType.NECROPOLIS);
        assertTrue(fraction.getHero() instanceof NecropolisHero);
        assertEquals(fraction.getHero().getName(), "Necromancer");
        assertTrue(fraction.getSkill() instanceof NecropolisSkill);
        assertEquals(fraction.getSkill().getName(), "Necromancy");
        assertTrue(fraction.getUnits() instanceof NecropolisUnits);
        assertEquals(fraction.getUnits().getUnits().toString(), "[Skeletons, Zombies, Ghosts, Vampires, Liches, Wights, Bone Dragons]");
    }

    private Fraction createFraction(FractionType fractionType){
        FractionFactory fractionFactory = FactoryMaker.makeFactory(fractionType);
        return new Fraction(fractionFactory.getHero(), fractionFactory.getRacialSkill(), fractionFactory.getUnits());
    }
}
