package prototype;

public class Sword implements Item {

	private String name;



	public Sword(String name) {
		super();
		this.name = name;
	}


	@Override
	public void get() {

		System.out.println(name + "を獲得しました");
	}

	@Override
	public void use() {
		System.out.println(name + "を使いました");

	}

	@Override
	public Item createClone() {
		Item item = null;

		try {
			item = (Item) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return item;
	}

}
