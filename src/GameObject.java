import java.io.Serializable;

public class GameObject implements Serializable{
    private int nodeOne;
    private int nodeTwo;
    private String text;


    public GameObject(int nodeOne, int nodeTwo, String text) {
        this.nodeOne = nodeOne;
        this.nodeTwo = nodeTwo;
        this.text = text;
    }

    public int getNodeOne() {
        return nodeOne;
    }

    public int getNodeTwo() {
        return nodeTwo;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "GameObject{" +
                "nodeOne=" + nodeOne +
                ", nodeTwo=" + nodeTwo +
                ", text='" + text + '\'' +
                '}';
    }
}
