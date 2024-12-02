public class mage extends ATKChar {
    public mage(String name) {
        super(name, 100, 50, 10, 10, 5);
    }

    public void castSpell(RPGcharacter target){
        target.HP -= 10;
        if(target.HP <= 0){
            target.HP = 0;
            System.out.println(target.name + "Dead!!!!");
            return;
        }
        else if (target==this){
            System.out.println("can't spell!!!");
            return;
        }
        System.out.println(name + " spelling: " + target.name);
    }
}
