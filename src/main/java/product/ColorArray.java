package product;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
      "Color"
})
@XmlRootElement(name = "ColorArray")
public class ColorArray {
    @XmlElement(name = "Color", required = true)
    protected List<ColorArray.Color> color;

    public List<ColorArray.Color> color() {
        if (color == null) {
            color = new ArrayList<ColorArray.Color>();
        }
        return this.color;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "colorName",
            "hex",
            "approximatePms",
            "standardColorName"
    })
    public static class Color{
        @XmlElement(name = "colorName", required = true)
        protected String colorName;
        @XmlElement(name = "hex", required = false)
        protected String hex;
        @XmlElement(name = "approximatePms", required = false)
        protected String approximatePms;
        @XmlElement(name = "standardColorName", required = false)
        protected String standardColorName;

        public String getColorName() {
            return colorName;
        }

        public void setColorName(String colorName) {
            this.colorName = colorName;
        }

        public String getHex() {
            return hex;
        }

        public void setHex(String hex) {
            this.hex = hex;
        }

        public String getApproximatePms() {
            return approximatePms;
        }

        public void setApproximatePms(String approximatePms) {
            this.approximatePms = approximatePms;
        }

        public String getStandardColorName() {
            return standardColorName;
        }

        public void setStandardColorName(String standardColorName) {
            this.standardColorName = standardColorName;
        }
    }
}
