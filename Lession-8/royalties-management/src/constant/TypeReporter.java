package constant;

public enum TypeReporter {
    CN("Chuyên nghiệp"),
    ND("Nghiệp dư"),
    CTV("Cộng tác viên");
    public String value;

    TypeReporter(String value) {
        this.value = value;
    }
}
