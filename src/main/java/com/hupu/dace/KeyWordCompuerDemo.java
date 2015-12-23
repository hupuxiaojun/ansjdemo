package com.hupu.dace;

import org.ansj.app.keyword.KeyWordComputer;
import org.ansj.app.keyword.Keyword;

import java.util.Collection;

/**
 * 关键词提取的例子
 * @author ansj
 *
 */
public class KeyWordCompuerDemo {
	public static void main(String[] args) {
		KeyWordComputer kwc = new KeyWordComputer(20);
		String title = "Nike Zoom Clear Out 实物预览";
		String content = "明年初我们将迎来一双全新的Nike实战鞋款。<img src=\"http://du.hupucdn.com/news_byte30043byte_5679f3f4c23cd_w600h360.jpg\" width=\"100%\"><img src=\"http://du.hupucdn.com/news_byte33103byte_5679f3f566cfa_w600h360.jpg\" width=\"100%\"><img src=\"http://du.hupucdn.com/news_byte73245byte_5679f3f60e603_w600h463.jpg\" width=\"100%\"><img src=\"http://du.hupucdn.com/news_byte29215byte_5679f3f6c4d46_w600h270.jpg\" width=\"100%\"><br/>";
		Collection<Keyword> result = kwc.computeArticleTfidf(title, content);
		System.out.println(result);
	}
}
