import edu.university.ccp.hotel.domain.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Hotel Booking CCP Demo ===");

        // 1) Create HotelChain
        HotelChain chain = new HotelChain();

        // 2) Create Hotel
        Hotel hotel = new Hotel(new Name("Pearl Hotel"));
        chain.addHotel(hotel);

        // 3) Create Room and add to Hotel
        Room room101 = new Room(101);
        hotel.addRoom(room101);

        // 4) Create Guest (Name + Address)
        Guest guest = new Guest(
                new Name("Ali"),
                new Address("House 10, Street 5, Karachi")
        );

        // 5) Check availability BEFORE check-in
        System.out.println("Room 101 available (before check-in)? " + hotel.isRoomAvailable(101));

        // 6) Check-in
        chain.checkIn(room101, guest);
        System.out.println("Checked in guest: " + room101.getGuest().getName().getValue());

        // 7) Check availability AFTER check-in
        System.out.println("Room 101 available (after check-in)? " + hotel.isRoomAvailable(101));

        // 8) Make a Reservation (simple)
        Reservation reservation = chain.makeReservation(
                LocalDate.now(),
                LocalDate.now().plusDays(1),
                LocalDate.now().plusDays(3),
                1
        );
        System.out.println("Reservation created. Number = " + reservation.getNumber());

        // 9) Cancel Reservation
        boolean cancelled = chain.cancelReservation(1);
        System.out.println("Reservation cancelled? " + cancelled);

        // 10) Check-out
        chain.checkOut(room101);
        System.out.println("Checked out. Room occupied now? " + room101.isOccupied());

        System.out.println("=== Demo End ===");
    }
}
