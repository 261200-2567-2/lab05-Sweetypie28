import static java.lang.Math.abs;

public class healChar extends RPGcharacter{

    public healChar(String name, int HP, int mana, int runSpeed, int Atk, int Def) {
        super(name, HP, mana, runSpeed, Atk, Def);
    }
    public void healerAtk(RPGcharacter target){
        target.HP -= abs(Atk-target.Def);
        HP += 5;
        if(target.HP <= 0){
            target.HP = 0;
            return;
        }
        else if(target == this){
            System.out.println("cannot attack yourselves!!!!!!");
            return;
        }
        System.out.println(name+ " attacking with "+ target.name);
    }
}
