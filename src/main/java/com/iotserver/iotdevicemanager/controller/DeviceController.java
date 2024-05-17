package com.iotserver.iotdevicemanager.controller;

import com.iotserver.iotdevicemanager.model.Device;
import com.iotserver.iotdevicemanager.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/devices")
public class DeviceController {
    private final DeviceService deviceService;

    @Autowired
    public DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @PostMapping("/")
    public ResponseEntity<Device> registerDevice(@RequestBody Device device){
        Device savedDevice = deviceService.registerDevice(device);
        return ResponseEntity.ok(savedDevice);
    }

    @GetMapping("/{deviceId}/status")
    public ResponseEntity<String> getDeviceStatus(@PathVariable Long deviceId){
        String status = deviceService.getDeviceStatus(deviceId);
        return ResponseEntity.ok(status);
    }

    @PutMapping("/{deviceId}/status")
    public ResponseEntity<Device> updateDeviceStatus(@PathVariable Long deviceId, @RequestBody String status){
        Device updatedDevice = deviceService.updateDeviceStatus(deviceId, status);
        return ResponseEntity.ok(updatedDevice);
    }

    @PostMapping("/{deviceId}/commands")
    public ResponseEntity<String> executeDeviceCommand(@PathVariable Long deviceId, @RequestBody String command){
        String result = deviceService.executeCommand(deviceId, command);
        return ResponseEntity.ok(result);
    }
}
