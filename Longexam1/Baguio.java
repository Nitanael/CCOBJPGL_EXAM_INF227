public class Baguio implements Locations {

    int airFare = 199;

    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}

