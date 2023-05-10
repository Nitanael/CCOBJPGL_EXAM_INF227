public class Me implements Tourist {
      
    static int budget = 1000;
    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {
 if (boracay.airFare > budget ){
        System.out.println("Your money is not enough to have a stay here in boracay...");
}
 else{
        System.out.println("Enjoy your stay in boracay!");
        budget = budget - boracay.airFare;   
}
        checkBudget();
    }

    public void visit(Tagaytay tagaytay) {
 if (tagaytay.airFare > budget){
        System.out.println("Your money is not enough to have a stay here in tagaytay...");
}
 else{
        System.out.println("Enjoy your stay here in tagaytay!");
        budget = budget - tagaytay.airFare;
}
        checkBudget();
    }

    public void visit(Baguio baguio) {
  if (baguio.airFare > budget){
        System.out.println("Your money is not enough to have a stay here in baguio...");
}
 else{
        System.out.println("Enjoy your stay here in baguio!");
        budget = budget - baguio.airFare;
}
        checkBudget(); 
    }

    public void visit(Cavite cavite) {
  if (cavite.airFare > budget){
        System.out.println("Your money is not enough to have a stay here in cavite...");
}
 else{
        System.out.println("Enjoy your stay here in cavite!");
        budget = budget - cavite.airFare;
}
        checkBudget();
   
    }

    public void visit(Cebu cebu) {
   if (cebu.airFare > budget){
        System.out.println("Your money is not enough to have a stay here in cebu...");
}
 else{
        System.out.println("Enjoy your stay here in cebu!");
        budget = budget - cebu.airFare;
}
        checkBudget();
       
    }
    public void visit(Dumaguete dumaguete) {
   if (dumaguete.airFare > budget){
        System.out.println("Your money is not enough to have a stay here in dumaguete...");
}
 else{
        System.out.println("Enjoy your stay here in dumaguete!");
        budget = budget - dumaguete.airFare;
}
        checkBudget();
        
    }


    public void checkBudget() {
        System.out.println("my budget is " + budget);

    }
}