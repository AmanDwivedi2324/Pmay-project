package com.aparsh.api.pmay.xml;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Setter;

@Setter
@XmlRootElement(name = "DscEnrollmentRequest")
public class DscEnrollmentRequest {
    private String applicantName;
    private String aadhaar;
    @XmlElement(name = "ApplicantName")
    public String getApplicantName() { return applicantName; }

    @XmlElement(name = "Aadhaar")
    public String getAadhaar() { return aadhaar; }
}
