import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Call {

    @XmlAttribute
    private String name;
    private String repeat;
    private String delay;
    private String fields;
    @XmlElement(name="call")
    private List<Call> call;

}
