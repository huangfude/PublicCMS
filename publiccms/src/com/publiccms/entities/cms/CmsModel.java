package com.publiccms.entities.cms;

// Generated 2015-6-25 11:28:56 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.Table;

import com.sanluan.common.source.entity.MyColumn;

/**
 * CmsModel generated by hbm2java
 */
@Entity
@Table(name = "cms_model")
public class CmsModel implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Integer id;
    @MyColumn(title = "父模型", condition = true)
    private Integer parentId;
    @MyColumn(title = "名称")
    private String name;
    @MyColumn(title = "模板路径")
    private String templatePath;
    @MyColumn(title = "有章节", condition = true)
    private boolean hasChild;
    @MyColumn(title = "是链接", condition = true)
    private boolean isUrl;
    @MyColumn(title = "是图集", condition = true)
    private boolean isImages;
    @MyColumn(title = "是片段", condition = true)
    private boolean isPart;
    @MyColumn(title = "已删除", condition = true)
    private boolean disabled;

    public CmsModel() {
    }

    public CmsModel(String name, boolean hasChild, boolean isUrl, boolean isImages, boolean isPart, boolean disabled) {
        this.name = name;
        this.hasChild = hasChild;
        this.isUrl = isUrl;
        this.isImages = isImages;
        this.isPart = isPart;
        this.disabled = disabled;
    }

    public CmsModel(Integer parentId, String name, String templatePath, boolean hasChild, boolean isUrl, boolean isImages,
            boolean isPart, boolean disabled) {
        this.parentId = parentId;
        this.name = name;
        this.templatePath = templatePath;
        this.hasChild = hasChild;
        this.isUrl = isUrl;
        this.isImages = isImages;
        this.isPart = isPart;
        this.disabled = disabled;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "parent_id")
    public Integer getParentId() {
        return this.parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Column(name = "name", nullable = false, length = 20)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "template_path", length = 200)
    public String getTemplatePath() {
        return this.templatePath;
    }

    public void setTemplatePath(String templatePath) {
        this.templatePath = templatePath;
    }

    @Column(name = "has_child", nullable = false)
    public boolean isHasChild() {
        return this.hasChild;
    }

    public void setHasChild(boolean hasChild) {
        this.hasChild = hasChild;
    }

    @Column(name = "is_url", nullable = false)
    public boolean isIsUrl() {
        return this.isUrl;
    }

    public void setIsUrl(boolean isUrl) {
        this.isUrl = isUrl;
    }

    @Column(name = "is_images", nullable = false)
    public boolean isIsImages() {
        return this.isImages;
    }

    public void setIsImages(boolean isImages) {
        this.isImages = isImages;
    }

    @Column(name = "is_part", nullable = false)
    public boolean isIsPart() {
        return this.isPart;
    }

    public void setIsPart(boolean isPart) {
        this.isPart = isPart;
    }

    @Column(name = "disabled", nullable = false)
    public boolean isDisabled() {
        return this.disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

}
