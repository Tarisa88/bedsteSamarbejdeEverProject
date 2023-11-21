public class DOS {

    String size;
    String speed;

    public DOS() {
        this.size = "Entire desk space";
        this.speed = "Glacial";
    }

    @Override
    public String toString() {
        return "DOS{" +
                "size='" + size + '\'' +
                ", speed='" + speed + '\'' +
                '}';
    }
}
