package fabrics;

import interfaces.IGameItem;
import products.Branch;

public class BranchGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Branch();
    }
    
}
