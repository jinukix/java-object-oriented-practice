package gamelevel;

public class BeginnerLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("천천히 run");
    }

    @Override
    public void jump() {
        System.out.println("불가능 jump");
    }

    @Override
    public void turn() {
        System.out.println("불가능 turn");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("초급자 레벨");
    }
}
