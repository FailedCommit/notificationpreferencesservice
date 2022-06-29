package com.cb.notificationpreferences.services;

import com.cb.notificationpreferences.beans.NotificationPreference;
import com.cb.notificationpreferences.beans.dto.NotificationPreferenceCreateRequest;
import com.cb.notificationpreferences.repos.NotificationPreferencesRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NotificationPreferencesService {
    private final NotificationPreferencesRepo repo;

    public NotificationPreference createNotificationPreference(NotificationPreferenceCreateRequest request) {
        NotificationPreference notificationPreference = request.createNotificationPreference();
        return repo.save(notificationPreference);
    }

    public NotificationPreference getNotificationPreference(String customerId) {
        return repo.findByCustomerId(customerId);
    }
}
