package com.uberall.locations.domain.response.pojos;
import java.util.Date;
import java.util.List;

public class Location{
    private String identifier;
    private int id;
    private Date dateCreated;
    private Date lastUpdated;
    private String name;
    private String street;
    private String streetNo;
    private String streetAndNumber;
    private Object addressExtra;
    private String zip;
    private String city;
    private Object cellphone;
    private Object fax;
    private String website;
    private Object email;
    private Object descriptionShort;
    private Object descriptionLong;
    private Object openingHoursNotes;
    private Object lastSyncStarted;
    private String country;
    private double lat;
    private double lng;
    private Object imprint;
    private boolean addressDisplay;
    private boolean autoSync;
    private boolean skipFacebookPicturesUpdate;
    private String phone;
    private String status;
    private String cleansingStatus;
    private Object cleansingInvalidDataReason;
    private List<Photo> photos;
    private List<String> keywords;
    private List<String> labels;
    private List<Integer> categories;
    private boolean locationSyncable;
    private int businessId;
    private Object socialPostId;
    private boolean hasFacebook;
    private Date endDate;
    private double averageRating;
    private List<OpeningHour> openingHours;
    private List<SpecialOpeningHour> specialOpeningHours;
    private boolean openNow;
    private List<Object> attributes;
    private int activeDirectoriesCount;
    private int activeListingsCount;
    private int publishedListingsCount;
    private int profileCompleteness;
    private List<String> missingMandatoryFields;
    private List<String> directoriesMissingConnect;
    private int listingsInSync;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public String getStreetAndNumber() {
        return streetAndNumber;
    }

    public void setStreetAndNumber(String streetAndNumber) {
        this.streetAndNumber = streetAndNumber;
    }

    public Object getAddressExtra() {
        return addressExtra;
    }

    public void setAddressExtra(Object addressExtra) {
        this.addressExtra = addressExtra;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Object getCellphone() {
        return cellphone;
    }

    public void setCellphone(Object cellphone) {
        this.cellphone = cellphone;
    }

    public Object getFax() {
        return fax;
    }

    public void setFax(Object fax) {
        this.fax = fax;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }

    public Object getDescriptionShort() {
        return descriptionShort;
    }

    public void setDescriptionShort(Object descriptionShort) {
        this.descriptionShort = descriptionShort;
    }

    public Object getDescriptionLong() {
        return descriptionLong;
    }

    public void setDescriptionLong(Object descriptionLong) {
        this.descriptionLong = descriptionLong;
    }

    public Object getOpeningHoursNotes() {
        return openingHoursNotes;
    }

    public void setOpeningHoursNotes(Object openingHoursNotes) {
        this.openingHoursNotes = openingHoursNotes;
    }

    public Object getLastSyncStarted() {
        return lastSyncStarted;
    }

    public void setLastSyncStarted(Object lastSyncStarted) {
        this.lastSyncStarted = lastSyncStarted;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public Object getImprint() {
        return imprint;
    }

    public void setImprint(Object imprint) {
        this.imprint = imprint;
    }

    public boolean isAddressDisplay() {
        return addressDisplay;
    }

    public void setAddressDisplay(boolean addressDisplay) {
        this.addressDisplay = addressDisplay;
    }

    public boolean isAutoSync() {
        return autoSync;
    }

    public void setAutoSync(boolean autoSync) {
        this.autoSync = autoSync;
    }

    public boolean isSkipFacebookPicturesUpdate() {
        return skipFacebookPicturesUpdate;
    }

    public void setSkipFacebookPicturesUpdate(boolean skipFacebookPicturesUpdate) {
        this.skipFacebookPicturesUpdate = skipFacebookPicturesUpdate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCleansingStatus() {
        return cleansingStatus;
    }

    public void setCleansingStatus(String cleansingStatus) {
        this.cleansingStatus = cleansingStatus;
    }

    public Object getCleansingInvalidDataReason() {
        return cleansingInvalidDataReason;
    }

    public void setCleansingInvalidDataReason(Object cleansingInvalidDataReason) {
        this.cleansingInvalidDataReason = cleansingInvalidDataReason;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public List<Integer> getCategories() {
        return categories;
    }

    public void setCategories(List<Integer> categories) {
        this.categories = categories;
    }

    public boolean isLocationSyncable() {
        return locationSyncable;
    }

    public void setLocationSyncable(boolean locationSyncable) {
        this.locationSyncable = locationSyncable;
    }

    public int getBusinessId() {
        return businessId;
    }

    public void setBusinessId(int businessId) {
        this.businessId = businessId;
    }

    public Object getSocialPostId() {
        return socialPostId;
    }

    public void setSocialPostId(Object socialPostId) {
        this.socialPostId = socialPostId;
    }

    public boolean isHasFacebook() {
        return hasFacebook;
    }

    public void setHasFacebook(boolean hasFacebook) {
        this.hasFacebook = hasFacebook;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public List<OpeningHour> getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(List<OpeningHour> openingHours) {
        this.openingHours = openingHours;
    }

    public List<SpecialOpeningHour> getSpecialOpeningHours() {
        return specialOpeningHours;
    }

    public void setSpecialOpeningHours(List<SpecialOpeningHour> specialOpeningHours) {
        this.specialOpeningHours = specialOpeningHours;
    }

    public boolean isOpenNow() {
        return openNow;
    }

    public void setOpenNow(boolean openNow) {
        this.openNow = openNow;
    }

    public List<Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Object> attributes) {
        this.attributes = attributes;
    }

    public int getActiveDirectoriesCount() {
        return activeDirectoriesCount;
    }

    public void setActiveDirectoriesCount(int activeDirectoriesCount) {
        this.activeDirectoriesCount = activeDirectoriesCount;
    }

    public int getActiveListingsCount() {
        return activeListingsCount;
    }

    public void setActiveListingsCount(int activeListingsCount) {
        this.activeListingsCount = activeListingsCount;
    }

    public int getPublishedListingsCount() {
        return publishedListingsCount;
    }

    public void setPublishedListingsCount(int publishedListingsCount) {
        this.publishedListingsCount = publishedListingsCount;
    }

    public int getProfileCompleteness() {
        return profileCompleteness;
    }

    public void setProfileCompleteness(int profileCompleteness) {
        this.profileCompleteness = profileCompleteness;
    }

    public List<String> getMissingMandatoryFields() {
        return missingMandatoryFields;
    }

    public void setMissingMandatoryFields(List<String> missingMandatoryFields) {
        this.missingMandatoryFields = missingMandatoryFields;
    }

    public List<String> getDirectoriesMissingConnect() {
        return directoriesMissingConnect;
    }

    public void setDirectoriesMissingConnect(List<String> directoriesMissingConnect) {
        this.directoriesMissingConnect = directoriesMissingConnect;
    }

    public int getListingsInSync() {
        return listingsInSync;
    }

    public void setListingsInSync(int listingsInSync) {
        this.listingsInSync = listingsInSync;
    }

    public int getListingsBeingUpdated() {
        return listingsBeingUpdated;
    }

    public void setListingsBeingUpdated(int listingsBeingUpdated) {
        this.listingsBeingUpdated = listingsBeingUpdated;
    }

    public int getVisibilityIndex() {
        return visibilityIndex;
    }

    public void setVisibilityIndex(int visibilityIndex) {
        this.visibilityIndex = visibilityIndex;
    }

    public int getDataPoints() {
        return dataPoints;
    }

    public void setDataPoints(int dataPoints) {
        this.dataPoints = dataPoints;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public boolean isSuggestionsForFieldsAvailable() {
        return suggestionsForFieldsAvailable;
    }

    public void setSuggestionsForFieldsAvailable(boolean suggestionsForFieldsAvailable) {
        this.suggestionsForFieldsAvailable = suggestionsForFieldsAvailable;
    }

    public int listingsBeingUpdated;
    public int visibilityIndex;
    public int dataPoints;
    public String province;
    public boolean suggestionsForFieldsAvailable;
}