package overriding;

public class SoloEvent extends Event {
    private int participantNo;

    @Override
    public void registerEvent() {
        super.registerEvent();
    }

    public SoloEvent(String emailName, String participantName, int participantNo) {
        super(emailName, participantName);
        this.participantNo = participantNo;
    }

    public int getParticipantNo() {
        return participantNo;
    }

    public void setParticipantNo(int participantNo) {
        this.participantNo = participantNo;
    }
}
