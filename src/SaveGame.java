import java.io.*;

public class SaveGame extends Menu {
    private GameObject gameObject;
    public SaveGame(GameObject gameObject){
        this.gameObject=gameObject;
    }
    @Override
    public void execute() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream(new File("save")))) {
            outputStream.writeObject(gameObject);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        new StartGame(gameObject).execute();

    }
}
