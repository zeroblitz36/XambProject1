package ontology;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name="Literal")
public class Literal {
    @XmlAttribute
    public String datatypeIRI;
    @XmlValue
    public String value;
}
