package com.mossle.internal.whitelist.persistence.domain;

// Generated by Hibernate Tools
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * WhitelistType .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "WHITELIST_TYPE")
public class WhitelistType implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private String name;

    /** null. */
    private String code;

    /** null. */
    private String tenantId;

    /** . */
    private Set<WhitelistApp> whitelistApps = new HashSet<WhitelistApp>(0);

    public WhitelistType() {
    }

    public WhitelistType(Long id) {
        this.id = id;
    }

    public WhitelistType(Long id, String name, String code, String tenantId,
            Set<WhitelistApp> whitelistApps) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.tenantId = tenantId;
        this.whitelistApps = whitelistApps;
    }

    /** @return null. */
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            null.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return null. */
    @Column(name = "NAME", length = 50)
    public String getName() {
        return this.name;
    }

    /**
     * @param name
     *            null.
     */
    public void setName(String name) {
        this.name = name;
    }

    /** @return null. */
    @Column(name = "CODE", length = 50)
    public String getCode() {
        return this.code;
    }

    /**
     * @param code
     *            null.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** @return null. */
    @Column(name = "TENANT_ID", length = 64)
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @param tenantId
     *            null.
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "whitelistType")
    public Set<WhitelistApp> getWhitelistApps() {
        return this.whitelistApps;
    }

    /**
     * @param whitelistApps
     *            .
     */
    public void setWhitelistApps(Set<WhitelistApp> whitelistApps) {
        this.whitelistApps = whitelistApps;
    }
}
