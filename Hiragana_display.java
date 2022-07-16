
public class Hiragana_display {
	
	public void check() {
		System.out.println("がめんに ででる ひらがな と  おなじ ひらがな を うちこんでね ！");
	    System.out.println("れべるが あがると だんだん もんだいが むずかしくなるよ！");
	    System.out.println();
	    System.out.println("まず にゅうりょくもーどを かくにんするよ！");
	    System.out.println("ためしに I ぼたんを おしてみてね！");
	    String test = new java.util.Scanner(System.in).nextLine();
	    if(test.equals("i")) {
		    System.out.println("にゅうりょくもーどが あっていないよ！");
		    System.out.println("Aぼたんの ひだりどなりにある CapsLockぼたんを おして\n"
		                        + " にゅうりょくもーどを きりかえてね");
	    }else {
	        System.out.println("げーむを はじめられるよ");
	    }
	}
	
	public void conti(int level) { 
		System.out.println("れべるが" + level + "になりました！");
	    System.out.println("まだ げーむを つづける？ つづけるなら y を おわりたいなら n をおしてね！" );
	    System.out.println("はい ： y  / いいえ ： n");
	    String ctn = new java.util.Scanner(System.in).nextLine();
	
	    if(ctn.equals("ｙ")){
	        System.out.println("げーむを つづけてくれて ありがとう！");
	        
	    }else {
            System.out.println("ぷれいしてくれてありがとう！ またあそびにきてね");
            System.exit(0);
	    }
	}
}
