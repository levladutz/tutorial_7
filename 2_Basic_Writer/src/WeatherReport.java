import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class WeatherReport {

    private List<DailyWeather> dailyReports;

    /**
     * Creates a weather report.
     *
     * @param dailyReports The list of daily reports in the weather report
     */
    public WeatherReport(List<DailyWeather> dailyReports) {
        this.dailyReports = dailyReports;
    }

    /**
     * Writes this weather report to the given writer.
     *
     * @param writer The writer to write to
     */
    public void write(Writer writer) throws IOException {
        String res="";
        for(int i=0 ;i<dailyReports.size(); i++)
        {
            DailyWeather x=dailyReports.get(i);
            String app="";
            res+= x.getDate().toString()+',';
            if(dailyReports.get(i) instanceof SunnyDay) {
                res+="SUN,";
                app= ((SunnyDay) x).getSunHours()+"h";
            }
            else {
                res+="RAIN,";
                app=((RainyDay)x).getMillimetersRained()+"mm";
            }
            res+=x.getTemperature()+"C,"+x.getWindSpeed()+"BFT,"+app+"\r\n";
        }
        writer.write(res);
    }

    /**
     * Gets the list of daily reports.
     *
     * @return The list of daily reports in this weather report
     */
    public List<DailyWeather> getDailyReports() {
        return dailyReports;
    }

}
