public class HavenFactory implements FractionFactory {
    @Override
    public Hero getHero() {
        return new HavenHero();
    }

    @Override
    public RacialSkill getRacialSkill() {
        return new HavenSkill();
    }

    @Override
    public Units getUnits() {
        return new HavenUnits();
    }
}
