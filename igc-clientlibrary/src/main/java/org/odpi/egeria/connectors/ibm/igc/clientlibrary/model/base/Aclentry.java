/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.egeria.connectors.ibm.igc.clientlibrary.model.base;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonTypeName;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.odpi.egeria.connectors.ibm.igc.clientlibrary.model.common.Reference;
import java.util.Date;
import java.util.List;

/**
 * POJO for the {@code aclentry} asset type in IGC, displayed as '{@literal AclEntry}' in the IGC UI.
 * <br><br>
 * (this code has been created based on out-of-the-box IGC metadata types.
 *  If modifications are needed, eg. to handle custom attributes,
 *  extending from this class in your own custom class is the best approach.)
 */
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.EXISTING_PROPERTY, property="_type", visible=true, defaultImpl=Aclentry.class)
@JsonAutoDetect(getterVisibility=PUBLIC_ONLY, setterVisibility=PUBLIC_ONLY, fieldVisibility=NONE)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeName("aclentry")
public class Aclentry extends Reference {

    @JsonProperty("created_by")
    protected String createdBy;

    @JsonProperty("created_on")
    protected Date createdOn;

    @JsonProperty("has_principal")
    protected Steward hasPrincipal;

    @JsonProperty("has_system_role")
    protected SystemRole hasSystemRole;

    @JsonProperty("modified_by")
    protected String modifiedBy;

    @JsonProperty("modified_on")
    protected Date modifiedOn;

    /**
     * Valid values are:
     * <ul>
     *   <li>READ (displayed in the UI as 'READ')</li>
     *   <li>UPDATE (displayed in the UI as 'UPDATE')</li>
     *   <li>DELETE (displayed in the UI as 'DELETE')</li>
     *   <li>VIEW (displayed in the UI as 'VIEW')</li>
     *   <li>EXECUTE (displayed in the UI as 'EXECUTE')</li>
     *   <li>OWNER (displayed in the UI as 'OWNER')</li>
     * </ul>
     */
    @JsonProperty("permissions")
    protected List<String> permissions;

    @JsonProperty("used_by_acl")
    protected Acl usedByAcl;

    /**
     * Retrieve the {@code created_by} property (displayed as '{@literal Created By}') of the object.
     * @return {@code String}
     */
    @JsonProperty("created_by")
    public String getCreatedBy() { return this.createdBy; }

    /**
     * Set the {@code created_by} property (displayed as {@code Created By}) of the object.
     * @param createdBy the value to set
     */
    @JsonProperty("created_by")
    public void setCreatedBy(String createdBy) { this.createdBy = createdBy; }

    /**
     * Retrieve the {@code created_on} property (displayed as '{@literal Created On}') of the object.
     * @return {@code Date}
     */
    @JsonProperty("created_on")
    public Date getCreatedOn() { return this.createdOn; }

    /**
     * Set the {@code created_on} property (displayed as {@code Created On}) of the object.
     * @param createdOn the value to set
     */
    @JsonProperty("created_on")
    public void setCreatedOn(Date createdOn) { this.createdOn = createdOn; }

    /**
     * Retrieve the {@code has_principal} property (displayed as '{@literal Has Principal}') of the object.
     * @return {@code Steward}
     */
    @JsonProperty("has_principal")
    public Steward getHasPrincipal() { return this.hasPrincipal; }

    /**
     * Set the {@code has_principal} property (displayed as {@code Has Principal}) of the object.
     * @param hasPrincipal the value to set
     */
    @JsonProperty("has_principal")
    public void setHasPrincipal(Steward hasPrincipal) { this.hasPrincipal = hasPrincipal; }

    /**
     * Retrieve the {@code has_system_role} property (displayed as '{@literal Has System Role}') of the object.
     * @return {@code SystemRole}
     */
    @JsonProperty("has_system_role")
    public SystemRole getHasSystemRole() { return this.hasSystemRole; }

    /**
     * Set the {@code has_system_role} property (displayed as {@code Has System Role}) of the object.
     * @param hasSystemRole the value to set
     */
    @JsonProperty("has_system_role")
    public void setHasSystemRole(SystemRole hasSystemRole) { this.hasSystemRole = hasSystemRole; }

    /**
     * Retrieve the {@code modified_by} property (displayed as '{@literal Modified By}') of the object.
     * @return {@code String}
     */
    @JsonProperty("modified_by")
    public String getModifiedBy() { return this.modifiedBy; }

    /**
     * Set the {@code modified_by} property (displayed as {@code Modified By}) of the object.
     * @param modifiedBy the value to set
     */
    @JsonProperty("modified_by")
    public void setModifiedBy(String modifiedBy) { this.modifiedBy = modifiedBy; }

    /**
     * Retrieve the {@code modified_on} property (displayed as '{@literal Modified On}') of the object.
     * @return {@code Date}
     */
    @JsonProperty("modified_on")
    public Date getModifiedOn() { return this.modifiedOn; }

    /**
     * Set the {@code modified_on} property (displayed as {@code Modified On}) of the object.
     * @param modifiedOn the value to set
     */
    @JsonProperty("modified_on")
    public void setModifiedOn(Date modifiedOn) { this.modifiedOn = modifiedOn; }

    /**
     * Retrieve the {@code permissions} property (displayed as '{@literal Permissions}') of the object.
     * @return {@code List<String>}
     */
    @JsonProperty("permissions")
    public List<String> getPermissions() { return this.permissions; }

    /**
     * Set the {@code permissions} property (displayed as {@code Permissions}) of the object.
     * @param permissions the value to set
     */
    @JsonProperty("permissions")
    public void setPermissions(List<String> permissions) { this.permissions = permissions; }

    /**
     * Retrieve the {@code used_by_acl} property (displayed as '{@literal Used By Acl}') of the object.
     * @return {@code Acl}
     */
    @JsonProperty("used_by_acl")
    public Acl getUsedByAcl() { return this.usedByAcl; }

    /**
     * Set the {@code used_by_acl} property (displayed as {@code Used By Acl}) of the object.
     * @param usedByAcl the value to set
     */
    @JsonProperty("used_by_acl")
    public void setUsedByAcl(Acl usedByAcl) { this.usedByAcl = usedByAcl; }

}
