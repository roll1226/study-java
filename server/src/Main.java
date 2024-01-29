public class Main {
  public static void main(String[] args) {
    Hero h = new Hero();

    Slime s1 = new Slime();

    h.attack(s1);

    SuperHero sh = new SuperHero();

    Slime s2 = new Slime();

    sh.attack(s2);
    sh.sleep();
  }
}
