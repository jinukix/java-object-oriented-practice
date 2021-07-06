package gamelevel;

public class AdvancedLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("적당히 run");
    }

    @Override
    public void jump() {
        System.out.println("적당히 jump");
    }

    @Override
    public void turn() {
        System.out.println("불가능 turn");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("중급자 레벨");
    }
}
