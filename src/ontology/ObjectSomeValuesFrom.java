package ontology;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ObjectSomeValuesFrom")
public class ObjectSomeValuesFrom {
    @XmlElement(name="ObjectProperty")
    ObjectProperty objectProperty;
    @XmlElement(name="Class")
    ClassXmlElement classXmlElement;
}
