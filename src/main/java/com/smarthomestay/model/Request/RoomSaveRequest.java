package com.smarthomestay.model.Request;

import lombok.Data;

@Data
public class RoomSaveRequest {
    private String roomNumber;
    private Long roomType;
    private String capacity;
    private String floor;
}
