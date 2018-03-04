package ontology;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="SymmetricObjectProperty")
public class SymmetricObjectProperty {
    @XmlElement(name="ObjectProperty")
    public ObjectProperty objectProperty;
}
