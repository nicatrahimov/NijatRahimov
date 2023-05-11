package az.coders.prac11may.exercise3;

public class TestMusic {
    public static void main(String[] args) {
        ClassicalMusicPlayer classicalMusicPlayer = new ClassicalMusicPlayer();
        JazzMusicPlayer jazzMusicPlayer = new JazzMusicPlayer();


        classicalMusicPlayer.pause();
        classicalMusicPlayer.play();
        classicalMusicPlayer.stop();

        jazzMusicPlayer.pause();
        jazzMusicPlayer.play();
        jazzMusicPlayer.stop();

        classicalMusicPlayer.playClassicalMusic();
        jazzMusicPlayer.playJazzMusic();
    }
}
