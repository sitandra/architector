package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public List<Poligon> Poligons;
    public List<Texture> Textures;

    public PoligonalModel(List<Texture> textures) {
        this.Textures = textures;
        this.Poligons = new ArrayList<>();
        this.Poligons.add(new Poligon());
    }
}
