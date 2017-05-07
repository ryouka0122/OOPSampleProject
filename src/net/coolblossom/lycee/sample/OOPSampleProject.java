package net.coolblossom.lycee.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OOPSampleProject {

	/**
	 * エントリポイント
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		// 標準入力を受け取る変数を作成
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// 入力情報を取得する
		String input = reader.readLine();

		// 標準出力に文字を出力
		System.out.println("input:" + input);

	}

}
