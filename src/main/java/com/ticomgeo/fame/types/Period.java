package com.ticomgeo.fame.types;

import java.time.Duration;

public class Period implements Type<Duration> {
    public Period(long seconds, long nanos) {
        this.seconds = seconds;
        this.nanos = nanos;
    }
    public Period(Duration d) {
        this.seconds = d.getSeconds();
        this.nanos = d.getNano();
    }
    @Override
    public Duration value() {
        return Duration.ofSeconds(seconds).plusNanos(nanos);
    }
    @Override
    public String toString() {
        return value().toString();
    }
    private final long seconds;
    private final long nanos;
}
