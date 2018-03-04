package ontology;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ClassAssertion")
public class ClassAssertion {
    @XmlElement(name="Class")
    public ClassXmlElement classXmlElement;
    @XmlElement(name="NamedIndividual")
    public NamedIndividual namedIndividual;
}
