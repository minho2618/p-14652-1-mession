package com.back.infra.kakfa;

import com.back.standard.event.HasEventName.HasEventName;

public record MyEvent(String msg) implements HasEventName {
}
