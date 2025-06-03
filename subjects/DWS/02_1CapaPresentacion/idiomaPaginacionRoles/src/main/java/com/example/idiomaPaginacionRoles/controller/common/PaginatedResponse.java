package com.example.idiomaPaginacionRoles.controller.common;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PaginatedResponse<T> {

    private List<T> data;
    private int total;
    private int currentPage;
    private int pageSize;
    private String next;
    private String previous;

    public PaginatedResponse(List<T> data, int total, int currentPage, int pageSize, String baseUrl) {
        this.data = data;
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.next = createNextLink(baseUrl);
        this.previous = createPreviousLink(baseUrl);
    }

    private String createNextLink(String baseUrl) {
        if (currentPage * pageSize < total) {
            return baseUrl + "?page=" + (currentPage + 1) + "&size=" + pageSize;
        }
        return null;
    }

    private String createPreviousLink(String baseUrl) {
        if (currentPage > 1) {
            return baseUrl + "=?page=" + (currentPage - 1) + "&size=" + pageSize;
        }
        return null;
    }
}
