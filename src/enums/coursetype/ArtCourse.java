package enums.coursetype;

public enum ArtCourse {
    DDP("Art"),
    BAND("Art");

    private final String label;

    private ArtCourse(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
