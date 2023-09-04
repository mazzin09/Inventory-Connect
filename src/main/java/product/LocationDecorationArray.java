package product;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder = {
        "LocationDecoration"
})
@XmlRootElement(name = "LocationDecorationArray")
public class LocationDecorationArray {
    @XmlElement(name = "LocationDecoration", required = true)
    protected List<LocationDecorationArray.LocationDecoration> locationDecoration;

    public List<LocationDecorationArray.LocationDecoration> locationDecoration() {
        if (locationDecoration == null) {
            locationDecoration = new ArrayList<LocationDecorationArray.LocationDecoration>();
        }
        return this.locationDecoration;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name="", propOrder = {
            "locationName",
            "maxImprintColors",
            "decorationName",
            "locationDecorationComboDefault",
            "priceIncludes"
    })
    public static class LocationDecoration{
        protected String locationName;
        protected int maxImprintColors;
        protected String decorationName;
        protected boolean locationDecorationComboDefault;
        protected boolean priceIncludes;

        public String getLocationName() {
            return locationName;
        }

        public void setLocationName(String locationName) {
            this.locationName = locationName;
        }

        public int getMaxImprintColors() {
            return maxImprintColors;
        }

        public void setMaxImprintColors(int maxImprintColors) {
            this.maxImprintColors = maxImprintColors;
        }

        public String getDecorationName() {
            return decorationName;
        }

        public void setDecorationName(String decorationName) {
            this.decorationName = decorationName;
        }

        public boolean isLocationDecorationComboDefault() {
            return locationDecorationComboDefault;
        }

        public void setLocationDecorationComboDefault(boolean locationDecorationComboDefault) {
            this.locationDecorationComboDefault = locationDecorationComboDefault;
        }

        public boolean isPriceIncludes() {
            return priceIncludes;
        }

        public void setPriceIncludes(boolean priceIncludes) {
            this.priceIncludes = priceIncludes;
        }
    }
}
