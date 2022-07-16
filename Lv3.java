
public class Lv3 extends Game_base{
	
	public Lv3() {
		//回数を設定
		clg = 5;
		
		//データに基づき参照する配列のゲッターメソッドを獲得
		Hiragana_data h = new Hiragana_data();
		
		nagasa = h.getHanDakuL();
		hiragana = h.getHanDaku(num);
	    hint = h.getHintHanDaku(num);
	    
	    messege = ("れべる３からは ひらがなに【゜】が つく もんだいだよ！");
	}
}
