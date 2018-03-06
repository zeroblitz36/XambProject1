package ontology;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DataPropertyRange")
public class DataPropertyRange {
    @XmlElement(name="DataProperty")
    public DataProperty dataProperty;
    @XmlElement(name="Datatype")
    public Datatype datatype;
}
