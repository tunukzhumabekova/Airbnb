package airbnb.Interfaces;

import airbnb.Model.Announcements;
import airbnb.Model.User;

public interface BookInterface {
    void book(User user, Announcements announcements);

    void bookAnnouncement(int id1, Long id);


    void unBookAnnouncement(int id, int id1);
}
