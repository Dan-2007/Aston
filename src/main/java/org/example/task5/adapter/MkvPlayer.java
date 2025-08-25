package org.example.task5.adapter;

public class MkvPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMkv(String fileName) {
        System.out.println("Playing mkv file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // Do nothing
    }
}