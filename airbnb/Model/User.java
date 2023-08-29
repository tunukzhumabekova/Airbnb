package airbnb.Model;

import java.time.LocalDate;

public class User {
    private int	id;
    private String	firstName;
    private String surname;
    private String	email;
    private LocalDate registeredDate;
    private static int idd=1;

    public User(String firstName, String surname, String email,LocalDate registeredDate) {
        if (firstName == null || firstName.isEmpty()) {
//            throw new IllegalArgumentException();
//        }{
            System.out.println("\"First name cannot be null or empty\"");
        }

        if (surname == null || surname.isEmpty()) {
            throw new IllegalArgumentException("Surname cannot be null or empty");
        }

        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email cannot be null or empty");

        }
                this.id = idd++;
                this.firstName = firstName;
                this.surname = surname;
                this.email = email;
                this.registeredDate = registeredDate;
            }
            public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getName() {
        return surname;
    }
    public void setName(String name) {
        this.surname = surname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDate getRegisteredDate() {
        return registeredDate;
    }
    public void setRegisteredDate(LocalDate registeredDate) {
        this.registeredDate = registeredDate;
    }
    public int getIdd() {
        return idd;
    }
    public void setIdd(int idd) {
        this.idd = idd;
    }
    @Override
    public String toString() {
        return " User" +
                " id=" + id +
                " \nfirstName=" + firstName +
                " \nname=" + surname +
                " \nemail=" + email +
                " \nregisteredDate=" + registeredDate +
                " \n--------------------------";
    }
}
