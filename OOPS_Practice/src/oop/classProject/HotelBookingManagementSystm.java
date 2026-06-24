package oop.classProject;


import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Rooms{
    int roomId;
    String type;
    long price;

    Rooms(int roomId, String type, long price){
        this.price=price;
        this.roomId = roomId;
        this.type = type;
    }
}
class Bookings{
    int bookingId;
    int roomId;
    int guestId;
    LocalDateTime check_in;
    LocalDateTime check_out;
    Bookings(int bookingId, int roomId, int guestId, LocalDateTime check_in, LocalDateTime check_out){
        this.bookingId = bookingId;
        this.roomId = roomId;
        this.guestId = guestId;
        this.check_in = check_in;
        this.check_out = check_out;
    }
}
class Guests{
    int guestId;
    String name;
    Guests(int guestId, String name){
        this.guestId = guestId;
        this.name = name;
    }
}

public class HotelBookingManagementSystm {
    public static void main(String[] args) {
        HotelBookingManagementSystm h = new HotelBookingManagementSystm();

        System.out.println("\n--- Show Count ---");
        h.showCount();

        System.out.println("\n--- Never Booked in Last 12 Months ---");
        h.showNeverBookedin12();

        System.out.println("\n--- Average Stay Per Guest ---");
        h.checkTheAvgPerGuest();

        System.out.println("\n--- Total Revenue ---");
        h.totalRevnue();

        System.out.println("\n--- Top 3 Guests ---");
        h.top3Guest();

        System.out.println("\n--- Rooms with Avg Stay >= 5 Days ---");
        h.listRoomAvgStayFive();

        System.out.println("\n--- Highest Booking Rate ---");
        h.highestBookingRate();
    }
    List<Rooms> roomsAre = new ArrayList<>();
    List<Bookings> bookRoom = new ArrayList<>();
    List<Guests> guestsAre = new ArrayList<>();
    LocalTime time = LocalTime.now();

    public HotelBookingManagementSystm() {
        roomsAre.add(new Rooms(1,"AC",500000));
        roomsAre.add(new Rooms(2,"VIP",80000));
        roomsAre.add(new Rooms(3,"NON-AC",90000));
        roomsAre.add(new Rooms(4,"LUXRY",100000));
        guestsAre.add(new Guests(101,"PERSON 1"));
        guestsAre.add(new Guests(102,"PERSON 2"));
        guestsAre.add(new Guests(103,"PERSON 3"));
        bookRoom.add(new Bookings(505,1,102,LocalDateTime.of(LocalDate.of(2025, 10, 2),time),LocalDateTime.of(LocalDate.of(2025, 11, 20),time)));
        bookRoom.add(new Bookings(505,1,101,LocalDateTime.of(LocalDate.of(2024, 10, 2),time),LocalDateTime.of(LocalDate.of(2024, 11, 20),time)));
        bookRoom.add(new Bookings(505,2,103,LocalDateTime.of(LocalDate.of(2025, 8, 25),time),LocalDateTime.of(LocalDate.of(2025, 8, 27),time)));
        bookRoom.add(new Bookings(505,3,102,LocalDateTime.of(LocalDate.of(2025, 3, 1),time),LocalDateTime.of(LocalDate.of(2025, 3, 20),time)));

    }
    public void showCount() {
        for(Rooms r :roomsAre) {
            int cnt = 0;
            for(Bookings b : bookRoom) {
                if(r.roomId == b.roomId) {
                    cnt++;
                }
            }
            System.out.println("Room "+r.roomId +" Have Type "+r.type+" Have cnts "+cnt);
        }


    }
    public void showNeverBookedin12() {
        LocalDate today = LocalDate.now();
        LocalDate toCheck = today.minusYears(1);
        for(Rooms r :roomsAre) {
            int cnt = 0;
            boolean flag = false;
            for(Bookings b : bookRoom) {
                if(r.roomId == b.roomId && b.check_in.toLocalDate().isAfter(toCheck)) {
                    flag = true;
                    break;
                }
            }
            if(!flag) {


                System.out.println("Room "+r.roomId +" Have Type "+r.type+" have not booked in last 12 months ");
            }
        }
    }
    public void checkTheAvgPerGuest() {
        for(Guests g : guestsAre) {
            int stay = 0;
            int total = 0;
            for(Bookings b : bookRoom) {
                if(b.guestId == g.guestId) {
                    Duration duration  =  Duration.between(b.check_in, b.check_out);
                    long days  = duration.toDays();
                    total+=days;
                    stay++;

                }

            }
            double avg = stay > 0 ? (double) total / stay : 0;
            System.out.println("Guest "+g.name+" have avg stay of "+avg+" days");
        }

    }
    public void totalRevnue() {
        for(Rooms r : roomsAre) {
            long revnue = 0;
            for(Bookings b: bookRoom) {
                if(r.roomId == b.roomId) {
                    Duration duration  =  Duration.between(b.check_in, b.check_out);
                    long days  = duration.toDays();
                    revnue += days*r.price;
                }
            }
            System.out.println("Total Revnue For the Room "+r.type+" is "+revnue);
        }
    }
    class guestStay{
        String name;
        Integer days;
        guestStay(String name, Integer days){
            this.name = name;
            this.days = days;
        }

    }
    public void top3Guest() {
        List<guestStay> res = new ArrayList<>();
        for(Guests g : guestsAre) {
            int stay = 0;
            int total = 0;
            for(Bookings b : bookRoom) {
                if(b.guestId == g.guestId) {
                    Duration duration  =  Duration.between(b.check_in, b.check_out);
                    long days  = duration.toDays();
                    total+=days;


                }

            }
            res.add(new guestStay(g.name,total));



        }
        res.sort((a,b)->Integer.compare(b.days,a.days));
        for(int i =0;i<Math.min(3, res.size());i++) {
            guestStay gs = res.get(i);
            System.out.println("Guest: " + gs.name + ", Total Stay Days: " + gs.days);
        }


    }
    public void listRoomAvgStayFive() {
        for(Rooms r : roomsAre) {
            int totalDay = 0;
            int stay = 0;
            for(Bookings b: bookRoom) {
                if(r.roomId == b.bookingId) {
                    Duration duration  =  Duration.between(b.check_in, b.check_out);
                    long days  = duration.toDays();
                    totalDay+=days;
                    stay++;
                }

            }
            double avg = totalDay/stay;
            if(avg>=5) {
                System.out.println("Room "+ r.roomId + " Type "+r.type + " has avg stays  "+avg);

            }else
            {
                System.out.println("There is no room who's stay avg is not more than 5");
            }
        }
    }
    public void guestOverLapping() {

    }
    public void getDetailsLast24() {

    }
    public void guestStayMostNight() {

    }
    public void highestBookingRate() {
        int max = 0;
        Rooms temp = null;
        for(Rooms r : roomsAre) {
            int cnt = 0;
            for(Bookings b : bookRoom) {
                if(b.roomId == r.roomId)
                {
                    cnt++;
                }

            }
            if(cnt>max) {
                max = cnt;
                temp = r;
            }
        }
        if(temp!=null) {
            System.out.println("Top Room With Highest Booking Rating is  "+"Room Type : "+temp.type+"Have Bookings : "+max);
        }

    }
}