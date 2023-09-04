package product;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "ShippingPackage"
})
@XmlRootElement(name = "ShippingPackageArray")
public class ShippingPackageArray {
    @XmlElement(name = "ShippingPackage")
    protected List<ShippingPackageArray.ShippingPackage> shippingPackage;

    public List<ShippingPackageArray.ShippingPackage> shippingPackage() {
        if (shippingPackage == null) {
            shippingPackage = new ArrayList<ShippingPackageArray.ShippingPackage>();
        }
        return this.shippingPackage;
    }
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder = {
            "packageType",
            "description",
            "quantity",
            "dimensionUom",
            "depth",
            "height",
            "width",
            "weightUom",
            "weight"
    })
    public static class ShippingPackage{
        @XmlElement(required = true)
        protected String packageType;
        protected String description;
        @XmlElement(required = true)
        protected double quantity;
        protected String dimensionUom;
        protected double depth;
        protected double height;
        protected double width;
        @XmlElement(required = true)
        protected String weightUom;
        protected double weight;

        public String getPackageType() {
            return packageType;
        }

        public void setPackageType(String packageType) {
            this.packageType = packageType;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public double getQuantity() {
            return quantity;
        }

        public void setQuantity(double quantity) {
            this.quantity = quantity;
        }

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
}
