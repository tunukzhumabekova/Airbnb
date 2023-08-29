package airbnb.Servese;

import airbnb.Interfaces.BookInterface;
import airbnb.Model.Announcements;
import airbnb.Model.User;

public class BookingService implements BookInterface {
    private Announcements[] announcements;

    public BookingService(Announcements[] announcements) {
        this.announcements = announcements;
    }

    @Override
    public void book(User user, Announcements announcements) {
        announcements.setOwner(user);
    }

    @Override
    public void bookAnnouncement(int id1, Long id) {
        try {
            for (int i = 0; i < announcements.length; i++) {
                if (!announcements[i].isBooked()) {
                    if (announcements[i].getOwner().getId() == id1) {
                        if (announcements[i].getId() == id) {
                            announcements[i].setBooked(!announcements[i].isBooked());
                            System.out.println(announcements[i]);
                        } else {
                            System.out.println("id of announcement is wrong");
                        }
                    } else {
                        System.out.println("incorrect id or this house is already booked");
                        break;
                    }
                }
            }
            throw new Exception("Объявление с данным айди не найдено или забронировано");
        } catch (Exception e) {
            System.out.println("Произошла ошибка при разбронировании объявления: " + e.getMessage());
            System.out.println();
        }
    }


    @Override
    public void unBookAnnouncement(int id, int ownerId) {
        try {
            for (Announcements announcement : announcements) {
                if (announcement.getId() == announcement.getId() && !announcement.isBooked()) {
                        if (announcement.getOwner().getId()==ownerId) {
                            announcement.setBooked(true);
                            System.out.println("Объявление успешно забронирован: " + announcement);
                            return;
                        }
                    }
                    System.out.println("Пользователь с указанным ID не найден");
                    break;
                }

            throw new Exception( "Объявление с указанным ID не найден или уже забронирован");
        } catch (Exception e) {
            System.out.println("Произошла ошибка при бронировании объявления: " + e.getMessage());
            System.out.println();
        }
    }
}
//            System.out.println(" -------------------------------------------");
//            System.out.println("|                                          |");
//            System.out.println("|    Booking was successfully cancelled    |");
//            System.out.println("|                                          |");
//            System.out.println("--------------------------------------------");




