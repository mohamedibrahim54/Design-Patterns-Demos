package creational.prototype;

import java.time.Duration;

public class Movie extends Item{
    private Duration duration;

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }
}
