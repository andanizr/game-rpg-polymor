public class Enemy extends Character{
    @Override
    public void move() {
        System.out.println("Enemy berjalan");
    }
    public void move(int step) {
        System.out.println("Enemy berjalan " +step+ " langkah");
    }
}
