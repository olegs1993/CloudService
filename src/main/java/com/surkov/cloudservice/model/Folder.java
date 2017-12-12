package com.surkov.cloudservice.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "folder")
public class Folder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Folder_Id")
    private Long folderId;

    @OneToOne
    @JoinColumn(referencedColumnName = "Folder_Id",table = "folder",name = "Folder_Id")
    private Folder parentId;

    @Column(name = "Name")
    private String name;

    @OneToMany(mappedBy = "folder")
    private List<File> files;

    @OneToOne(mappedBy = "rootFolder")
    private Directory directory;

    public Folder getParentId() {
        return parentId;
    }

    public void setParentId(Folder parentId) {
        this.parentId = parentId;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public Long getFolderId() {
        return folderId;
    }

    public void setFolderId(Long folderId) {
        this.folderId = folderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Directory getDirectory() {
        return directory;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }
}