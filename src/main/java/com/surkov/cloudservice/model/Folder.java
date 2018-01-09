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

    @Column(name = "Name")
    private String name;

    @OneToMany(mappedBy = "folder")
    private List<File> files;

    @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(referencedColumnName = "Folder_Id", table = "folder", name = "Parent_Id")
    private List<Folder> folderList;

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

    public List<Folder> getFolderList() {
        return folderList;
    }

    public void setFolderList(List<Folder> folderList) {
        this.folderList = folderList;
    }
}
