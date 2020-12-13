package com.yaroslavm87.testtask01.Notifications.Events;

public enum EventType {
    VEHICLE_BUFFER_NEW_VEHICLE_ADDED,
    VEHICLE_BUFFER_VEHICLE_DELETED,
    VEHICLE_START_LIST_NEW_VEHICLE_ADDED,
    VEHICLE_START_LIST_VEHICLE_DELETED,
    RACE_MANAGER_VALUE_CHANGED_TRACK_LENGTH,
    RACE_STARTED,
    RACE_ENDED,
    VEHICLE_GOT_PUNCTURE,
    VEHICLE_RETURNED_TO_RACE,
    VEHICLE_FINISHED,
    VEHICLE_TYPE_CHANGED,
    VEHICLE_VALUE_CHANGED_SPEED,
    VEHICLE_VALUE_CHANGED_DISTANCE_TRAVELLED,
    VEHICLE_VALUE_CHANGED_PUNCTURE_PROBABILITY,
    VEHICLE_VALUE_CHANGED_ADDITIONAL_VALUE,
    VEHICLE_VALUE_CHANGED_STATE
}