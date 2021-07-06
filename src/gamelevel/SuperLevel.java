package gamelevel;

public class SuperLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("빠르게 run");
    }

    @Override
    public void jump() {
        System.out.println("높이 jump");
    }

    @Override
    public void turn() {
        System.out.println("적당히 turn");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("고급자 레벨");
    }
}
