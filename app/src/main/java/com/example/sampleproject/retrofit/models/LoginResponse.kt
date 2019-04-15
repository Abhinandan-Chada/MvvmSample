package com.example.sampleproject.retrofit.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class LoginResponse {
    @Expose
    @SerializedName("http_status")
    private var httpStatus: Int = 0
    @Expose
    @SerializedName("toaster_status")
    private var toasterStatus: String? = null
    @Expose
    @SerializedName("user_permissions")
    private var userPermissions: UserPermissions? = null
    @Expose
    @SerializedName("description")
    private var description: String? = null
    @Expose
    @SerializedName("timezone")
    private var timezone: String? = null
    @Expose
    @SerializedName("company_id")
    private var companyId: Int = 0
    @Expose
    @SerializedName("role")
    private var role: String? = null
    @Expose
    @SerializedName("abbr")
    private var abbr: String? = null
    @Expose
    @SerializedName("name")
    private var name: String? = null
    @Expose
    @SerializedName("user_id")
    private var userId: Int = 0
    @Expose
    @SerializedName("email")
    private var email: String? = null
    @Expose
    @SerializedName("token")
    private var token: String? = null
    @Expose
    @SerializedName("message")
    private var message: String? = null
    @Expose
    @SerializedName("orignal_image")
    private var originalImage: String? = null
    @Expose
    @SerializedName("thumbnail_image")
    private var thumbImage: String? = null

    @Expose
    @SerializedName("status")
    private var status: Boolean = false

    fun getHttpStatus(): Int {
        return httpStatus
    }

    fun setHttpStatus(httpStatus: Int) {
        this.httpStatus = httpStatus
    }

    fun getOriginalImage(): String? {
        return originalImage
    }

    fun setOriginalImage(toasterStatus: String) {
        this.originalImage = toasterStatus
    }

    fun getThumbImage(): String? {
        return thumbImage
    }

    fun setThumbImage(toasterStatus: String) {
        this.thumbImage = toasterStatus
    }

    fun getToasterStatus(): String? {
        return toasterStatus
    }

    fun setToasterStatus(toasterStatus: String) {
        this.toasterStatus = toasterStatus
    }

    fun getUserPermissions(): UserPermissions? {
        return userPermissions
    }

    fun setUserPermissions(userPermissions: UserPermissions) {
        this.userPermissions = userPermissions
    }

    fun getDescription(): String? {
        return description
    }

    fun setDescription(description: String) {
        this.description = description
    }

    fun getTimezone(): String? {
        return timezone
    }

    fun setTimezone(timezone: String) {
        this.timezone = timezone
    }

    fun getCompanyId(): Int {
        return companyId
    }

    fun setCompanyId(companyId: Int) {
        this.companyId = companyId
    }

    fun getRole(): String? {
        return role
    }

    fun setRole(role: String) {
        this.role = role
    }

    fun getAbbr(): String? {
        return abbr
    }

    fun setAbbr(abbr: String) {
        this.abbr = abbr
    }

    fun getName(): String? {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getUserId(): Int {
        return userId
    }

    fun setUserId(userId: Int) {
        this.userId = userId
    }

    fun getEmail(): String? {
        return email
    }

    fun setEmail(email: String) {
        this.email = email
    }

    fun getToken(): String? {
        return token
    }

    fun setToken(token: String) {
        this.token = token
    }

    fun getMessage(): String? {
        return message
    }

    fun setMessage(message: String) {
        this.message = message
    }

    fun getStatus(): Boolean {
        return status
    }

    fun setStatus(status: Boolean) {
        this.status = status
    }

    class UserPermissions {

        @Expose
        @SerializedName("counter")
        var counter: Int = 0
        @Expose
        @SerializedName("user_role")
        var userRole: String? = null
        @Expose
        @SerializedName("action")
        var action: String? = null
        @Expose
        @SerializedName("updated_at")
        var updatedAt: String? = null
        @Expose
        @SerializedName("created_at")
        var createdAt: String? = null
        @Expose
        @SerializedName("manage_time_material")
        var manageTimeMaterial: Int = 0
        @Expose
        @SerializedName("manage_subscriptions_billings")
        var manageSubscriptionsBillings: Int = 0
        @Expose
        @SerializedName("manage_comp_profile")
        var manageCompProfile: Int = 0
        @Expose
        @SerializedName("delete_emp")
        var deleteTechEmp: Int = 0
        @Expose
        @SerializedName("delete_prop")
        var deleteProp: Int = 0
        @Expose
        @SerializedName("approve_decline_quality")
        var approveDeclineQuality: Int = 0
        @Expose
        @SerializedName("approve_decline_cost")
        var approveDeclineCost: Int = 0
        @Expose
        @SerializedName("share_sr")
        var shareSr: Int = 0
        @Expose
        @SerializedName("process_sr")
        var processSr: Int = 0
        @Expose
        @SerializedName("delete_sr")
        var deleteSr: Int = 0
        @Expose
        @SerializedName("edit_emp")
        var editTechEmp: Int = 0
        @Expose
        @SerializedName("add_emp")
        var addTechEmp: Int = 0
        @Expose
        @SerializedName("add_edit_pm")
        var addEditPm: Int = 0
        @Expose
        @SerializedName("add_edit_emp")
        var addEditEmp: Int = 0
        @Expose
        @SerializedName("add_edit_cont")
        var addEditCont: Int = 0
        @Expose
        @SerializedName("edit_prop")
        var editProp: Int = 0
        @Expose
        @SerializedName("add_prop")
        var addProp: Int = 0
        @Expose
        @SerializedName("add_edit_sr")
        var addEditSr: Int = 0
        @Expose
        @SerializedName("delete_cont")
        var deleteCont: Int = 0
        @Expose
        @SerializedName("delete_pm")
        var deletePM: Int = 0
        @Expose
        @SerializedName("guest_add_edit")
        var guestAddEdit: Int = 0
        @Expose
        @SerializedName("guest_delete")
        var guestDelete: Int = 0
        @Expose
        @SerializedName("view_pm")
        var viewPm: Int = 0
        @Expose
        @SerializedName("view_emp")
        var viewEmp: Int = 0
        @Expose
        @SerializedName("view_cont")
        var viewCont: Int = 0
        @Expose
        @SerializedName("view_prop")
        var viewProp: Int = 0
        @Expose
        @SerializedName("view_sr")
        var viewSr: Int = 0
        @Expose
        @SerializedName("user_id")
        var userId: Int = 0
        @Expose
        @SerializedName("id")
        var id: Int = 0


    }
}
