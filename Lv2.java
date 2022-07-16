
public class Lv2 extends Game_base{
	
	public Lv2() {
		//回数を設定
		clg = 5;
		
		//データに基づき参照する配列のゲッターメソッドを獲得
		Hiragana_data h = new Hiragana_data();
		int num = (int)(Math.random()*(nagasa));
		nagasa = h.getDakuonL();
		hiragana = h.getDakuon(num);
	    hint = h.getHintDakuon(num);
	    
	    messege = "れべる２からは ひらがなに【 ゛】が つく もんだいだよ！";
	}

}
