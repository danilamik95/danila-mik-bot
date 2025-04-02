package ru.deniil.joepeachbot;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledTasks {

  private final TelegramBot bot;

    public ScheduledTasks(TelegramBot bot) {
        this.bot = bot;
    }

    @Scheduled(cron = "0 * * * * *") // Каждую минуту
public void sendScheduledMessage() {
    String chatId = "354728826"; // ID пользователя или группы
    bot.sendTextMessage(chatId, "Привет! Это сообщение по расписанию 🚀");
}
}