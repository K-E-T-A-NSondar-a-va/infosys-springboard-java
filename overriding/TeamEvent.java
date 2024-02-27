package overriding;

public class TeamEvent extends Event {
    private int noOfParticipants;
    private int teamNo;

    @Override
    public void registerEvent() {
        if(noOfParticipants <= 1) {
            setRegistrationFee(0);
            return;
        }
        if(getEventName().equals("Singing")) setRegistrationFee(4 * noOfParticipants);
        else if(getEventName().equals("Dancing")) setRegistrationFee(6 * noOfParticipants);
        else if (getEventName().equals("DigitalArt")) setRegistrationFee(8 * noOfParticipants);
        else if(getEventName().equals("Acting")) setRegistrationFee(10 * noOfParticipants);
        else setRegistrationFee(0);
    }

    public TeamEvent(String eventName, String participantName, int noOfParticipants, int teamNo) {
        super(eventName, participantName);
        this.noOfParticipants = noOfParticipants;
        this.teamNo = teamNo;
    }

    public int getNoOfParticipants() {
        return noOfParticipants;
    }

    public void setNoOfParticipants(int noOfParticipants) {
        this.noOfParticipants = noOfParticipants;
    }

    public int getTeamNo() {
        return teamNo;
    }

    public void setTeamNo(int teamNo) {
        this.teamNo = teamNo;
    }
}
