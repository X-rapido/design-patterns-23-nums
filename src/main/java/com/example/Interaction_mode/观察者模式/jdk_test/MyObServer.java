package com.example.Interaction_mode.观察者模式.jdk_test;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者用户
 */
public class MyObServer implements Observer {

	public void update(Observable o, Object arg) {
		Article art = (Article)arg;
		
		System.out.println("博主发表了新文章，快去看吧！");
		System.out.println("博客标题：" + art.getArticleTitle());
		System.out.println("博客内容" + art.getArticleContent());
	}

}
