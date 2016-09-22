package org.pmareke.cerner.timezone;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * Created by pmareke on 22/09/16.
 */
public class Baby {
    private String name;
    private Date birth;
    private String continent;
    private String city;

    public Baby(String name, Date birth, String continent, String city) {
        this.name = name;
        this.birth = birth;
        this.continent = continent;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return convertoTimeZone(continent, city);
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBirthInOtherTimeZone(String continent, String city) {
        return convertoTimeZone(continent, city);
    }

    public String convertoTimeZone(String continent, String city){
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(this.birth);

        DateFormat formatter = new SimpleDateFormat("dd MMM yyyy HH:mm:ss z");

        formatter.setCalendar(calendar);
        formatter.setTimeZone(TimeZone.getTimeZone(continent + "/" + city ));

        return formatter.format(calendar.getTime());
    }
}
