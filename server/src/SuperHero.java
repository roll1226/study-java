// サブクラスの定義
public class SuperHero extends Hero {
  public void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は眠ってすっかり回復した");
  }

  @Override
  public void attack(Slime s) {
    System.out.println(this.name + "はめちゃくちゃ攻撃した！");
    s.hp -= 30;
    System.out.println("敵に30のダメージをあたえた");
  };
}
