public class Match {
    Fighter f1;
    Fighter f2;

    int minWeight, maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {

        this.f1 = f1;
        this.f2 = f2;


        this.minWeight = minWeight;
        this.maxWeight = maxWeight;


    }

    void StartTheFight() {
        if (isCheck()) {
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("======== YENİ ROUND ===========");
                if (firstStrike()) {
                    f2.health = f1.hit(f2);
                    f1.health = f2.hit(f1);
                } else {
                    f1.health = f2.hit(f1);
                    f2.health = f1.hit(f2);
                }
                if (isWin()) {
                    break;
                }

                if (isWin()) {
                    break;
                }
                printScore();
            }

        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }


    }


    boolean isCheck() {
        return (this.f1.weight >= minWeight || this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight || this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (f1.health == 0) {
            System.out.println("*****" + this.f2.name + " maçı kazandı ***** ");
            return true;
        }


        if (f2.health == 0) {
            System.out.println("***** " + this.f1.name + " maçı kazandı *****");
            return true;
        }
        return false;
    }

    boolean firstStrike() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= 50;
    }


    public void printScore() {

        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }
}
