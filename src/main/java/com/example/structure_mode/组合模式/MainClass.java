package com.example.structure_mode.组合模式;

public class MainClass {

    public static void main(String[] args) {
        // 定义文件
        AbstractFile f1, f2, f3, f4;

        Folder folder_1 = new Folder("我的收藏");
        Folder folder_2 = new Folder("电影");

        f1 = new ImageFile("老高的大头像.jpg");
        f2 = new TextFile("Hello.txt");
        f3 = new VideoFile("笑傲江湖.avi");
        f4 = new VideoFile("神雕侠侣.avi");

        folder_1.add(f1);
        folder_1.add(f2);
        folder_2.add(f3);
        folder_2.add(f4);
        folder_1.add(folder_2);

//		f2.killVirus();
//        folder_1.killVirus();
        folder_2.killVirus();
    }
}
