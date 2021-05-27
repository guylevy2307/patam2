package app.model;


import app.model.algorithms.TimeSeries;

import java.util.Observable;
import java.util.Observer;

public class AppModel extends Observable {
    private FlightSettings flightSettings;
    private TimeSeries timeSeries;
    private SimulatorPlayer sm;

    public void loadSettings(String settingsFile) {
        flightSettings = new FlightSettings(settingsFile);
        flightSettings.loadSettings();
    }
    

    public FlightSettings getFlightSettings() {
        return flightSettings;
    }

    public void setFlightSettings(FlightSettings flightSettings) {
        this.flightSettings = flightSettings;
    }

    public TimeSeries getTimeSeries() {
        return timeSeries;
    }

    public void setTimeSeries(TimeSeries timeSeries) {
        this.timeSeries = timeSeries;
    }

    public void setAileron(double value, int time) {

    }

	
}
