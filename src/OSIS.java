public class OSIS {

    private final int ID;

    public OSIS(int id) {
        this.ID = id;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        String str = "";

        str += ID;

        return str;
    }

}
