package airbnb.Model;

import airbnb.Enum.TypeOfHouse;

import java.util.Arrays;
public class Announcements {
    private int id;
    private String description;
    private String data;
    private String title;
    private TypeOfHouse typeOfHouse;
    private User owner;
    private boolean isBooked;
    private int rating;
    private int pricePerDay;
    private static int idd = 1;
    private Address address;
    public Announcements(String description, String data, String title, TypeOfHouse typeOfHouse, User owner, boolean isBooked, int rating, int pricePerDay, Address address) {
        if (description == null || description.isEmpty()) {
            throw new IllegalArgumentException("Description cannot be null or empty");
        }
        if (data == null || data.isEmpty()) {
            throw new IllegalArgumentException("Data cannot be null or empty");
        }
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        if (typeOfHouse == null) {
            throw new IllegalArgumentException("TypeOfHouse cannot be null");
        }
        if (owner == null) {
            throw new IllegalArgumentException("Owner cannot be null");
        }
        if (pricePerDay < 0) {
            throw new IllegalArgumentException("PricePerDay cannot be negative");
        }
        if (address == null) {
            throw new IllegalArgumentException("Address cannot be null");
        }

        this.id = idd++;
        this.description = description;
        this.data = data;
        this.title = title;
        this.typeOfHouse = typeOfHouse;
        this.owner = owner;
        this.isBooked = isBooked;
        this.rating = rating;
        this.pricePerDay = pricePerDay;
        this.address = address;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public TypeOfHouse getTypeOfHouse() {
        return typeOfHouse;
    }
    public void setTypeOfHouse(TypeOfHouse typeOfHouse) {
        this.typeOfHouse = typeOfHouse;
    }
    public User getOwner() {
        return owner;
    }
    public void setOwner(User owner) {
        this.owner = owner;
    }
    public boolean isBooked() {
        return isBooked;
    }
    public void setBooked(boolean booked) {
        isBooked = booked;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public int getPricePerDay() {
        return pricePerDay;
    }
    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
    public static int getIdd() {
        return idd;
    }
    public static void setIdd(int idd) {
        Announcements.idd = idd;
    }

    @Override
    public String toString() {
        return " \n............................................................................................................................................................................................... " +
                "       \n                                                    Announcements" +
                "id=" + id +
                " \ndescription='" + description  +
                " \ndata='" + data  +
                " \ntitle='" + title  +
                " \ntypeOfHouse=" + typeOfHouse +
                " \n--------------------------"+
                " \nowner=" + owner +
                " \nisBooked=" + isBooked +
                " \nrating=" + rating +
                " \npricePerDay=" + pricePerDay +
                " \n--------------------------" +
                " \naddress=" + address+
                " \n--------------------------";
    }
}