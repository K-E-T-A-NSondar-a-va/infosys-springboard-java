package aggregation;

import java.util.Comparator;

public class RoomIdComparator implements Comparator<Room> {
    @Override
    public int compare(Room o1, Room o2) {
        return Integer.compare(o1.getRoomNo(), o2.getRoomNo());
    }
}
