package com.example;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDateTime;

public class Event {

  private String notHidden;

  @Schema(hidden = true)
  private String hidden;

  @Schema(hidden = true)
  @JsonSerialize(using = LocalDateTimeSerializer.class)
  private LocalDateTime hiddenDateTime;

  public Event() {
  }

  public void setNotHidden(String value) {
    this.notHidden = value;
  }

  public String getNotHidden() {
    return notHidden;
  }

  public void setHidden(String value) {
    this.hidden = value;
  }

  public String getHidden() {
    return hidden;
  }

  public void setHiddenDateTime(LocalDateTime value) {
    this.hiddenDateTime = value;
  }

  public LocalDateTime getHiddenDateTime() {
    return hiddenDateTime;
  }
}
