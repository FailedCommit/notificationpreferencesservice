package com.cb.notificationpreferences.repos;

import com.cb.notificationpreferences.beans.NotificationPreference;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotificationPreferencesRepo extends MongoRepository<NotificationPreference, String> {
    NotificationPreference findByCustomerId(String customerId);
}
