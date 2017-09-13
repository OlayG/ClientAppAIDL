
package com.example.admin.serverappaidl;

import android.os.Parcel;
import android.os.Parcelable;

import com.example.admin.serverappaidl.model.Description;
import com.example.admin.serverappaidl.model.End;
import com.example.admin.serverappaidl.model.Logo;
import com.example.admin.serverappaidl.model.Name;
import com.example.admin.serverappaidl.model.Start;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Event implements Parcelable {

    @SerializedName("name")
    @Expose
    private Name name;
    @SerializedName("description")
    @Expose
    private Description description;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("vanity_url")
    @Expose
    private String vanityUrl;
    @SerializedName("start")
    @Expose
    private Start start;
    @SerializedName("end")
    @Expose
    private End end;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("changed")
    @Expose
    private String changed;
    @SerializedName("capacity")
    @Expose
    private Integer capacity;
    @SerializedName("capacity_is_custom")
    @Expose
    private Boolean capacityIsCustom;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("listed")
    @Expose
    private Boolean listed;
    @SerializedName("shareable")
    @Expose
    private Boolean shareable;
    @SerializedName("online_event")
    @Expose
    private Boolean onlineEvent;
    @SerializedName("tx_time_limit")
    @Expose
    private Integer txTimeLimit;
    @SerializedName("hide_start_date")
    @Expose
    private Boolean hideStartDate;
    @SerializedName("hide_end_date")
    @Expose
    private Boolean hideEndDate;
    @SerializedName("locale")
    @Expose
    private String locale;
    @SerializedName("is_locked")
    @Expose
    private Boolean isLocked;
    @SerializedName("privacy_setting")
    @Expose
    private String privacySetting;
    @SerializedName("is_series")
    @Expose
    private Boolean isSeries;
    @SerializedName("is_series_parent")
    @Expose
    private Boolean isSeriesParent;
    @SerializedName("is_reserved_seating")
    @Expose
    private Boolean isReservedSeating;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("is_free")
    @Expose
    private Boolean isFree;
    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("logo_id")
    @Expose
    private String logoId;
    @SerializedName("organizer_id")
    @Expose
    private String organizerId;
    @SerializedName("venue_id")
    @Expose
    private String venueId;
    @SerializedName("category_id")
    @Expose
    private Object categoryId;
    @SerializedName("subcategory_id")
    @Expose
    private Object subcategoryId;
    @SerializedName("format_id")
    @Expose
    private Object formatId;
    @SerializedName("resource_uri")
    @Expose
    private String resourceUri;
    @SerializedName("logo")
    @Expose
    private Logo logo;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getVanityUrl() {
        return vanityUrl;
    }

    public void setVanityUrl(String vanityUrl) {
        this.vanityUrl = vanityUrl;
    }

    public Start getStart() {
        return start;
    }

    public void setStart(Start start) {
        this.start = start;
    }

    public End getEnd() {
        return end;
    }

    public void setEnd(End end) {
        this.end = end;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getChanged() {
        return changed;
    }

    public void setChanged(String changed) {
        this.changed = changed;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Boolean getCapacityIsCustom() {
        return capacityIsCustom;
    }

    public void setCapacityIsCustom(Boolean capacityIsCustom) {
        this.capacityIsCustom = capacityIsCustom;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Boolean getListed() {
        return listed;
    }

    public void setListed(Boolean listed) {
        this.listed = listed;
    }

    public Boolean getShareable() {
        return shareable;
    }

    public void setShareable(Boolean shareable) {
        this.shareable = shareable;
    }

    public Boolean getOnlineEvent() {
        return onlineEvent;
    }

    public void setOnlineEvent(Boolean onlineEvent) {
        this.onlineEvent = onlineEvent;
    }

    public Integer getTxTimeLimit() {
        return txTimeLimit;
    }

    public void setTxTimeLimit(Integer txTimeLimit) {
        this.txTimeLimit = txTimeLimit;
    }

    public Boolean getHideStartDate() {
        return hideStartDate;
    }

    public void setHideStartDate(Boolean hideStartDate) {
        this.hideStartDate = hideStartDate;
    }

    public Boolean getHideEndDate() {
        return hideEndDate;
    }

    public void setHideEndDate(Boolean hideEndDate) {
        this.hideEndDate = hideEndDate;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Boolean getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    public String getPrivacySetting() {
        return privacySetting;
    }

    public void setPrivacySetting(String privacySetting) {
        this.privacySetting = privacySetting;
    }

    public Boolean getIsSeries() {
        return isSeries;
    }

    public void setIsSeries(Boolean isSeries) {
        this.isSeries = isSeries;
    }

    public Boolean getIsSeriesParent() {
        return isSeriesParent;
    }

    public void setIsSeriesParent(Boolean isSeriesParent) {
        this.isSeriesParent = isSeriesParent;
    }

    public Boolean getIsReservedSeating() {
        return isReservedSeating;
    }

    public void setIsReservedSeating(Boolean isReservedSeating) {
        this.isReservedSeating = isReservedSeating;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Boolean getIsFree() {
        return isFree;
    }

    public void setIsFree(Boolean isFree) {
        this.isFree = isFree;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLogoId() {
        return logoId;
    }

    public void setLogoId(String logoId) {
        this.logoId = logoId;
    }

    public String getOrganizerId() {
        return organizerId;
    }

    public void setOrganizerId(String organizerId) {
        this.organizerId = organizerId;
    }

    public String getVenueId() {
        return venueId;
    }

    public void setVenueId(String venueId) {
        this.venueId = venueId;
    }

    public Object getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Object categoryId) {
        this.categoryId = categoryId;
    }

    public Object getSubcategoryId() {
        return subcategoryId;
    }

    public void setSubcategoryId(Object subcategoryId) {
        this.subcategoryId = subcategoryId;
    }

    public Object getFormatId() {
        return formatId;
    }

    public void setFormatId(Object formatId) {
        this.formatId = formatId;
    }

    public String getResourceUri() {
        return resourceUri;
    }

    public void setResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
    }

    public Logo getLogo() {
        return logo;
    }

    public void setLogo(Logo logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name=" + name +
                ", description=" + description +
                ", id='" + id + '\'' +
                ", url='" + url + '\'' +
                ", vanityUrl='" + vanityUrl + '\'' +
                ", start=" + start +
                ", end=" + end +
                ", created='" + created + '\'' +
                ", changed='" + changed + '\'' +
                ", capacity=" + capacity +
                ", capacityIsCustom=" + capacityIsCustom +
                ", status='" + status + '\'' +
                ", currency='" + currency + '\'' +
                ", listed=" + listed +
                ", shareable=" + shareable +
                ", onlineEvent=" + onlineEvent +
                ", txTimeLimit=" + txTimeLimit +
                ", hideStartDate=" + hideStartDate +
                ", hideEndDate=" + hideEndDate +
                ", locale='" + locale + '\'' +
                ", isLocked=" + isLocked +
                ", privacySetting='" + privacySetting + '\'' +
                ", isSeries=" + isSeries +
                ", isSeriesParent=" + isSeriesParent +
                ", isReservedSeating=" + isReservedSeating +
                ", source='" + source + '\'' +
                ", isFree=" + isFree +
                ", version='" + version + '\'' +
                ", logoId='" + logoId + '\'' +
                ", organizerId='" + organizerId + '\'' +
                ", venueId='" + venueId + '\'' +
                ", categoryId=" + categoryId +
                ", subcategoryId=" + subcategoryId +
                ", formatId=" + formatId +
                ", resourceUri='" + resourceUri + '\'' +
                ", logo=" + logo +
                '}' + "\n";
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable((Parcelable) this.name, flags);
        dest.writeParcelable((Parcelable) this.description, flags);
        dest.writeString(this.id);
        dest.writeString(this.url);
        dest.writeString(this.vanityUrl);
        dest.writeParcelable((Parcelable) this.start, flags);
        dest.writeParcelable((Parcelable) this.end, flags);
        dest.writeString(this.created);
        dest.writeString(this.changed);
        dest.writeValue(this.capacity);
        dest.writeValue(this.capacityIsCustom);
        dest.writeString(this.status);
        dest.writeString(this.currency);
        dest.writeValue(this.listed);
        dest.writeValue(this.shareable);
        dest.writeValue(this.onlineEvent);
        dest.writeValue(this.txTimeLimit);
        dest.writeValue(this.hideStartDate);
        dest.writeValue(this.hideEndDate);
        dest.writeString(this.locale);
        dest.writeValue(this.isLocked);
        dest.writeString(this.privacySetting);
        dest.writeValue(this.isSeries);
        dest.writeValue(this.isSeriesParent);
        dest.writeValue(this.isReservedSeating);
        dest.writeString(this.source);
        dest.writeValue(this.isFree);
        dest.writeString(this.version);
        dest.writeString(this.logoId);
        dest.writeString(this.organizerId);
        dest.writeString(this.venueId);
        dest.writeParcelable((Parcelable) this.categoryId, flags);
        dest.writeParcelable((Parcelable) this.subcategoryId, flags);
        dest.writeParcelable((Parcelable) this.formatId, flags);
        dest.writeString(this.resourceUri);
        dest.writeParcelable((Parcelable) this.logo, flags);
    }

    public Event() {
    }

    protected Event(Parcel in) {
        this.name = in.readParcelable(Name.class.getClassLoader());
        this.description = in.readParcelable(Description.class.getClassLoader());
        this.id = in.readString();
        this.url = in.readString();
        this.vanityUrl = in.readString();
        this.start = in.readParcelable(Start.class.getClassLoader());
        this.end = in.readParcelable(End.class.getClassLoader());
        this.created = in.readString();
        this.changed = in.readString();
        this.capacity = (Integer) in.readValue(Integer.class.getClassLoader());
        this.capacityIsCustom = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.status = in.readString();
        this.currency = in.readString();
        this.listed = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.shareable = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.onlineEvent = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.txTimeLimit = (Integer) in.readValue(Integer.class.getClassLoader());
        this.hideStartDate = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.hideEndDate = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.locale = in.readString();
        this.isLocked = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.privacySetting = in.readString();
        this.isSeries = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.isSeriesParent = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.isReservedSeating = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.source = in.readString();
        this.isFree = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.version = in.readString();
        this.logoId = in.readString();
        this.organizerId = in.readString();
        this.venueId = in.readString();
        this.categoryId = in.readParcelable(Object.class.getClassLoader());
        this.subcategoryId = in.readParcelable(Object.class.getClassLoader());
        this.formatId = in.readParcelable(Object.class.getClassLoader());
        this.resourceUri = in.readString();
        this.logo = in.readParcelable(Logo.class.getClassLoader());
    }

    public static final Creator<Event> CREATOR = new Creator<Event>() {
        @Override
        public Event createFromParcel(Parcel source) {
            return new Event(source);
        }

        @Override
        public Event[] newArray(int size) {
            return new Event[size];
        }
    };
}
