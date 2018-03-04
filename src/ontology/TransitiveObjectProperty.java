package ontology;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="TransitiveObjectProperty")
public class TransitiveObjectProperty {
    @XmlElement(name="ObjectProperty")
    public ObjectProperty objectProperty;
}
