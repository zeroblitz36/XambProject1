package ontology;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Declaration")
public class Declaration {
    @XmlElement(name="Class")
    public ClassXmlElement classXmlElement;
    @XmlElement(name="ObjectProperty")
    public ObjectProperty objectProperty;
    @XmlElement(name="DataProperty")
    public DataProperty dataProperty;
    @XmlElement(name="NamedIndividual")
    public NamedIndividual namedIndividual;
}
