interface Tourist {

    int budget = 0;

    void visit();

    void visit(Boracay boracay);
    void visit(Tagaytay tagaytay);
    void visit(Baguio baguio);
    void visit(Cavite cavite);
    void visit(Cebu cebu);
    void visit(Dumaguete dumaguete);
    
    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();

}