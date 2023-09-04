package product;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "ProductPriceGroup"
})
@XmlRootElement(name = "ProductPriceGroupArray")
public class ProductPriceGroupArray {
    @XmlElement(name = "ProductPriceGroup")
    protected List<ProductPriceGroupArray.ProductPriceGroup> productPriceGroup;

    public List<ProductPriceGroupArray.ProductPriceGroup> productPriceGroup() {
        if (productPriceGroup == null) {
            productPriceGroup = new ArrayList<ProductPriceGroupArray.ProductPriceGroup>();
        }
        return this.productPriceGroup;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder = {
            "groupName",
            "currency",
            "description",
            "productPriceArray"
    })
    public static class ProductPriceGroup{
        @XmlElement(required = true)
        protected String groupName;
        protected String currency;
        protected String description;
        @XmlElement(name = "ProductPriceArray", required = true)
        protected ProductPriceArray productPriceArray;

        public String getGroupName() {
            return groupName;
        }

        public void setGroupName(String groupName) {
            this.groupName = groupName;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public ProductPriceArray getProductPriceArray() {
            return productPriceArray;
        }

        public void setProductPriceArray(ProductPriceArray productPriceArray) {
            this.productPriceArray = productPriceArray;
        }
    }
}
