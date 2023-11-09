package fabrics;

import interfaces.IGameItem;
import products.Stone;

public class StoneGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Stone();
    }
    
}
