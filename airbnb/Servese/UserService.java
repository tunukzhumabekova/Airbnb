package airbnb.Servese;

import airbnb.Interfaces.UserInterface;
import airbnb.Model.Address;
import airbnb.Model.Announcements;
import airbnb.Model.User;

public class UserService implements UserInterface {
private User[]users;
private Announcements [] announcements;

public UserService(User[] users,Announcements[]announcements) {
        this.users=users;
        this.announcements=announcements;
    }
    @Override
    public User[] getAllUser() {
        return users ;
    }
    @Override
    public void getAnnouncementsByUserId(int id) {
        for(int i=0;i<announcements.length;i++){
            if(announcements[i].getOwner().getId()==id){
                System.out.println((announcements[i]));
            }
        }
    }
    @Override
    public Address getAnnouncementsByAddress(Address address) {
        for (int i = 0; i < announcements.length; i++) {
            if(announcements[i].getAddress().equals(address)){
                System.out.println(announcements[i]);
            }
        }
        return address;
    }
}
