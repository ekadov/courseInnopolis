package org.example;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JacksonXmlRootElement(localName = "Players")
public class Players {

    @Setter
    @Getter
    @JacksonXmlProperty(localName = "Player")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Player> listOfPlayers;

}
