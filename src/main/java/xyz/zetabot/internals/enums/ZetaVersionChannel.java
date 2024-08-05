package xyz.zetabot.internals.enums;

public enum ZetaVersionChannel {
    STABLE("Stable"), BETA("Beta"), CANARY("Canary"), DEVELOP("Develop"), SPECIAL("Special Edition");
    private final String displayName;

    ZetaVersionChannel(String displayName) {
        this.displayName = displayName;
    }

    public static ZetaVersionChannel fromEnv() {
        return switch (System.getenv("BOT_CHANNEL")) {
            case "BETA" -> ZetaVersionChannel.BETA;
            case "CANARY" -> ZetaVersionChannel.CANARY;
            case "DEVELOP" -> ZetaVersionChannel.DEVELOP;
            case "SPECIAL" -> ZetaVersionChannel.SPECIAL;
            default -> ZetaVersionChannel.STABLE;
        };
    }

    public String getDisplayName() {
        return displayName;
    }
}
