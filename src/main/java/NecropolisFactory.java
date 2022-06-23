public class NecropolisFactory implements FractionFactory {
    @Override
    public Hero getHero() {
        return new NecropolisHero();
    }

    @Override
    public RacialSkill getRacialSkill() {
        return new NecropolisSkill();
    }

    @Override
    public Units getUnits() {
        return new NecropolisUnits();
    }
}
