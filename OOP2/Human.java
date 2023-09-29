public abstract class Human implements Illable {
    private String name;

    @Override
    public void getIll() {
    }

    // Конструкторы
    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}