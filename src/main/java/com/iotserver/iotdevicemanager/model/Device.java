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
}
