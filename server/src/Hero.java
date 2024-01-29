// スーパークラスの定義
public class Hero {
  String name = "アキラ";
  int hp = 100;

  public void attack(Slime m) {
    System.out.println(this.name + "は攻撃した！");
    m.hp -= 10;
    System.out.println("敵に10のダメージをあたえた");
  }

  public final void run() {
      System.out.println(this.name +"は逃げた");
  }
}
