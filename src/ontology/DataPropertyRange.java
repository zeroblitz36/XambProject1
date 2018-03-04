package ontology;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DataPropertyRange")
public class DataPropertyRange {
    @XmlAttribute(name="DataProperty")
    public DataProperty dataProperty;
    @XmlAttribute(name="Datatype")
    public Datatype datatype;
}
