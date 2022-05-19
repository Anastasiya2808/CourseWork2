public class Play extends Menu {
    private GameObject gameObject;

    public void StartGame(GameObject gameObject) {
        this.gameObject = gameObject;
    }

    @Override
    public void execute() {
        ListGame gameList = new ListGame();
        ListGame.game(gameObject);
    }
}
