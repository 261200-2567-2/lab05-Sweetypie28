public class lab05 {
    public static void main(String[] args) {
        mage x = new mage("namkhaw");
        healer y = new healer("Pam");

        wing w = new wing("wing");
        wand z = new wand("wand");

        x.ShowStats();
        y.ShowStats();

        x.LevelUp();
        y.LevelUp();

        x.equip(w);
        x.equip(z);

        x.ShowStats();
        y.ShowStats();

        while(x.)y.Attack(x);

    }
}
