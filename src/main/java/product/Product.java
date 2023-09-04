package product;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "productId",
        "productName",
        "locationDecorationArray",
        "description",
        "priceExpiresDate",
        "productMarketingPointArray",
        "productKeywordArray",
        "productBrand",
        "export",
        "productCategoryArray",
        "relatedProductArray",
        "productPartArray",
        "lastChangeDate",
        "creationDate",
        "endDate",
        "effectiveDate",
        "isCaution",
        "cautionComment",
        "isCloseout",
        "lineName",
        "primaryImageURL",
        "productPriceGroupArray",
        "complianceInfoAvailable",
        "unspscCommodityCode",
        "imprintSize",
        "defaultSetUpCharge",
        "defaultRunCharge",
        "fobPointArray",
})
@XmlRootElement(name = "Product")
public class Product {
    @XmlElement(required = true)
    protected String productId;
    @XmlElement(required = true)
    protected String productName;
    @XmlElement(name = "LocationDecorationArray", required = true)
    protected LocationDecorationArray locationDecorationArray;

    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = false)
    @XmlSchemaType(name = "priceExpiresDate")
    protected XMLGregorianCalendar priceExpiresDate;

    @XmlElement(name = "ProductMarketingPointArray", required = false)
    protected ProductMarketingPointArray productMarketingPointArray;

    @XmlElement(name = "ProductKeywordArray", required = false)
    protected ProductKeywordArray productKeywordArray;
    protected String productBrand;
    @XmlElement(required = true)
    protected boolean export;
    @XmlElement(name = "ProductCategoryArray")
    protected ProductCategoryArray productCategoryArray;
    @XmlElement(name = "RelatedProductArray")
    protected RelatedProductArray relatedProductArray;
    @XmlElement(name = "ProductPartArray", required = true)
    protected ProductPartArray productPartArray;
    @XmlElement(required = true)
    @XmlSchemaType(name = "lastChangeDate")
    protected XMLGregorianCalendar lastChangeDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "creationDate")
    protected XMLGregorianCalendar creationDate;
    @XmlSchemaType(name = "endDate")
    protected XMLGregorianCalendar endDate;
    @XmlSchemaType(name = "effectiveDate")
    protected XMLGregorianCalendar effectiveDate;
    protected boolean isCaution;
    protected String cautionComment;
    protected boolean isCloseout;
    protected String lineName;
    protected String primaryImageURL;
    @XmlElement(name = "ProductPriceGroupArray")
    protected ProductPriceGroupArray productPriceGroupArray;
    protected boolean complianceInfoAvailable;
    protected int unspscCommodityCode;
    protected String imprintSize;
    protected String defaultSetUpCharge;
    protected String defaultRunCharge;
    protected FobPointArray fobPointArray;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public LocationDecorationArray getLocationDecorationArray() {
        return locationDecorationArray;
    }

    public void setLocationDecorationArray(LocationDecorationArray locationDecorationArray) {
        this.locationDecorationArray = locationDecorationArray;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public XMLGregorianCalendar getPriceExpiresDate() {
        return priceExpiresDate;
    }

    public void setPriceExpiresDate(XMLGregorianCalendar priceExpiresDate) {
        this.priceExpiresDate = priceExpiresDate;
    }

    public ProductMarketingPointArray getProductMarketingPointArray() {
        return productMarketingPointArray;
    }

    public void setProductMarketingPointArray(ProductMarketingPointArray productMarketingPointArray) {
        this.productMarketingPointArray = productMarketingPointArray;
    }

    public ProductKeywordArray getProductKeywordArray() {
        return productKeywordArray;
    }

    public void setProductKeywordArray(ProductKeywordArray productKeywordArray) {
        this.productKeywordArray = productKeywordArray;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public boolean isExport() {
        return export;
    }

    public void setExport(boolean export) {
        this.export = export;
    }

    public ProductCategoryArray getProductCategoryArray() {
        return productCategoryArray;
    }

    public void setProductCategoryArray(ProductCategoryArray productCategoryArray) {
        this.productCategoryArray = productCategoryArray;
    }

    public RelatedProductArray getRelatedProductArray() {
        return relatedProductArray;
    }

    public void setRelatedProductArray(RelatedProductArray relatedProductArray) {
        this.relatedProductArray = relatedProductArray;
    }

    public ProductPartArray getProductPartArray() {
        return productPartArray;
    }

    public void setProductPartArray(ProductPartArray productPartArray) {
        this.productPartArray = productPartArray;
    }

    public XMLGregorianCalendar getLastChangeDate() {
        return lastChangeDate;
    }

    public void setLastChangeDate(XMLGregorianCalendar lastChangeDate) {
        this.lastChangeDate = lastChangeDate;
    }

    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(XMLGregorianCalendar creationDate) {
        this.creationDate = creationDate;
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

    public boolean isCloseout() {
        return isCloseout;
    }

    public void setCloseout(boolean closeout) {
        isCloseout = closeout;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getPrimaryImageURL() {
        return primaryImageURL;
    }

    public void setPrimaryImageURL(String primaryImageURL) {
        this.primaryImageURL = primaryImageURL;
    }

    public ProductPriceGroupArray getProductPriceGroupArray() {
        return productPriceGroupArray;
    }

    public void setProductPriceGroupArray(ProductPriceGroupArray productPriceGroupArray) {
        this.productPriceGroupArray = productPriceGroupArray;
    }

    public boolean isComplianceInfoAvailable() {
        return complianceInfoAvailable;
    }

    public void setComplianceInfoAvailable(boolean complianceInfoAvailable) {
        this.complianceInfoAvailable = complianceInfoAvailable;
    }

    public int getUnspscCommodityCode() {
        return unspscCommodityCode;
    }

    public void setUnspscCommodityCode(int unspscCommodityCode) {
        this.unspscCommodityCode = unspscCommodityCode;
    }

    public String getImprintSize() {
        return imprintSize;
    }

    public void setImprintSize(String imprintSize) {
        this.imprintSize = imprintSize;
    }

    public String getDefaultSetUpCharge() {
        return defaultSetUpCharge;
    }

    public void setDefaultSetUpCharge(String defaultSetUpCharge) {
        this.defaultSetUpCharge = defaultSetUpCharge;
    }

    public String getDefaultRunCharge() {
        return defaultRunCharge;
    }

    public void setDefaultRunCharge(String defaultRunCharge) {
        this.defaultRunCharge = defaultRunCharge;
    }

    public FobPointArray getFobPointArray() {
        return fobPointArray;
    }

    public void setFobPointArray(FobPointArray fobPointArray) {
        this.fobPointArray = fobPointArray;
    }
}
