package prototype;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Manager manager = new Manager();

		Potion redPotion = new Potion("赤のポーション");
		manager.register("redPotion", redPotion);

		Potion orangePotion = new Potion("オレンジのポーション");
		manager.register("orangePotion", orangePotion);

		Sword sword = new Sword("鋼の剣");
		manager.register("sword", sword);

		Item sword1 = manager.create("sword");
		sword1.get();
		sword1.use();

		Item potion1 = manager.create("redPotion");
		potion1.get();
		potion1.use();

		Item potion2 = manager.create("orangePotion");
		potion2.get();
		potion2.use();
	}

}
