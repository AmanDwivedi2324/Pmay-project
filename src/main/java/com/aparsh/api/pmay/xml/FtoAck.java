package com.aparsh.api.pmay.xml;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Setter;

@Setter
@XmlRootElement(name = "FtoAck")
public class FtoAck {
    private String status;
    private String message;

    @XmlElement(name = "Status")
    public String getStatus() { return status; }

    @XmlElement(name = "Message")
    public String getMessage() { return message; }
}
