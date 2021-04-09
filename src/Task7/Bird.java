package Task7;

public abstract class Bird implements Fly {
    private String feathers;
    private String layEggs;
    public void fly() {
    }
    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public String getLayEggs() {
        return layEggs;
    }

    public void setLayEggs(String layEggs) {
        this.layEggs = layEggs;
    }

    public static void main(String[] args) {
        Bird [] bd = new Bird[4];
        bd[0] = new Eagle();
        bd[1] = new Swallow();
        bd[2] = new Penguin();
        bd[3] = new Chicken();
        System.out.println("Flying birds: " + bd[0] + ","+ bd[1]);
        System.out.println("Non-Flying birds: " + bd[2] + ","+ bd[3]);

    }
}
