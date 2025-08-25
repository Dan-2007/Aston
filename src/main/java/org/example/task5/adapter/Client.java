package org.example.task5.adapter;

public class Client {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mkv", "Terminator 2.mkv");
        audioPlayer.play("mp4", "Alone In The Dark.mp4");
        audioPlayer.play("mkv", "Man Of Steel.mkv");
        audioPlayer.play("avi", "Bug.avi");
    }
}