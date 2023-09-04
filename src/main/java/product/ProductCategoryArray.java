package product;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "ProductCategory"
})
@XmlRootElement(name = "ProductCategoryArray")
public class ProductCategoryArray {
    @XmlElement(name = "ProductCategory")
    protected List<ProductCategoryArray.ProductCategory> productCategory;

    public List<ProductCategoryArray.ProductCategory> productCategory() {
        if (productCategory == null) {
            productCategory = new ArrayList<ProductCategoryArray.ProductCategory>();
        }
        return this.productCategory;
    }
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder = {
            "category",
            "subCategory"
    })
    public static class ProductCategory{
        @XmlElement(required = true)
        protected String category;
        protected String subCategory;

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getSubCategory() {
            return subCategory;
        }

        public void setSubCategory(String subCategory) {
            this.subCategory = subCategory;
        }
    }
}
