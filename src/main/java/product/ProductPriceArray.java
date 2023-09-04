package product;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "ProductPrice"
})
@XmlRootElement(name = "ProductPriceArray")
public class ProductPriceArray {
    @XmlElement(name = "ProductPrice")
    protected List<ProductPriceArray.ProductPrice> productPrice;

    public List<ProductPriceArray.ProductPrice> productPrice() {
        if (productPrice == null) {
            productPrice = new ArrayList<ProductPriceArray.ProductPrice>();
        }
        return this.productPrice;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder = {
            "quantityMax",
            "quantityMin",
            "price",
            "discountCode"
    })
    public static class ProductPrice{
        @XmlElement(required = true)
        protected int quantityMax;
        @XmlElement(required = true)
        protected int quantityMin;
        @XmlElement(required = true)
        protected double price;
        protected String discountCode;

        public int getQuantityMax() {
            return quantityMax;
        }

        public void setQuantityMax(int quantityMax) {
            this.quantityMax = quantityMax;
        }

        public int getQuantityMin() {
            return quantityMin;
        }

        public void setQuantityMin(int quantityMin) {
            this.quantityMin = quantityMin;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getDiscountCode() {
            return discountCode;
        }

        public void setDiscountCode(String discountCode) {
            this.discountCode = discountCode;
        }
    }
}
