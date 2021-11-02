package com.company;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface info{
    int authorId ();
    String date ();
    String time ();
    double  version ();
}
@info (authorId = 1,date ="1st Nov",time="12Am",version=1.1 )
public class Information {
    private int authorId;
    private String name;
    private String supervisior;
    private String date;
    private String time;
    private String description;
    private  double  version;

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSupervisior() {
        return supervisior;
    }

    public void setSupervisior(String supervisior) {
        this.supervisior = supervisior;
    }

    public String getDate() {
        return date;
    }

    public void setDate() {
        this.date =  String.valueOf(LocalDate.now());
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = String.valueOf(LocalTime.now());
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }
}
