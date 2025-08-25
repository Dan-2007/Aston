package org.example.task5.adapter;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playMkv(String fileName) {
        // Do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}