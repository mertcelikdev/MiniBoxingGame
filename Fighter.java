public class Fighter {

    String name;
    int damage, health, weight, dodge , firsthit;

    Fighter(String name, int damage, int health, int weight, int dodge ) {
        this.name = name;
        this.weight = weight;
        this.damage = damage;
        this.health = health;
        if (this.dodge < 100) {
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }

    }

    public int hit(Fighter foe) {

        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");

        if (foe.isDodge()) {
            System.out.println(foe.name + " gelen hasarı savurdu.");

            return foe.health;
        }

        if (foe.health - this.damage < 0)
            return 0;

        return foe.health - this.damage;
    }


    boolean isDodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;


    }


}
