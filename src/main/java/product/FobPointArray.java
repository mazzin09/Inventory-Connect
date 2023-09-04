package product;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder = {
        "FobPoint"
})
@XmlRootElement(name = "FobPointArray")
public class FobPointArray {
    @XmlElement(name = "FobPoint", required = true)
    protected List<FobPointArray.FobPoint> fobPoint;

    public List<FobPointArray.FobPoint> fobPoint() {
        if (fobPoint == null) {
            fobPoint = new ArrayList<FobPointArray.FobPoint>();
        }
        return this.fobPoint;
    }
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder = {
            "fobId",
            "fobPostalCode",
            "fobCity",
            "fobState",
            "fobCountry"
    })
    public static class FobPoint{
        @XmlElement(required = true)
        protected String fobId;
        protected String fobPostalCode;
        protected String fobCity;
        protected String fobState;
        protected String fobCountry;

        public String getFobId() {
            return fobId;
        }

        public void setFobId(String fobId) {
            this.fobId = fobId;
        }

        public String getFobPostalCode() {
            return fobPostalCode;
        }

        public void setFobPostalCode(String fobPostalCode) {
            this.fobPostalCode = fobPostalCode;
        }

        public String getFobCity() {
            return fobCity;
        }

        public void setFobCity(String fobCity) {
            this.fobCity = fobCity;
        }

        public String getFobState() {
            return fobState;
        }

        public void setFobState(String fobState) {
            this.fobState = fobState;
        }

        public String getFobCountry() {
            return fobCountry;
        }

        public void setFobCountry(String fobCountry) {
            this.fobCountry = fobCountry;
        }
    }
}
