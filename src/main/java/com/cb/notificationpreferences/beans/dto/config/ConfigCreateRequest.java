package com.cb.notificationpreferences.beans.dto.config;

import com.cb.notificationpreferences.beans.NotificationPreference;
import com.cb.notificationpreferences.beans.config.CbConfig;
import com.cb.notificationpreferences.beans.enums.ConfigType;
import com.cb.notificationpreferences.beans.enums.NotificationType;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

import static com.cb.notificationpreferences.beans.config.CbConfig.*;
import static java.lang.System.currentTimeMillis;

@Data
public class ConfigCreateRequest {
    private String type;
    @NotNull
    private TwilioSmsGatewayConfiguration twilioSMSGatewayConfig;
    @NotNull
    private GmailGatewayConfig gmailGatewayConfig;

    public CbConfig createCBConfig() {
        CbConfig config = new CbConfig();
        config.setType(ConfigType.valueOf(type));
        config.setGmailGatewayConfig(gmailGatewayConfig);
        config.setTwilioSMSGatewayConfig(twilioSMSGatewayConfig);
        return config;
    }
}
