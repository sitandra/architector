package fabrics;

import interfaces.IGameItem;
import products.Wing;

public class WingGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Wing();
    }
    
}
