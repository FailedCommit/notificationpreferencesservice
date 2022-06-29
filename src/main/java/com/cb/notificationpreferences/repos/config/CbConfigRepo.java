package com.cb.notificationpreferences.repos.config;

import com.cb.notificationpreferences.beans.config.CbConfig;
import com.cb.notificationpreferences.beans.enums.ConfigType;
import com.cb.notificationpreferences.beans.enums.NotificationType;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CbConfigRepo extends MongoRepository<CbConfig, String> {
    CbConfig findByType(ConfigType type);
}
