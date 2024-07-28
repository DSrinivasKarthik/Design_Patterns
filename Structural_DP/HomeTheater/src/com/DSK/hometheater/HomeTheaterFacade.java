package Structural_DP.HomeTheater.src.com.DSK.hometheater;

public class HomeTheaterFacade {
    private DvdPlayer dvdPlayer;
    private Projector projector;
    private Amplifier amplifier;
    private Lights lights;

    public HomeTheaterFacade(DvdPlayer dvdPlayer, Projector projector, Amplifier amplifier, Lights lights) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.amplifier = amplifier;
        this.lights = lights;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        lights.dim(10);
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        lights.on();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.off();
    }
}
