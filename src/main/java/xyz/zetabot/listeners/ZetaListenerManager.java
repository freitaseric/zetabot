package xyz.zetabot.listeners;

import io.github.classgraph.ClassGraph;
import io.github.classgraph.ClassInfo;
import io.github.classgraph.ScanResult;
import xyz.zetabot.ZetaBot;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

public class ZetaListenerManager {
    private final Set<Object> listeners = new HashSet<>();
    private final ZetaBot bot;

    public ZetaListenerManager(ZetaBot bot) {
        this.bot = bot;

        this.loadListeners();
    }

    public void registerAllListeners() {
        if (listeners.isEmpty()) {
            throw new RuntimeException("The listeners aren't loaded!");
        }

        for (Object listener : listeners) {
            bot.getApi().addEventListener(listener);
        }

    }

    private void loadListeners() {
        try (ScanResult scanResult = new ClassGraph().enableAllInfo().scan()) {
            String listenerManagerClassName = ZetaListenerManager.class.getName();

            for (ClassInfo classInfo : scanResult.getAllClasses()) {
                if (!classInfo.getName().equals(listenerManagerClassName)) {
                    try {
                        Class<?> clazz = classInfo.loadClass();
                        System.out.println(clazz.getName());
                        Object instance = clazz.getDeclaredConstructor(ZetaBot.class).newInstance(bot);
                        listeners.add(instance);
                    } catch (InvocationTargetException | InstantiationException | IllegalAccessException |
                             NoSuchMethodException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
