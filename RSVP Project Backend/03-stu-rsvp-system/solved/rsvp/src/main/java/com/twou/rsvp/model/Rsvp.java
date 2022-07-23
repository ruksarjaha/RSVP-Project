package com.twou.rsvp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"jsonLazyInitializer", "handler"})
@Table(name="Rsvp")
public class Rsvp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="rsvp_id")
    private Long id;
    private String guestName;
    private int totalAttending;

    private int numOfAdults;

    private int numOfKids;

    private String email;

    public Rsvp(Long id, String guestName, int totalAttending, int numOfAdults, int numOfKids, String email) {
        this.id = id;
        this.guestName = guestName;
        this.totalAttending = totalAttending;
        this.numOfAdults = numOfAdults;
        this.numOfKids = numOfKids;
        this.email = email;
    }

    public Rsvp(String guestName, int totalAttending, int numOfAdults, int numOfKids, String email) {
        this.guestName = guestName;
        this.totalAttending = totalAttending;
        this.numOfAdults = numOfAdults;
        this.numOfKids = numOfKids;
        this.email = email;
    }

    public Rsvp() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public int getTotalAttending() {
        return totalAttending;
    }

    public void setTotalAttending(int totalAttending) {
        this.totalAttending = totalAttending;
    }

    public int getNumOfAdults() {
        return numOfAdults;
    }

    public void setNumOfAdults(int numOfAdults) {
        this.numOfAdults = numOfAdults;
    }

    public int getNumOfKids() {
        return numOfKids;
    }

    public void setNumOfKids(int numOfKids) {
        this.numOfKids = numOfKids;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rsvp)) return false;
        Rsvp rsvp = (Rsvp) o;
        return getTotalAttending() == rsvp.getTotalAttending() && getNumOfAdults() == rsvp.getNumOfAdults() && getNumOfKids() == rsvp.getNumOfKids() && Objects.equals(getId(), rsvp.getId()) && Objects.equals(getGuestName(), rsvp.getGuestName()) && Objects.equals(getEmail(), rsvp.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getGuestName(), getTotalAttending(), getNumOfAdults(), getNumOfKids(), getEmail());
    }

    @Override
    public String toString() {
        return "Rsvp{" +
                "id=" + id +
                ", guestName='" + guestName + '\'' +
                ", totalAttending=" + totalAttending +
                ", numOfAdults=" + numOfAdults +
                ", numOfKids=" + numOfKids +
                ", email='" + email + '\'' +
                '}';
    }
}
