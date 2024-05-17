package com.iotserver.iotdevicemanager.service;

import com.iotserver.iotdevicemanager.model.Device;
import com.iotserver.iotdevicemanager.repository.DeviceRepository;
import org.springframework.stereotype.Service;

@Service
public class DeviceService {
    private final DeviceRepository deviceRepository;

    public DeviceService(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    public Device registerDevice(Device device) {
        return deviceRepository.save(device);
    }

    public String getDeviceStatus(Long deviceId) {
        Device device = deviceRepository.findById(deviceId)
                .orElseThrow(() -> new RuntimeException("Device not found"));
        return device.getStatus();
    }

    public Device updateDeviceStatus(Long deviceId, String newStatus){
        Device device = deviceRepository.findById(deviceId)
                .orElseThrow(() -> new RuntimeException("Device not found"));
        device.setStatus(newStatus);
        return deviceRepository.save(device);
    }

    public String executeCommand(Long deviceId, String command) {
        // Logic to execute command
        return "Command executed: " + command;
    }
}
