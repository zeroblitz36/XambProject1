package ontology;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="DataPropertyAssertion")
public class DataPropertyAssertion {
    @XmlElement(name="DataProperty")
    public DataProperty dataProperty;
    @XmlElement(name="NamedIndividual")
    public NamedIndividual namedIndividual;
    @XmlElement(name="Literal")
    public Literal literal;
}
