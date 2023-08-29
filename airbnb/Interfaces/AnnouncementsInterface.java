package airbnb.Interfaces;

import airbnb.Enum.TypeOfHouse;
import airbnb.Model.Announcements;

public interface AnnouncementsInterface {
  void createAnnouncement(Announcements announcements);
   void deleteAnnouncementById(int id);

 void updateAnnouncementById(int id, Announcements announcements);

 void getAnnouncementById(int id);
    Announcements[]  getAllAnnouncements();
     void sortAnnouncementsByRating();
    void sortByPrice();
    void filterByType(TypeOfHouse type);
}
