package com.cb.notificationpreferences.services.config;

import com.cb.notificationpreferences.beans.config.CbConfig;
import com.cb.notificationpreferences.beans.dto.config.ConfigCreateRequest;
import com.cb.notificationpreferences.beans.enums.ConfigType;
import com.cb.notificationpreferences.repos.config.CbConfigRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CbConfigService {
    private final CbConfigRepo configRepo;

    public CbConfig createCBEmailConfig(ConfigCreateRequest request) {
        return configRepo.save(request.createCBConfig());
    }

    public CbConfig getConfig(ConfigType type) {
        return configRepo.findByType(type);
    }
}
