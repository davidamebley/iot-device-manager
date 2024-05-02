package com.iotserver.iotdevicemanager.model;

import jakarta.persistence.*;

@Entity
@Table(name = "devices")
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String deviceId;
    private String name;
    private String type;
    private String location;
    private String status;

    public Device(Long id, String deviceId, String name, String type, String location, String status) {
        this.id = id;
        this.deviceId = deviceId;
        this.name = name;
        this.type = type;
        this.location = location;
        this.status = status;
    }

    public Device() {}

    public Device(String name, String type, String location, String status) {
        this.name = name;
        this.type = type;
        this.location = location;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
