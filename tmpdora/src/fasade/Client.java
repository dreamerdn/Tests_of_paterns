package fasade;

public class Client {

    public static void main(String[] args) {
        AppActivate activate = new AppActivate();
        AppGPS gps = new AppGPS();
        AppWeather weather = new AppWeather();
        AppInterface ri = new AppInterface(activate, gps, weather);

        ri.activate();
        ri.deact();
    }

}
