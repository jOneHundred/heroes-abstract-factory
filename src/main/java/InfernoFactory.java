public class InfernoFactory implements FractionFactory {
    @Override
    public Hero getHero() {
        return new InfernoHero();
    }

    @Override
    public RacialSkill getRacialSkill() {
        return new InfernoSkill();
    }

    @Override
    public Units getUnits() {
        return new InfernoUnits();
    }
}
