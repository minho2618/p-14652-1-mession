package com.back.standard.event.HasEventName;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface HasEventName {
    @JsonIgnore
    default String getEventName() {
        return this.getClass().getSimpleName();
    }
}
