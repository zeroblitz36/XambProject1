package ontology;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name="ObjectPropertyAssertion")
public class ObjectPropertyAssertion {
    @XmlElement(name="ObjectProperty")
    public ObjectProperty objectProperty;
    @XmlElement(name="NamedIndividual")
    public ArrayList<NamedIndividual> namedIndividualArrayList;
}
