package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] questions = {
                "フリーハンド恐怖症で、線や円は定規やコンパスを使って美しく描けないと気がすまない",
                "沖縄の海にもぐるよりも、琵琶湖で鳥人間コンテストを観戦したい",
                "さまざまな国語辞典の語釈を読みくらべることを、楽しいと思う",
                "ラブソングの歌詞よりも、万葉集や百人一首におさめられている恋の歌の世界観のほうが好きだ",
                "流行に影響されず、自分らしさを貫くスタイルを好む"};

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int answer_count = 0;
        int input_num = 0;


        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println("1: あてはまらない 2: あまりあてはらまらない 3: まあまああてはまる 4: あてはまる");

            input_num = scanner.nextInt();

            if (input_num == 99) {
                break;
            }

            sum += input_num;
            answer_count++;
        }

        System.out.println("診断結果");
        if (sum <= 4 * answer_count && sum > 3 * answer_count) {
            System.out.println("わたしたちは気が合うようです。ぜひ、お互いの趣味について語り合いましょう");
        } else if (sum <= 3 * answer_count && sum > 2 * answer_count) {
            System.out.println("わたしたちはそこそこ気が合うようです。時間のあるときにお茶でもしましょう");
        } else if (sum <= 2 * answer_count && sum > 1 * answer_count) {
            System.out.println("わたしたちはタイプのちがう者どうしのようです");
        } else {
            System.out.println("あなたとは気が合わないようです");
        }
    }
}
