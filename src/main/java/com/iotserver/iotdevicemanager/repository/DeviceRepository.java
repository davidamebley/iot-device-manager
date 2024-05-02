package com.iotserver.iotdevicemanager.repository;

import com.iotserver.iotdevicemanager.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long> {
//    TODO
    // Custom database queries
}
