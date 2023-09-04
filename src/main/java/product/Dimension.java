package product;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder = {
        "dimensionUom",
        "depth",
        "height",
        "width",
        "weightUom",
        "weight"
})
@XmlRootElement(name = "Dimension")
public class Dimension {

    @XmlElement(name = "dimensionUom", required = true)
    protected String dimensionUom;
    @XmlElement(name = "depth", required = false)
    protected double depth;
    @XmlElement(name = "height", required = false)

    protected double height;
    @XmlElement(name = "width", required = false)

    protected double width;
    @XmlElement(name = "weightUom", required = true)

    protected String weightUom;
    @XmlElement(name = "weight", required = false)

    protected double weight;

    public String getDimensionUom() {
        return dimensionUom;
    }

    public void setDimensionUom(String dimensionUom) {
        this.dimensionUom = dimensionUom;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getWeightUom() {
        return weightUom;
    }

    public void setWeightUom(String weightUom) {
        this.weightUom = weightUom;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
