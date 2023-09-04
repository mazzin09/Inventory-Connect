package product;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "Specification"
})
@XmlRootElement(name = "SpecificationArray")
public class SpecificationArray {
    @XmlElement(name = "Specification")
    protected List<SpecificationArray.Specification> specification;

    public List<SpecificationArray.Specification> specification() {
        if (specification == null) {
            specification = new ArrayList<SpecificationArray.Specification>();
        }
        return this.specification;
    }
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder = {
            "specificationType",
            "specificationUom",
            "measurementValue"
    })
    public static class Specification{
        @XmlElement(required = true)
        protected String specificationType;
        @XmlElement(required = true)
        protected String specificationUom;
        @XmlElement(required = true)
        protected String measurementValue;

        public String getSpecificationType() {
            return specificationType;
        }

        public void setSpecificationType(String specificationType) {
            this.specificationType = specificationType;
        }

        public String getSpecificationUom() {
            return specificationUom;
        }

        public void setSpecificationUom(String specificationUom) {
            this.specificationUom = specificationUom;
        }

        public String getMeasurementValue() {
            return measurementValue;
        }

        public void setMeasurementValue(String measurementValue) {
            this.measurementValue = measurementValue;
        }
    }
}
