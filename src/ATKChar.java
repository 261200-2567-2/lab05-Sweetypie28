import static java.lang.Math.abs;

public class ATKChar extends RPGcharacter{

    public ATKChar(String name, int HP, int mana, int runSpeed, int Atk, int Def) {
        super(name, HP, mana, runSpeed, Atk, Def);
    }
    public void Attack(RPGcharacter target){
        target.HP -= abs(Atk-target.Def);
        if(target.HP <= 0){
            target.HP = 0;
            return;
        }
        else if(target == this){
            System.out.println("cannot attack yourselves!!!!!!");
            return;
        }
        System.out.println(name+ " attacking "+ target.name );
    }
}
