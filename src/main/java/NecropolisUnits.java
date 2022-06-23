import java.util.Arrays;
import java.util.List;

public class NecropolisUnits implements Units {
    @Override
    public List<String> getUnits() {
        return Arrays.asList("Skeletons", "Zombies", "Ghosts", "Vampires", "Liches", "Wights", "Bone Dragons");
    }
}
