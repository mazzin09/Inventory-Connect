package product;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "RelatedProduct"
})
@XmlRootElement(name = "RelatedProductArray")
public class RelatedProductArray {
    @XmlElement(name = "RelatedProduct")
    protected List<RelatedProductArray.RelatedProduct> relatedProduct;

    public List<RelatedProductArray.RelatedProduct> relatedProduct() {
        if (relatedProduct == null) {
            relatedProduct = new ArrayList<RelatedProductArray.RelatedProduct>();
        }
        return this.relatedProduct;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder = {
            "relationType",
            "productId",
            "partId"
    })
    public static class RelatedProduct{
        @XmlElement(required = true)
        protected String relationType;
        @XmlElement(required = true)
        protected String productId;
        protected String partId;

        public String getRelationType() {
            return relationType;
        }

        public void setRelationType(String relationType) {
            this.relationType = relationType;
        }

        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }

        public String getPartId() {
            return partId;
        }

        public void setPartId(String partId) {
            this.partId = partId;
        }
    }
}
