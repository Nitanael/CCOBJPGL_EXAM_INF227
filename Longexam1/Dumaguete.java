public class Dumaguete implements  Locations {

    int airFare = 177;

    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}