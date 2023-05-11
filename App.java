public class App {
    
    public static void main(String[] args) throws Exception{
        Hero Hr = new Hero();
        Enemy En = new Enemy();
        Character Fg = new Fighter();
        Character Wt = new Witch();
        Character Hr2 = new Hero();
        Character En2 = new Enemy();

        System.out.println("");
        Hr.move();
        Hr.move("depan");
        Hr = new Fighter();
        System.out.println("====================");
        System.out.println("");
        Hr.move();
        System.out.println("====================");
        System.out.println("");
        En.move();
        En.move(3);
        System.out.println("====================");
        System.out.println("");
        En = new Witch();
        En.move();
        System.out.println("====================");
        System.out.println("");
        Fg.move();
        Wt.move();
        Hr2.move();
        En2.move();
        System.out.println("====================");
        System.out.println("");
        
        
        Character cr = new Witch();
        cr.move();
        Fighter f = (Fighter) cr;
        f.move();

    }
}
