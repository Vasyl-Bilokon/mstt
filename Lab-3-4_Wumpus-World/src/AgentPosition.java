public class AgentPosition {

    public enum Orientation {
        FACING_NORTH("FacingNorth"),
        FACING_SOUTH("FacingSouth"),
        FACING_EAST("FacingEast"),
        FACING_WEST("FacingWest");

        public String getSymbol() {
            return symbol;
        }

        private final String symbol;

        Orientation(String sym) {
            symbol = sym;
        }
    }

    private final Room room;
    private final Orientation orientation;

    public AgentPosition(int x, int y, Orientation orientation) {
        this(new Room(x, y), orientation);
    }

    public AgentPosition(Room _room, Orientation _orientation) {
        room = _room;
        orientation = _orientation;
    }

    public Room getRoom() {
        return room;
    }

    public int getX() {
        return room.getX();
    }

    public int getY() {
        return room.getY();
    }

    public Orientation getOrientation() {
        return orientation;
    }

    @Override
    public String toString() {
        return room.toString() + "->" + orientation.getSymbol();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            AgentPosition other = (AgentPosition) obj;
            return (getX() == other.getX()) && (getY() == other.getY())
                    && (orientation == other.getOrientation());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + room.hashCode();
        result = 43 * result + orientation.hashCode();
        return result;
    }
}
