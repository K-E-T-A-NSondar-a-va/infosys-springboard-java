package aggregation;

import java.util.*;

public class Admin {
    public void assignRoom(Room[] rooms, Member member) {

        List<Room> roomList = Arrays.asList(rooms);
        roomList.sort(new RoomIdComparator());

//        System.out.println("room list: "+roomList);
        for(Room room : roomList) {
            System.out.println(room.getRoomNo());
            if(room.getCapacity() > 0) {
                room.setCapacity(room.getCapacity() - 1);
                member.setRoom(room);
                break;
            }
        }

    }

//    private Room getRoom(int roomNo, Room[] rooms) {
//        return Arrays.stream(rooms).filter(room1 -> room1.getRoomNo() == roomNo).toList().get(0);
//    }
}
