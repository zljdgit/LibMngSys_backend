package com.book.backend.pojo.dto;

import com.book.backend.pojo.BooksBorrow;
import lombok.Data;

import java.io.Serializable;

@Data
public class BooksBorrowDTO extends BooksBorrow implements Serializable {
    /**
     * 接受图书管理员的id
     */
    public Integer bookAdminId;

}
