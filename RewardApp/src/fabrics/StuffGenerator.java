package fabrics;

import interfaces.IGameItem;
import products.Stuff;

public class StuffGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Stuff();
    }
    
}
