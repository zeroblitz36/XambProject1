package ontology;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ObjectPropertyDomain")
public class ObjectPropertyDomain {
    @XmlElement(name="ObjectProperty")
    public ObjectProperty objectProperty;
    @XmlElement(name="Class")
    public ClassXmlElement classXmlElement;
    @XmlElement(name="ObjectUnionOf")
    public ObjectUnionOf objectUnionOf;
}
