package xyz.zetabot;

import net.dv8tion.jda.api.entities.Activity;
import xyz.zetabot.internals.ZetaSettings;

import java.util.Timer;
import java.util.TimerTask;

public class ZetaLauncher {
    private static final String token = System.getenv("BOT_TOKEN");
    private static final ZetaSettings settings = new ZetaSettings();
    private static ZetaBot bot;

    public static void main(String[] args) throws InterruptedException {
        bot = new ZetaBot(settings, token);
        bot.getJda().setActivity(Activity.customStatus("Iniciando o bot no canal: " + bot.getSettings().getChannel().getDisplayName()));

        bot.login();

        bot.getJda().setActivity(Activity.watching("Youtube").withState("Videos sobre Discord"));

        startActivityLoop();
    }

    private static void startActivityLoop() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                String[] messages = {"Economia 💵", "Roleplay 🎲", "Minijogos 🎮"};
                int currentIndex = 0;

                bot.getApi().getPresence().setActivity(Activity.playing(messages[currentIndex]));
                currentIndex = (currentIndex + 1) % messages.length;
            }
        }, 0, 30_000);
    }
}