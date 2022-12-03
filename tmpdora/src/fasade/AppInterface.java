package fasade;

public class AppInterface {

    private AppActivate act_app;
    private AppGPS gps_app;
    private AppWeather weath_app;

    public AppInterface(AppActivate act_app, AppGPS gps_app, AppWeather weath_app){
        this.act_app =act_app;
        this.gps_app =gps_app;
        this.weath_app =weath_app;
    }

    public void activate() {
        act_app.act_appOn();
        gps_app.gps_app();
        weath_app.weath_app();
    }

    public void deact(){
        act_app.act_appOff();
    }
}

