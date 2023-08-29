package airbnb;

import airbnb.Enum.TypeOfHouse;
import airbnb.Model.Address;
import airbnb.Model.Announcements;
import airbnb.Model.Booking;
import airbnb.Model.User;
import airbnb.Servese.AnnouncementsService;
import airbnb.Servese.BookingService;
import airbnb.Servese.UserService;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Alex", "Doe", "john@example.com", LocalDate.of(2022, 5, 15));
        User user2 = new User("Alice", "Smith", "alice@example.com", LocalDate.of(2021, 9, 10));
        User user3 = new User("Bob", "Johnson", "bob@example.com", LocalDate.of(2023, 1, 25));
        User user4 = new User("Eva", "Brown", "eva@example.com", LocalDate.of(2020, 11, 7));
        User user5 = new User("Michава", "Williams", "michael@example.com", LocalDate.of(2022, 3, 30));


        Address address1 = new Address("Ontario", "Central", "123 Main Street");
        Address address2 = new Address("California", "West", "456 Elm Avenue");
        Address address3 = new Address("Texas", "South", "789 Oak Road");
        Address address4 = new Address("New York", "Northeast", "101 Broadway");
        Address address5 = new Address("Florida", "Southeast", "222 Palm Street");

        Announcements announcement1 = new Announcements("Cozy cottage near the lake", "2023-09-01", "Lakefront Cottage", TypeOfHouse.HOUSE, user1, false, 4, 150, address1);
        Announcements announcement2 = new Announcements("Spacious apartment in the city center", "2023-10-15", "City Center Apartment", TypeOfHouse.APARTMENT, user2, true, 5, 200, address2);
        Announcements announcement3 = new Announcements("Luxurious villa with a private pool", "2023-09-20", "Private Villa with Pool", TypeOfHouse.APARTMENT, user3, false, 4, 400, address3);
        Announcements announcement4 = new Announcements("Charming cabin in the woods", "2023-09-10", "Woodland Retreat", TypeOfHouse.HOUSE, user4, false, 5, 120, address4);
        Announcements announcement5 = new Announcements("Modern loft with city skyline view", "2023-10-01", "Urban Loft", TypeOfHouse.APARTMENT, user5, true, 4, 180, address5);
        Announcements[] announcements = { announcement1,announcement2, announcement3, announcement4,announcement5};
        AnnouncementsService announcementsService = new AnnouncementsService(announcements);
        User[] users = {user1, user2, user3, user4};
        UserService userService = new UserService(users, announcements);
        BookingService bookingService = new BookingService(announcements);


        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Create Announcement");
            System.out.println("2. Delete Announcement");
            System.out.println("3. Update Announcement");
            System.out.println("4. Get Announcement by ID");
            System.out.println("5. Get All Announcements");
            System.out.println("6. Sort Announcements by Rating");
            System.out.println("7. Sort Announcements by Price");
            System.out.println("8. Filter Announcements by Type");
            System.out.println("9. Book Announcement");
            System.out.println("10. Unbook Announcement");
            System.out.println("11. Get All Users");
            System.out.println("12. Get Announcements by User ID");
            System.out.println("13. Get Announcements by Address");
            System.out.println("0. Exit");

            Scanner scanner=new Scanner(System.in);

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    announcementsService.createAnnouncement(announcement1);
                    break;
                case 2:
                    System.out.println("Enter id of announcement to delete");
                    int a= scanner.nextInt();
                    announcementsService.deleteAnnouncementById(a);
                    System.out.println("Announcement deleted.");
                    break;
                case 3:
                    System.out.println("Enter id of announcement to update");
                    int b= scanner.nextInt();
                    announcementsService.updateAnnouncementById(b,announcement1);
                    break;
                case 4:
                    System.out.println("Enter id of announcement sout");
                    int c= scanner.nextInt();
                    announcementsService.getAnnouncementById(c);
                    break;
                case 5:
                    System.out.println(Arrays.toString(announcementsService.getAllAnnouncements()));
                    break;
                case 6:
                    announcementsService.sortAnnouncementsByRating();
                    break;
                case 7:
                    announcementsService.sortByPrice();
                    break;
                case 8:
                    System.out.println("Enter type");
                    String type=scanner.nextLine();
                    TypeOfHouse typeOfHouse=TypeOfHouse.valueOf(type);
                    announcementsService.filterByType(typeOfHouse);
                    break;
                case 9:
                    System.out.println("Enter id of user");
                    int d= scanner.nextInt();
                    System.out.println("Enter id of announcement");
                    Long e= scanner.nextLong();
                    bookingService.bookAnnouncement(d, e);
                    System.out.println("Announcement booked.");
                    break;
                case 10:
                    System.out.println("Enter id of user");
                    int f= scanner.nextInt();
                    System.out.println("Enter id of announcement");
                    int m= scanner.nextInt();
                    bookingService.unBookAnnouncement(f, m);
                    break;
                case 11:
                    System.out.println(Arrays.toString(userService.getAllUser()));
                    break;
                case 12:
                    userService.getAnnouncementsByUserId(1);
                    System.out.println("Got announcements by user ID.");
                    break;
                case 13:
                    userService.getAnnouncementsByAddress(address2);
                    System.out.println("Got announcements by address.");
                    break;
                case 0:
                    System.out.println("Exiting the application.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }
    }
}













































//     System.out.println(Arrays.toString(announcementsService.createAnnouncement(announcement5)));
//     announcementsService.deleteAnnouncementById(1);
//     announcementsService.updateAnnouncementById(1);
//     announcementsService.getAnnouncementById(1);
//     System.out.println(Arrays.toString(announcementsService.getAllAnnouncements()));
//     announcementsService.sortAnnouncementsByRating();
//     announcementsService.sortByPrice();
//     System.out.println(Arrays.toString(announcementsService.filterByType(TypeOfHouse.HOUSE)));
//     bookingService.bookAnnouncement(1, 1L);
//     bookingService.unBookAnnouncement(2,2);
//     System.out.println(Arrays.toString(userService.getAllUser()));
//     userService.getAnnouncementsByUserId(1);
//     userService.getAnnouncementsByAddress(address2);











