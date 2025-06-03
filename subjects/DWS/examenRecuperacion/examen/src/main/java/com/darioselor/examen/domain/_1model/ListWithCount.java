package com.darioselor.examen.domain._1model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ListWithCount<T> {

    private List<T> list;
    private long count;
}
