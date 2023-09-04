package product;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "ProductMarketingPoint"
})
@XmlRootElement(name = "ProductMarketingPointArray")
public class ProductMarketingPointArray {
    @XmlElement(name = "ProductMarketingPoint")
    protected List<ProductMarketingPointArray.ProductMarketingPoint> productMarketingPoint;

    public List<ProductMarketingPointArray.ProductMarketingPoint> productMarketingPoint() {
        if (productMarketingPoint == null) {
            productMarketingPoint = new ArrayList<ProductMarketingPointArray.ProductMarketingPoint>();
        }
        return this.productMarketingPoint;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder = {
            "pointType",
            "pointCopy"
    })
    public static class ProductMarketingPoint{
        protected String pointType;
        @XmlElement(required = true)
        protected String pointCopy;

        public String getPointType() {
            return pointType;
        }

        public void setPointType(String pointType) {
            this.pointType = pointType;
        }

        public String getPointCopy() {
            return pointCopy;
        }

        public void setPointCopy(String pointCopy) {
            this.pointCopy = pointCopy;
        }
    }
}
