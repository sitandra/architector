import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import fabrics.BladeGenerator;
import fabrics.BranchGenerator;
import fabrics.GemGenerator;
import fabrics.GoldGenerator;
import fabrics.ItemGenerator;
import fabrics.StoneGenerator;
import fabrics.StuffGenerator;
import fabrics.WingGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        List<ItemGenerator> generators = new ArrayList<>();
        generators.add(new GemGenerator());
        generators.add(new GoldGenerator());
        generators.add(new BladeGenerator());
        generators.add(new BranchGenerator());
        generators.add(new StoneGenerator());
        generators.add(new StuffGenerator());
        generators.add(new WingGenerator());
        Random rnd = new Random();
        // 10:10:10:10:10(ваши награды):3(золото GOLD):1(алмазы GEM)
        for (int i = 0; i < 100; i++) {
            int v = rnd.nextInt(54);
            int idx = v == 0 ? 0 : v < 4 ? 1: v < 14 ? 2 : v < 24 ? 3 : v < 34 ? 4 : v < 44 ? 5 : 6;
            generators.get(idx).openReward();
        }
    }
}
