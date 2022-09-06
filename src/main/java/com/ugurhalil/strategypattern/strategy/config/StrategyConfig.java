package com.ugurhalil.strategypattern.strategy.config;

import com.ugurhalil.strategypattern.strategy.NotificationStrategy;
import com.ugurhalil.strategypattern.strategy.enums.NotificationType;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

@Configuration
@AllArgsConstructor
public class StrategyConfig {
    private final List<NotificationStrategy> notificationStrategies;

    @Bean
    public Map<NotificationType, NotificationStrategy> sendNotificationByType() {
        Map<NotificationType, NotificationStrategy> messagesByType = new EnumMap<>(NotificationType.class);
        notificationStrategies.forEach(notificationStrategy -> messagesByType.put(notificationStrategy.notificationType(), notificationStrategy));
        return messagesByType;
    }
}



