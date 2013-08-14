package com.sportslabs.demo.models;

import com.google.common.base.Objects;

public class Player
{

    private String firstName;
    private String lastName;
    private Integer uniformNumber;

    public Player() {
        this(null, null, null);
    }

    /**
     * What were thinking?
     * @param firstName
     * @param lastName
     * @param uniformNumber
     */
    public Player(String firstName, String lastName, Integer uniformNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.uniformNumber = uniformNumber;
    }

    public Integer getUniformNumber() {
        return uniformNumber;
    }

    public void setUniformNumber(final Integer uniformNumber) {
        this.uniformNumber = uniformNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(final String firstName )
    {
        this.firstName = firstName;
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(firstName, lastName, uniformNumber);
    }

    @Override
    public boolean equals(final Object otherObject){
        if(otherObject == null || !(otherObject instanceof Player))
            return false;
        else {
            Player otherPlayer = (Player) otherObject;
            return Objects.equal(firstName, otherPlayer.getFirstName())
                    && Objects.equal(lastName, otherPlayer.getLastName())
                    && Objects.equal(uniformNumber, otherPlayer.getUniformNumber());
        }
    }

}
