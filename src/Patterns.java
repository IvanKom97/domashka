public enum Patterns {
    LOGIN_PATTERN("[a-zA-Z1-9-0_@]+"),
    PASSWORD_PATTERN("[a-zA-Z1-9-0_]+");
    private String value;

    Patterns(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
