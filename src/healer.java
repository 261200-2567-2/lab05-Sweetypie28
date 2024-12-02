public class healer extends ATKChar {
    public healer(String name) {
        super(name, 105, 50, 10, 5, 5);
    }

    public void heal(RPGcharacter target){
        HP += 5;
        if(this.HP <= 120){ //MaxHP for healer=120
            target.HP = 105;
            return;
        }
        System.out.println(name + " is healing");
    }
}
