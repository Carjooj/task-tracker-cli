package enums;

public enum Status {
    TODO(1, "To Do"),
    PROGRESS(2, "In-Progress"),
    DONE(3, "Done"),
    ;

    private int statusCode;

    private String statusString;

    Status(int codigo, String status) {
        this.statusCode = codigo;
        this.statusString = status;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getStatusString() {
        return statusString;
    }
}
