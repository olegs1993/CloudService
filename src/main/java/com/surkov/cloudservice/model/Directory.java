package com.surkov.cloudservice.model;

import javax.persistence.*;

@Entity
@Table(name = "directory")
public class Directory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Directory_Id")
    private Long directoryId;

    @OneToOne
    @JoinColumn(referencedColumnName = "Folder_Id", name = "Folder_Id")
    private Folder rootFolder;


    @OneToOne
    @JoinColumn(name = "User_Id", referencedColumnName = "User_Id")
    private User user;

    @Column(name = "Dir_Path")
    private String dirPath;

    public Long getDirectoryId() {
        return directoryId;
    }

    public void setDirectoryId(Long directoryId) {
        this.directoryId = directoryId;
    }

    public Folder getRootFolder() {
        return rootFolder;
    }

    public void setRootFolder(Folder rootFolder) {
        this.rootFolder = rootFolder;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDirPath() {
        return dirPath;
    }

    public void setDirPath(String dirPath) {
        this.dirPath = dirPath;
    }
}
