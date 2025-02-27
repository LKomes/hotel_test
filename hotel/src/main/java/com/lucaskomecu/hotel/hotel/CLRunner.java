package com.lucaskomecu.hotel.hotel;

import com.lucaskomecu.hotel.hotel.data.entity.Reservation;
import com.lucaskomecu.hotel.hotel.data.entity.Room;
import com.lucaskomecu.hotel.hotel.data.repository.ReservationRepository;
import com.lucaskomecu.hotel.hotel.data.repository.RoomRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;

@Component
public class CLRunner implements CommandLineRunner {

    private final RoomRepository roomRepository;
    private final ReservationRepository reservationRepository;

    public CLRunner(RoomRepository roomRepository, ReservationRepository reservationRepository){
        this.roomRepository =  roomRepository;
        this.reservationRepository = reservationRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        List<Room> rooms = this.roomRepository.findAll();
        Optional<Room> room = this.roomRepository.findByRoomNumberIgnoreCase("p1");
        System.out.println(room);
        rooms.forEach(System.out::println);

        System.out.println("Reservations");
        List<Reservation> reservations = this.reservationRepository.findAll();
        reservations.forEach(System.out::println);
    }
}
