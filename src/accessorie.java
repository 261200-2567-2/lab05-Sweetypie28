public class accessorie implements Accessories {
    String name;
    double weight;
    int level;

    public accessorie(String name, int weight) {
        this.name = name;
        this.weight = weight;
        this.level = 1;
    }

    @Override
    public void LevelUp() {
        level++;
    }
}
