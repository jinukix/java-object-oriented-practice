package gamelevel;

public class UltraSuperLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("엄청 빠르게 run");
    }

    @Override
    public void jump() {
        System.out.println("엄청 높이 jump");
    }

    @Override
    public void turn() {
        System.out.println("빠르게 turn");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("초고급자 레벨");
    }
}
