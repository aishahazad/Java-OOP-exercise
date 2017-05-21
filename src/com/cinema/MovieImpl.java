package com.cinema;

public class MovieImpl implements Movie {

    private long id;
    private String name;
    private String director;

    public MovieImpl(long id, String name, String directorName){
        this.id = id;
        this.name = name;
        this.director = directorName;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDirector() {
        return director;
    }
}
