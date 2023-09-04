package product;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "ProductKeyword"
})
@XmlRootElement(name = "ProductKeywordArray")
public class ProductKeywordArray {
    @XmlElement(name = "ProductKeyword")
    protected List<ProductKeywordArray.ProductKeyword> productKeyword;

    public List<ProductKeywordArray.ProductKeyword> productKeyword() {
        if (productKeyword == null) {
            productKeyword = new ArrayList<ProductKeywordArray.ProductKeyword>();
        }
        return this.productKeyword;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder = {
            "keyword",
    })
    public static class ProductKeyword{
        @XmlElement(required = true)
        protected String keyword;

        public String getKeyword() {
            return keyword;
        }

        public void setKeyword(String keyword) {
            this.keyword = keyword;
        }
    }
}
