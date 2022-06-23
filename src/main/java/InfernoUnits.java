import java.util.Arrays;
import java.util.List;

public class InfernoUnits implements Units {
    @Override
    public List<String> getUnits() {
        return Arrays.asList("Imps", "Horned Demons", "Hell Hounds", "Succubi", "Hell Chargers", "Pit Fiends", "Devils");
    }
}
