public class RPGcharacter implements Character {
    public String name;
    public int HP;
    public int mana;
    public int runSpeed;
    public int Atk;
    public int Def;
    public int level;

    int wandHP = 0;
    int wingSpeed = 0;

    public RPGcharacter(String name, int HP, int mana, int runSpeed, int Atk, int Def) {
        this.name = name;
        this.HP = HP;
        this.mana = mana;
        this.runSpeed = runSpeed;
        this.Atk = Atk;
        this.Def = Def;
        this.level = 1;
    }

    @Override
    public void ShowStats() {
        System.out.println("Name: " + name + " | HP: " + HP + " | Mana: " + mana + " | Run Speed: " + runSpeed
                + " | Attack: " + Atk + " | Defense: " + Def);
    }

    @Override
    public void LevelUp() {
        level++;
        Atk += 2;
        Def += 2;
        runSpeed += 1;
    }

    @Override
    public void equip(Accessories accessories) {
        if(accessories instanceof Wing){
            HP -= wandHP;
            wandHP = accessories.value;
            HP += wandHP;
        }
        if(accessories instanceof Wand){
            runSpeed -= wingSpeed;
            wingSpeed = accessories.value;
            runSpeed += wingSpeed;
        }
    }
}