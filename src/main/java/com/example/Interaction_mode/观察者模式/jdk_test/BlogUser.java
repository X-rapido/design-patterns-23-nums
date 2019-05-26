package com.example.Interaction_mode.观察者模式.jdk_test;

import java.util.Observable;

/**
 * 发布者 - 博主
 */
public class BlogUser extends Observable {

    /**
     * 发表新文章
     */
    public void publishBlog(String articleTitle, String articleContent) {
        System.out.println("博主发表新文章，标题：" + articleTitle + "，内容：" + articleContent);

        Article art = new Article(articleTitle, articleContent);
        this.setChanged();          // 表示目标对象已经做了更改
        this.notifyObservers(art);  // 通知所有的观察者
    }
}
