package xyz.zetabot.internals;

import xyz.zetabot.internals.enums.ZetaVersionChannel;

public class ZetaSettings {
    private final String version = "0.0.1";
    private final ZetaVersionChannel channel = ZetaVersionChannel.fromEnv();

    public String getVersion() {
        return version;
    }

    public ZetaVersionChannel getChannel() {
        return channel;
    }

    public String getFormattedVersion() {
        return version + "-" + channel;
    }
}
