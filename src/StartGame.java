import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StartGame extends Menu {
    private GameObject gameObject;


    public StartGame(GameObject gameObject) {
        this.gameObject = gameObject;
    }

    @Override
    public void execute() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("save"))) {
            this.gameObject= (GameObject) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        new StartGame(gameObject).execute();
    }
}
