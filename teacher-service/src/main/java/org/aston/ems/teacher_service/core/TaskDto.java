package org.aston.ems.teacher_service.core;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TaskDto {
    private Long id;
    private String nickName;
    private Long teacherId;
    private String content;
    private String answer;
    private boolean checked;
    private int mark;
}
