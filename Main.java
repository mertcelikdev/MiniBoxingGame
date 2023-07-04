public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Boksör A",20,200,85, 30);
        Fighter f2= new Fighter("Boksör B", 15 ,220 , 80, 20);

        Match match = new Match(f1,f2,75,90);
        match.StartTheFight();

    }
}