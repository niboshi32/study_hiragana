
public class Lv1 extends Game_base{

	public Lv1() {
		//回数を設定
		clg = 10;
		
		//データに基づき参照する配列のゲッターメソッドを獲得
		Hiragana_data h = new Hiragana_data();
		
		nagasa = h.getHiraganaL();	
		hiragana = h.getHiragana(num);
	    hint = h.getHintHiragana(num);
	    
//	    hiragana = h.getHiragana(20);
	    messege = " ";
	}
}
