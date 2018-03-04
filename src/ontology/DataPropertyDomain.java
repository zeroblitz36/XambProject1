package ontology;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="DataPropertyDomain")
public class DataPropertyDomain {
    @XmlElement(name="DataProperty")
    public DataProperty dataProperty;
    @XmlElement(name="Class")
    public ClassXmlElement classXmlElement;
    @XmlElement(name="ObjectUnionOf")
    public ObjectUnionOf objectUnionOf;
}
