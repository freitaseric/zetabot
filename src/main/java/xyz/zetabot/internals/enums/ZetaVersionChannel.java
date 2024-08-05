package xyz.zetabot.internals.enums;

public enum ZetaVersionChannel {
    STABLE("Stable"), BETA("Beta"), CANARY("Canary"), DEVELOP("Develop"), SPECIAL_EDITION("Special Edition");

    private final String displayName;

    ZetaVersionChannel(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
