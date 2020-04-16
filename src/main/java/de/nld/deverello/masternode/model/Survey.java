package de.nld.deverello.masternode.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Survey extends SurveyBase {

    @Getter
    @Setter
    private String dateTime;

    @Getter
    @Setter
    private String remoteAddr;

    @Getter
    @Setter
    private String path;

}
