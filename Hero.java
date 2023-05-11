public class Hero extends Character{
    @Override
    public void move() {
        System.out.println("Hero berjalan");
    }
    public void move(String direction){
        System.out.println("hero berjalan ke " +direction);
    }
}
