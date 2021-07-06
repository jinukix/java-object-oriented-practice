package gamelevel;

public class MainBoardPlay {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);

        System.out.println("================================");

        AdvancedLevel aLevel = new AdvancedLevel();
        player.upgradeLvel(aLevel);
        player.play(2);

        System.out.println("================================");

        SuperLevel sLevel = new SuperLevel();
        player.upgradeLvel(sLevel);
        player.play(3);
    }
}
