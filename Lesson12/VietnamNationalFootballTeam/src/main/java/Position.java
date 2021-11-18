public enum Position
{
    GK("Thủ môn"),
    DF("Hậu vệ"),
    MF("Tiền vệ"),
    FW("Tiền đạo");

    String value;

    Position(String position) {value=position;}

    public String returnPosition() {return value;}
}
