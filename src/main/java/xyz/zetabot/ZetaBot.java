package xyz.zetabot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;
import xyz.zetabot.internals.ZetaSettings;

import java.util.ArrayList;

public class ZetaBot {
    private final ZetaSettings settings;
    private final JDABuilder jda;
    private JDA api;

    public ZetaBot(ZetaSettings settings, String token) {
        this.settings = settings;

        ArrayList<GatewayIntent> intents = new ArrayList<>(GatewayIntent.DEFAULT);
        this.jda = JDABuilder.create(token, intents);
    }

    public void login() throws InterruptedException {
        api = jda.build().awaitReady();
    }

    public ZetaSettings getSettings() {
        return settings;
    }

    public JDABuilder getJda() {
        return jda;
    }

    public JDA getApi() {
        return api;
    }
}
