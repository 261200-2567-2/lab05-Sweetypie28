public class Accessories implements AccessoriesInterface {
    String name;
    double weight;
    int level;
    int value;

    public Accessories(String name, int weight, int value) {
        this.name = name;
        this.weight = weight;
        this.level = 1;
        this.value = value;
    }

    @Override
    public void LevelUp() {
        level++;
    }
}