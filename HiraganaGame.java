public class HiraganaGame {
    public static void main(String[] args) {

    int level = 1;
    int corect = 0;
    int clg = 0;
    int count = clg - corect;
    String[] hiragana = {
                         "あ","い","う","え","お",
                         "か","き","く","け","こ",
                         "さ","し","す","せ","そ",
                         "た","ち","つ","て","と",
                         "な","に","ぬ","ね","の",
                         "は","ひ","ふ","へ","ほ",
                         "ま","み","む","め","も",
                         "や","ゆ","よ",
                         "ら","り","る","れ","ろ",
                         "わ","を","ん",
                         "きゃ","きゅ","きょ",
                         "しゃ","しゅ","しぇ","しょ",
                         "ちゃ","ちゅ","ちぇ","ちょ",
                         "にゃ","にゅ","にょ",
                         "ひゃ","ひゅ","ひょ",
                         "みゃ","みゅ","みょ",
                         "りゃ","りゅ","りょ",
                         "てぃ","っ",
                         "ぁ","ぃ","ぅ","ぇ","ぉ",
                         "ゃ","ゅ","ょ"
                         };

        String[] dakuon = {
                          "が","ぎ","ぐ","げ","ご",
                          "ざ","じ","ず","ぜ","ぞ",
                          "だ","ぢ","づ","で","ど",
                          "ば","び","ぶ","べ","ぼ",
                          "ぎゃ","ぎゅ","ぎょ",
                          "じゃ","じゅ","じょ",
                          "ぢゃ","ぢゅ","ぢょ",
                          "びゃ","びゅ","びょ",
                          "でぃ"
                          };

        String[] hanDaku = {
                           "ぱ","ぴ","ぷ","ぺ","ぽ",
                           "ぴゃ","ぴゅ","ぴょ"
                           };

        String[] alHira = {
                           "あ","い","う","え","お",
                           "か","き","く","け","こ",
                           "さ","し","す","せ","そ",
                           "た","ち","つ","て","と",
                           "な","に","ぬ","ね","の",
                           "は","ひ","ふ","へ","ほ",
                           "ま","み","む","め","も",
                           "や","ゆ","よ",
                           "ら","り","る","れ","ろ",
                           "わ","を","ん",
                           "きゃ","きゅ","きょ",
                           "しゃ","しゅ","しぇ","しょ",
                           "ちゃ","ちゅ","ちぇ","ちょ",
                           "にゃ","にゅ","にょ",
                           "ひゃ","ひゅ","ひょ",
                           "みゃ","みゅ","みょ",
                           "りゃ","りゅ","りょ",
                           "てぃ","っ",
                           "ぁ","ぃ","ぅ","ぇ","ぉ",
                           "ゃ","ゅ","ょ",
                           "が","ぎ","ぐ","げ","ご",
                           "ざ","じ","ず","ぜ","ぞ",
                           "だ","ぢ","づ","で","ど",
                           "ば","び","ぶ","べ","ぼ",
                           "ぎゃ","ぎゅ","ぎょ",
                           "じゃ","じゅ","じょ",
                           "ぢゃ","ぢゅ","ぢょ",
                           "びゃ","びゅ","びょ",
                           "でぃ",
                           "ぱ","ぴ","ぷ","ぺ","ぽ",
                           "ぴゃ","ぴゅ","ぴょ"
                          };



        // ヒント用アルファベット
        String[] abc = {
                       "a","i","u","e","o",
                       "ka","ki","ku","ke","ko",
                       "sa","si","su","se","so",
                       "ta", "ti","tu","te","to",
                       "na","ni","nu","ne","no",
                       "ha","hi","hu","he","ho",
                       "ma","mi","mu","me","mo",
                       "ya","yu","yo",
                       "ra","ri","ru","re","ro",
                       "wa","wo","nn",
                       "kya","kyu","kyo",
                       "sya","syu","sye","syo",
                       "tya","tyu","tye","tyo",
                       "nya","nyu","nyo",
                       "hya","hyu","hyo",
                       "mya","myu","myo",
                       "rya","ryu","ryo",
                       "thi","ltu",
                       "la","li","lu","le","lo",
                       "lya","lyu","lyo"
                       };

        String[] dakuAbc = {
                           "ga","gi","gu","ge","go",
                           "za","zi","zu","ze","zo",
                           "da","di","du","de","do",
                           "ba","bi","bu","be","bo",
                           "gya","gyu","gyo",
                           "ja","ju","jo",
                           "dya","dyu","dyo",
                           "bya","byu","byo",
                           "dhi"
                           };

        String[] handakuAbc = {
                              "pa","pi","pu","pe","po",
                              "pya","pyu","pyo"
                              };
        String[] alAbc = {
                "a","i","u","e","o",
                "ka","ki","ku","ke","ko",
                "sa","si","su","se","so",
                "ta", "ti","tu","te","to",
                "na","ni","nu","ne","no",
                "ha","hi","hu","he","ho",
                "ma","mi","mu","me","mo",
                "ya","yu","yo",
                "ra","ri","ru","re","ro",
                "wa","wo","nn",
                "kya","kyu","kyo",
                "sya","syu","sye","syo",
                "tya","tyu","tye","tyo",
                "nya","nyu","nyo",
                "hya","hyu","hyo",
                "mya","myu","myo",
                "rya","ryu","ryo",
                "thi","ltu",
                "la","li","lu","le","lo",
                "lya","lyu","lyo",
                "ga","gi","gu","ge","go",
                "za","zi","zu","ze","zo",
                "da","di","du","de","do",
                "ba","bi","bu","be","bo",
                "gya","gyu","gyo",
                "ja","ju","jo",
                "dya","dyu","dyo",
                "bya","byu","byo",
                "dhi",
                "pa","pi","pu","pe","po",
                "pya","pyu","pyo"
               };


        // 問題表示
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
        System.out.println("れべる" + level + "から はじまるよ");
        do {

            clg = 10;
            int num1 = (int)(Math.random()*(hiragana.length));

            System.out.println(hiragana[num1] + "\n とおなじひらがなを入力してね！");
            System.out.println("がめんに うつってる あるふぁべっとと おなじのを おしてみてね ");
            System.out.println(abc[num1]);
            String ans1 = new java.util.Scanner(System.in).nextLine();

            //入力判定
            if(ans1.equals(hiragana[num1])) {
                corect++;
                count = clg-corect;
                System.out.println("だいせいかい。おめでとう！");

                if(count <= 0) {
                    System.out.println("れべるが 1 あがったよ！");
                }else {
                    System.out.println("あと" + count + "せいかいすると れべるがあがるよ");
                }
            }else {
                System.out.println("ざんねん せいかいできるまで ちょうせんしてね");
            }
        }
        while(corect < clg);
        level++;
        clg = 0;

        System.out.println("れべるが" + level + "になりました！");
        System.out.println("まだ げーむを つづける？ つづけるなら y を おわりたいなら n をおしてね！" );
        System.out.println("はい ： y  / いいえ ： n");
        String ctn = new java.util.Scanner(System.in).nextLine();

        if(ctn.equals("ｙ")){
            System.out.println("げーむを つづけてくれて ありがとう！");
            System.out.println("れべる２からは ひらがなに【 ゛】が つく もんだいだよ！");
            System.out.println("がんばってね！");

            do {
                clg = 5;
                int num2 = (int)(Math.random()*(dakuon.length));
                System.out.println("れべる" + level + "からはじまるよ！");
                System.out.println(dakuon[num2] + "\nと同じひらがなを入力してね！");
                System.out.println("がめんに うつってる あるふぁべっとと おなじのを おしてみてね ");
                System.out.println(dakuAbc[num2]);
                String ans2 = new java.util.Scanner(System.in).nextLine();

                if(ans2.equals(dakuon[num2])) {
                    corect++;
                    count = clg-corect;
                    System.out.println("だいせいかい。おめでとう！");

                    if(count <= 0) {
                        System.out.println("れべるが 1 あがったよ！ おめでとう！");
                    }else {
                        System.out.println("あと" + count + "せいかいすると れべるがあがるよ");
                    }
                }else {
                    System.out.println("ざんねん せいかいできるまで ちょうせんしてね");
                }
            }
            while(corect < clg);
        }else {
            System.out.println("ぷれいしてくれてありがとう！ またあそびにきてね");
            System.exit(0);
        }
        level++;
        clg = 0;

        System.out.println("れべるが" + level + "になりました！");
        System.out.println("まだ げーむを つづける？ つづけるなら y を おわりたいなら n をおしてね！" );
        System.out.println("はい ： y  / いいえ ： n");
        ctn = new java.util.Scanner(System.in).nextLine();

        if(ctn.equals("y")){
            System.out.println("げーむを つづけてくれて ありがとう！");
            System.out.println("れべる" + level + "からは ひらがなに【゜】が つく もんだいだよ！");
            System.out.println("がんばってね！");

            do {
                clg = 5;
                int num3 = (int)(Math.random()*(hanDaku.length));
                System.out.println("れべる" + level + "からはじまるよ！");
                System.out.println(hanDaku[num3] + "\nと同じひらがなを入力してね！");
                System.out.println("がめんに うつってる あるふぁべっとと おなじのを おしてみてね ");
                System.out.println(handakuAbc[num3]);
                String ans3 = new java.util.Scanner(System.in).nextLine();

                if(ans3.equals(hanDaku[num3])) {
                    corect++;
                    count = clg-corect;
                    System.out.println("だいせいかい。おめでとう！");

                    if(count <= 0) {
                        System.out.println("れべるが 1 あがったよ！ おめでとう！");
                    }else {
                        System.out.println("あと" + count + "せいかいすると れべるがあがるよ");
                    }
                }else {
                	System.out.println("ざんねん せいかいできるまで ちょうせんしてね");
                }
            }
            while(corect < clg);
        }else {
            System.out.println("ぷれいしてくれてありがとう！ またあそびにきてね");
            System.exit(0);
        }
        level++;
        clg = 0;

        System.out.println("れべるが" + level + "になりました！");
        System.out.println("まだ げーむを つづける？ つづけるなら y を おわりたいなら n をおしてね！" );
        System.out.println("はい ： y  / いいえ ： n");
        ctn = new java.util.Scanner(System.in).nextLine();

        if(ctn.equals("y")){
            System.out.println("げーむを つづけてくれて ありがとう！");
            System.out.println("れべる" + level + "は さいごの\n "
                               + "ひらがなもんだいだよ！");
            System.out.println("がんばってね！");

            do {
            	clg = 10;
                int num4 = (int)(Math.random()*(alHira.length));
                System.out.println("れべる" + level + "からはじまるよ！");
                System.out.println(alHira[num4] + "\nと同じひらがなを入力してね！");
                System.out.println("がめんに うつってる あるふぁべっとと おなじのを おしてみてね ");
                System.out.println(alAbc[num4]);
                String ans4 = new java.util.Scanner(System.in).nextLine();

                if(ans4.equals(alHira[num4])) {
                    corect++;
                    count = clg-corect;
                    System.out.println("だいせいかい。おめでとう！");

                    if(count <= 0) {
                        System.out.println("さいしゅう すてーじ くりあ おめでとう！");

                    }else {
                        System.out.println("あと" + count + "せいかいすると れべるがあがるよ");
                    }
                }else {
                	System.out.println("ざんねん せいかいできるまで ちょうせんしてね");
                }
            }
            while(corect < clg);
        }else {
            System.out.println("あそんでくれてありがとう！またきてね");
            System.exit(0);
        }
    }
}
