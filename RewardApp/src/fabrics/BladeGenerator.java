package fabrics;

import interfaces.IGameItem;
import products.Blade;

public class BladeGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Blade();
    }
    
}
