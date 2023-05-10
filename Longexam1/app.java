public class App {
    public static void main(String[] args) throws Exception {

        // Long exam 1

        // 1. Add 5 new locations to visit
        // 2. Each location should have an airFare.
        // 3. Each time you visit a new location, your budget should decrease.
        // 4. In the visit method, print a message if you can visit the new location and
        // print another message if you cannot visit the location.
        // 5. Each time you visit a location, call the checkBudgetMethod


        Boracay boracay = new Boracay();
        Tagaytay tagaytay = new Tagaytay();
        Baguio baguio = new Baguio();
        Cavite cavite = new Cavite();
        Cebu cebu = new Cebu();
        Dumaguete dumaguete = new Dumaguete();

        Me tourist = new Me();
        
        boracay.accept(tourist);
        tagaytay.accept(tourist);
        baguio.accept(tourist);
        cavite.accept(tourist);
        cebu.accept(tourist);
        dumaguete.accept(tourist);

    }
}
