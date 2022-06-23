import java.util.Arrays;
import java.util.List;

public class HavenUnits implements Units {
    @Override
    public List<String> getUnits() {
        return Arrays.asList("Peasants", "Archers", "Footmen", "Griffins", "Priests", "Cavaliers", "Angels");
    }
}
