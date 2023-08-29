package airbnb.Interfaces;

import airbnb.Model.Address;
import airbnb.Model.User;

public interface UserInterface {
    User[] getAllUser();
   void getAnnouncementsByUserId(int id);
   Address getAnnouncementsByAddress(Address address);

}
