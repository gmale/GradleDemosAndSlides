package com.sportslabs.demo.models;

import com.google.common.base.Objects;

public class Event {

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(title);
    }

    @Override
    public boolean equals(final Object otherObject){
        if(otherObject == null || !(otherObject instanceof Event))
            return false;
        else
            return Objects.equal(title, (((Event) otherObject).getTitle()));
    }
}
