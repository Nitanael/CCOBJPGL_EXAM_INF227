public class Tagaytay implements Locations {

    int airFare = 150;

    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}