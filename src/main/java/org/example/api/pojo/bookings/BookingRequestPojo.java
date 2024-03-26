package org.example.api.pojo.bookings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class BookingRequestPojo {

    @JsonProperty("bookingid")
    private int bookingId;

}
