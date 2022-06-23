import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {

    public static void main(String[] args) {
        Fraction fraction = createFraction(FractionType.HAVEN);
        log.info(fraction.getHero().getName());
        log.info(fraction.getSkill().getName());
        log.info(fraction.getUnits().getUnits().toString());

        fraction = createFraction(FractionType.INFERNO);
        log.info(fraction.getHero().getName());
        log.info(fraction.getSkill().getName());
        log.info(fraction.getUnits().getUnits().toString());

        fraction = createFraction(FractionType.NECROPOLIS);
        log.info(fraction.getHero().getName());
        log.info(fraction.getSkill().getName());
        log.info(fraction.getUnits().getUnits().toString());
    }

    private static Fraction createFraction(FractionType fractionType){
        FractionFactory fractionFactory = FactoryMaker.makeFactory(fractionType);
        return new Fraction(fractionFactory.getHero(), fractionFactory.getRacialSkill(), fractionFactory.getUnits());
    }
}