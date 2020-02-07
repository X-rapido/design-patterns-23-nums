package com.example.Interaction_mode.观察者模式.jdk_test;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者用户
 */
public class MyOb_A_Server implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("--- 观察者 A ---");

		Article art = (Article)arg;
		System.out.println("博主发表了新文章，快去看吧！");
		System.out.println("博客标题：" + art.getArticleTitle());
		System.out.println("博客内容" + art.getArticleContent());
	}

}
