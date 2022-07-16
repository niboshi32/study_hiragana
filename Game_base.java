
public abstract class Game_base {
	//問題の元となるクラス
	//総数、正解数、目標までの残り回数を設定
	int clg ;
	int corect ;
    int count ;

    //出題乱数とその範囲
    int nagasa;
    int num ;

    //問題、ヒント、メッセージ
    String hiragana;
    String hint;
    String messege;

	public int play(int level) {

		System.out.println("れべる" + (level+1) + "からはじまるよ");
		System.out.println(messege);
		System.out.println("がんばってね");

		while(corect < clg){

            int num = (int)(Math.random()*(nagasa));

            System.out.println(hiragana + "\n とおなじひらがなを入力してね！");
            System.out.println("がめんに うつってる あるふぁべっとと おなじのを おしてみてね ");
            System.out.println(hint);
            String ans = new java.util.Scanner(System.in).nextLine();

            //入力判定
            if(ans.equals(hiragana)) {
                corect++;
                count = clg-corect;
                System.out.println("だいせいかい。おめでとう！");

                if(count <= 0) {
                    System.out.println("れべるが 1 あがったよ！");
                    return level;
                }else {
                    System.out.println("あと" + count + "せいかいすると れべるがあがるよ");
                }
            }else {
                System.out.println("ざんねん せいかいできるまで ちょうせんしてね");
            }
        }
		return level-1;
	}
	public Game_base() {
		//コンストラクタとして回数を初期化、他の値は継承先で設定
		count = 0;
	}
}
