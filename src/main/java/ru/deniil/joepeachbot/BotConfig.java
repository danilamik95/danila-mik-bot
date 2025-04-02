package ru.deniil.joepeachbot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BotConfig {
    @Value("${bot.token}")
    public String botToken;

    @Value("${bot.username}")
    public String botUsername;
}