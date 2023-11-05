package InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;
import ModelElements.Texture;

public class ModelStore implements IModelChanger{
    public List<PoligonalModel> Models;
    public List<Scene> Scenes;
    public List<Flash> Flashes;
    public List<Camera> Cameras;
    private IModelChangedObserver[] changeObservers;

    public ModelStore(IModelChangedObserver[] changeObservers) {
        this.changeObservers = changeObservers;
        this.Models = new ArrayList<>();
        this.Scenes = new ArrayList<>();
        this.Flashes = new ArrayList<>();
        this.Cameras = new ArrayList<>();
        this.Models.add(new PoligonalModel(new ArrayList<Texture>()));
        this.Scenes.add(new Scene());
        this.Flashes.add(new Flash());
        this.Cameras.add(new Camera());
    }

    public Scene GetScena(int id) {
        return Scenes.get(id);
    }

    @Override
    public void NotifyChange(IModelChanger sender) {
        throw new UnsupportedOperationException("Unimplemented method 'NotifyChange'");
    }
}
