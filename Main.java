
public class Main {
	public static void main(String[] args) {

		Hiragana_display d = new Hiragana_display();

		int level = 0;

		Lv1 v1 = new Lv1();
		Lv2 v2 = new Lv2();
		Lv3 v3 = new Lv3();
		Lv4 v4 = new Lv4();

		Game_base[] g = {v1,v2,v3,v4};

		d.check();
		while(level<4) {
		g[level].play(level);
		d.conti(level);
		}

	}
}
