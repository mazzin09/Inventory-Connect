package product;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "ProductPackaging"
})
@XmlRootElement(name = "ProductPackagingArray")
public class ProductPackagingArray {
    @XmlElement(name = "ProductPackaging")
    protected List<ProductPackagingArray.ProductPackaging> productPackaging;

    public List<ProductPackagingArray.ProductPackaging> productPackaging() {
        if (productPackaging == null) {
            productPackaging = new ArrayList<ProductPackagingArray.ProductPackaging>();
        }
        return this.productPackaging;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder = {
            "isDefault",
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
    public static class ProductPackaging{
        @XmlElement(required = true)
        protected boolean isDefault;
        protected String packageType;
        protected String description;
        @XmlElement(required = true)
        protected double quantity;
        @XmlElement(required = true)
        protected String dimensionUom;
        protected double depth;
        protected double height;
        protected double width;
        @XmlElement(required = true)
        protected String weightUom;
        protected double weight;

        public boolean isDefault() {
            return isDefault;
        }

        public void setDefault(boolean aDefault) {
            isDefault = aDefault;
        }

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
