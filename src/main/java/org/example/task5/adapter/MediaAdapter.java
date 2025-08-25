package org.example.task5.adapter;

public class MediaAdapter implements MediaPlayer {
    private final AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        if ("mkv".equalsIgnoreCase(audioType)) {
            advancedMusicPlayer = new MkvPlayer();
        } else if ("mp4".equalsIgnoreCase(audioType)) {
            advancedMusicPlayer = new Mp4Player();
        } else {
            advancedMusicPlayer = null;
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (advancedMusicPlayer == null) {
            System.out.println("Invalid media. " + audioType + " format not supported");
            return;
        }
        if ("mkv".equalsIgnoreCase(audioType)) {
            advancedMusicPlayer.playMkv(fileName);
        } else if ("mp4".equalsIgnoreCase(audioType)) {
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}