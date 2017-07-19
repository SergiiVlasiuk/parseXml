import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "workflow")
public class Workflow {
    @XmlElement(name="call")
    private List<Call> calls;
}
