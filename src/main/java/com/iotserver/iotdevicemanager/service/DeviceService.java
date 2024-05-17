package com.iotserver.iotdevicemanager.service;

import com.iotserver.iotdevicemanager.repository.DeviceRepository;
import org.springframework.stereotype.Service;

@Service
public class DeviceService {
    private final DeviceRepository deviceRepository;

    public DeviceService(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

//    TODO: Service methods for device management
}