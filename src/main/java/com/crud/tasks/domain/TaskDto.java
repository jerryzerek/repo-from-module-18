package com.crud.tasks.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.transaction.annotation.Transactional;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Transactional
public class TaskDto {
    private Long id;
    private String name;
    private String content;

}
