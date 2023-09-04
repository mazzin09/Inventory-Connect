package product;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "ProductPart"
})
@XmlRootElement(name = "ProductPartArray")
public class ProductPartArray {
    protected List<ProductPartArray.ProductPart> productPart;

    public List<ProductPartArray.ProductPart> productPart() {
        if (productPart == null) {
            productPart = new ArrayList<ProductPartArray.ProductPart>();
        }
        return this.productPart;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder = {
            "partId",
            "description",
            "countryOfOrigin",
            "colorArray",
            "primaryMaterial",
            "specificationArray",
            "shape",
            "apparelSize",
            "dimension",
            "leadTime",
            "unspsc",
            "gtin",
            "isRushService",
            "productPackagingArray",
            "shippingPackageArray",
            "endDate",
            "effectiveDate",
            "isCloseout",
            "isCaution",
            "cautionComment",
            "nmfcCode",
            "nmfcDescription",
            "nmfcNumber",
            "isOnDemand",
            "isHazmat",
            "primaryColor"
    })
    public static class ProductPart{
        @XmlElement(required = true)
        protected String partId;
        protected String description;
        protected String countryOfOrigin;
        protected ColorArray colorArray;
        protected String primaryMaterial;
        protected SpecificationArray specificationArray;
        protected String shape;
        protected ApparelSize apparelSize;
        protected Dimension dimension;
        protected int leadTime;
        protected String unspsc;
        protected String gtin;
        @XmlElement(required = true)
        protected boolean isRushService;
        protected ProductPackagingArray productPackagingArray;
        protected ShippingPackageArray shippingPackageArray;
        protected XMLGregorianCalendar endDate;
        protected XMLGregorianCalendar effectiveDate;
        protected boolean isCloseout;
        @XmlElement(required = true)
        protected boolean isCaution;
        protected String cautionComment;
        protected double nmfcCode;
        protected String nmfcDescription;
        protected String nmfcNumber;
        @XmlElement(required = true)
        protected boolean isOnDemand;
        @XmlElement(required = true)
        protected boolean isHazmat;
        protected ColorArray primaryColor;

        public String getPartId() {
            return partId;
        }

        public void setPartId(String partId) {
            this.partId = partId;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getCountryOfOrigin() {
            return countryOfOrigin;
        }

        public void setCountryOfOrigin(String countryOfOrigin) {
            this.countryOfOrigin = countryOfOrigin;
        }

        public ColorArray getColorArray() {
            return colorArray;
        }

        public void setColorArray(ColorArray colorArray) {
            this.colorArray = colorArray;
        }

        public String getPrimaryMaterial() {
            return primaryMaterial;
        }

        public void setPrimaryMaterial(String primaryMaterial) {
            this.primaryMaterial = primaryMaterial;
        }

        public SpecificationArray getSpecificationArray() {
            return specificationArray;
        }

        public void setSpecificationArray(SpecificationArray specificationArray) {
            this.specificationArray = specificationArray;
        }

        public String getShape() {
            return shape;
        }

        public void setShape(String shape) {
            this.shape = shape;
        }

        public ApparelSize getApparelSize() {
            return apparelSize;
        }

        public void setApparelSize(ApparelSize apparelSize) {
            this.apparelSize = apparelSize;
        }

        public Dimension getDimension() {
            return dimension;
        }

        public void setDimension(Dimension dimension) {
            this.dimension = dimension;
        }

        public int getLeadTime() {
            return leadTime;
        }

        public void setLeadTime(int leadTime) {
            this.leadTime = leadTime;
        }

        public String getUnspsc() {
            return unspsc;
        }

        public void setUnspsc(String unspsc) {
            this.unspsc = unspsc;
        }

        public String getGtin() {
            return gtin;
        }

        public void setGtin(String gtin) {
            this.gtin = gtin;
        }

        public boolean isRushService() {
            return isRushService;
        }

        public void setRushService(boolean rushService) {
            isRushService = rushService;
        }

        public ProductPackagingArray getProductPackagingArray() {
            return productPackagingArray;
        }

        public void setProductPackagingArray(ProductPackagingArray productPackagingArray) {
            this.productPackagingArray = productPackagingArray;
        }

        public ShippingPackageArray getShippingPackageArray() {
            return shippingPackageArray;
        }

        public void setShippingPackageArray(ShippingPackageArray shippingPackageArray) {
            this.shippingPackageArray = shippingPackageArray;
        }

        public XMLGregorianCalendar getEndDate() {
            return endDate;
        }

        public void setEndDate(XMLGregorianCalendar endDate) {
            this.endDate = endDate;
        }

        public XMLGregorianCalendar getEffectiveDate() {
            return effectiveDate;
        }

        public void setEffectiveDate(XMLGregorianCalendar effectiveDate) {
            this.effectiveDate = effectiveDate;
        }

        public boolean isCloseout() {
            return isCloseout;
        }

        public void setCloseout(boolean closeout) {
            isCloseout = closeout;
        }

        public boolean isCaution() {
            return isCaution;
        }

        public void setCaution(boolean caution) {
            isCaution = caution;
        }

        public String getCautionComment() {
            return cautionComment;
        }

        public void setCautionComment(String cautionComment) {
            this.cautionComment = cautionComment;
        }

        public double getNmfcCode() {
            return nmfcCode;
        }

        public void setNmfcCode(double nmfcCode) {
            this.nmfcCode = nmfcCode;
        }

        public String getNmfcDescription() {
            return nmfcDescription;
        }

        public void setNmfcDescription(String nmfcDescription) {
            this.nmfcDescription = nmfcDescription;
        }

        public String getNmfcNumber() {
            return nmfcNumber;
        }

        public void setNmfcNumber(String nmfcNumber) {
            this.nmfcNumber = nmfcNumber;
        }

        public boolean isOnDemand() {
            return isOnDemand;
        }

        public void setOnDemand(boolean onDemand) {
            isOnDemand = onDemand;
        }

        public boolean isHazmat() {
            return isHazmat;
        }

        public void setHazmat(boolean hazmat) {
            isHazmat = hazmat;
        }

        public ColorArray getPrimaryColor() {
            return primaryColor;
        }

        public void setPrimaryColor(ColorArray primaryColor) {
            this.primaryColor = primaryColor;
        }
    }
}
