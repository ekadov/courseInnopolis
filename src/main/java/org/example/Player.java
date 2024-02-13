package org.example;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {

    @JacksonXmlProperty
    private int id;

    @JacksonXmlProperty
    private String nick;

    @JacksonXmlProperty
    private int points;

    @JacksonXmlProperty(localName = "isOnline")
    private boolean isOnline;

}
