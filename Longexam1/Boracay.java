public class Boracay implements Locations {

    int airFare = 130;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}