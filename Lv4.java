
public class Lv4 extends Game_base{
	
	public Lv4() {
		//回数を設定
		clg = 10;
		
		//データに基づき参照する配列のゲッターメソッドを獲得
		Hiragana_data h = new Hiragana_data();
		
		nagasa = h.getAlHiraganaL();
		hiragana = h.getAlHiragana(num);
	    hint = h.getHintAlHiragana(num);
	    
	    messege = ("れべる４はさいごのひらがなもんだいだよ！");
	}
}
