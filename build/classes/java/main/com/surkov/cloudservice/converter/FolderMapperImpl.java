package com.surkov.cloudservice.converter;

import com.surkov.cloudservice.dto.FolderOutputDto;
import com.surkov.cloudservice.model.Folder;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-12-19T23:49:03+0200",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_141 (Oracle Corporation)"
)
@Component
public class FolderMapperImpl implements FolderMapper {

    @Override
    public FolderOutputDto toFolderOutputDto(Folder folder) {
        if ( folder == null ) {
            return null;
        }

        FolderOutputDto folderOutputDto = new FolderOutputDto();

        folderOutputDto.setName( folder.getName() );
        folderOutputDto.setFolderId( folder.getFolderId() );

        return folderOutputDto;
    }
}
