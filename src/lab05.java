public class lab05 {
    public static void main(String[] args) {
        mage x = new mage("Pam");
        healer y = new healer("Namkhaw");

        Wing wing = new Wing("Wing", 1, 2);
        Wand wand = new Wand("Wand", 1, 2);

        x.ShowStats();
        y.ShowStats();

        x.LevelUp();
        y.LevelUp();

        x.equip(wing);
        x.equip(wand);

        x.ShowStats();
        y.ShowStats();

        x.Attack(y);
        while(y.HP > 0){
            x.Attack(y);
        }
        y.ShowStats();
    }
}