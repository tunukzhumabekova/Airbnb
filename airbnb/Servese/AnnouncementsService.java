package airbnb.Servese;

import airbnb.Enum.TypeOfHouse;
import airbnb.Interfaces.AnnouncementsInterface;
import airbnb.Model.Announcements;
import java.util.Arrays;
public class AnnouncementsService implements AnnouncementsInterface {
    private Announcements[] announcements;
    public AnnouncementsService(Announcements[] announcements) {
        this.announcements=announcements;
    }
    @Override
    public void createAnnouncement(Announcements announcements1) {
        Announcements[] announcements2;
        for (int i = 0; i < announcements.length; i++) {
            announcements2=Arrays.copyOf(announcements,announcements.length+1);
            announcements2[announcements2.length-1]=announcements1;
            announcements=announcements2;
            System.out.println(Arrays.toString( announcements2));
            break;
        }

    }
    @Override
    public void deleteAnnouncementById(int id) {
    Announcements[]updatedAnnouncement=new Announcements[announcements.length-1];
    int index=0;
    for (int i = 0; i < announcements.length; i++) {
        if (announcements[i].getId() != id) {
                updatedAnnouncement[index] = announcements[i];
                index++;
            }
        }
                System.out.println(Arrays.toString(updatedAnnouncement));


    }
    @Override
    public void updateAnnouncementById(int id, Announcements announcement) {
        for (int i = 0; i < announcements.length; i++) {
            if (announcements[i].getId() == id) {
                announcements[i].setId(id);
                announcements[i].setBooked(announcement.isBooked());
                announcements[i].setData(announcement.getData());
                announcements[i].setDescription(announcement.getDescription());
                announcements[i].setOwner(announcement.getOwner());
                announcements[i].setTitle(announcement.getTitle());
                announcements[i].setPricePerDay(announcement.getPricePerDay());
                announcements[i].setRating(announcement.getRating());
                announcements[i].setTypeOfHouse(announcement.getTypeOfHouse());
                System.out.println(announcements[i]);
            }
        }
    }


    @Override
    public void getAnnouncementById(int id) {
        for (int i = 0; i < announcements.length; i++) {
            if (announcements[i].getId() == id) {
                System.out.println(announcements[i]);

            }
        }
    }
    @Override
    public Announcements[] getAllAnnouncements() {
        return announcements;
    }
    @Override
    public void sortAnnouncementsByRating() {

        Arrays.sort(announcements, (a2, a1) -> Integer.compare(a1.getRating(), a2.getRating()));

        System.out.println(" sorted by rating (desc):");
        for (Announcements a : announcements) {
            System.out.println(a);
        }
    }
    @Override
    public void sortByPrice() {

        Arrays.sort(announcements, (a2, a1) -> Integer.compare(a1.getPricePerDay(), a2.getPricePerDay()));

        System.out.println(" sorted by price (desc):");
        for (Announcements a : announcements) {
            System.out.println(a);
        }
    }
    @Override
    public void filterByType(TypeOfHouse type) {
        Announcements[] filteredAnnouncements = new Announcements[0];
        for (Announcements a : announcements) {
            if (a.getTypeOfHouse().equals(type)) {
                Announcements[] newFilteredAnnouncements = new Announcements[filteredAnnouncements.length + 1];
                System.arraycopy(filteredAnnouncements, 0, newFilteredAnnouncements, 0, filteredAnnouncements.length);
                newFilteredAnnouncements[newFilteredAnnouncements.length - 1] = a;
                filteredAnnouncements = newFilteredAnnouncements;
            }
        }
    }





}
