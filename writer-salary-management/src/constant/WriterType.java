package constant;

public enum WriterType {

    CHUYEN_NGHIEP("Chuyên nghiệp"),
    NGHIEP_DU("Nghiệp dư"),
    CTV("Cộng tác viên");

    public String value;

    WriterType(String value) {
        this.value = value;
    }
}
