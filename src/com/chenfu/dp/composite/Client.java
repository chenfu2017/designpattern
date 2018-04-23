package com.chenfu.dp.composite;

public class Client {

    public static StringBuffer stringBuffer = new StringBuffer();

    public static void main(String[] args) {

        MyDirectory root = new MyDirectory("root");
        MyDirectory music = new MyDirectory("music");
        MyDirectory kugou = new MyDirectory("kugou");
        MyDirectory wycloud = new MyDirectory("wycloud");
        MyDirectory video = new MyDirectory("video");

        MyFile file1 = new MyFile("1.mp3");
        MyFile file2 = new MyFile("2.mp3");
        MyFile file3 = new MyFile("3.mp3");
        MyFile file4 = new MyFile("1.flv");
        MyFile file5 = new MyFile("2.flv");
        MyFile file6 = new MyFile("1.exe");

        root.add(music).add(video).add(file6);
        music.add(wycloud).add(kugou);
        kugou.add(file2).add(file3);
        wycloud.add(file1);
        video.add(file4).add(file5);

        root.traverse();
    }
}
