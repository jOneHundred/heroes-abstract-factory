public class FactoryMaker {
    public static FractionFactory makeFactory(FractionType fractionType){
        return switch (fractionType){
            case HAVEN -> new HavenFactory();
            case INFERNO -> new InfernoFactory();
            case NECROPOLIS -> new NecropolisFactory();
        };
    }
}
