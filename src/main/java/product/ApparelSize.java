package product;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder = {
        "apparelStyle",
        "labelSize",
        "customSize"
})
@XmlRootElement(name = "ApparelSize")
public class ApparelSize {
    @XmlElement(name = "apparelStyle", required = true)
    protected String apparelStyle;
    @XmlElement(name = "labelSize", required = true)

    protected String labelSize;
    @XmlElement(name = "customSize", required = false)

    protected String customSize;

    public String getApparelStyle() {
        return apparelStyle;
    }

    public void setApparelStyle(String apparelStyle) {
        this.apparelStyle = apparelStyle;
    }

    public String getLabelSize() {
        return labelSize;
    }

    public void setLabelSize(String labelSize) {
        this.labelSize = labelSize;
    }

    public String getCustomSize() {
        return customSize;
    }

    public void setCustomSize(String customSize) {
        this.customSize = customSize;
    }
}
