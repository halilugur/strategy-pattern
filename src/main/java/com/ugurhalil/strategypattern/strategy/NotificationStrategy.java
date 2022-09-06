package com.ugurhalil.strategypattern.strategy;

import com.ugurhalil.strategypattern.strategy.enums.NotificationType;

public interface NotificationStrategy {
    void sendMessage(String message);

    NotificationType notificationType();
}
